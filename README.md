# BaseSQLite
En este repositorio se va a subir las clases y demás que necesitamos para generar la conexión con la base de datos

Las bases de datos SQLite se generan con una extension del Mozilla Firefox, que se llama SQLite.

En las clases que van a llamar a la BD deben importarse los siguientes:
import java.sql.*;
import javax.swing.*;


1-Hay que generar un folderSource en el proyecto llamado resources. Arrastrar ahi el .jar.
2- Una vez que ya aparece el jar en el folder, boton derecho donde dice JRE System Library -> Build Path ->Configure Path.
Ahi seleccionamos de la carpeta resources nuestro .jar y lo añadimos al proyecto como si fuera una libreria más.
