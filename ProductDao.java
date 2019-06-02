package dao_implementatie;

import java.util.List;

public interface ProductDao {
	public Product save(Product product);
	public Product update(Product product);
	public boolean delete(Product product);
}
