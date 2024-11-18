
DELIMITER $$
--
-- Procedures
--
DROP PROCEDURE IF EXISTS `calc_per`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `calc_per` (IN `Roll` INT(5))   BEGIN
select * from view_attendencedata WHERE Rollno=Roll;
END$$

DROP PROCEDURE IF EXISTS `getstudentdata`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `getstudentdata` ()   BEGIN
select * from student_alldata;
END$$

DROP PROCEDURE IF EXISTS `view_attendence`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `view_attendence` ()   BEGIN
select * from view_attendencedata;
END$$

DELIMITER ;
