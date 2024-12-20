package br.edu.ifsp.dmo.listadecontatos.model

import br.edu.ifsp.listadecontatos.model.Contact
import java.util.LinkedList;

object ContactDao {
    private val dataset = LinkedList<Contact>()
    fun insert(contact: Contact) {
        dataset.add(Contact(contact.name, contact.phone))
    }
    fun findAll(): List<Contact> {
        var ar = ArrayList<Contact>(dataset);
        ar.sortedBy { r -> r.name }
        System.out.println(ar);
        return ar.sortedBy {r -> r.name};
    }
}