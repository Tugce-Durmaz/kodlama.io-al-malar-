
public class GamerManager  implements GamerService {

    @Override
	 public void add(Gamer gamer) {
	        System.out.println(" Eklendi: " + gamer.getName());
	        
	    }

    @Override
	    public void update(Gamer gamer) {
	        System.out.println(" g�ncellendi: " + gamer.getName());
	        
	    }

    @Override
	    public void delete(Gamer gamer) {
	        System.out.println(" silindi: " + gamer.getName());
	        

	
}
}