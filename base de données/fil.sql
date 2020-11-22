-- phpMyAdmin SQL Dump
-- version 3.5.4
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Mar 04 Juin 2019 à 00:02
-- Version du serveur: 5.5.28-log
-- Version de PHP: 5.4.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `db_torsadage`
--

-- --------------------------------------------------------

--
-- Structure de la table `fil`
--

CREATE TABLE IF NOT EXISTS `fil` (
  `numfil` int(11) NOT NULL,
  `adresse` varchar(35) NOT NULL,
  `couleur` varchar(40) NOT NULL,
  `longueur` int(11) NOT NULL,
  `numpaire_fk` varchar(35) NOT NULL,
  `pas` int(11) NOT NULL,
  PRIMARY KEY (`numfil`),
  KEY `numfil` (`numfil`),
  KEY `numpaire_fk` (`numpaire_fk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `fil`
--

INSERT INTO `fil` (`numfil`, `adresse`, `couleur`, `longueur`, `numpaire_fk`, `pas`) VALUES
(10, 'aa', 'jaune', 20, 'p1', 15),
(11, 'pp', 'noir', 30, 'p1', 25),
(12, 'jj', 'violet', 15, 'p2', 20),
(13, 'll', 'rouge', 45, 'p2', 13),
(14, 'cc', 'bleu', 18000, 'p3', 30),
(15, 'ff', 'blanc', 18000, 'p3', 35);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `fil`
--
ALTER TABLE `fil`
  ADD CONSTRAINT `fil_ibfk_1` FOREIGN KEY (`numpaire_fk`) REFERENCES `paire` (`numpaire`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
