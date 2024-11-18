
-- --------------------------------------------------------

--
-- Table structure for table `student_alldata`
--
-- Creation: Sep 21, 2023 at 09:45 AM
--

DROP TABLE IF EXISTS `student_alldata`;
CREATE TABLE IF NOT EXISTS `student_alldata` (
  `Rollno` int(5) NOT NULL,
  `Name` varchar(10) NOT NULL,
  `Division` varchar(10) NOT NULL,
  `Branch` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Truncate table before insert `student_alldata`
--

TRUNCATE TABLE `student_alldata`;
--
-- Dumping data for table `student_alldata`
--

INSERT DELAYED IGNORE INTO `student_alldata` (`Rollno`, `Name`, `Division`, `Branch`) VALUES
(1, 'Hardik', 'D9', 'IT'),
(2, 'Manav', 'D9', 'CE'),
(3, 'Bhargav', 'D9', 'CE'),
(4, 'Henil', 'D9', 'CE'),
(5, 'Sujan', 'D9', 'CE'),
(6, 'Jay', 'D9', 'IT'),
(7, 'Vasu', 'D9', 'IT'),
(8, 'Vedant', 'D9', 'IT'),
(9, 'Smit', 'D9', 'CE'),
(10, 'Om', 'D9', 'IT'),
(11, 'Romil', 'D4', 'IT');
