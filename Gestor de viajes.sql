create database gestor_de_eventos;
use gestor_de_eventos;


CREATE TABLE tipo_agencia (
    Codigo CHAR(3) PRIMARY KEY,
    Descripcion VARCHAR(50) NOT NULL
);

INSERT INTO tipo_agencia (Codigo, Descripcion) VALUES ('A1', 'Mayorista');
INSERT INTO tipo_agencia (Codigo, Descripcion) VALUES ('A2', 'Minorista');
INSERT INTO tipo_agencia (Codigo, Descripcion) VALUES ('A3', 'Mayorista-minorista');

CREATE TABLE tipo_viaje (
    Codigo VARCHAR(10) PRIMARY KEY,
    Descripcion VARCHAR(100) NOT NULL
);

INSERT INTO tipo_viaje (Codigo, Descripcion) VALUES ('B1', 'Luna de miel');
INSERT INTO tipo_viaje (Codigo, Descripcion) VALUES ('B2', 'Senior');
INSERT INTO tipo_viaje (Codigo, Descripcion) VALUES ('B3', 'Grupo');
INSERT INTO tipo_viaje (Codigo, Descripcion) VALUES ('B4', 'Viajes grandes (Destino exotico + vuelo + alojamiento)');
INSERT INTO tipo_viaje (Codigo, Descripcion) VALUES ('B5', 'Escapada');
INSERT INTO tipo_viaje (Codigo, Descripcion) VALUES ('B6', 'Familia (con niños)');

CREATE TABLE tipo_habitacion (
    Codigo CHAR(3) PRIMARY KEY,
    Descripcion VARCHAR(50) NOT NULL
);

INSERT INTO tipo_habitacion (Codigo, Descripcion) VALUES ('DB', 'doble');
INSERT INTO tipo_habitacion (Codigo, Descripcion) VALUES ('DUI', 'doble, uso individual');
INSERT INTO tipo_habitacion (Codigo, Descripcion) VALUES ('SIN', 'individual');
INSERT INTO tipo_habitacion (Codigo, Descripcion) VALUES ('TPL', 'triple');

CREATE TABLE pais (
    Codigo CHAR(2) PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL
);

