First to create this project:   
                    go to spring intializer online
                    create new project Task Management System 
                    maven,java, spring 3.0.5, jar
                    dependencies:
                                    Web, Data JPA, Security, MySQL Driver

Then connect to the MySQL:
                    sudo apt update
                    sudo apt install mysql-server

        To start the server:
                    sudo systemctl start mysql

        Check status:
                    sudo systemctl status mysql

        sudo mysql_secure_installation:
            use this command to secure the installation

        create database:
            mysql -u root -p -e "CREATE DATABASE task_management_system;"

        how to check the users in mysql:
            SELECT User FROM mysql.user;

