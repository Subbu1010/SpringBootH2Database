# Role Management Service

This is a Spring Boot microservice for managing roles, channels, audit levels, and permissions. It uses an H2 in-memory database and exposes REST endpoints for data retrieval.

## Features
- Retrieve all roles, channels, and audit levels
- Retrieve permissions by role and permission category
- H2 in-memory database with sample data

## Requirements
- Java 17+
- Maven 3.6+

## Build & Run

1. **Build the project:**
   ```sh
   mvn clean compile
   ```
2. **Run the application:**
   ```sh
   mvn spring-boot:run
   ```

The service will start on [http://localhost:8080](http://localhost:8080).

## API Endpoints

### Get All Roles
- **URL:** `/api/getRoles`
- **Method:** `GET`
- **Response:**
  ```json
  [
    {
      "roleId": 1,
      "roleNm": "Admin",
      "adGroup": "AD_ADMIN",
      "approverSoeid": "SOEID1",
      "approverFname": "John",
      "approverLname": "Doe",
      "approverGroup": "GroupA",
      "resourceId": "RES1",
      "defaultFlag": null
    }
  ]
  ```

### Get All Channels
- **URL:** `/api/getChannels`
- **Method:** `GET`
- **Response:**
  ```json
  [
    {
      "channelId": 1,
      "channelNm": "Email",
      "adGroup": "AD_EMAIL",
      "defaultFlag": null
    }
  ]
  ```

### Get All Audit Levels
- **URL:** `/api/getAuditLevels`
- **Method:** `GET`
- **Response:**
  ```json
  [
    {
      "auditLevelId": 1,
      "auditLevelNm": "Level 1",
      "adGroup": "AD_AUDIT1",
      "approverSoeid": "SOEID3",
      "approverFname": "Alice",
      "approverLname": "Brown",
      "approverGroup": "GroupC",
      "resourceId": "RES3",
      "defaultFlag": null
    }
  ]
  ```

### Get Permissions by Role and Category
- **URL:** `/api/getPermission`
- **Method:** `GET`
- **Query Params:**
  - `role_id` (Long)
  - `permission_category` (String)
- **Example:**
  `/api/getPermission?role_id=1&permission_category=CategoryA`
- **Response:**
  ```json
  [
    {
      "permissionNm": "Permission 1",
      "adGroup": "AD_PERM1",
      "defaultFlag": "Y"
    }
  ]
  ```

## H2 Database
- **Console:** [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- **JDBC URL:** `jdbc:h2:mem:testdb`
- **Username:** `sa`
- **Password:** `password`

## Sample Data
Sample records are loaded automatically from `src/main/resources/data.sql` on startup.

## License
MIT 