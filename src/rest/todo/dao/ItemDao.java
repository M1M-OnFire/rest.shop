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

        data.add(new Item( "Apple",1000,"Macbook", "https://assets.stickpng.com/images/580b57fbd9996e24bc43bfd5.png", "MacBook Pro Retina 15\" Core i7 2,3 GHz - SSD 256 Go - RAM 8 Go  C’est en 2012 lors du Worldwide Developers Conference qu’Apple a devoile son MacBook Pro Retina. Il s’agit d’un MacBook equipe d’un ecran Retina de 15,4 pouces, d’une coque unibody en aluminium avec un chassis plus fin et d’un systeme de refroidissement revisite.  Cet ordinateur portable integre un puissant processeur Intel Ivy Bridge a quatre cœurs, une memoire vive elevee et un systeme de doubles cartes graphiques." + "Le MacBook pro retina 15 est a la fois plus leger et plus fin que le MacBook Pro 15 dit classique sorti en 2011, avec une hauteur de 18 mm seulement pour 2 kg. Ce modele est dote d’un boitier en aluminium d’une solidite a toute epreuve. Ce qui fait la grande difference de ce MacBook pro retina avec le modele classique, c’est son nouvel ecran Retina de 15,4 pouces affichant une magnifique resolution de 2880 x 1800 pixels avec une densite de 220 dpi. De quoi voir tout en grand. Pour cette version Retina, la firme de Cupertino a mis le paquet sur les connectiques. Sur le côte gauche, il y a le port MagSafe 2, 2 ports Thunderbolt, un port USB 3.0 et un port audio jack 3,5 mm, tandis que sur le côte droit, il est possible de retrouver un lecteur de cartes SDXC, un port HDMI et un autre port USB 3.0. Si les ports Gigabit Ethernet et FireWire ne sont plus presents, ils sont tout de meme disponibles avec leur propre adaptateur Thunderbolt. Pour la connectivite, le MacBook pro retina 15 pouces est equipe du Wi-Fi 802.11n et le Bluetooth v4.0." + "Sous sa coque unibody a la finition parfaite pour un design elegant, raffine et sobre, le MacBook pro retina utilise un processeur Intel Ivy Bridge Core i7-3615QM disposant de 4 cœurs physiques cadences a 2,3 GHz et jusqu’a 3,3 GHz avec Turbo Boost 2.0, et 8 cœurs virtuels. Ce processeur est accompagne par une memoire RAM DDR3 de 8 Go et d’une memoire de stockage SSD de 256 Go. Au niveau de la partie graphique, le MacBook pro retina 15 est dote du combo Intel GMA HD 4000 integre au processeur et Nvidia GeForce GT 650M avec architecture Kepler, 384 ALUs, bus de 128 bits et VRAM GDDR5 de 1024 Mo. Avec cette configuration, les utilisateurs n’auront aucun mal a traiter des videos en Ultra HD 4K ou a jouer aux jeux recents avec une excellente qualite graphique." + "Ce produit est fait pour vous si vous souhaitez profiter d’un ordinateur portable avec un magnifique ecran Retina affichant une tres haute resolution, et equipe de composants de derniere generation pour faire tourner toutes les applications, les jeux et les logiciels sans aucun temps de latence et avec une grande fluidite."));

        data.add(new Item("Asus", 1050, "Zenbook", "https://media.materiel.net/r550/products/MN0005467071_1_0005687887.jpg","Le Zenbook UX431FA-AM140T est le fruit d'un veritable travail d'orfevre ! Avec ses 16 mm d'epaisseur et ses 1,39 kg sur la balance, il sait rester resolument mobile !  Mais le Zenbook UX431 se distingue aussi grace a sa charniere ErgoLift : en bref, des l'ouverture, la partie clavier se rehausse, ce qui vous confere une meilleure position de saisie !  Autre avantage non negligeable, cela contribue a une meilleure circulation de l'air sous votre PC pour un refroidissement encore optimise !"));

        data.add(new Item( "Apple", 1500, "Mac", "https://www.journaldugeek.com/content/uploads/2018/07/macbook-air.jpg","Macbook 12\" Intel Core i5 1,3 GHz - SSD 512 Go - RAM 8 Go"  + " Autonomie (Donnee Constructeur) : Jusqu'a 9 Heures " + " Systeme D'Exploitation : Mac Os " + " Souris : Trackpad Force Touch " + " Microphone Integre : Oui " + " Type De Batterie : Lithium Polymer " + " Ecran : 12 Pouces " + " Lecteur Optique : Pas De Lecteur Optique " + " Chargeur Secteur : Oui " + " Webcam Integree : Webcam 640 X 480 Pixels " + " Frequence (En Mhz) : 1600 " + " Son : Haut-Parleurs Stereos Integres " + " Definition De L'ecran : 2304 X 1440 Pixels " + "  Coloris : Or (Gold)" + " Full Hd : Oui " + " Capacite Ssd (En Go) : 512 " + " Memoire Vive : 8 Go de memoire LPDDR3 a 1 866 MHz " + " Reference Et Specificites : Intel Core i5 bicoeur de 7eme generation : 1,3 Ghz ; Turbo 3,2 Ghz /  4 Threads / 4 Mo De Memoire Cache " + "  Port Usb 3.1 Gen 1 (Type C): 1, Sortie Casque: 1 " + " Contrôleur Graphique : Intel HD Graphics 615 " + " Clavier : Chiclet Retroeclaire :Les Touches Du Clavier Sont Separees Et Retroeclairees Afin D'eviter Les Erreurs De Frappe Et De Faciliter La Saisie " + " Dimensions L X H X P : 28.05 X 1.31 X 19.65 Cm"));

        data.add(new Item("Dell", 700, "Dell laptop", "https://i.dell.com/is/image/DellContent//content/dam/global-asset-library/Products/Notebooks/XPS/13_7390_non-touch/xs7390nt_xnb_ces19_shot_03.psd?fmt=pjpg&pscan=auto&scl=1&wid=3670&hei=2060&qlt=85,0&resMode=sharp2&op_usm=1.75,0.3,2,0&size=3670,2060","Superbe a l’interieur comme a l’exterieur" + "Le plus petit ordinateur portable 13 pouces au monde. Arborant des materiaux revolutionnaires et une batterie tres longue duree." + "Un affichage inegale" + "Des bords plus fins, plus de pixels : nous avons ameliore tous les aspects de l’ecran.  Profitez d’un ecran qui semble illimite avec un bord InfinityEdge 23 % plus fin : seulement 4 mm d’epaisseur pour un taux ecran-boîtier de 80,7 %. Decouvrez tous les petits details, auparavant invisibles, grace a la resolution Ultra HD 4K aux 8 millions de pixels. " + "Image parfaite : en optimisant le spectre de couleurs avec une couverture des couleurs sRVB a 100 % et un taux de contraste de 1500:1, chaque ombre prend forme et meme les scenes les plus lumineuses beneficient d’une definition optimisee." + "Superbe affichage a partir de n’importe quel angle : l’ecran antireflet associe a une luminosite de 400 nit vous permet de profiter de vos divertissements a l’exterieur. En outre, l’ecran IPS offre un plus grand angle d’affichage, afin de partager votre ecran sans manquer quoi que ce soit."));

        data.add(new Item("Logitech", 20, "Clavier",  "https://images-na.ssl-images-amazon.com/images/I/51SahJF-bCL._AC_SX569_.jpg","Eclairage LIGHTSYNC RVB: Le clavier gaming G213 par Logitech offre cinq zones d'eclairage individuelles, chacune etant personnalisable a partir d'une palette de pres de 16,8 millions de couleurs" + "Resistant aux Eclaboussures et Durable: Le clavier mecanique pour gamer G213 est concu avec une resistance aux eclaboussures eprouvee avec 60 ml de liquide afin d’eviter les accidents" + "Repose-Poignets Integres et Pieds Reglables: Profitez d’un design confortable et ergonomique avec le clavier gaming Logitech G213, ses repose-poignets integres ameliorent le confort" + "Personnalisation avec l’Assistant pour Jeux Video de Logitech: Ce clavier est personnalisable grace a l'assistant pour jeux video de Logitech,pour une commodite et une personnalisation sans egales" + "Commandes Multimedia Dediees: Avec le clavier mecanique G213 Prodigy vous pouvez contrôler le son au cours de votre partie sans perdre de temps" + "Configuration systeme requise : Windows 7 ou version ulterieure"));

        //Telephonie
        data.add(new Item("Apple", 750.0, "iPhone",  "https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/iphone-12-green-select-2020?wid=470&hei=556&fmt=jpeg&qlt=95&op_usm=0.5,0.5&.v=1604343704000", "Un produit Reconditionne Certifie a ete teste et certifie pour se presenter et fonctionner comme un produit neuf. Le produit benefice d’une garantie d’un an minimum, et peut arriver dans une boîte generique brune ou blanche. Le produit est livre avec tous les accessoires pertinents, sauf les ecouteurs, manuel ou carte SIM. Les accessoires peuvent etre generiques et pas directement du fabricant." + "Apple Smartphone 4G-LTE Advanced IP67 - Apple A11 Bionic Hexa-Core - RAM 64Go - Ecran Retina 4.7' 75"));

        data.add(new Item( "Samsung", 800.0, "Galaxy S20","https://images.samsung.com/is/image/samsung/p5/nz/smartphones/galaxy-s20/buy/S20-FE_Navy_SKUimage_MO-img.jpg", "Samsung Galaxy S20 4G 128GB 8GB RAM DS Cosmic Gray EU" + "Processeur: Snapdragon 865 2,84 GHz / Exynos 990 2,73 GHz" + "Appareil photo: Triple, 12MP + 64MP + 12MP" + "Batterie: 4000 mAh" + "OS: Android 10" + "Resolution d'ecran: 1440 x 3200 pixels"));

        data.add(new Item("HP", 1200.0, "HP Ordinateur Fixe", "https://image.darty.com/informatique/bureau-bureau/bureau/hp_a_24_i5_8_512_s2009074849795A_114710342.jpg", "De son design impeccable a sa puissance et ses performances, l'ordinateur tout-en-un HP Pavilion est fait pour s'attaquer a des projets exigeants et profiter de marathons cinematographiques, tout en offrant une belle apparence. Alliant parfaitement forme et fonction, il s'integre parfaitement dans n'importe quelle maison." ));

        data.add(new Item("Powerbank", 20.0, "Chargeur telephone", "https://images-na.ssl-images-amazon.com/images/I/61uewq8j-OL._AC_SL1500_.jpg","【Batterie Externe Haute Capacite】: batterie externe 24800mAh de tres haute capacite peut recharger tout smartphones au moins 5 fois(pour iPhone X 6 fois , iPhone 8 9 fois , iPhone 8Plus 6 fois, iPhone 7 8 fois, iPhone 6S environ 8 fois, Samsung Galaxy S8 6 fois .) Dimension: 150* 15* 75mm. Poids: 350g. Garantie de 24 mois" + "【Power Bank de Haute vitesse de charge】: power bank de 2 ports de USB sortie tous equipes de la technologie avancee detectent l'etat de votre appareil et fournissent sa vitesse de charge la plus rapide avec deux ports de sortie 5V 2.1A / 5V 1A" + "【Batterie de Secours Protection de Securite】: 5 Systemes de securite: powerbank equipes d'une protection surchargee, surchargee, de surtension, de surintensite et de court-circuit. Garantie de securite pour vos appareils" + "【Chargeur Portable pour Lumieres LED Multifonctions】: La lampe de poche LED integree affiche 1 mode. Avec quatre voyants LED affichant la puissance restante dans le chargeur portable.Appuyez longuement pour ouvrir, puis appuyez longuement pour fermer"));

        //Stockage
        data.add(new Item("Seagate", 50.0, "Disque dur externe 1TO", "https://static.fnac-static.com/multimedia/Images/FR/MDM/02/b0/d2/13807618/1540-1.jpg", "Un stockage et des deplacements simplifies" + "Plus de stress grace a cette solution de sauvegarde simple et fiable. Simple, compact et compatible avec les PC, le disque portable Seagate® Basic est une solution de stockage d'appoint portable et vous permet d'emmener des fichiers volumineux lors de vos deplacements." + "Beneficiez de la fonction simple de glisser-deposer Augmentez la capacite de votre ordinateur grace a une solution compacte et legere Tirez parti de la compatibilite instantanee entre le plug-and-play et votre PC Transferez rapidement des fichiers grace a l'USB 3.0 qui est retrocompatible avec l'USB 2.0" + "L'installation sur PC est simple et rapide : il vous suffit de connecter un simple cable USB, et le tour est joue ! Le disque est alimente par le cable USB ; aucune source d'alimentation externe n'est donc necessaire. De plus, il est automatiquement reconnu par le systeme d'exploitation Windows®1,2 : vous n'avez aucun logiciel a installer ni aucune configuration a effectuer. Connectez-vous et profitez du debit rapide de transfert de donnees qu'offre l'interface USB 3.0 en reliant le disque a un port SuperSpeed USB 3.0."));

        data.add(new Item(  "Seagate", 100.0,"Disque dur externe 3TO", "https://images-na.ssl-images-amazon.com/images/I/61XBOi8VI7L._AC_SY355_.jpg", "Stockez photos, films, musique et autres fichiers pour les annees a venir grace a une immense capacite de stockage pour PC de bureau" + "Concu pour fonctionner avec les ordinateurs Windows, ce disque USB externe permet des sauvegardes aisees par simple glisser-deposer" + "Sa configuration est un vrai jeu d'enfant ! Il vous suffit de le connecter a votre PC Windows pour qu'il soit automatiquement detecte sans qu'aucun logiciel ne soit requis" + "Inclut un cable USB 3.0 de 46 cm et un adaptateur secteur 18 W" + "Gagnez durablement en tranquillite d'esprit grace a la garantie limitee d'un an incluse Deux ans (EMEA) Trois ans (APAC)" ));

        data.add(new Item("Sandisk", 15.0, "Cle USB Sandisk 64go", "https://media.ldlc.com/r1600/ld/products/00/01/34/36/LD0001343681_2.jpg", "Plus vite vous pouvez transferer du contenu, plus vous pouvez commencer a vous amuser, ou travailler, rapidement. La cle USB SanDisk Ultra 3.0 de 64 Go offre des vitesses de lecture ultra-elevees allant jusqu'a 80 Mo/s. Vous pouvez ainsi transferer des videos importantes en HD, photos et d'autres fichiers en une fraction de seconde, bien plus que ce que peut faire la technologie USB 2.0." + "Elle inclut aussi le logiciel SanDisk SecureAccess avec une fonction de cryptage des fichiers 128 bits et une protection par mot de passe, afin que meme vos fichiers confidentiels les plus volumineux restent proteges, tout en vous laissant partager les fichiers que vous voulez."));

        data.add(new Item( "Sony", 220.0, "Super cle USB 128go", "https://i.ebayimg.com/images/g/stwAAOSwbs9fvcXP/s-l300.jpg", "Capacite de memoire maximale 128 Go" + "Marque Sony ( SONY )" + "Vitesse de lecture 226 megaoctets par seconde" + "a propos de ce produit" + "Privilege de telechargement gratuit \"Memory Card File Rescue\" (necessite un environnement Internet)" + "Interface: USB3.0" + "Capacite: 128 Go Couleur: Or" + "Type de glissiere a frapper, equipe d'une LED d'acces aux donnees" + "Transfert a grande vitesse de gros volumes de donnees avec une vitesse de lecture maximale de 226 Mo / s (en cas de connexion via USB3.0)" + "Le voyant de l'unite principale clignote pendant l'acces, par exemple pendant le transfert de donnees. Vous evite de retirer accidentellement l'appareil de votre ordinateur pendant le transfert de donnees." + "Utilise un \"mecanisme de cliquetis\" qui permet a la borne USB d'etre inseree et retiree en douceur." + "Une pression avec la facilite d'un stylo a bille." + "Il n'y a pas de soucis lors de la connexion a un ordinateur et il n'y a pas besoin de s'inquieter de perdre le capuchon." + "Le corps mince d'une largeur de 19,7 mm ne bloque pas les autres interfaces lors de la connexion." + "Mesures contre les fuites d'informations grace au logiciel de cryptage de fichiers puissant \"LB File Lock 2\"" + "C'est un logiciel qui recupere les donnees enregistrees dans la mesure du possible lorsque les donnees enregistrees dans le bit de poche ne peuvent pas etre lues." + "Sony Le logiciel original qui vous permet de creer facilement des clips video a partir de photos prises avec un appareil photo numerique." + "Meme si vous connectez plusieurs peripheriques USB en meme temps, il affiche son propre nom de volume afin que vous puissiez savoir en un coup d'œil quel lecteur est le Pocket Bit." + "Vous n'avez pas a vous soucier de l'utilisation accidentelle d'un autre lecteur lors de l'acces ou du retrait en toute securite." + "Il est tres facile a utiliser car il est automatiquement reconnu en le connectant directement a la borne USB qui est l'equipement standard sur la plupart des ordinateurs. Aucun lecteur / ecrivain n'est requis." + "De plus, comme l'alimentation est fournie par USB, aucun adaptateur secteur n'est requis."));

        data.add(new Item( "Aucune", 20.0,"Accessoire Disque Dur", "https://www.cdiscount.com/pdt2/6/4/2/1/700x700/auc3548389246642/rw/accessoire-disque-dur-generique-boitier-externe-us.jpg", "Accessoire disque dur GENERIQUE Boîtier externe US"));

        data.add(new Item("Siemens",30.0 ,"Telephone fixe","https://image.darty.com/telephonie/telephone_sans_fil/telephone_sans_fil/siemens_gigaset_c_470_t001215v1a_1185806603243.jpg","Telephone simple mais riche en fonctionnalites !" + "Dote d'un ecran graphique retro-eclaire de 4096 couleurs, vous apprecierez la  presentation du numero ainsi que la fonction mains-libres." + "Vous pouvez envoyer et recevoir des SMS et en conserver jusqu'a 30 dans 3 boîtes personnelles + 1 boîte commune." + "Vous avez le choix entre 15 melodies dont 5 polyphoniques et vous pouvez profiter da la fonction reveil."));
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