INSERT INTO pais (Codigo, Nombre) VALUES ('DE', 'ALEMANIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('AR', 'ARGENTINA');
INSERT INTO pais (Codigo, Nombre) VALUES ('AT', 'AUSTRIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('BE', 'BÉLGICA');
INSERT INTO pais (Codigo, Nombre) VALUES ('BR', 'BRASIL');
INSERT INTO pais (Codigo, Nombre) VALUES ('CA', 'CANADA');
INSERT INTO pais (Codigo, Nombre) VALUES ('HR', 'CROACIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('CZ', 'REPUBLICA CHECA');
INSERT INTO pais (Codigo, Nombre) VALUES ('CU', 'CUBA');
INSERT INTO pais (Codigo, Nombre) VALUES ('CN', 'CHINA');
INSERT INTO pais (Codigo, Nombre) VALUES ('CY', 'CHIPRE');
INSERT INTO pais (Codigo, Nombre) VALUES ('DK', 'DINAMARCA');
INSERT INTO pais (Codigo, Nombre) VALUES ('EG', 'EGIPTO');
INSERT INTO pais (Codigo, Nombre) VALUES ('ES', 'ESPAÑA');
INSERT INTO pais (Codigo, Nombre) VALUES ('US', 'ESTADOS UNIDOS');
INSERT INTO pais (Codigo, Nombre) VALUES ('EE', 'ESTONIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('FI', 'FINLANDIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('FR', 'FRANCIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('GR', 'GRECIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('GT', 'GUATEMALA');
INSERT INTO pais (Codigo, Nombre) VALUES ('HK', 'HONG-KONG');
INSERT INTO pais (Codigo, Nombre) VALUES ('HU', 'HUNGRIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('IN', 'INDIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('ID', 'INDONESIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('IE', 'IRLANDA');
INSERT INTO pais (Codigo, Nombre) VALUES ('IS', 'ISLANDIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('IL', 'ISRAEL');
INSERT INTO pais (Codigo, Nombre) VALUES ('IT', 'ITALIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('JM', 'JAMAICA');
INSERT INTO pais (Codigo, Nombre) VALUES ('JP', 'JAPÓN');
INSERT INTO pais (Codigo, Nombre) VALUES ('KE', 'KENIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('LU', 'LUXEMBURGO');
INSERT INTO pais (Codigo, Nombre) VALUES ('MV', 'MALDIVAS');
INSERT INTO pais (Codigo, Nombre) VALUES ('MT', 'MALTA');
INSERT INTO pais (Codigo, Nombre) VALUES ('MA', 'MARRUECOS');
INSERT INTO pais (Codigo, Nombre) VALUES ('MX', 'MEXICO');
INSERT INTO pais (Codigo, Nombre) VALUES ('MC', 'MÓNACO');
INSERT INTO pais (Codigo, Nombre) VALUES ('NO', 'NORUEGA');
INSERT INTO pais (Codigo, Nombre) VALUES ('NL', 'PAISES BAJOS');
INSERT INTO pais (Codigo, Nombre) VALUES ('PA', 'PANAMÁ');
INSERT INTO pais (Codigo, Nombre) VALUES ('PE', 'PERÚ');
INSERT INTO pais (Codigo, Nombre) VALUES ('PL', 'POLONIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('PT', 'PORTUGAL');
INSERT INTO pais (Codigo, Nombre) VALUES ('PR', 'PUERTO RICO');
INSERT INTO pais (Codigo, Nombre) VALUES ('QA', 'QATAR');
INSERT INTO pais (Codigo, Nombre) VALUES ('GB', 'REINO UNIDO');
INSERT INTO pais (Codigo, Nombre) VALUES ('RO', 'RUMANIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('RU', 'RUSIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('SC', 'SEYCHELLES');
INSERT INTO pais (Codigo, Nombre) VALUES ('SG', 'SINGAPUR');
INSERT INTO pais (Codigo, Nombre) VALUES ('ZA', 'SUDÁFRICA');
INSERT INTO pais (Codigo, Nombre) VALUES ('SE', 'SUECIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('CH', 'SUIZA');
INSERT INTO pais (Codigo, Nombre) VALUES ('TH', 'TAILANDIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('TZ', 'TANZANIA (INCLUYE ZANZIBAR)');
INSERT INTO pais (Codigo, Nombre) VALUES ('TN', 'TÚNEZ');
INSERT INTO pais (Codigo, Nombre) VALUES ('TR', 'TURQUIA');
INSERT INTO pais (Codigo, Nombre) VALUES ('VE', 'VENEZUELA');
INSERT INTO pais (Codigo, Nombre) VALUES ('VN', 'VIETNAM');

CREATE TABLE agencia (
    IdAgencia INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100) UNIQUE NOT NULL,
    Logo VARCHAR(50),
    ColorMarca VARCHAR(50),
    NumEmple VARCHAR(10) NOT NULL,
    TipoAgencia CHAR(3) NOT NULL,
    FOREIGN KEY (TipoAgencia) REFERENCES tipo_agencia(Codigo) ON DELETE CASCADE
);

CREATE TABLE viaje (
    IdViaje INT AUTO_INCREMENT PRIMARY KEY,
    IdAgencia INT,
    Nombre VARCHAR(100) NOT NULL,
    DescViaje VARCHAR(500),
    TipoViaje VARCHAR(10) NOT NULL,
    FechaInicio DATE,
    FechaFin DATE,
    PaisDestino CHAR(2),
    Servicio VARCHAR(100),
    ServiNoIncluidos VARCHAR(100),
    FOREIGN KEY (IdAgencia) REFERENCES agencia (IdAgencia),
    FOREIGN KEY (TipoViaje) REFERENCES tipo_viaje(Codigo) ON DELETE CASCADE,
    FOREIGN KEY (PaisDestino) REFERENCES pais(Codigo) ON DELETE CASCADE
);

CREATE TABLE eventos (
    IdEvento INT AUTO_INCREMENT PRIMARY KEY,
    IdViaje INT,
    TipoEvento VARCHAR(20) CHECK (TipoEvento IN ('VUELO', 'ALOJAMIENTO', 'OTROS')) NOT NULL,
    FOREIGN KEY (IdViaje) REFERENCES viaje (IdViaje)
);

CREATE TABLE aeropuerto (
    CodigoIATA CHAR(3) PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL
);

INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Alicante', 'ALC');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Asturias', 'OVD');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Barcelona', 'BCN');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Córdoba', 'ODB');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Gerona', 'GRO');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Granada', 'GRX');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Ibiza', 'IBZ');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('La Coruña LCG', 'LCG');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Lanzarote', 'ACE');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Madrid', 'MAD');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Mahon', 'MAH');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Murcia', 'MJV');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Pamplona', 'PNA');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Salamanca', 'SLM');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Santa Cruz de la Palma', 'SPC');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Santiago de Compostela', 'SCQ');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Valencia', 'VLC');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Vigo', 'VGO');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Zaragoza', 'ZAZ');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Badajoz', 'BJZ');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Bilbao', 'BIO');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Vitoria', 'VIT');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Tenerife Norte', 'TFN');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Tenerife Sur', 'TFS');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Santander', 'SDR');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('San Sebastian', 'EAS');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Reus', 'REU');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Palma de Mallorca', 'PMI');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Malaga', 'AGP');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Jerez de la Frontera', 'XRY');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Gran Canaria', 'LPA');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Fuerteventura', 'FUE');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Hierro', 'VDE');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('La Gomera', 'GMZ');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Montreal, Québec', 'YMQ');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Ottawa, Ontario', 'YOW');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Toronto, Ontario', 'YTO');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Vancouver', 'YVR');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Boston', 'BOS');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Houston', 'HOU');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Miami', 'MIA');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Los Angeles', 'LAX');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Nueva York', 'JFK');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Detroit', 'DTT');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Philadelphia', 'PHL');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('San Francisco', 'SFO');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Seattle', 'SEA');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Washington', 'WAS');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Santo Domingo', 'SDQ');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Kingston', 'KIN');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Buenos Aires', 'BUE');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Rio de Janeiro', 'RIO');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Sao Paulo', 'SAO');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Bogotá', 'BOG');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Lima', 'LIM');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Caracas', 'CCS');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Viena', 'VIE');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Praga', 'PRG');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Helsinki', 'HEL');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Lyon', 'LYS');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('París Charles de Gaulle', 'CDG');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Le Bourget', 'LBG');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Orly', 'ORY');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Marsella', 'MRS');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Berlín', 'BER');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Dusseldorf', 'DUS');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Frankfurt', 'FRA');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Munich', 'MUC');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Hamburgo', 'HAM');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Atenas', 'ATH');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Dublín', 'DUB');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Milán', 'MIL');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Acapulco', 'ACA');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Brasilia', 'BSB');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Estocolmo', 'STO');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Copenhague', 'CPH');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Bruselas', 'BRU');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Amsterdam', 'AMS');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Oslo', 'OSL');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Varsovia', 'WAW');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Lisboa', 'LIS');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Moscú', 'MOW');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Ginebra', 'GVA');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Zurich', 'ZRH');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Estambul', 'IST');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Londres Gatwick', 'LGH');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Londres Heathrow', 'LHR');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Londres Stansted', 'STN');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('El Cairo', 'CAI');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Nairobi', 'NBO');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Casablanca', 'CAS');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Marrakech', 'RAK');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Túnez', 'TUN');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Ammán', 'AMM');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Bangkok', 'BKK');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Melbourne', 'MEL');
INSERT INTO aeropuerto (Nombre, CodigoIATA) VALUES ('Sídney', 'SYD');

