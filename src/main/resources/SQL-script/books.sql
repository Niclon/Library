ALTER DATABASE db_vis CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

INSERT INTO books (bid,autor, description, name)
VALUES (1,'J.R.R. Tolkien', 'Toto je trilogie pána prstenů.', 'Pán prstenů');
INSERT INTO books (bid,autor, description, name)
VALUES (2,'Pepa Barot', 'Toto je kniha o důvodech proč brát věci postupně.', 'Raz Dva');
INSERT INTO books (bid,autor, description, name)
VALUES (3,'Petr Vychodil', 'Tato kniha zobrazuje studiumm Petra na Vysoké škole báňské.', 'Příběhy líného studenta Petra');
INSERT INTO books (bid,autor, description, name)
VALUES (4,'George Orwell', 'Jedno z nejznámějších děl světové literatury našeho storokého pojí v sebě prvky společensko-politického a vědecko-fantastického románu. Je obžalobou komunistické diktatury, která v roku 1984 ovládá všecko, vrací lidské myšlení.', '1984');
INSERT INTO books (bid,autor, description, name)
VALUES (5,'Ernest Hemingway', 'Ernest Hemingway obdržel Nobelovu cenu „za mistrovství v umění vyprávět, naposledy prokázané v díle Stařec a moře, a za to, jak ovlivnil literární styl své doby.“ Hemingwayova novela se brzy po svém prvním vydání roku 1952 stala jedním ze zásadních děl moderní americké prózy. Z příběhu rybáře, jenž se v nevelkém člunu pouští do zápasu s obrovským marlínem a potom do posledních sil bojuje s přesilou žraloků, kteří napadnou jeho úlovek, dokázal spisovatel na malém prostoru vytvořit existenciální drama o hrdinství, vůli a vnitřní síle.', 'Stařec a moře');
INSERT INTO books (bid,autor, description, name)
VALUES (6,'Jack London', 'Příběh Bílého tesáka se odehrává během zlaté horečky na sklonku devatenáctého století v Kanadě a západní části Spojených států. V tomto dobrodružném a romantickém prostředí má čtenář možnost sledovat osudy vlka, který se snaží přežít a přizpůsobit neustálým změnám svého okolí.', 'Bílý tesák');
INSERT INTO books (bid,autor, description, name)
VALUES (7,'Jostein Gaarder', 'Román o dějinách filosofie. Norský učitel kombinací zdánlivě neatraktivních témat, jako jsou dějiny filosofie a příběh dospívání patnáctileté dívky, vytvořil knížku, která slaví mezi čtenáři neuvěřitelný úspěch. V roce 1995 se stala nejprodávanější knihou na světě', 'Sofiin svět');
INSERT INTO books (bid,autor, description, name)
VALUES (8,'Victor Hugo', 'V devatenáctém století se na těžké galeje mohl dostat třeba člověk, který zcizil bochník obyčejného chleba. Pokud se z nucených prací pokusil uprchnout, za kus pečiva pak musel v nelidských podmínkách lámat kámen víc než dvacet let. Takový byl i smutný osud Jeana Valjeana. ', 'Bídníci');
INSERT INTO books (bid,autor, description, name)
VALUES (9,'Anthony Doerr', 'David Winkler, tichý chlapec okouzlený nestálostí počasí a posedlý sněhem, žije na Aljašce ve městě Anchorage. Někdy vidí události ještě předtím, než se stanou: muže s krabicí na klobouky srazí autobus, sám David se v supermarketu zamiluje do krásné ženy.', 'O dívce Grace');
INSERT INTO books (bid,autor, description, name)
VALUES (10,'Victor Hugo', 'Historický román odehrávající se v Paříži v 15. století za vlády Ludvíka XI., vystavěný v chronologické kompozici s v romantismu obvyklými prvky retardace. Victor Hugo čtenáře zavede do dokonale vykreslené atmosféry patnáctého století a seznámí nás s tragickým příběhem znetvořeného Quasimoda, krásné Esmeraldy a proradným knězem Frollem.', 'Chrám Matky Boží v Paříži');



INSERT INTO customers (cid, email, login, name, password, surname) VALUES(1,'abcd@gmail.com','abcd','Pepa','Pepa','Tovar')
INSERT INTO customers (cid, email, login, name, password, surname) VALUES(2,'user@gmail.com','user','Petr','user','Vychodil')
INSERT INTO customers (cid, email, login, name, password, surname) VALUES(3,'lopata@gmail.com','ryc','Honza','lopata','Lafatra')







