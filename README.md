# lab4

# muhashtable
"muhashtable" implements a hash table with separate chaining collision resolution. It provides methods to add, retrieve, and remove key-value pairs, as well as perform additional operations such as checking if a value exists in the hash table and retrieving the key associated with a value.
# methods
void put(K key, V value): Adds a key-value pair to the hash table.
V get(K key): Retrieves the value associated with a given key.
V remove(K key): Removes a key-value pair from the hash table based on the given key.
boolean contains(V value): Checks if a value exists in the hash table.
K getKey(V value): Retrieves the key associated with a given value.
void printBucketSizes(): Prints the sizes of each bucket in the hash table.
# student
Student
The student class represents a student with a name.
Student(String name): Constructs a student object with the given name.
private String name: The name of the student.
# hashtabletest
The "hashtabletest" class represents an object used for testing hash table functionality. It contains an id and name field and overrides the hashCode() method to calculate the hash code based on these fields.
private int id: The id of the test object. private String name: The name of the test object.
@Override int hashCode(): Overrides the hashCode() method to calculate the hash code based on the id and name fields.
# main
The "main" class is the entry point for the program. It demonstrates the usage of the muhashtable class by creating a hash table and populating it with randomly generated key-value pairs.
public static void main(String[] args): The main method that executes the program.
Creates an instance of muhashtable<hashtabletest, student>.
Generates random key-value pairs and adds them to the hash table using the put method.
Prints the sizes of each bucket in the hash table using the printBucketSizes method.
