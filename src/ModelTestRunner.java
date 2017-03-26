
public class ModelTestRunner {

	public static void main(String[] args) {
		
		SQLConnector sqlite_c = new SQLConnector("jdbc:sqlite:./database/crud_db","","");
		EntryDAO entryDAO = new EntryDAO(sqlite_c.getConnection());
		Entry Sasha = new Entry(2, "Sasha", 40);
		entryDAO.createEntry(Sasha);
			
	}

}
