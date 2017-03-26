import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class EntryDAO {

	private Connection dbConnection;
	
	public EntryDAO(Connection dbConnection) {
		this.dbConnection = dbConnection;
	}
	
	public void createEntry(Entry entry) {
		try {
			PreparedStatement stmt = dbConnection.prepareStatement(
					"INSERT INTO Entries " + "Values (?,?,?)"
					);
			stmt.setInt(1, entry.getId());
			stmt.setString(2, entry.getName());
			stmt.setInt(3, entry.getAge());
			stmt.executeUpdate();
		} catch(Exception e) {
			System.err.print(e.toString());
		}
	}
	
	public List<EntryDAO> readEntries(List<Integer> idList) {
		
		return null;
	}
	
	public EntryDAO readEntry(int id) {
		
		return null;
	}
	
	public void updateEntry(int id, String name, int age) {
		
	}
	
	public void deleteEntry(int id) {
		
	}
	

	
	

	
	
	
}
