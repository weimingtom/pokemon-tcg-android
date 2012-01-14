package fr.codlab.cartes.util;

import fr.codlab.cartes.Principal;

public class Pokemon{
	private final static String FR[]={
		"MissingNo",
		"Bulbizarre",
		"Herbizarre",
		"Florizarre",
		"Salamèche",
		"Reptincel",
		"Dracaufeu",
		"Carapuce",
		"Carabaffe",
		"Tortank",
		"Chenipan",
		"Chrysacier",
		"Papilusion",
		"Aspicot",
		"Coconfort",
		"Dardargnan",
		"Roucool",
		"Roucoups",
		"Roucarnage",
		"Rattata",
		"Rattatac",
		"Piafabec",
		"Rapasdepic",
		"Abo",
		"Arbok",
		"Pikachu",
		"Raichu",
		"Sabelette",
		"Sablaireau",
		"Nidoran?",
		"Nidorina",
		"Nidoqueen",
		"Nidoran?",
		"Nidorino",
		"Nidoking",
		"Mélofée",
		"Mélodelfe",
		"Goupix",
		"Feunard",
		"Rondoudou",
		"Grodoudou",
		"Nosferapti",
		"Nosferalto",
		"Mystherbe",
		"Ortide",
		"Rafflesia",
		"Paras",
		"Parasect",
		"Mimitoss",
		"Aéromite",
		"Taupiqueur",
		"Triopikeur",
		"Miaouss",
		"Persian",
		"Psykokwak",
		"Akwakwak",
		"Férosinge",
		"Colossinge",
		"Caninos",
		"Arcanin",
		"Ptitard",
		"Tétarte",
		"Tartard",
		"Abra",
		"Kadabra",
		"Alakazam",
		"Machoc",
		"Machopeur",
		"Mackogneur",
		"Chétiflor",
		"Boustiflor",
		"Empiflor",
		"Tentacool",
		"Tentacruel",
		"Racaillou",
		"Gravalanch",
		"Grolem",
		"Ponyta",
		"Galopa",
		"Ramoloss",
		"Flagadoss",
		"Magneti",
		"Magneton",
		"Canarticho",
		"Doduo",
		"Dodrio",
		"Otaria",
		"Lamantine",
		"Tadmorv",
		"Grotadmorv",
		"Kokiyas",
		"Crustabri",
		"Fantominus",
		"Spectrum",
		"Ectoplasma",
		"Onix",
		"Soporifik",
		"Hypnomade",
		"Krabby",
		"Krabboss",
		"Voltorbe",
		"Electrode",
		"Noeunoeuf",
		"Noadkoko",
		"Osselait",
		"Ossatueur",
		"Kicklee",
		"Tygnon",
		"Excelangue",
		"Smogo",
		"Smogogo",
		"Rhinocorne",
		"Rhinoféros",
		"Leveinard",
		"Saquedeneu",
		"Kangourex",
		"Hypotrempe",
		"Hypocéan",
		"Poissirène",
		"Poissoroy",
		"Stari",
		"Staross",
		"Mr.mime",
		"Insécateur",
		"Lippoutou",
		"Elektek",
		"Magmar",
		"Scarabrute",
		"Tauros",
		"Magicarpe",
		"Léviator",
		"Lokhlass",
		"Métamorph",
		"Evoli",
		"Aquali",
		"Voltali",
		"Pyroli",
		"Porygon",
		"Amonita",
		"Amonistar",
		"Kabuto",
		"Kabutops",
		"Ptéra",
		"Ronflex",
		"Artikodin",
		"Electhor",
		"Sulfura",
		"Minidraco",
		"Draco",
		"Dracolosse",
		"Mewtwo",
		"Mew",
		"Germignon",
		"Macronium",
		"Méganium",
		"Héricendre",
		"Feurisson",
		"Typhlosion",
		"Kaïminus",
		"Crocrodil",
		"Aligatueur",
		"Fouinette",
		"Fouinar",
		"Hoot-hoot",
		"Noarfang",
		"Coxy",
		"Coxyclaque",
		"Mimigal",
		"Migalos",
		"Nostenfer",
		"Loupio",
		"Lanturn",
		"Pichu",
		"Mélo",
		"Toudoudou",
		"Togépi",
		"Togétic",
		"Natu",
		"Xatu",
		"Wattouat",
		"Lainergie",
		"Pharamp",
		"Joliflor",
		"Marill",
		"Azumarill",
		"Simularbre",
		"Tarpaud",
		"Granivol",
		"Floravol",
		"Cotovol",
		"Capumain",
		"Tournegrin",
		"Héliatronc",
		"Yanma",
		"Axoloto",
		"Maraiste",
		"Mentali",
		"Noctali",
		"Cornebre",
		"Roigada",
		"Feuforêve",
		"Zarbi",
		"Qulbutoke",
		"Girafarig",
		"Pomdepic",
		"Foretress",
		"Insolourdo",
		"Scorplane",
		"Steelix",
		"Snubull",
		"Granbull",
		"Qwilfish",
		"Cizayox",
		"Caratroc",
		"Scarhino",
		"Farfuret",
		"Teddiursa",
		"Ursaring",
		"Limagma",
		"Volcaropod",
		"Marcacrain",
		"Cochignon",
		"Corayon",
		"Remoraid",
		"Octillery",
		"Cadoizo",
		"Demanta",
		"Airmure",
		"Malosse",
		"Démolosse",
		"Hyporoi",
		"Phanpy",
		"Donphan",
		"Porygon2",
		"Cerfrousse",
		"Queulorior",
		"Débugant",
		"Kapoera",
		"Lippouti",
		"Elekid",
		"Magby",
		"Ecremeuh",
		"Leuphorie",
		"Raïkou",
		"Enteï",
		"Suicune",
		"Embrylex",
		"Ymphect",
		"Tyranocif",
		"Lugia",
		"Ho-oh",
		"Célébi",
		"Arcko",
		"Massko",
		"Jungko",
		"Poussifeu",
		"Galifeu",
		"Brasegali",
		"Gobou",
		"Flobio",
		"Laggron",
		"Medhyena",
		"Grahyena",
		"Zigzaton",
		"Lineon",
		"Chenipotte",
		"Armulys",
		"Charmillon",
		"Blindalys",
		"Papinox",
		"Nenupiot",
		"Lombre",
		"Ludicolo",
		"Grainipiot",
		"Pifeuil",
		"Tengalice",
		"Nirondelle",
		"Heledelle",
		"Goelise",
		"Bekipan",
		"Tarsal",
		"Kirlia",
		"Gardevoir",
		"Arakdo",
		"Maskadra",
		"Balignon",
		"Chapignon",
		"Parecool",
		"Vigoroth",
		"Monaflemit",
		"Ningale",
		"Ninjask",
		"Munja",
		"Chuchmur",
		"Ramboum",
		"Brouhabam",
		"Makuhita",
		"Hariyama",
		"Azurill",
		"Tarinor",
		"Skitty",
		"Delcatty",
		"Tenefix",
		"Mysdibule",
		"Galekid",
		"Galegon",
		"Galeking",
		"Meditikka",
		"Charmina",
		"Dynavolt",
		"Elecsprint",
		"Posipi",
		"Negapi",
		"Muciole",
		"Lumivole",
		"Roselia",
		"Gloupti",
		"Avaltout",
		"Carvanha",
		"Sharpedo",
		"Wailmer",
		"Wailord",
		"Chamallot",
		"Camerupt",
		"Chartor",
		"Spoink",
		"Groret",
		"Spinda",
		"Kraknoix",
		"Vibrannif",
		"Libegon",
		"Cacnea",
		"Cacturne",
		"Tylton",
		"Altaria",
		"Mangriff",
		"Seviper",
		"Seleroc",
		"Solaroc",
		"Barloche",
		"Barbicha",
		"Ecrapince",
		"Colhomar",
		"Balbuto",
		"Kaorine",
		"Lilia",
		"Vacilys",
		"Anorith",
		"Armaldo",
		"Barpau",
		"Milobellus",
		"Morpheo",
		"Kecleon",
		"Polichombr",
		"Branette",
		"Skelenox",
		"Teraclope",
		"Tropius",
		"Eoko",
		"Absol",
		"Okéoké",
		"Stalgamin",
		"Oniglali",
		"Obalie",
		"Phogleur",
		"Kaimorse",
		"Coquiperl",
		"Serpang",
		"Rosabyss",
		"Relicanth",
		"Lovdisc",
		"Draby",
		"Drakhaus",
		"Drattak",
		"Terhal",
		"Metang",
		"Metalosse",
		"Regirock",
		"Regice",
		"Registeel",
		"Latias",
		"Latios",
		"Kyogre",
		"Groudon",
		"Rayquaza",
		"Jirachi",
		"Deoxys",
		"Tortipouss",
		"Boskara",
		"Torterra",
		"Ouisticram",
		"Chimpenfeu",
		"Simiabraz",
		"Tiplouf",
		"Prinplouf",
		"Pingoleon",
		"Étourmi",
		"Étourvol",
		"Étouraptor",
		"Keunotor",
		"Castorno",
		"Crikzik",
		"Melocrik",
		"Lixy",
		"Luxio",
		"Luxray",
		"Rozbouton",
		"Roserade",
		"Kranidos",
		"Charkos",
		"Dinoclier",
		"Bastiodon",
		"Cheniti",
		"Cheniselle",
		"Papilord",
		"Apitrini",
		"Apireine",
		"Pachirisu",
		"Mustebouée",
		"Musteflott",
		"Ceribou",
		"Ceriflor",
		"Sancoki",
		"Tritosor",
		"Capidextre",
		"Baudrive",
		"Grodrive",
		"Laporeille",
		"Lockpin",
		"Magirêve",
		"Corboss",
		"Chaglam",
		"Chaffreux",
		"Korillon",
		"Moufouette",
		"Moufflair",
		"Archeomire",
		"Archeodong",
		"Manzaï",
		"Mime jr.",
		"Ptiravi",
		"Pijako",
		"Spiritomb",
		"Griknot",
		"Carmache",
		"Carchacrok",
		"Goinfrex",
		"Riolu",
		"Lucario",
		"Hippopotas",
		"Hippodocus",
		"Rapion",
		"Drascore",
		"Cradopaud",
		"Coatox",
		"Vortente",
		"Ecayon",
		"Lumineon",
		"Babimanta",
		"Blizzi",
		"Blizzaroi",
		"Dimoret",
		"Magnezone",
		"Coudlangue",
		"Rhinastoc",
		"Bouldeneu",
		"Elekable",
		"Maganon",
		"Togekiss",
		"Yanmega",
		"Phyllali",
		"Givrali",
		"Scorvol",
		"Mammochon",
		"Porygon-z",
		"Gallame",
		"Tarinorme",
		"Noctunoir",
		"Momartik",
		"Motisma",
		"Crehelf",
		"Crefollet",
		"Crefadet",
		"Dialga",
		"Palkia",
		"Heatran",
		"Regigigas",
		"Giratina",
		"Cresselia",
		"Phione",
		"Manaphy",
		"Darkrai",
		"Shaymin",
		"Arceus",
		"Victini",
		"Vipélierre",
		"Lianaja",
		"Majaspic",
		"Gruikui",
		"Grotichon",
		"Roitiflam",
		"Moustillon",
		"Mateloutre",
		"Clamiral",
		"Ratentif",
		"Miradar",
		"Ponchiot",
		"Ponchien",
		"Mastouffe",
		"Chacripan",
		"Léopardus",
		"Feuillajou",
		"Feuiloutan",
		"Flamajou",
		"Flamoutan",
		"Flotajou",
		"Flotoutan",
		"Munna",
		"Mushana",
		"Poichigeon",
		"Colombeau",
		"Déflaisan",
		"Zébibron",
		"Zéblitz",
		"Nodulithe",
		"Géolithe",
		"Gigalith",
		"Chovsourir",
		"Rhinolove",
		"Rototaupe",
		"Minotaupe",
		"Nanméouïe",
		"Charpenti",
		"Ouvrifier",
		"Bétochef",
		"Tritonde",
		"Batracné",
		"Crapustule",
		"Judokrak",
		"Karaclée",
		"Larveyette",
		"Couverdure",
		"Manternel",
		"Venipatte",
		"Scobolide",
		"Brutapode",
		"Doudouvet",
		"Farfaduvet",
		"Chlorobule",
		"Fragilady",
		"Bargantua",
		"Mascaïman",
		"Escroco",
		"Crocorible",
		"Darumarond",
		"Darumacho",
		"Maracachi",
		"Crabicoque",
		"Crabaraque",
		"Baggiguane",
		"Baggaïd",
		"Cryptéro",
		"Tutafeh",
		"Tutankafer",
		"Carapagos",
		"Mégapagos",
		"Arkéapti",
		"Aéroptéryx",
		"Miamiasme",
		"Miasmax",
		"Zorua",
		"Zoroark",
		"Chinchidou",
		"Pashmilla",
		"Scrutella",
		"Mesmérella",
		"Sidérella",
		"Nucléos",
		"Méios",
		"Symbios",
		"Couaneton",
		"Lakmécygne",
		"Sorbébé",
		"Sorboul",
		"Sorbouboul",
		"Vivaldaim",
		"Haydaim",
		"Emolga",
		"Carabing",
		"Lançargot",
		"Trompignon",
		"Gaulet",
		"Viskuse",
		"Moyade",
		"Mamanbo",
		"Statitik",
		"Mygavolt",
		"Grindur",
		"Noacier",
		"Tic",
		"Clic",
		"Cliticlic",
		"Anchwatt",
		"Lampéroie",
		"Ohmassacre",
		"Lewsor",
		"Neitram",
		"Funécire",
		"Mélancolux",
		"Lugulabre",
		"Coupenotte",
		"Incisache",
		"Tranchodon",
		"Polarhume",
		"Polagriffe",
		"Hexagel",
		"Escargaume",
		"Limaspeed",
		"Limonde",
		"Kungfouine",
		"Shaofouine",
		"Drakkarmin",
		"Gringolem",
		"Golemastoc",
		"Scalpion",
		"Scalproie",
		"Frison",
		"Furaiglon",
		"Gueriaigle",
		"Vostourno",
		"Vaututrice",
		"Aflamanoir",
		"Fermite",
		"Solochi",
		"Diamat",
		"Trioxhydre",
		"Pyronille",
		"Pyrax",
		"Cobaltium",
		"Terrakium",
		"Viridium",
		"Boréas",
		"Fulguris",
		"Reshiram",
		"Zekrom",
		"Démétéros",
		"Kyurem",
		"Keldeo",
		"Meloetta",
		"Genesect"
	};
	private final static String US[]={
		"MissingNo",
		"Bulbasaur",	
		"Ivysaur",
		"Venusaur",
		"Charmander",
		"Charmeleon",
		"Charizard",
		"Squirtle",
		"Wartortle",
		"Blastoise",
		"Caterpie",
		"Metapod",
		"Butterfree",
		"Weedle",
		"Kakuna",
		"Beedrill",
		"Pidgey",
		"Pidgeotto",
		"Pidgeot",
		"Rattata",
		"Raticate",
		"Spearow",
		"Fearow",
		"Ekans",
		"Arbok",
		"Pikachu",
		"Raichu",
		"Sandshrew",
		"Sandslash",
		"Nidoran♀",
		"Nidorina",
		"Nidoqueen",
		"Nidoran♂",
		"Nidorino",
		"Nidoking",
		"Clefairy",
		"Clefable",
		"Vulpix",
		"Ninetales",
		"Jigglypuff",
		"Wigglytuff",
		"Zubat",
		"Golbat",
		"Oddish",
		"Gloom",
		"Vileplume",
		"Paras",
		"Parasect",
		"Venonat",
		"Venomoth",
		"Diglett",
		"Dugtrio",
		"Meowth",
		"Persian",
		"Psyduck",
		"Golduck",
		"Mankey",
		"Primeape",
		"Growlithe",
		"Arcanine",
		"Poliwag",
		"Poliwhirl",
		"Poliwrath",
		"Abra",
		"Kadabra",
		"Alakazam",
		"Machop",
		"Machoke",
		"Machamp",
		"Bellsprout",
		"Weepinbell",
		"Victreebel",
		"Tentacool",
		"Tentacruel",
		"Geodude",
		"Graveler",
		"Golem",
		"Ponyta",
		"Rapidash",
		"Slowpoke",
		"Slowbro",
		"Magnemite",
		"Magneton",
		"Farfetch'd",
		"Doduo",
		"Dodrio",
		"Seel",
		"Dewgong",
		"Grimer",
		"Muk",
		"Shellder",
		"Cloyster",
		"Gastly",
		"Haunter",	
		"Gengar",	
		"Onix",
		"Drowzee",
		"Hypno",
		"Krabby","Kingler",
		"Voltorb",
		"Electrode",
		"Exeggcute",
		"Exeggutor",
		"Cubone",
		"Marowak",
		"Hitmonlee",
		"Hitmonchan",
		"Lickitung",
		"Koffing",
		"Weezing",
		"Rhyhorn",
		"Rhydon",
		"Chansey",
		"Tangela",
		"Kangaskhan",
		"Horsea",
		"Seadra",
		"Goldeen",
		"Seaking",
		"Staryu",
		"Starmie",
		"Mr.Mime",
		"Scyther",
		"Jynx",
		"Electabuzz",
		"Magmar",
		"Pinsir",
		"Tauros",
		"Magikarp",
		"Gyarados",
		"Lapras",
		"Ditto",
		"Eevee",
		"Vaporeon",
		"Jolteon",
		"Flareon",
		"Porygon",
		"Omanyte",
		"Omastar",
		"Kabuto",
		"Kabutops",
		"Aerodactyl",
		"Snorlax",
		"Articuno",
		"Zapdos",
		"Moltres",
		"Dratini",
		"Dragonair",
		"Dragonite",
		"Mewtwo",
		"Mew",
		"Chikorita",
		"Bayleef",
		"Meganium",
		"Cyndaquil",
		"Quilava",
		"Typhlosion",
		"Totodile",
		"Croconaw",
		"Feraligatr",
		"Sentret",
		"Furret",
		"Hoothoot",
		"Noctowl",
		"Ledyba",
		"Ledian",
		"Spinarak",
		"Ariados",
		"Crobat",
		"Chinchou",
		"Lanturn",
		"Pichu",
		"Cleffa",
		"Igglybuff",
		"Togepi",
		"Togetic",
		"Natu",
		"Xatu",
		"Mareep",
		"Flaaffy",
		"Ampharos",
		"Bellossom",
		"Marill",
		"Azumarill",
		"Sudowoodo",
		"Politoed",
		"Hoppip",
		"Skiploom",
		"Jumpluff",
		"Aipom",
		"Sunkern",
		"Sunflora",
		"Yanma",
		"Wooper",
		"Quagsire",
		"Espeon",
		"Umbreon",
		"Murkrow",
		"Slowking",
		"Misdreavus",
		"Unown",
		"Wobbuffet",
		"Girafarig",
		"Pineco",
		"Forretress",
		"Dunsparce",
		"Gligar",
		"Steelix",
		"Snubbull",
		"Granbull",
		"Qwilfish",
		"Scizor",
		"Shuckle",
		"Heracross",
		"Sneasel",
		"Teddiursa",
		"Ursaring",
		"Slugma",
		"Magcargo",
		"Swinub",
		"Piloswine",
		"Corsola",
		"Remoraid",
		"Octillery",
		"Delibird",
		"Mantine",
		"Skarmory",
		"Houndour",
		"Houndoom",
		"Kingdra",
		"Phanpy",
		"Donphan",
		"Porygon2",
		"Stantler",
		"Smeargle",
		"Tyrogue",
		"Hitmontop",
		"Smoochum",
		"Elekid",
		"Magby",
		"Miltank",
		"Blissey",
		"Raikou",
		"Entei",
		"Suicune",
		"Larvitar",
		"Pupitar",
		"Tyranitar",
		"Lugia",
		"Ho-oh",
		"Celebi",
		"Treecko",
		"Grovyle",
		"Sceptile",
		"Torchic",
		"Combusken",
		"Blaziken",
		"Mudkip",
		"Marshtomp",
		"Swampert",
		"Poochyena",
		"Mightyena",
		"Zigzagoon",
		"Linoone",
		"Wurmple",
		"Silcoon",
		"Beautifly",
		"Cascoon",
		"Dustox",
		"Lotad",
		"Lombre",
		"Ludicolo",
		"Seedot",
		"Nuzleaf",
		"Shiftry",
		"Taillow",
		"Swellow",
		"Wingull",
		"Pelipper",
		"Ralts",
		"Kirlia",
		"Gardevoir",
		"Surskit",
		"Masquerain",
		"Shroomish",
		"Breloom",
		"Slakoth",
		"Vigoroth",
		"Slaking",
		"Nincada",
		"Ninjask",
		"Shedinja",
		"Whismur",
		"Loudred",
		"Exploud",
		"Makuhita",
		"Hariyama",
		"Azurill",
		"Nosepass",
		"Skitty",
		"Delcatty",
		"Sableye",
		"Mawile",
		"Aron",
		"Lairon",
		"Aggron",
		"Meditite",
		"Medicham",
		"Electrike",
		"Manectric",
		"Plusle",
		"Minun",
		"Volbeat",
		"Illumise",
		"Roselia",
		"Gulpin",
		"Swalot",
		"Carvanha",
		"Sharpedo",
		"Wailmer",
		"Wailord",
		"Numel",
		"Camerupt",
		"Torkoal",
		"Spoink",
		"Grumpig",
		"Spinda",
		"Trapinch",
		"Vibrava",
		"Flygon",
		"Cacnea",
		"Cacturne",
		"Swablu",
		"Altaria",
		"Zangoose",
		"Seviper",
		"Lunatone",
		"Solrock",
		"Barboach",
		"Whiscash",
		"Corphish",
		"Crawdaunt",
		"Baltoy",
		"Claydol",
		"Lileep",
		"Cradily",
		"Anorith",
		"Armaldo",
		"Feebas",
		"Milotic",
		"Castform",
		"Kecleon",
		"Shuppet",
		"Banette",
		"Duskull",
		"Dusclops",
		"Tropius",
		"Chimecho",
		"Absol",
		"Wynaut",
		"Snorunt",
		"Glalie",
		"Spheal",
		"Sealeo",
		"Walrein",
		"Clamperl",
		"Huntail",
		"Gorebyss",
		"Relicanth",
		"Luvdisc",
		"Bagon",
		"Shelgon",
		"Salamence",
		"Beldum",
		"Metang",
		"Metagross",
		"Regirock",
		"Regice",
		"Registeel",
		"Latias",
		"Latios",
		"Kyogre",
		"Groudon",
		"Rayquaza",
		"Jirachi",
		"Deoxys",
		"Turtwig",
		"Grotle",
		"Torterra",
		"Chimchar",
		"Monferno",
		"Infernape",
		"Piplup",
		"Prinplup",
		"Empoleon",
		"Starly",
		"Staravia",
		"Staraptor",
		"Bidoof",
		"Bibarel",
		"Kricketot",
		"Kricketune",
		"Shinx",
		"Luxio",
		"Luxray",
		"Budew",
		"Roserade",
		"Cranidos",
		"Rampardos",
		"Shieldon",
		"Bastiodon",
		"Burmy",
		"Wormadam",
		"Mothim",
		"Combee",
		"Vespiquen",
		"Pachirisu",
		"Buizel",
		"Floatzel",
		"Cherubi",
		"Cherrim",
		"Shellos",
		"Gastrodon",
		"Ambipom",
		"Drifloon",
		"Drifblim",
		"Buneary",
		"Lopunny",
		"Mismagius",
		"Honchkrow",
		"Glameow",
		"Purugly",
		"Chingling",
		"Stunky",
		"Skuntank",
		"Bronzor",
		"Bronzong",
		"Bonsly",
		"MimeJr.",
		"Happiny",
		"Chatot",
		"Spiritomb",
		"Gible",
		"Gabite",
		"Garchomp",
		"Munchlax",
		"Riolu",
		"Lucario",
		"Hippopotas",
		"Hippowdon",
		"Skorupi",
		"Drapion",
		"Croagunk",
		"Toxicroak",
		"Carnivine",
		"Finneon",
		"Lumineon",
		"Mantyke",
		"Snover",
		"Abomasnow",
		"Weavile",
		"Magnezone",
		"Lickilicky",
		"Rhyperior",
		"Tangrowth",
		"Electivire",
		"Magmortar",
		"Togekiss",
		"Yanmega",
		"Leafeon",
		"Glaceon",
		"Gliscor",
		"Mamoswine",
		"Porygon-Z",
		"Gallade",
		"Probopass",
		"Dusknoir",
		"Froslass",
		"Rotom",
		"Uxie",
		"Mesprit",
		"Azelf",
		"Dialga",
		"Palkia",
		"Heatran",
		"Regigigas",
		"Giratina",
		"Cresselia",
		"Phione",
		"Manaphy",
		"Darkrai",
		"Shaymin",
		"Arceus",
		"Victini",
		"Snivy",
		"Servine",
		"Serperior",
		"Tepig",
		"Pignite",
		"Emboar",
		"Oshawott",
		"Dewott",
		"Samurott",
		"Patrat",
		"Watchog",
		"Lillipup",
		"Herdier",
		"Stoutland",
		"Purrloin",
		"Liepard",
		"Pansage",
		"Simisage",
		"Pansear",
		"Simisear",
		"Panpour",
		"Simipour",
		"Munna",
		"Musharna",
		"Pidove","Tranquill","Unfezant","Blitzle","Zebstrika",
		"Roggenrola","Boldore",
		"Gigalith","Woobat",
		"Swoobat","Drilbur",
		"Excadrill","Audino",
		"Timburr","Gurdurr",
		"Conkeldurr",
		"Tympole",
		"Palpitoad",
		"Seismitoad",
		"Throh",
		"Sawk",
		"Sewaddle",
		"Swadloon",
		"Leavanny",
		"Venipede",
		"Whirlipede",
		"Scolipede",
		"Cottonee",
		"Whimsicott",
		"Petilil",
		"Lilligant",
		"Basculin",
		"Sandile",
		"Krokorok",
		"Krookodile",
		"Darumaka",
		"Darmanitan",
		"Maractus",
		"Dwebble",
		"Crustle",
		"Scraggy",
		"Scrafty",
		"Sigilyph",
		"Yamask",
		"Cofagrigus",
		"Tirtouga",
		"Carracosta",
		"Archen",
		"Archeops",
		"Trubbish",
		"Garbodor",
		"Zorua",
		"Zoroark",
		"Minccino",
		"Cinccino",
		"Gothita",
		"Gothorita",
		"Gothitelle",
		"Solosis",
		"Duosion",
		"Reuniclus",
		"Ducklett",
		"Swanna",
		"Vanillite",
		"Vanillish",
		"Vanilluxe",
		"Deerling",
		"Sawsbuck",
		"Emolga",
		"Karrablast",
		"Escavalier",
		"Foongus",
		"Amoonguss",
		"Frillish",
		"Jellicent",
		"Alomomola",
		"Joltik",
		"Galvantula",
		"Ferroseed",
		"Ferrothorn",
		"Klink",
		"Klang",
		"Klinklang",
		"Tynamo",
		"Eelektrik",
		"Eelektross",
		"Elgyem",
		"Beheeyem",
		"Litwick",
		"Lampent",
		"Chandelure",
		"Axew",
		"Fraxure",
		"Haxorus",
		"Cubchoo",
		"Beartic",
		"Cryogonal",
		"Shelmet",
		"Accelgor",
		"Stunfisk",
		"Mienfoo",
		"Mienshao",
		"Druddigon",
		"Golett",
		"Golurk",
		"Pawniard",
		"Bisharp",
		"Bouffalant",
		"Rufflet",
		"Braviary",
		"Vullaby",
		"Mandibuzz",
		"Heatmor",
		"Durant",
		"Deino",
		"Zweilous",
		"Hydreigon",
		"Larvesta",
		"Volcarona",
		"Cobalion",
		"Terrakion",
		"Virizion",
		"Tornadus",
		"Thundurus",
		"Reshiram",
		"Zekrom",
		"Landorus",
		"Kyurem",
		"Keldeo",
		"Meloetta",
	"Genesect"};

	public static boolean valid(int id){
		return id < 650 && id > 0;
	}

	public static String getName(int id){
		if(valid(id))
			return Principal.InUse == Principal.FR ? FR[id] : US[id];
			return null;
	}
}