package org.javers.model.object.graph

import org.javers.core.metamodel.property.FieldBasedPropertyScanner
import org.javers.core.metamodel.property.ManagedClassFactory

/**
 * @author bartosz walacik
 */
class ObjectWrapperFieldTest extends ObjectWrapperTest{

    def setup() {
        def scanner = new FieldBasedPropertyScanner();
        managedClassFactory = new ManagedClassFactory(scanner);
    }
}
