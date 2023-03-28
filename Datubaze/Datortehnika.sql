-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Mar 28, 2023 at 05:13 PM
-- Server version: 5.7.39
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Datortehnika`
--

-- --------------------------------------------------------

--
-- Table structure for table `pieprasijumi`
--

CREATE TABLE `pieprasijumi` (
  `id` int(11) NOT NULL,
  `laiks` varchar(255) DEFAULT NULL,
  `pamatojums` varchar(255) DEFAULT NULL,
  `tehnika` varchar(255) DEFAULT NULL,
  `vards` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `pieprasijumi`
--

INSERT INTO `pieprasijumi` (`id`, `laiks`, `pamatojums`, `tehnika`, `vards`) VALUES
(2, '2023-03-27 14:39:54.851', 'Vajag klaviatūru', 'Klaviatūra', 'Laura Zālīte'),
(6, '2023-03-28 17:42:33.518', 'Vajag datoru', 'HP dators', 'Pēteris Lapiņš'),
(7, '2023-03-28 17:42:33.518', 'Vajag planšeti', 'iPad Pro', 'Ieva Kalniņa'),
(8, '2023-03-28 18:38:27.199', 'Vajag', 'Klavitūra', 'Kārlis Vītoliņš');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pieprasijumi`
--
ALTER TABLE `pieprasijumi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pieprasijumi`
--
ALTER TABLE `pieprasijumi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
