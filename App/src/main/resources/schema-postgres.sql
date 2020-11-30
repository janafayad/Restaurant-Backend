DROP TABLE IF EXISTS restos;
CREATE TABLE restos(id serial PRIMARY KEY, name_resto VARCHAR(255), type_resto VARCHAR(255),cost_for_two integer, address_resto VARCHAR(255), phone_number integer);