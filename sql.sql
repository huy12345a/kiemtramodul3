CREATE DATABASE IF NOT EXISTS md3final;
USE md3final;


CREATE TABLE IF NOT EXISTS room
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    code        NVARCHAR(20) NOT NULL UNIQUE ,
    area        DOUBLE       NOT NULL,
    status      NVARCHAR(20) NOT NULL,
    floor       INT          NOT NULL CHECK ( floor >= 1 AND floor <= 15 ),
    type        NVARCHAR(20) NOT NULL,
    description NVARCHAR(100),
    price       DOUBLE       NOT NULL,
    startDate   DATE         NOT NULL,
    endDate     DATE         NOT NULL
);

INSERT INTO room (code, area, status, floor, type, description, price, startDate, endDate)
VALUES ('111-11-11', 25.5, 'full', 1, 'share', 'A room with a view of the city', 1000001, '2024-01-01', '2024-12-31'),
       ('222-22-22', 30.0, 'empty', 2, 'full', 'Spacious room with balcony', 1500000, '2024-01-01', '2024-12-31'),
       ('333-33-33', 45.5, 'full', 3, 'share', 'Room with modern amenities', 2000000, '2024-01-01', '2024-12-31'),
       ('444-44-44', 22.0, 'empty', 4, 'full', 'Cozy room with wooden flooring', 1200000, '2024-01-01', '2024-12-31'),
       ('555-55-55', 35.0, 'full', 5, 'share', 'Room with a beautiful garden view', 1800000, '2024-01-01',
        '2024-12-31'),
       ('666-66-66', 28.5, 'empty', 6, 'full', 'Room with a mini kitchen', 1600000, '2024-01-01', '2024-12-31'),
       ('777-77-77', 40.0, 'full', 7, 'share', 'Large room with a private terrace', 1900000, '2024-01-01',
        '2024-12-31'),
       ('888-88-88', 32.0, 'empty', 8, 'full', 'Room with a private entrance', 1700000, '2024-01-01', '2024-12-31'),
       ('999-99-99', 29.0, 'full', 9, 'share', 'Room with a shared kitchen', 1400000, '2024-01-01', '2024-12-31'),
       ('101-10-10', 33.5, 'empty', 10, 'full', 'Room with a stunning sea view', 2000000, '2024-01-01', '2024-12-31');

