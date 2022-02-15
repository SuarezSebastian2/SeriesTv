Create database series; 

Use series; 

CREATE TABLE series1 ( 

Id INT auto_increment NOT NULL, 
Codigo VARCHAR(10) NOT NULL, 
Titulo VARCHAR(200) NOT NULL, 
Temporadas VARCHAR(45) NOT NULL, 
Genero VARCHAR(45) NOT NULL, 
Actores VARCHAR(200) NOT NULL,
Sinopsis TEXT,
  PRIMARY KEY (Id) 

); 

INSERT INTO series1 (Codigo,Titulo,Temporadas,Genero, Actores, Sinopsis) VALUES 

(8210, 'Batman', 'Tercera','Ciencia Ficción', 'Tom hanks', 'Aventuras de Batman'), 

(5213, 'Walking dead','Segunda', 'Terror', 'Alan Joe', 'Muertos vivientes'), 

(6754, 'Vampire diares','Primera', 'Terror','Sara Parker', 'Cazavampiros 90s');

select* from series1;

