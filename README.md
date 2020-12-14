# TP M2 IDM UNO
- Léo RAUZIER
- Istic
- ILA

------------

## FEATURE MODEL
Le feature model se trouve dans le répertoire ```istic.m2.idm.tp.uno.feature```. Le model est dans le fichier ```model.xml``` et les configurations dans le répertoire ```configs```.

D'après ce model, il existe 768 variantes possible du UNO.
## GRAMMAIRE

La grammaire se trouve dans le répertoire ```istic.m2.idm.tp.uno\src\org\xtext\example\mydsl``` dans le fichier ```RulesUNO.xtext```

elle permet de configurer les règles du UNO simple ou complexe, allant de la règle de base à une règle personnelle.

elle est composé de 4 parties :
#### nombre de joueurs
on choisi le nombre de joueurs
#### type de participants
on choisi si les participants sont des joueurs et des équipes
#### variantes
on choisi les variantes utilisées du jeu
#### règles
partie facultative où l'on peut spécifier nos propre règles

Exemple de programme :
#### base.runo
```
RUno {
	nb_joueur = 5;
	participant = JOUEUR;
	
	variantes {
		BASE
	}
}
```

#### complexe.runo

```
RUno {
	
	nb_joueur = 10;
	participant = EQUIPE;
	
	variantes {
		BASE, EQUIPE 
	}
	
	regles {
		if (JOUEUR_COURRANT.POSER_QUESTION()) {
			JOUEUR_COURRANT.PIOCHER_2_CARTES();
		}
		if (JOUEUR_COURRANT.NB_CARTES == 1 && ! JOUEUR_COURRANT.CRIER_UNO() && JOUEUR_EXISTE.REMARQUER_ERREUR_UNO()) {
			JOUEUR_COURRANT.PIOCHER_2_CARTES();
		}
		if (JOUEUR_COURRANT.JOUER_CARTE_JOKER()) {
			choix {
				JOUEUR_COURRANT.CHANGER_COULEUR();
				JOUEUR_COURRANT.CHOISIR_COULEUR();
			}
		}	
		if (JOUEUR_COURRANT.JOUER_CARTE_PLUS_2()) {
			JOUEUR_SUIVANT.PIOCHER_2_CARTES();
		}
		if (JOUEUR_COURRANT.JOUER_CARTE_PLUS_4()) {
			JOUEUR_SUIVANT.PIOCHER_4_CARTES();
		}
		if (JOUEUR_COURRANT.JOUER_CARTE_INVERSER_SENS()) {
			JOUEUR_COURRANT.INVERSER_SENS();
		}
		if (JOUEUR_COURRANT.JOUER_CARTE_PASSE_TON_TOUR()) {
			JOUEUR_SUIVANT.PASSER_SON_TOUR();
		}
		
		if (JOUEUR_EXISTE.NB_CARTES == 0) {
			MANCHE.FINIR();
			if (PARTICIPANT_EXISTE.POINTS >= 500) {
				PARTICIPANT_MIN_POINTS.GAGNER();
			} else {
				MANCHE.NOUVELLE();
			}
		}	
	}
}
```

les deux fichiers se trouvent à la racine

## JSON

Voici un exemple de fichier JSON et son schema associé contenant les règles d'une partie de UNO :

#### exemple.json

```json
{
  "nb_joueurs": 2,
  "variantes": [
    "base",
    "equipe"
  ],
  "participant": "equipe",
  "regles": {
    "crier_uno": {
      "joueur": "joueur_existe",
      "remarquer_erreur_uno": {
        "joueur": "joueur_courrant",
        "actions": [
          "piocher_2_cartes"
        ]
      }
    },
    "poser_question": {
      "joueur": "joueur_courrant",
      "actions": [
        "piocher_2_cartes"
      ]
    },
    "jouer_carte_base": {
      "joueur": "joueur_courrant",
      "choix": [
        "meme_couleur",
        "meme_numero",
        "meme_symbole"
      ]
    },

    "jouer_carte_joker": {
      "joueur": "joueur_courrant",
      "choix": [
        "choisir_couleur",
        "changer_couler"
      ]
    },
    "jouer_carte_plus_2": {
      "joueur": "joueur_suivant",
      "actions": [
        "piocher_2_cartes"
      ]
    },
    "jouer_carte_plus_4": {
      "joueur": "joueur_suivant",
      "actions": [
        "piocher_4_cartes"
      ]
    },
    "jouer_carte_inversement_sens": {
      "joueur": "joueur_courrant",
      "actions": [
        "inverser_sens"
      ]
    },
    "jouer_carte_passe_ton_tour": {
      "joueur": "joueur_suivant",
      "actions": [
        "passer_son_tour"
      ]
    },
    "jouer_plusieurs_cartes_identiques": {
      "joueur": "none",
      "actions": ["none"]
    },
    "jouer_carte_zero": {
      "joueur": "none",
      "actions": ["none"]
    },
    "jouer_suites_de_cartes": {
      "joueur": "none",
      "actions": ["none"]
    },
    "fin_manche": {
      "joueur": "joueur_existe",
      "nb_cartes": 0
    },
    "fin_partie": {
      "participant": "participant_existe",
      "nb_points_min": 500,
      "gagant" : "participant_min_points"
    }
  }
}
```

