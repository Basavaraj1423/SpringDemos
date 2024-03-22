package org.docterapp.util;

public class Querries {
	public static final String INSERTQUERRY = "insert into docter(docter_name,speciality,experience,fees,ratings) values (?,?,?,?,?)";
    public static final String UPDATEQUERRY = "UPDATE DOCTER SET fees=? where docter_Id = ?";
    public static final String DELETEQUERRY = "DELETE from DOCTER  where docter_Id= ?";
    public static final String FINDALLQUERRY = "SELECT * from Docter";
    public static final String FINDBYSPECIALITYQUERRY = "SELECT * from Docter WHERE speciality=?";
    public static final String FINDBYSPECIALITYANDEXPQUERRY = "SELECT * from Docter WHERE speciality=? AND EXPERIENCE >= ?";
    public static final String FINDBYSPECIALITYANDRATINGSQUERRY = "SELECT * from Docter WHERE speciality=? AND RATINGS >= ?";
    public static final String FINDBYSPECIALITYANDFEESQUERRY = "SELECT * from Docter WHERE speciality=? AND FEES <=?";
    public static final String FINDBYSPECIALITYANDNAMEQUERRY = "SELECT * from Docter WHERE speciality=? AND docter_name like ?";
    public static final String FINDBYidQUERRY = "SELECT * from Docter WHERE dotcter_id = ?";


}
