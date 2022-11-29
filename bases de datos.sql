create database proyecto;

CREATE TABLE proyecto.`choferes` (
`id` varchar(30) NOT NULL,
 `nombre`  varchar(30) NOT NULL,
  `telefono` varchar(30) NOT NULL,
  `edad` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE  proyecto.`buses`;
CREATE TABLE proyecto.`buses` (
`codigo`  varchar(30) NOT NULL,
 `estado` varchar(30) NOT NULL,
  `placa` varchar(30) NOT NULL,
  `capacidad` int NOT NULL,
   `id` varchar(30) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE proyecto.`viajes` (
 `ruta` varchar(30) NOT NULL,
  `salida` varchar(30) NOT NULL,
   `destino`  varchar(30) NOT NULL,
  `kilometros` int NOT NULL,
   `fecha` varchar(30) NOT NULL,
    `fechaLl` int NOT NULL,
     `horaS` int NOT NULL,
      `horaLl` int NOT NULL,
       `precio` double NOT NULL,
       `unidad` varchar(30) NOT NULL,
  PRIMARY KEY (`ruta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE proyecto.`encomiendas` (
 `codigo` varchar(30) NOT NULL,
 `peso` double NOT NULL,
  `precioXpeso`  varchar(30) NOT NULL,
   `personaEntrega`  varchar(30) NOT NULL,
  `personaRetirar` varchar(30) NOT NULL,
   `salida` varchar(30) NOT NULL,
    `destino` varchar(30) NOT NULL,
     `horaS` int NOT NULL,
      `horaE` int NOT NULL,
       `fechaS` varchar(30) NOT NULL,
        `fechaE` varchar(30) NOT NULL,
          `estado` int NOT NULL,
          `fecha` varchar(30) NOT NULL,
          `viaje` varchar(30) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



