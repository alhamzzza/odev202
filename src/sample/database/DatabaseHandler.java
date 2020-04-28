package sample.database;
import java.sql.*;

import static sample.database.Consts.admuser;

public class DatabaseHandler extends Configs {
    public Connection getDBconnection() throws ClassNotFoundException, SQLException {

        Connection dbConnection;

        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName + "?useSSL=false";
        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }


    public void signupuser(String name, String username, String email, String password) throws SQLException, ClassNotFoundException {

        String insert = "INSERT INTO " + Consts.admins + "(" + Consts.adminsname + "," +
                admuser + "," + Consts.admemail +
                "," + Consts.admpass + ")" + "VALUES (?,?,?,?)";
        try {
            PreparedStatement preparedStatment = getDBconnection().prepareStatement(insert);
            preparedStatment.setString(1, name);
            preparedStatment.setString(2, username);
            preparedStatment.setString(3, email);
            preparedStatment.setString(4, password);

            preparedStatment.executeUpdate();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


    public void addperson(String name, String username, String email, String password) throws SQLException, ClassNotFoundException {

        String insert = "INSERT INTO " + Consts.admins + "(" + Consts.adminsname + "," +
                admuser + "," + Consts.admemail +
                "," + Consts.admpass + ")" + "VALUES (?,?,?,?)";
        try {
            PreparedStatement preparedStatment = getDBconnection().prepareStatement(insert);
            preparedStatment.setString(1, name);
            preparedStatment.setString(2, username);
            preparedStatment.setString(3, email);
            preparedStatment.setString(4, password);

            preparedStatment.executeUpdate();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


    public void delete(String username) throws SQLException, ClassNotFoundException {

        String delete = "DELETE FROM " + Consts.admins + " WHERE " + admuser + "=?";

        try {
            PreparedStatement preparedStatment = getDBconnection().prepareStatement(delete);

            preparedStatment.setString(1, username);


            preparedStatment.executeUpdate();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


    public void update(String name, String username, String email, String password) throws SQLException, ClassNotFoundException {

        String update = "Update " + Consts.admins +   " Set " + "(" + Consts.adminsname  + admuser  + Consts.admpass +  ")" + "VALUES (?,?,?)" + " WHERE " + admuser + "=?" ;
        try {
            PreparedStatement preparedStatment = getDBconnection().prepareStatement(update);
            preparedStatment.setString(1, name);
            preparedStatment.setString(2, username);
            preparedStatment.setString(3, email);
            preparedStatment.setString(4, password);

            preparedStatment.executeUpdate();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


}