CREATE TABLE aerolinea (
    Codigo CHAR(4) PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Pais VARCHAR(100) NOT NULL
);

INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Aerolínea Vueling SA', 'España', 'VOY');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('RYNAIR', 'Reino Unido', 'RK');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('World2Fly', 'España', 'WFL');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Air France', 'Francia', 'A.C.');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('KLM', 'Netherlands', 'KL');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('KLM Cityhopper', 'Netherlands', 'WA');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('TAP Portugal', 'Portugal', 'TP');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('World 2 Fly Portugal, S.A.', 'Portugal', '3P');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Finnair', 'Finlandia', 'AY');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Brussels Airlines', 'Belgium', 'SN');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Condor Flugdienst GmbH', 'Germany', 'DE');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Lufthansa', 'Germany', 'LH');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Lufthansa CityLine GmbH', 'Germany', 'CL');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('TUIfly Gmbh', 'Germany', 'X3*');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('TUIfly Nordic AB', 'Sweden', '6B*');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Croatia Airlines d.d.', 'Croatia', 'OU');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Air Nostrum, Lineas aereas del Mediterra neo SA', 'Spain', 'YW');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('SATA (Air Acores)', 'Portugal', 'SP');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('SATA Internacional - Azores Airlines, S.A.', 'Portugal', 'S4');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Air Europa Lineas Aereas, S.A.', 'Spain', 'UX');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('British Airways PLC', 'United Kingdom', 'BA');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('BA Euroflyer Limited dba British Airways', 'United Kingdom', 'A0');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Virgin Atlantic Airways Ltd', 'United Kingdom', 'VS');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Norse Atlantic Airways AS', 'Norway', 'N0');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Challenge Airlines (BE) S.A.', 'Belgium', 'X7');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('EASYJET UK LIMITED', 'United Kingdom', 'U2');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Easyjet Switzerland S.A', 'Switzerland', 'DS');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Edelweiss Air AG', 'Switzerland', 'WK');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Air Greenland', 'Greenland', 'GL');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('SWISS Internation Air Lines Ltd', 'Switzerland', 'LX');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Turkish Airlines Inc', 'Turquia', 'TK');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Pegasus Airlines', 'Turquia', 'PC');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Malta Air Travel Ltd dba Malta MedAir', 'Malta', 'MT');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Alitalia', 'Italia', 'AZ');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('American Airlines', 'USA', 'AA');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('BSA - Aerolinhas Brasileiras S.A dba LATAM Cargo Br', 'Brazil', 'M3');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Tam Linhas Aereas SA dba Latam Airlines Brasil', 'Brazil', 'JJ');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Delta Air Lines Inc', 'USA', 'DL');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('United Airlines Inc', 'USA', 'UA');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('China United Airlines', 'CHINA', 'KN');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('AVIANCA-Ecuador dba AVIANCA', 'Ecuador', '2K');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Aerovias del Continente Americano S.A. AVIANCA', 'Colombia', 'AV');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Egyptair', 'EGIPTO', 'MS');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Aerovias de Mexico SA de CV dba AeroMexico', 'Mexico', 'AM');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Aerolineas Argentinas S.A.', 'Argentina', 'AR');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Air Transat', 'Canada', 'TS');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Alia - The Royal Jordanian Airlines dba Royal Jordanian', 'JordanIA', 'RJ');
INSERT INTO aerolinea (Nombre, Pais, Codigo) VALUES ('Qatar Airways Group Q.C.S.C dba Qatar Airways', 'Qatar', 'QR');

