CREATE TABLE `customerdb`.`EngineeringStudents` (
  `student_id` INT NOT NULL,
  `department` VARCHAR(45) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `passout_year` INT NOT NULL,
  `university_rank` INT NOT NULL,
  PRIMARY KEY (`student_id`),
  UNIQUE INDEX `student_id_UNIQUE` (`student_id` ASC));

