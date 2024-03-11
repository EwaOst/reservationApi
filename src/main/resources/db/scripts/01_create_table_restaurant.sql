CREATE TABLE IF NOT EXISTS restaurant
(
    id                  BIGINT AUTO_INCREMENT PRIMARY KEY,
    identifier          VARCHAR(128) UNIQUE,
    name                VARCHAR(128),
    street              VARCHAR(128),
    building_number     VARCHAR(128),
    city                VARCHAR(128),
    postal_code         VARCHAR(128),
    openning_hours      TIMESTAMP WITH TIME ZONE,
    closing_hours       TIMESTAMP WITH TIME ZONE,
    restaurant          TEXT NOT NULL
    );