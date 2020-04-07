package UCDeleteProduc;

public class DeleteJDO {

	public DeleteJDO() {
		// TODO Auto-generated constructor stub
	}
	public void apply()
	{
		/*
	    PersistenceManager manager = null;
	    Transaction tx = null;
	    String in = readLineWithMessage("Delete Product with id:");
	    int id = Integer.parseInt(in);

	    try
	    {
	        // 1. start transaction
	        manager = factory.getPersistenceManager();
	        tx = manager.currentTransaction();
	        tx.begin();

	        // 2. Build a query to look up product by the id
	        Query query = manager.newQuery(Product.class, "id == " + id);

	        // 3. execute query
	        Collection result = (Collection) query.execute();

	        // 4. if no matching product was found, print a message
	        if (result.size() == 0)
	        {
	            System.out.println("did not find a Product with id=" + id);
	            tx.rollback();
	            manager.close();
	            return;
	        }
	        // 5. if a matching product was found, delete it
	        else
	        {
	            Product toBeDeleted = (Product) result.iterator().next();
	            manager.deletePersistent(toBeDeleted);
	            tx.commit();
	            manager.close();
	        }
	        
	    }
	    catch (Throwable t)
	    {
	        // rollback in case of errors
	        //broker.abortTransaction();
	        tx.rollback();
	        t.printStackTrace();
	    }
	    */
	}
}
