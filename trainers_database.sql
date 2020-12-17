DROP DATABASE IF EXISTS `pschooltrainers`;

CREATE DATABASE IF NOT EXISTS `pschooltrainers`;
USE `pschooltrainers`;
CREATE TABLE IF NOT EXISTS `trainers` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(20) NULL DEFAULT NULL,
    `last_name` VARCHAR(30) NULL DEFAULT NULL,
    `subject` VARCHAR(20) NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `trainers`(`first_name`, `last_name`, `subject`) VALUES ("Nikos","Nikolakos","Database");
INSERT INTO `trainers`(`first_name`, `last_name`, `subject`) VALUES ("Stamatis","Theodoridis","FrontEnd");
INSERT INTO `trainers`(`first_name`, `last_name`, `subject`) VALUES ("Eleni","Louka","BackEnd");