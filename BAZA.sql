/*
SQLyog Community v13.2.1 (64 bit)
MySQL - 10.4.25-MariaDB : Database - prakse
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`prakse` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `prakse`;

/*Table structure for table `kompanija` */

DROP TABLE IF EXISTS `kompanija`;

CREATE TABLE `kompanija` (
  `KompanijaID` int(5) NOT NULL AUTO_INCREMENT,
  `PIB` int(9) NOT NULL,
  `Naziv` varchar(30) NOT NULL,
  `BrojTelefona` varchar(12) DEFAULT NULL,
  `WebAdresa` varchar(20) DEFAULT NULL,
  `Adresa` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`KompanijaID`),
  UNIQUE KEY `unique_pib` (`PIB`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `kompanija` */

insert  into `kompanija`(`KompanijaID`,`PIB`,`Naziv`,`BrojTelefona`,`WebAdresa`,`Adresa`) values 
(1,112233,'KingKompani',NULL,NULL,NULL),
(3,112244,'Djuka Komerc',NULL,NULL,NULL);

/*Table structure for table `korisnik` */

DROP TABLE IF EXISTS `korisnik`;

CREATE TABLE `korisnik` (
  `korisnikID` int(5) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`korisnikID`),
  UNIQUE KEY `unique_username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `korisnik` */

/*Table structure for table `praksa` */

DROP TABLE IF EXISTS `praksa`;

CREATE TABLE `praksa` (
  `StudentID` int(5) NOT NULL,
  `KompanijaID` int(5) NOT NULL,
  `DatumOd` date NOT NULL,
  `DatumDo` date DEFAULT NULL,
  `Pozicija` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`StudentID`,`KompanijaID`,`DatumOd`),
  KEY `PIB` (`KompanijaID`),
  CONSTRAINT `praksa_ibfk_1` FOREIGN KEY (`StudentID`) REFERENCES `student` (`StudentID`),
  CONSTRAINT `praksa_ibfk_2` FOREIGN KEY (`KompanijaID`) REFERENCES `kompanija` (`KompanijaID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `praksa` */

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `StudentID` int(5) NOT NULL AUTO_INCREMENT,
  `BrojIndeksa` varchar(9) NOT NULL,
  `Ime` varchar(30) NOT NULL,
  `Prezime` varchar(30) NOT NULL,
  `StudentskiEmail` varchar(30) DEFAULT NULL,
  `PrivatniEmail` varchar(30) DEFAULT NULL,
  `BrojTelefona` int(12) DEFAULT NULL,
  `Smer` varchar(50) DEFAULT NULL CHECK (`Smer` in ('ISiT','MIO')),
  `NivoStudija` varchar(50) DEFAULT NULL CHECK (`NivoStudija` in ('Osnovne','Master','Doktorske')),
  PRIMARY KEY (`StudentID`),
  UNIQUE KEY `unique_indeks` (`BrojIndeksa`),
  KEY `StudentID` (`StudentID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

/*Data for the table `student` */

insert  into `student`(`StudentID`,`BrojIndeksa`,`Ime`,`Prezime`,`StudentskiEmail`,`PrivatniEmail`,`BrojTelefona`,`Smer`,`NivoStudija`) values 
(1,'121','Nemanja','',NULL,NULL,NULL,NULL,NULL),
(2,'202','Dunjic','Kurvar',NULL,NULL,NULL,NULL,NULL),
(4,'15','Milan','',NULL,NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
