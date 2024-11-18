
-- --------------------------------------------------------

--
-- Table structure for table `view_attendencedata`
--
-- Creation: Sep 21, 2023 at 09:37 AM
--

DROP TABLE IF EXISTS `view_attendencedata`;
CREATE TABLE IF NOT EXISTS `view_attendencedata` (
  `Rollno` int(5) DEFAULT NULL,
  `Monday` varchar(10) DEFAULT NULL,
  `Tuesday` varchar(10) DEFAULT NULL,
  `Wednesday` varchar(10) DEFAULT NULL,
  `Thursday` varchar(10) DEFAULT NULL,
  `Friday` varchar(10) DEFAULT NULL,
  `Saturday` varchar(10) DEFAULT NULL,
  `Persentage` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Truncate table before insert `view_attendencedata`
--

TRUNCATE TABLE `view_attendencedata`;
--
-- Dumping data for table `view_attendencedata`
--

INSERT DELAYED IGNORE INTO `view_attendencedata` (`Rollno`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, `Persentage`) VALUES
(1, 'P', 'P', 'P', '-', '-', '-', '42.00'),
(2, 'P', '-', 'P', '-', '-', '-', '28.00'),
(3, 'P', '-', '-', '-', '-', '-', '14.00'),
(4, '-', '-', '-', '-', '-', '-', '0.00'),
(5, '-', 'P', 'P', '-', '-', '-', '28.00'),
(6, 'P', '-', '-', '-', '-', '-', '14.00'),
(7, '-', '-', 'P', '-', '-', '-', '14.00'),
(8, '-', '-', '-', '-', '-', '-', '0.00'),
(9, '-', '-', '-', '-', '-', '-', '0.00'),
(10, '-', '-', '-', '-', '-', '-', '0.00'),
(11, '-', '-', '-', '-', '-', '-', '0');
