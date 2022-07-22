CREATE SCHEMA IF NOT EXISTS `recipe`;
USE recipe;
CREATE TABLE category
(
    id          INT AUTO_INCREMENT,
    description VARCHAR(245),
    PRIMARY KEY (id)
);

CREATE TABLE unit_of_measure
(
    id          INT AUTO_INCREMENT,
    description VARCHAR(245),
    PRIMARY KEY (id)
);

CREATE TABLE notes
(
    id           INT AUTO_INCREMENT,
    recipe_id    INT,
    recipe_notes TEXT(1255),
    PRIMARY KEY (id)
);

CREATE TABLE recipe_category
(
    recipe_id   INT,
    category_id INT
);

CREATE TABLE recipe
(
    id          INT AUTO_INCREMENT,
    description TEXT(9245),
    prep_time   INT,
    cook_time   INT,
    serving     INT,
    source      VARCHAR(255),
    url         VARCHAR(255),
    directions  TEXT(9255),
    image       BLOB,
    difficulty  ENUM ('EASY', 'MODERATE', 'HARD'),
    notes_id    INT,
    PRIMARY KEY (id)
);

CREATE TABLE ingredient
(
    id          INT AUTO_INCREMENT,
    description TEXT(9245),
    amount      DECIMAL,
    uom_id      INT,
    recipe_id   INT,
    PRIMARY KEY (id)
);

INSERT INTO category (description)
VALUES ('American');
INSERT INTO category (description)
VALUES ('Italian');
INSERT INTO category (description)
VALUES ('Mexican');
INSERT INTO category (description)
VALUES ('Fast Food');
INSERT INTO unit_of_measure (description)
VALUES ('Teaspoon');
INSERT INTO unit_of_measure (description)
VALUES ('Tablespoon');
INSERT INTO unit_of_measure (description)
VALUES ('Cup');
INSERT INTO unit_of_measure (description)
VALUES ('Pinch');
INSERT INTO unit_of_measure (description)
VALUES ('Ounce');
INSERT INTO unit_of_measure (description)
VALUES ('Each');
INSERT INTO unit_of_measure (description)
VALUES ('Dash');
INSERT INTO unit_of_measure (description)
VALUES ('Pint');