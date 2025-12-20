package Lab7_LibraryManagementSystem.service;

import Lab7_LibraryManagementSystem.exception.ClientNotFoundException;
import Lab7_LibraryManagementSystem.model.Client;
import Lab7_LibraryManagementSystem.model.LibraryItem;
import Lab7_LibraryManagementSystem.exception.ItemNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class Library{
    private Map<Integer,LibraryItem> library = new HashMap();
    private int itemsCount;
    private Map<Integer, Client> clients = new HashMap();

    public <T extends LibraryItem> void addItem(T item){
        if(library.containsKey(item.getId())){
            System.out.println("Item Already exist !");
        }
        else{
            library.put(item.getId(), item);
            itemsCount++;
        }
    }

    public <T extends LibraryItem> LibraryItem retrieveItem(T item) throws ItemNotFoundException {
        if(library.containsKey(item.getId())){
            //itemsCount--;
            return library.get(item.getId());
        }
        else {
            throw new ItemNotFoundException("Item ID " + item.getId() + " not found!");
        }
    }

    public void deleteItem(int itemId) throws ItemNotFoundException{
        if(library.containsKey(itemId)){
            itemsCount--;
            library.remove(itemId);
        }
        else{
            throw new ItemNotFoundException("Item ID " + itemId + " not found!");
        }
    }

    public LibraryItem retrieveItem(int itemId) throws ItemNotFoundException {
        if(library.containsKey(itemId)){
            //itemsCount--;
            return library.get(itemId);
        }
        else {
            throw new ItemNotFoundException("Item ID " + itemId + " not found!");
        }
    }

    public <T extends LibraryItem> void deleteItem(T item) throws ItemNotFoundException{
        if(library.containsKey(item.getId())){
            itemsCount--;
            library.remove(item.getId());
        }
        else {
            throw new ItemNotFoundException("Item ID " + item.getId() + " not found!");
        }
    }

    public void displayAllItems(){
        for(Map.Entry<Integer, LibraryItem> pair : library.entrySet()){
            System.out.println(pair.getValue().getItemDetails());

            //System.out.println(pair.getValue());
        }
        System.out.println("ItemsCount = " + getItemsCount());
    }

    public void addClient(Client client) throws ClientNotFoundException {
        if(clients.containsKey(client.getId())){
            System.out.println("Client Already Exist!");
        }
        else {
            clients.put(client.getId(), client);
        }
    }

    public void deleteClient(int clientId) throws ClientNotFoundException{
        if(clients.containsKey(clientId)){
            clients.remove(clientId);
        }
        else{
            throw new ClientNotFoundException("Client ID not found!");
        }
    }

    public Client retrieveClient(int clientId) throws ClientNotFoundException {
        if(clients.containsKey(clientId)){
            return clients.get(clientId);
        }
        else{
            throw new ClientNotFoundException("Client ID not found!");
        }
    }

    public void displayAllClients(){
        for(Map.Entry<Integer, Client> pair : clients.entrySet()){
            Client client = pair.getValue();
            System.out.println(client.getClientDetails());
        }
    }

    public int getItemsCount() {
        return this.itemsCount;
    }

    public void borrowItem(int clientId, int itemId) throws ClientNotFoundException, ItemNotFoundException {
        Client client = retrieveClient(clientId);
        LibraryItem item = retrieveItem(itemId);

        if (item.isBorrowed()) {
            System.out.println("Item ID " + itemId + " is borrowed.");
        } else {
            item.setBorrowed(true);
            client.borrowItem(item);
            System.out.println("Client " + clientId + " successfully borrowed Item " + itemId);
        }
    }

    public void returnItem(int clientId, int itemId) throws ClientNotFoundException, ItemNotFoundException {
        Client client = retrieveClient(clientId);
        LibraryItem item = retrieveItem(itemId);

        if (client.getBorrowedItems().contains(item)) {
            item.setBorrowed(false);
            client.returnItem(item);
            System.out.println("Client " + clientId + " successfully returned Item " + itemId);
        } else {
            System.out.println("Client " + clientId + " does not have Item " + itemId);
        }
    }

}