#### schema.json
```json
{
  "$schema": "http://json-schema.org/draft-04/schema#",
  "type": "object",
  "properties": {
    "nb_joueurs": {
      "type": "integer"
    },
    "variantes": {
      "type": "array",
      "items": [
        {
          "type": "string"
        },
        {
          "type": "string"
        }
      ]
    },
    "participant": {
      "type": "string"
    },
    "regles": {
      "type": "object",
      "properties": {
        "crier_uno": {
          "type": "object",
          "properties": {
            "joueur": {
              "type": "string"
            },
            "remarquer_erreur_uno": {
              "type": "object",
              "properties": {
                "joueur": {
                  "type": "string"
                },
                "actions": {
                  "type": "array",
                  "items": [
                    {
                      "type": "string"
                    }
                  ]
                }
              },
              "required": [
                "joueur",
                "actions"
              ]
            }
          },
          "required": [
            "joueur",
            "remarquer_erreur_uno"
          ]
        },
        "poser_question": {
          "type": "object",
          "properties": {
            "joueur": {
              "type": "string"
            },
            "actions": {
              "type": "array",
              "items": [
                {
                  "type": "string"
                }
              ]
            }
          },
          "required": [
            "joueur",
            "actions"
          ]
        },
        "jouer_carte_base": {
          "type": "object",
          "properties": {
            "joueur": {
              "type": "string"
            },
            "choix": {
              "type": "array",
              "items": [
                {
                  "type": "string"
                },
                {
                  "type": "string"
                },
                {
                  "type": "string"
                }
              ]
            }
          },
          "required": [
            "joueur",
            "choix"
          ]
        },
        "jouer_carte_joker": {
          "type": "object",
          "properties": {
            "joueur": {
              "type": "string"
            },
            "choix": {
              "type": "array",
              "items": [
                {
                  "type": "string"
                },
                {
                  "type": "string"
                }
              ]
            }
          },
          "required": [
            "joueur",
            "choix"
          ]
        },
        "jouer_carte_plus_2": {
          "type": "object",
          "properties": {
            "joueur": {
              "type": "string"
            },
            "actions": {
              "type": "array",
              "items": [
                {
                  "type": "string"
                }
              ]
            }
          },
          "required": [
            "joueur",
            "actions"
          ]
        },
        "jouer_carte_plus_4": {
          "type": "object",
          "properties": {
            "joueur": {
              "type": "string"
            },
            "actions": {
              "type": "array",
              "items": [
                {
                  "type": "string"
                }
              ]
            }
          },
          "required": [
            "joueur",
            "actions"
          ]
        },
        "jouer_carte_inversement_sens": {
          "type": "object",
          "properties": {
            "joueur": {
              "type": "string"
            },
            "actions": {
              "type": "array",
              "items": [
                {
                  "type": "string"
                }
              ]
            }
          },
          "required": [
            "joueur",
            "actions"
          ]
        },
        "jouer_carte_passe_ton_tour": {
          "type": "object",
          "properties": {
            "joueur": {
              "type": "string"
            },
            "actions": {
              "type": "array",
              "items": [
                {
                  "type": "string"
                }
              ]
            }
          },
          "required": [
            "joueur",
            "actions"
          ]
        },
        "jouer_plusieurs_cartes_identiques": {
          "type": "object",
          "properties": {
            "joueur": {
              "type": "string"
            },
            "actions": {
              "type": "array",
              "items": [
                {
                  "type": "string"
                }
              ]
            }
          },
          "required": [
            "joueur",
            "actions"
          ]
        },
        "jouer_carte_zero": {
          "type": "object",
          "properties": {
            "joueur": {
              "type": "string"
            },
            "actions": {
              "type": "array",
              "items": [
                {
                  "type": "string"
                }
              ]
            }
          },
          "required": [
            "joueur",
            "actions"
          ]
        },
        "jouer_suites_de_cartes": {
          "type": "object",
          "properties": {
            "joueur": {
              "type": "string"
            },
            "actions": {
              "type": "array",
              "items": [
                {
                  "type": "string"
                }
              ]
            }
          },
          "required": [
            "joueur",
            "actions"
          ]
        },
        "fin_manche": {
          "type": "object",
          "properties": {
            "joueur": {
              "type": "string"
            },
            "nb_cartes": {
              "type": "integer"
            }
          },
          "required": [
            "joueur",
            "nb_cartes"
          ]
        },
        "fin_partie": {
          "type": "object",
          "properties": {
            "participant": {
              "type": "string"
            },
            "nb_points_min": {
              "type": "integer"
            },
            "gagant": {
              "type": "string"
            }
          },
          "required": [
            "participant",
            "nb_points_min",
            "gagant"
          ]
        }
      },
      "required": [
        "crier_uno",
        "poser_question",
        "jouer_carte_base",
        "jouer_carte_joker",
        "jouer_carte_plus_2",
        "jouer_carte_plus_4",
        "jouer_carte_inversement_sens",
        "jouer_carte_passe_ton_tour",
        "jouer_plusieurs_cartes_identiques",
        "jouer_carte_zero",
        "jouer_suites_de_cartes",
        "fin_manche",
        "fin_partie"
      ]
    }
  },
  "required": [
    "nb_joueurs",
    "variantes",
    "participant",
    "regles"
  ]
}
```

Les deux fichiers se trouvent à la racine.

Avec la grammaire, on serait capable de générer un fichier json facilement.
Il faurait pour cela générer du code json pour chaque type d'istruction.
Par éxemple : 
```
if (JOUEUR_COURRANT.POSER_QUESTION()) {
            JOUEUR_COURRANT.PIOCHER_2_CARTES();
}
```
donnerait
```json
"poser_question": {
      "joueur": "joueur_courrant",
      "actions": [
        "piocher_2_cartes"
      ]
    } 
```