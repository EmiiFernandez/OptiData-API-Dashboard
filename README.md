# OptiData API & Dashboard 📊✨

## 💡 Sobre el Proyecto

**OptiData API & Dashboard** es un proyecto integral que fusiona el desarrollo **Backend robusto** con el **Análisis de Datos estratégico**, aplicado al dominio de la **salud visual (oftalmología/óptica)**.

Este proyecto demuestra mi capacidad para:

  * Diseñar y construir **APIs RESTful escalables** con Java y Spring Boot.
  * Gestionar y persistir datos eficientemente en **bases de datos relacionales**.
  * Documentar APIs de forma clara utilizando **Swagger/OpenAPI**.
  * Extraer, transformar y **visualizar datos** para generar *insights* accionables, utilizando Power BI o Locker Studio.

El objetivo es simular un sistema básico de gestión de consultas ópticas y mostrar cómo la tecnología backend puede habilitar un **análisis de datos inteligente** que informe la toma de decisiones clínicas y operativas.

## 🚀 Características Principales

### Backend (OptiData API)

  * **API RESTful:** Endpoints para la gestión de `Pacientes`, `Consultas` y `Prescripciones de Lentes`.
  * **Tecnología:** Desarrollado con **Java 17+** y **Spring Boot 3+**.
  * **Persistencia:** Integración con **MySQL** o **PostgreSQL** utilizando Spring Data JPA.
  * **Documentación:** API documentada automáticamente con **Swagger/OpenAPI UI**, accesible en `/swagger-ui.html`.
  * **Endpoints de Análisis:** Endpoints específicos para facilitar la extracción de datos agregados para el dashboard.

### Frontend (OptiData Dashboard)

  * **Visualización de Datos:** Dashboard interactivo creado en **Power BI** o **Locker Studio**.
  * **Métricas Clave:**
      * Tendencias de consultas (por mes/año).
      * Diagnósticos oftalmológicos más frecuentes.
      * Distribución por edad y género de pacientes.
      * Análisis de tipos de lentes recetados.
      * Y más, revelando patrones ocultos en los datos de salud visual.
  * **Conectividad:** Conexión directa a la base de datos o mediante importación de datos CSV generados desde la API.

## 🛠️ Tecnologías Utilizadas

  * **Backend:** Java, Spring Boot, Spring Data JPA, Maven, Lombok (opcional), Swagger/OpenAPI.
  * **Bases de Datos:** MySQL / PostgreSQL.
  * **Análisis y Visualización:** Power BI / Locker Studio, SQL.
  * **Control de Versiones:** Git / GitHub.

## 📋 Requisitos Previos

Asegúrate de tener instalado lo siguiente:

  * **Java Development Kit (JDK) 17 o superior.**
  * **Maven 3.6 o superior.**
  * **Docker** (opcional, para ejecutar la base de datos fácilmente).
  * **MySQL** o **PostgreSQL** instalado localmente o a través de Docker.
  * **Power BI Desktop** o acceso a **Locker Studio** (web).

## 🚀 Cómo Ejecutar el Proyecto

Sigue estos pasos para poner en marcha OptiData API & Dashboard:

### 1\. Clonar el Repositorio

```bash
git clone https://github.com/EmiiFernandez/OptiData-API-Dashboard.git
cd OptiData-API-Dashboard
```

### 2\. Configuración de la Base de Datos

  * **Crear Base de Datos:**
    Crea una base de datos con el nombre `optidata` (o el que prefieras) en tu instancia de MySQL/PostgreSQL.

    ```sql
    -- Para MySQL
    CREATE DATABASE optidata;

    -- Para PostgreSQL
    CREATE DATABASE optidata;
    ```

  * **Configurar `application.properties`:**
    Abre `src/main/resources/application.properties` y configura las credenciales de tu base de datos:

    ```properties
    # Configuración para MySQL
    spring.datasource.url=jdbc:mysql://localhost:3306/optidata?useSSL=false&serverTimezone=UTC
    spring.datasource.username=tu_usuario_mysql
    spring.datasource.password=tu_password_mysql
    spring.jpa.hibernate.ddl-auto=update # o create para la primera vez
    spring.jpa.show-sql=true

    # Configuración para PostgreSQL (descomentar si usas PostgreSQL y comentar MySQL)
    # spring.datasource.url=jdbc:postgresql://localhost:5432/optidata
    # spring.datasource.username=tu_usuario_postgresql
    # spring.datasource.password=tu_password_postgresql
    # spring.jpa.hibernate.ddl-auto=update
    # spring.jpa.show-sql=true
    ```

### 3\. Ejecutar el Backend

```bash
mvn clean install
mvn spring-boot:run
```

La API estará disponible en `http://localhost:8080`.
Puedes acceder a la documentación de Swagger en `http://localhost:8080/swagger-ui.html`.

### 4\. Llenar la Base de Datos (Opcional, pero Recomendado)

Puedes insertar algunos datos de prueba manualmente a través de Swagger UI o ejecutando los scripts SQL de ejemplo que se encontrarán en la carpeta `src/main/resources/sql` (crea esta carpeta y añade tus scripts).

### 5\. Configurar el Dashboard

#### **Opción A: Usando Datos Exportados (CSV)**

1.  Exporta tus tablas `Pacientes`, `Consultas` y `PrescripcionesLentes` desde tu base de datos a archivos CSV.
2.  Abre Power BI Desktop o Locker Studio.
3.  Importa los archivos CSV como fuentes de datos.
4.  Crea las relaciones entre las tablas y construye tus visualizaciones.

#### **Opción B: Conexión Directa a la Base de Datos**

1.  Abre Power BI Desktop o Locker Studio.
2.  Utiliza el conector de **MySQL** o **PostgreSQL** para conectarte a tu base de datos `optidata`.
3.  Ingresa las credenciales de tu base de datos.
4.  Selecciona las tablas `Pacientes`, `Consultas` y `PrescripcionesLentes` (o las vistas que crees).
5.  Construye tus visualizaciones y reportes.

## 📊 Dashboard y Análisis de Datos (Ejemplo de Insights)

Aquí se mostrarán capturas de pantalla de los dashboards en Power BI/Locker Studio, destacando los principales insights obtenidos.

*(Aquí irían tus screenshots de Power BI/Locker Studio mostrando el dashboard con gráficos y métricas. Por ejemplo:)*

  * **[Captura de Pantalla 1: Consultas por Mes]**
      * *Insight:* "Observamos un pico de consultas en los meses de marzo y agosto, lo que podría indicar la necesidad de reforzar el personal en esas temporadas."
  * **[Captura de Pantalla 2: Diagnósticos Comunes]**
      * *Insight:* "La miopía y el astigmatismo representan la mayor proporción de diagnósticos, sugiriendo un enfoque en soluciones para estos casos."
  * **[Captura de Pantalla 3: Distribución de Prescripciones]**
      * *Insight:* "Los lentes progresivos son el tipo de prescripción más común entre pacientes mayores de 40, reafirmando la tendencia de presbicia."

## 🤝 Contribuciones

¡Tu interés es bienvenido\! Si tienes sugerencias o deseas contribuir, no dudes en abrir un *issue* o enviar un *pull request*.

## 🔗 Conectemos

[](https://www.google.com/search?q=%5Bhttps://www.linkedin.com/in/emiliafernandez%5D\(https://www.linkedin.com/in/emiliafernandez\))
[](https://github.com/EmiiFernandez)
[](mailto:e.fernandezmurgia@gmail.com)

## 📜 Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](https://www.google.com/search?q=LICENSE) para más detalles.
