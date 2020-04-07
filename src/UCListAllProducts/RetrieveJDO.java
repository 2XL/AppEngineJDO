package UCListAllProducts;

public class RetrieveJDO {
/*
	public void apply()
	{
	    // 1. get a PersistenceManager instance
	    PersistenceManager manager = factory.getPersistenceManager();
	    System.out.println("The list of available products:");

	    try
	    {
	        // clear cache to provoke query against database
	        PersistenceBrokerFactory.defaultPersistenceBroker().clearCache();

	        // 2. start tx and form query
	        manager.currentTransaction().begin();
	        Query query = manager.newQuery(Product.class);

	        // 3. perform query
	        Collection allProducts = (Collection)query.execute();

	        // 4. now iterate over the result to print each
	        // product and finish tx
	        java.util.Iterator iter = allProducts.iterator();
	        if (! iter.hasNext())
	        {
	            System.out.println("No Product entries found!");
	        }
	        while (iter.hasNext())
	        {
	            System.out.println(iter.next());
	        }
	        manager.currentTransaction().commit();
	    }
	    catch (Throwable t)
	    {
	        t.printStackTrace();
	    }
	    finally
	    {
	        manager.close();
	    }
	}
*/
}
