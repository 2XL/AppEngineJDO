package UCEditProduct;

public class UpdateJDO {

	public void apply()
	{/*
	    PersistenceManager manager = null;

	    // ask user which object should edited
	    String in = readLineWithMessage("Edit Product with id:");
	    int id = Integer.parseInt(in);

	    Product toBeEdited;
	    try
	    {
	        // 1. start transaction
	        manager = factory.getPersistenceManager();
	        manager.currentTransaction().begin();

	        // We don't have a reference to the selected Product.
	        // So we have to look it up first,


	        // 2. Build a query to look up product by the id
	        Query query = manager.newQuery(Product.class, "id == " + id);

	        // 3. execute query
	        Collection result = (Collection) query.execute();
	        toBeEdited = (Product) result.iterator().next();

	        if (toBeEdited == null)
	        {
	            System.out.println("did not find a matching instance...");
	            manager.currentTransaction().rollback();
	            return;
	        }

	        // 4. edit the existing entry
	        System.out.println("please edit the product entry");
	        in =
	            readLineWithMessage(
	                "enter name (was " + toBeEdited.getName() + "):");
	        toBeEdited.setName(in);
	        in =
	            readLineWithMessage(
	                "enter price (was " + toBeEdited.getPrice() + "):");
	        toBeEdited.setPrice(Double.parseDouble(in));
	        in =
	            readLineWithMessage(
	                "enter available stock (was "
	                    + toBeEdited.getStock()
	                    + "):");
	        toBeEdited.setStock(Integer.parseInt(in));

	        // 5. commit changes
	        manager.currentTransaction().commit();
	    }
	    catch (Throwable t)
	    {
	        // rollback in case of errors
	        manager.currentTransaction().rollback();
	        t.printStackTrace();
	    }
	    finally
	    {
	        manager.close();
	    }
	*/
	}
	public UpdateJDO() {
		// TODO Auto-generated constructor stub
	}

}
