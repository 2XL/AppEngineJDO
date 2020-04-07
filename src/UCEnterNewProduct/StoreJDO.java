package UCEnterNewProduct;

public class StoreJDO {
	public void apply()
	{
	    // 1. this will be our new object
	    Product newProduct = new Product();
	    // 2. now read in all relevant information and fill the new object:
	    System.out.println("please enter a new product");
	    String in = readLineWithMessage("enter name:");
	    newProduct.setName(in);
	    in = readLineWithMessage("enter price:");
	    newProduct.setPrice(Double.parseDouble(in));
	    in = readLineWithMessage("enter available stock:");
	    newProduct.setStock(Integer.parseInt(in));
/*
	    // 3. create PersistenceManager and start transaction
	    PersistenceManager manager = factory.getPersistenceManager();

	    Transaction tx = null;
	    tx = manager.currentTransaction();
	    tx.begin();

	    // 4. mark object as persistent
	    manager.makePersistent(newProduct);

	    // 5. commit transaction
	    tx.commit();

	    manager.close();
	}

	private String readLineWithMessage(String string) {
		// TODO Auto-generated method stub
		return null;
*/
	}

	private String readLineWithMessage(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
