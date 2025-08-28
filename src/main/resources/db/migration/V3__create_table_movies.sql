CREATE TABLE movie(

    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    realise_date DATE NOT NULL,
    rating NUMERIC NOT NULL,
    created_at TIMESTAMP,
    updated_at TIMESTAMP

);
