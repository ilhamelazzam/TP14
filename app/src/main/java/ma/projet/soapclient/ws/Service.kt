package ma.projet.soapclient.ws

import ma.projet.soapclient.beans.Compte
import ma.projet.soapclient.beans.TypeCompte
import java.util.Date
import java.util.concurrent.atomic.AtomicLong

/**
 * Service SOAP factice pour permettre la compilation.
 * Remplacez le contenu par les appels réels à votre endpoint SOAP.
 */
class Service {
    private val idGenerator = AtomicLong(1)
    private val comptes = mutableListOf(
        Compte(idGenerator.getAndIncrement(), 1200.0, Date(), TypeCompte.COURANT),
        Compte(idGenerator.getAndIncrement(), 2400.0, Date(), TypeCompte.EPARGNE)
    )

    fun getComptes(): List<Compte> = comptes.toList()

    fun createCompte(solde: Double, type: TypeCompte): Boolean {
        val newCompte = Compte(idGenerator.getAndIncrement(), solde, Date(), type)
        comptes.add(newCompte)
        return true
    }

    fun updateCompte(id: Long, solde: Double, type: TypeCompte): Boolean {
        val index = comptes.indexOfFirst { it.id == id }
        if (index == -1) return false
        comptes[index] = comptes[index].copy(solde = solde, type = type)
        return true
    }

    fun deleteCompte(id: Long): Boolean {
        val removed = comptes.removeIf { it.id == id }
        return removed
    }
}
