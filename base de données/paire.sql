-- phpMyAdmin SQL Dump
-- version 3.5.4
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Mar 04 Juin 2019 à 00:03
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
-- Structure de la table `paire`
--

CREATE TABLE IF NOT EXISTS `paire` (
  `numpaire` varchar(35) NOT NULL,
  `tour` double NOT NULL DEFAULT '0',
  `numart_fk` varchar(35) NOT NULL,
  PRIMARY KEY (`numpaire`),
  KEY `numpaire` (`numpaire`),
  KEY `numart_fk` (`numart_fk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `paire`
--

INSERT INTO `paire` (`numpaire`, `tour`, `numart_fk`) VALUES
('p1', 2, 'article1'),
('p2', 1, 'article2'),
('p3', 2340, 'article3');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `paire`
--
ALTER TABLE `paire`
  ADD CONSTRAINT `paire_ibfk_1` FOREIGN KEY (`numart_fk`) REFERENCES `article` (`numarticle`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
