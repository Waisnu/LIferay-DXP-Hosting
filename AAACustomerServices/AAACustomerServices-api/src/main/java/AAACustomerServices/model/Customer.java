

package AAACustomerServices.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;


@ImplementationClassName("AAACustomerServices.model.impl.CustomerImpl")
@ProviderType
public interface Customer extends CustomerModel, PersistedModel {

	public static final Accessor<Customer, Long> CUSTOMER_ID_ACCESSOR =
		new Accessor<Customer, Long>() {

			@Override
			public Long get(Customer customer) {
				return customer.getCustomerId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Customer> getTypeClass() {
				return Customer.class;
			}

		};

}
