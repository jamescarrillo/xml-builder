/**
 * Copyright 2019 Project OpenUBL, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Eclipse Public License - v 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openublpe.xmlbuilder.inputdata.generator.cases.proveedorsincodigopostal;

import org.openublpe.xmlbuilder.core.models.input.common.ClienteInputModel;
import org.openublpe.xmlbuilder.core.models.input.standard.invoice.InvoiceInputModel;
import org.openublpe.xmlbuilder.inputdata.generator.AbstractInvoiceInputGenerator;
import org.openublpe.xmlbuilder.inputdata.generator.InvoiceInputGenerator;

import java.util.Calendar;
import java.util.Optional;

public class Invoice_ProveedorSinCodigoPostalGenerator extends AbstractInvoiceInputGenerator implements InvoiceInputGenerator {

    @Override
    public InvoiceInputModel getInput() {
        InvoiceInputModel input = new InvoiceInputModel();
        input.setSerie("F001");
        input.setNumero(1);

        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, Calendar.FEBRUARY, 1, 18, 30, 0);
        input.setFechaEmision(calendar.getTimeInMillis());

        // Proveedor
        input.setProveedor(Utils.getProveedor());

        // Cliente
        ClienteInputModel cliente = new ClienteInputModel();
        input.setCliente(Utils.getCliente());

        // Detalle
        input.setDetalle(Utils.getDetalle());

        return input;
    }

    @Override
    public Optional<String> getSnapshot() {
        return Optional.of("xml/cases/proveedorsincodigopostal/Invoice.xml");
    }

}
