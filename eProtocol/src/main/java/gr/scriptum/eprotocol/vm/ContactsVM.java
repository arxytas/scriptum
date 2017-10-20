/**
 * 
 */
package gr.scriptum.eprotocol.vm;

import org.zkoss.bind.annotation.AfterCompose;
import org.zkoss.bind.annotation.Init;

import gr.scriptum.dao.ContactDAO;
import gr.scriptum.domain.Contact;
import gr.scriptum.eprotocol.csv.ContactConverter;

/**
 * @author <a href=
 *         "mailto:angelosanagnostopoulos@runbox.com">aanagnostopoulos</a>
 *
 */

@AfterCompose(superclass = true)
@Init(superclass = true)
public class ContactsVM extends GenericSearchVM<Contact, ContactDAO, ContactConverter> {

	@Override
	public String getEntityPage() {
		return ContactVM.PAGE;
	}

}