CREATE TABLE vuelo (
    IdEvento INT PRIMARY KEY,
    TipoVuelo VARCHAR(30) CHECK (TipoVuelo IN ('IDA', 'IDA_VUELTA')),
    AeroOrigenIda CHAR(3) NOT NULL,
    AeroDestinoIda CHAR(3) NOT NULL,
    CodVueloIda VARCHAR(30) NOT NULL,
    AerolineaIda CHAR(3) NOT NULL,
    Precio DECIMAL(7,2) NOT NULL,
    FechaSalidaIda DATE NOT NULL,
    HoraSalidaIda TIME NOT NULL,
    HoraLlegadaIda TIME NOT NULL,
    DuracionIda TIME NOT NULL,
    FechaVuelta DATE,
    HoraSalidaVuelta TIME,
    HoraLlegadaVuelta TIME,
    DuracionVuelta TIME,
    CodVueloVuelta VARCHAR(30),
    AerolineaVuelta CHAR(3),
    FOREIGN KEY (IdEvento) REFERENCES eventos (IdEvento) ON DELETE CASCADE,
    FOREIGN KEY (AeroOrigenIda) REFERENCES aeropuerto(CodigoIATA) ON DELETE CASCADE,
    FOREIGN KEY (AeroDestinoIda) REFERENCES aeropuerto(CodigoIATA) ON DELETE CASCADE,
    FOREIGN KEY (AerolineaIda) REFERENCES aerolinea(Codigo) ON DELETE CASCADE,
    FOREIGN KEY (AerolineaVuelta) REFERENCES aerolinea(Codigo) ON DELETE CASCADE
    );
    
    CREATE TABLE alojamiento (
    IdEvento INT PRIMARY KEY,
    NombreHotel VARCHAR(100) NOT NULL,
    Ciudad VARCHAR(100) NOT NULL,
    Precio DECIMAL(7,2) NOT NULL,
    FechaEntrada DATE NOT NULL,
    FechaSalida DATE NOT NULL,
    TipoHabitacion VARCHAR(3) DEFAULT 'DB' CHECK ( TipoHabitacion IN ('DB', 'DUI', 'SIN', 'TPL')), 
    FOREIGN KEY (IdEvento) REFERENCES eventos (IdEvento) ON DELETE CASCADE,
    FOREIGN KEY (TipoHabitacion) REFERENCES tipo_habitacion(Codigo) ON DELETE CASCADE
);

CREATE TABLE otros (
    IdEvento INT PRIMARY KEY,
    Nombre VARCHAR(50) NOT NULL,
    Fecha DATE NOT NULL,
    Descripcion VARCHAR(500),
    Precio DECIMAL(7,2) NOT NULL,
    FOREIGN KEY (IdEvento) REFERENCES eventos (IdEvento) ON DELETE CASCADE
);

CREATE TABLE rango_empleados (
    Codigo VARCHAR(10) PRIMARY KEY,
    Descripcion VARCHAR(100) NOT NULL
);

INSERT INTO rango_empleados (Codigo, Descripcion) VALUES ('L1', '5 empleados maximo de 1 a 5');
INSERT INTO rango_empleados (Codigo, Descripcion) VALUES ('L2', '10 empleados maximo de 1 a 10');
INSERT INTO rango_empleados (Codigo, Descripcion) VALUES ('L3', '20 empleados maximo de 1 a 20');

