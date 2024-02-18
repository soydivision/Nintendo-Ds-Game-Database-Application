CREATE TABLE NintendoDSGame (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100),
    developer VARCHAR(100),
    publisher VARCHAR(100),
    firstReleased DATE,
    JP BOOLEAN,
    NA BOOLEAN,
    EU BOOLEAN,
    AU BOOLEAN
);


INSERT INTO NintendoDSGame (title, developer, publisher, firstReleased, JP, NA, EU, AU)
VALUES
('New Super Mario Bros.', 'Nintendo EAD', 'Nintendo', '2006-05-15', FALSE, FALSE, TRUE, FALSE),
('Pokémon Diamond', 'Game Freak', 'Nintendo', '2006-09-28', FALSE, TRUE, TRUE, FALSE),
('Mario Kart DS', 'Nintendo EAD', 'Nintendo', '2005-11-14', TRUE, FALSE, TRUE, TRUE),
('The Legend of Zelda: Phantom Hourglass', 'Nintendo EAD', 'Nintendo', '2007-06-23', FALSE, TRUE, TRUE, TRUE),
('Animal Crossing: Wild World', 'Nintendo EAD', 'Nintendo', '2005-11-23', TRUE, TRUE, TRUE, FALSE),
('Professor Layton and the Curious Village', 'Level-5', 'Nintendo', '2007-02-15', TRUE, FALSE, TRUE, TRUE),
('Brain Age: Train Your Brain in Minutes a Day!', 'Nintendo', 'Nintendo', '2005-05-19', TRUE, TRUE, TRUE, TRUE),
('Phoenix Wright: Ace Attorney', 'Capcom', 'Capcom', '2005-10-12', TRUE, TRUE, TRUE, FALSE),
('Final Fantasy III', 'Square Enix', 'Square Enix', '2006-08-24', TRUE, FALSE, TRUE, TRUE),
('Castlevania: Dawn of Sorrow', 'Konami', 'Konami', '2005-08-25', FALSE, TRUE, FALSE, TRUE);
