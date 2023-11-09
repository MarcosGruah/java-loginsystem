## Login System in Java

This university assignment aimed to create a basic login system using Java Swing and integrate it with MySQL 8.0.34. Requirements included implementing login and user registration screens. Additional elements like loading and error screens were added to enhance the user experience and practice language skills. The project used Java JDK 20 and MySQL Java Connector 8.0.1 for database communication.

## Database Schema and Table Setup

```sql
CREATE SCHEMA `mapa`;

CREATE TABLE `mapa`.`usuario` (
`id` INT NOT NULL AUTO_INCREMENT,
`nome` VARCHAR(45) NULL,
`login` VARCHAR(45) NULL,
`senha` VARCHAR(45) NULL,
`email` VARCHAR(45) NULL,
PRIMARY KEY (`id`));