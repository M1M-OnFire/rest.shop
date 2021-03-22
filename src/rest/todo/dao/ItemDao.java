package rest.todo.dao;

import rest.todo.dto.CategorieInItemDTO;
import rest.todo.dto.ItemCategorieDTO;
import rest.todo.model.Item;

import java.util.*;

public class ItemDao {
    private static ItemDao instance = null;


    private final Set<Item> data;

    private ItemDao() {

        data = new HashSet<>();

        data.add(new Item( "Apple",1000,"Macbook", "https://assets.stickpng.com/images/580b57fbd9996e24bc43bfd5.png", "MacBook Pro Retina 15\" Core i7 2,3 GHz - SSD 256 Go - RAM 8 Go <br> C’est en 2012 lors du Worldwide Developers Conference qu’Apple a dévoilé son MacBook Pro Retina. Il s’agit d’un MacBook équipé d’un écran Retina de 15,4 pouces, d’une coque unibody en aluminium avec un châssis plus fin et d’un système de refroidissement revisité. <br> Cet ordinateur portable intègre un puissant processeur Intel Ivy Bridge à quatre cœurs, une mémoire vive élevée et un système de doubles cartes graphiques." + "Le MacBook pro retina 15 est à la fois plus léger et plus fin que le MacBook Pro 15 dit classique sorti en 2011, avec une hauteur de 18 mm seulement pour 2 kg. Ce modèle est doté d’un boitier en aluminium d’une solidité à toute épreuve. Ce qui fait la grande différence de ce MacBook pro retina avec le modèle classique, c’est son nouvel écran Retina de 15,4 pouces affichant une magnifique résolution de 2880 x 1800 pixels avec une densité de 220 dpi. De quoi voir tout en grand. Pour cette version Retina, la firme de Cupertino a mis le paquet sur les connectiques. Sur le côté gauche, il y a le port MagSafe 2, 2 ports Thunderbolt, un port USB 3.0 et un port audio jack 3,5 mm, tandis que sur le côté droit, il est possible de retrouver un lecteur de cartes SDXC, un port HDMI et un autre port USB 3.0. Si les ports Gigabit Ethernet et FireWire ne sont plus présents, ils sont tout de même disponibles avec leur propre adaptateur Thunderbolt. Pour la connectivité, le MacBook pro retina 15 pouces est équipé du Wi-Fi 802.11n et le Bluetooth v4.0." + "Sous sa coque unibody à la finition parfaite pour un design élégant, raffiné et sobre, le MacBook pro retina utilise un processeur Intel Ivy Bridge Core i7-3615QM disposant de 4 cœurs physiques cadencés à 2,3 GHz et jusqu’à 3,3 GHz avec Turbo Boost 2.0, et 8 cœurs virtuels. Ce processeur est accompagné par une mémoire RAM DDR3 de 8 Go et d’une mémoire de stockage SSD de 256 Go. Au niveau de la partie graphique, le MacBook pro retina 15 est doté du combo Intel GMA HD 4000 intégré au processeur et Nvidia GeForce GT 650M avec architecture Kepler, 384 ALUs, bus de 128 bits et VRAM GDDR5 de 1024 Mo. Avec cette configuration, les utilisateurs n’auront aucun mal à traiter des vidéos en Ultra HD 4K ou à jouer aux jeux récents avec une excellente qualité graphique." + "Ce produit est fait pour vous si vous souhaitez profiter d’un ordinateur portable avec un magnifique écran Retina affichant une très haute résolution, et équipé de composants de dernière génération pour faire tourner toutes les applications, les jeux et les logiciels sans aucun temps de latence et avec une grande fluidité."));

        data.add(new Item("Asus", 1050, "Zenbook", "https://media.materiel.net/r550/products/MN0005467071_1_0005687887.jpg","Le Zenbook UX431FA-AM140T est le fruit d'un véritable travail d'orfèvre ! Avec ses 16 mm d'épaisseur et ses 1,39 kg sur la balance, il sait rester résolument mobile ! <br> Mais le Zenbook UX431 se distingue aussi grâce à sa charnière ErgoLift : en bref, dès l'ouverture, la partie clavier se réhausse, ce qui vous confère une meilleure position de saisie ! <br> Autre avantage non négligeable, cela contribue à une meilleure circulation de l'air sous votre PC pour un refroidissement encore optimisé !"));

        data.add(new Item( "Apple", 1500, "Mac", "https://www.journaldugeek.com/content/uploads/2018/07/macbook-air.jpg","Macbook 12\" Intel Core i5 1,3 GHz - SSD 512 Go - RAM 8 Go"  + " Autonomie (Donnée Constructeur) : Jusqu'À 9 Heures " + " Système D'Exploitation : Mac Os " + " Souris : Trackpad Force Touch " + " Microphone Intégré : Oui " + " Type De Batterie : Lithium Polymer " + " Ecran : 12 Pouces " + " Lecteur Optique : Pas De Lecteur Optique " + " Chargeur Secteur : Oui " + " Webcam Intégrée : Webcam 640 X 480 Pixels " + " Fréquence (En Mhz) : 1600 " + " Son : Haut-Parleurs Stéréos Intégrés " + " Définition De L'Écran : 2304 X 1440 Pixels " + "  Coloris : Or (Gold)" + " Full Hd : Oui " + " Capacité Ssd (En Go) : 512 " + " Mémoire Vive : 8 Go de mémoire LPDDR3 à 1 866 MHz " + " Référence Et Spécificités : Intel Core i5 bicoeur de 7ème génération : 1,3 Ghz ; Turbo 3,2 Ghz /  4 Threads / 4 Mo De Mémoire Cache " + "  Port Usb 3.1 Gen 1 (Type C): 1, Sortie Casque: 1 " + " Contrôleur Graphique : Intel HD Graphics 615 " + " Clavier : Chiclet Rétroéclairé :Les Touches Du Clavier Sont Séparées Et Rétroéclairées Afin D'Éviter Les Erreurs De Frappe Et De Faciliter La Saisie " + " Dimensions L X H X P : 28.05 X 1.31 X 19.65 Cm"));

        data.add(new Item("Dell", 700, "Dell laptop", "https://i.dell.com/is/image/DellContent//content/dam/global-asset-library/Products/Notebooks/XPS/13_7390_non-touch/xs7390nt_xnb_ces19_shot_03.psd?fmt=pjpg&pscan=auto&scl=1&wid=3670&hei=2060&qlt=85,0&resMode=sharp2&op_usm=1.75,0.3,2,0&size=3670,2060","Superbe à l’intérieur comme à l’extérieur" + "Le plus petit ordinateur portable 13 pouces au monde. Arborant des matériaux révolutionnaires et une batterie très longue durée." + "Un affichage inégalé" + "Des bords plus fins, plus de pixels : nous avons amélioré tous les aspects de l’écran. <br> Profitez d’un écran qui semble illimité avec un bord InfinityEdge 23 % plus fin : seulement 4 mm d’épaisseur pour un taux écran-boîtier de 80,7 %. Découvrez tous les petits détails, auparavant invisibles, grâce à la résolution Ultra HD 4K aux 8 millions de pixels. " + "Image parfaite : en optimisant le spectre de couleurs avec une couverture des couleurs sRVB à 100 % et un taux de contraste de 1500:1, chaque ombre prend forme et même les scènes les plus lumineuses bénéficient d’une définition optimisée." + "Superbe affichage à partir de n’importe quel angle : l’écran antireflet associé à une luminosité de 400 nit vous permet de profiter de vos divertissements à l’extérieur. En outre, l’écran IPS offre un plus grand angle d’affichage, afin de partager votre écran sans manquer quoi que ce soit."));

        data.add(new Item("Logitech", 20, "Clavier",  "https://images-na.ssl-images-amazon.com/images/I/51SahJF-bCL._AC_SX569_.jpg","Eclairage LIGHTSYNC RVB: Le clavier gaming G213 par Logitech offre cinq zones d'éclairage individuelles, chacune étant personnalisable à partir d'une palette de près de 16,8 millions de couleurs" + "Résistant aux Eclaboussures et Durable: Le clavier mécanique pour gamer G213 est conçu avec une résistance aux éclaboussures éprouvée avec 60 ml de liquide afin d’éviter les accidents" + "Repose-Poignets Intégrés et Pieds Réglables: Profitez d’un design confortable et ergonomique avec le clavier gaming Logitech G213, ses repose-poignets intégrés améliorent le confort" + "Personnalisation avec l’Assistant pour Jeux Vidéo de Logitech: Ce clavier est personnalisable grâce à l'assistant pour jeux vidéo de Logitech,pour une commodité et une personnalisation sans égales" + "Commandes Multimédia Dédiées: Avec le clavier mécanique G213 Prodigy vous pouvez contrôler le son au cours de votre partie sans perdre de temps" + "Configuration système requise : Windows 7 ou version ultérieure"));

        //Téléphonie
        data.add(new Item("Apple", 750.0, "iPhone",  "https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/iphone-12-green-select-2020?wid=470&hei=556&fmt=jpeg&qlt=95&op_usm=0.5,0.5&.v=1604343704000", "Un produit Reconditionné Certifié a été testé et certifié pour se présenter et fonctionner comme un produit neuf. Le produit bénéfice d’une garantie d’un an minimum, et peut arriver dans une boîte générique brune ou blanche. Le produit est livré avec tous les accessoires pertinents, sauf les écouteurs, manuel ou carte SIM. Les accessoires peuvent être génériques et pas directement du fabricant." + "Apple Smartphone 4G-LTE Advanced IP67 - Apple A11 Bionic Hexa-Core - RAM 64Go - Ecran Retina 4.7' 75"));

        data.add(new Item( "Samsung", 800.0, "Galaxy S20","https://images.samsung.com/is/image/samsung/p5/nz/smartphones/galaxy-s20/buy/S20-FE_Navy_SKUimage_MO-img.jpg", "Samsung Galaxy S20 4G 128GB 8GB RAM DS Cosmic Gray EU" + "Processeur: Snapdragon 865 2,84 GHz / Exynos 990 2,73 GHz" + "Appareil photo: Triple, 12MP + 64MP + 12MP" + "Batterie: 4000 mAh" + "OS: Android 10" + "Résolution d'écran: 1440 x 3200 pixels"));

        data.add(new Item("HP", 1200.0, "HP Ordinateur Fixe", "https://image.darty.com/informatique/bureau-bureau/bureau/hp_a_24_i5_8_512_s2009074849795A_114710342.jpg", "De son design impeccable à sa puissance et ses performances, l'ordinateur tout-en-un HP Pavilion est fait pour s'attaquer à des projets exigeants et profiter de marathons cinématographiques, tout en offrant une belle apparence. Alliant parfaitement forme et fonction, il s'intègre parfaitement dans n'importe quelle maison." ));

        data.add(new Item("Powerbank", 20.0, "Chargeur telephone", "https://images-na.ssl-images-amazon.com/images/I/61uewq8j-OL._AC_SL1500_.jpg","【Batterie Externe Haute Capacité】: batterie externe 24800mAh de très haute capacité peut recharger tout smartphones au moins 5 fois(pour iPhone X 6 fois , iPhone 8 9 fois , iPhone 8Plus 6 fois, iPhone 7 8 fois, iPhone 6S environ 8 fois, Samsung Galaxy S8 6 fois .)<br> Dimension: 150* 15* 75mm. Poids: 350g. Garantie de 24 mois" + "【Power Bank de Haute vitesse de charge】: power bank de 2 ports de USB sortie tous équipés de la technologie avancée détectent l'état de votre appareil et fournissent sa vitesse de charge la plus rapide avec deux ports de sortie 5V 2.1A / 5V 1A" + "【Batterie de Secours Protection de Sécurité】: 5 Systèmes de sécurité: powerbank équipés d'une protection surchargée, surchargée, de surtension, de surintensité et de court-circuit. Garantie de sécurité pour vos appareils" + "【Chargeur Portable pour Lumières LED Multifonctions】: La lampe de poche LED intégrée affiche 1 mode. Avec quatre voyants LED affichant la puissance restante dans le chargeur portable.Appuyez longuement pour ouvrir, puis appuyez longuement pour fermer"));

        //Stockage
        data.add(new Item("Seagate", 50.0, "Disque dur externe 1TO", "https://static.fnac-static.com/multimedia/Images/FR/MDM/02/b0/d2/13807618/1540-1.jpg", "Un stockage et des déplacements simplifiés" + "Plus de stress grâce à cette solution de sauvegarde simple et fiable. Simple, compact et compatible avec les PC, le disque portable Seagate® Basic est une solution de stockage d'appoint portable et vous permet d'emmener des fichiers volumineux lors de vos déplacements." + "Bénéficiez de la fonction simple de glisser-déposer Augmentez la capacité de votre ordinateur grâce à une solution compacte et légère Tirez parti de la compatibilité instantanée entre le plug-and-play et votre PC Transférez rapidement des fichiers grâce à l'USB 3.0 qui est rétrocompatible avec l'USB 2.0" + "L'installation sur PC est simple et rapide : il vous suffit de connecter un simple câble USB, et le tour est joué ! Le disque est alimenté par le câble USB ; aucune source d'alimentation externe n'est donc nécessaire. De plus, il est automatiquement reconnu par le système d'exploitation Windows®1,2 : vous n'avez aucun logiciel à installer ni aucune configuration à effectuer. Connectez-vous et profitez du débit rapide de transfert de données qu'offre l'interface USB 3.0 en reliant le disque à un port SuperSpeed USB 3.0."));

        data.add(new Item(  "Seagate", 100.0,"Disque dur externe 3TO", "https://images-na.ssl-images-amazon.com/images/I/61XBOi8VI7L._AC_SY355_.jpg", "Stockez photos, films, musique et autres fichiers pour les années à venir grâce à une immense capacité de stockage pour PC de bureau" + "Conçu pour fonctionner avec les ordinateurs Windows, ce disque USB externe permet des sauvegardes aisées par simple glisser-déposer" + "Sa configuration est un vrai jeu d'enfant ! Il vous suffit de le connecter à votre PC Windows pour qu'il soit automatiquement détecté sans qu'aucun logiciel ne soit requis" + "Inclut un câble USB 3.0 de 46 cm et un adaptateur secteur 18 W" + "Gagnez durablement en tranquillité d'esprit grâce à la garantie limitée d'un an incluse Deux ans (EMEA) Trois ans (APAC)" ));

        data.add(new Item("Sandisk", 15.0, "Clé USB Sandisk 64go", "https://media.ldlc.com/r1600/ld/products/00/01/34/36/LD0001343681_2.jpg", "Plus vite vous pouvez transférer du contenu, plus vous pouvez commencer à vous amuser, ou travailler, rapidement. La clé USB SanDisk Ultra 3.0 de 64 Go offre des vitesses de lecture ultra-élevées allant jusqu'à 80 Mo/s. Vous pouvez ainsi transférer des vidéos importantes en HD, photos et d'autres fichiers en une fraction de seconde, bien plus que ce que peut faire la technologie USB 2.0." + "Elle inclut aussi le logiciel SanDisk SecureAccess avec une fonction de cryptage des fichiers 128 bits et une protection par mot de passe, afin que même vos fichiers confidentiels les plus volumineux restent protégés, tout en vous laissant partager les fichiers que vous voulez."));

        data.add(new Item( "Sony", 220.0, "Super clé USB 128go", "https://i.ebayimg.com/images/g/stwAAOSwbs9fvcXP/s-l300.jpg", "Capacité de mémoire maximale 128 Go" + "Marque Sony ( SONY )" + "Vitesse de lecture 226 mégaoctets par seconde" + "À propos de ce produit" + "Privilège de téléchargement gratuit \"Memory Card File Rescue\" (nécessite un environnement Internet)" + "Interface: USB3.0" + "Capacité: 128 Go Couleur: Or" + "Type de glissière à frapper, équipé d'une LED d'accès aux données" + "Transfert à grande vitesse de gros volumes de données avec une vitesse de lecture maximale de 226 Mo / s (en cas de connexion via USB3.0)" + "Le voyant de l'unité principale clignote pendant l'accès, par exemple pendant le transfert de données. Vous évite de retirer accidentellement l'appareil de votre ordinateur pendant le transfert de données." + "Utilise un \"mécanisme de cliquetis\" qui permet à la borne USB d'être insérée et retirée en douceur." + "Une pression avec la facilité d'un stylo à bille." + "Il n'y a pas de soucis lors de la connexion à un ordinateur et il n'y a pas besoin de s'inquiéter de perdre le capuchon." + "Le corps mince d'une largeur de 19,7 mm ne bloque pas les autres interfaces lors de la connexion." + "Mesures contre les fuites d'informations grâce au logiciel de cryptage de fichiers puissant \"LB File Lock 2\"" + "C'est un logiciel qui récupère les données enregistrées dans la mesure du possible lorsque les données enregistrées dans le bit de poche ne peuvent pas être lues." + "Sony Le logiciel original qui vous permet de créer facilement des clips vidéo à partir de photos prises avec un appareil photo numérique." + "Même si vous connectez plusieurs périphériques USB en même temps, il affiche son propre nom de volume afin que vous puissiez savoir en un coup d'œil quel lecteur est le Pocket Bit." + "Vous n'avez pas à vous soucier de l'utilisation accidentelle d'un autre lecteur lors de l'accès ou du retrait en toute sécurité." + "Il est très facile à utiliser car il est automatiquement reconnu en le connectant directement à la borne USB qui est l'équipement standard sur la plupart des ordinateurs. Aucun lecteur / écrivain n'est requis." + "De plus, comme l'alimentation est fournie par USB, aucun adaptateur secteur n'est requis."));

        data.add(new Item( "Aucune", 20.0,"Accessoire Disque Dur", "https://www.cdiscount.com/pdt2/6/4/2/1/700x700/auc3548389246642/rw/accessoire-disque-dur-generique-boitier-externe-us.jpg", "Accessoire disque dur GENERIQUE Boîtier externe US"));

        data.add(new Item("Siemens",30.0 ,"Téléphone fixe","https://image.darty.com/telephonie/telephone_sans_fil/telephone_sans_fil/siemens_gigaset_c_470_t001215v1a_1185806603243.jpg","Téléphone simple mais riche en fonctionnalités !" + "Doté d'un écran graphique rétro-éclairé de 4096 couleurs, vous apprécierez la  présentation du numéro ainsi que la fonction mains-libres." + "Vous pouvez envoyer et recevoir des SMS et en conserver jusqu'à 30 dans 3 boîtes personnelles + 1 boîte commune." + "Vous avez le choix entre 15 mélodies dont 5 polyphoniques et vous pouvez profiter da la fonction réveil."));
    }

    public static ItemDao getInstance() {
        if(instance == null){
            instance = new ItemDao();
        }
        return instance;
    }

    public Set<Item> getAll(){
        return data;
    }

    public Set<CategorieInItemDTO> getAllItemCategorie(){
        Set<CategorieInItemDTO> itemCategorieSet = new HashSet<>();
        data.forEach(item -> {
            CategorieDao.getInstance()
                    .getAll()
                    .forEach(categorie -> {
                        if(categorie.getItems().contains(item)){
                            itemCategorieSet.add(new CategorieInItemDTO(categorie, item));
                        }
                    });
        });
        return itemCategorieSet;
    }

    public void update(Item item){
        getAll().remove(item);
        getAll().add(item);
    }

    public void delete(Item item){
        getAll().remove(item);
    }

    public Item get(String id){
        return data.stream().filter(item -> item.getId().equals(id)).findFirst().get();
    };

    public void add(Item item){
        data.add(item);
    }
}
