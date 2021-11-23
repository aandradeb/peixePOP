package common;

import acuario.Sala;
import org.json.JSONArray;
import org.json.JSONObject;
import tienda.Cliente;

import java.util.ArrayList;

public class APIRequest {

    private final APIConfig api = new APIConfig();

    // MÉTODOS AÑADIDOS PARA EL ACUARIO
    // API SALAS
    public ArrayList<Sala> getSalas(){
        JSONArray jsonResponse = api.getResponse("/salas");
        ArrayList<Sala> lista=new ArrayList();
        for (int indice = 0; indice < jsonResponse.length(); indice++) {
            JSONObject jsonObject = jsonResponse.getJSONObject(indice);
            String codigo = jsonObject.getString("codigo");
            String nombre = jsonObject.getString("nombre");
            String tipo = jsonObject.getString("tipo");
            lista.add(new Sala(codigo,nombre,tipo));
        }
        return lista;
    }

    // API CLIENTES
    public ArrayList<Cliente> getClientes(){
        JSONArray jsonResponse = api.getResponse("/clientes");
        ArrayList<Cliente> lista=new ArrayList();
        for (int indice = 0; indice < jsonResponse.length(); indice++) {
            JSONObject jsonObject = jsonResponse.getJSONObject(indice);
            String codigo = jsonObject.getString("codigo");
            String nombre = jsonObject.getString("nombre");
            String direccion = jsonObject.getString("direccion");
            String telefono = jsonObject.getString("telefono");
            lista.add(new Cliente(codigo,nombre,direccion,telefono));
        }
        return lista;
    }
    
    // API FACTURAS
    public ArrayList<Factura> getFacturas(){
        JSONArray jsonResponse = api.getResponse("/facturas");
        ArrayList<Factura> lista=new ArrayList();
        for (int indice = 0; indice < jsonResponse.length(); indice++) {
            JSONObject jsonObject = jsonResponse.getJSONObject(indice);
            String codigo = jsonObject.getString("codigo");
            String codigo_cliente = jsonObject.getString("codigo_cliente");
            String fecha = jsonObject.getString("fecha");
            String importe_total = jsonObject.getString("importe_total");
            String pagada = jsonObject.getString("pagada");
            lista.add(new Factura(codigo,codigo_cliente,fecha,importe_total,pagada));
        }
        return lista;
    }
    
    // API LINEAS FACTURAS
    public ArrayList<Linea_Factura> getLineasFacturas(){
        JSONArray jsonResponse = api.getResponse("/lineas_facturas");
        ArrayList<Linea_Factura> lista=new ArrayList();
        for (int indice = 0; indice < jsonResponse.length(); indice++) {
            JSONObject jsonObject = jsonResponse.getJSONObject(indice);
            String codigo = jsonObject.getString("codigo");
            String cantidad = jsonObject.getString("cantidad");
            String descripcion = jsonObject.getString("descripcion");
            String precio = jsonObject.getString("precio");
            String codigo_factura = jsonObject.getString("codigo_factura");
            lista.add(new Linea_Factura(codigo,cantidad,descripcion,precio,codigo_factura));
        }
        return lista;
    }
    
    // API LINEAS PEDIDOS
    public ArrayList<Linea_Pedido> getLineasPedidos(){
        JSONArray jsonResponse = api.getResponse("/lineas_pedidos");
        ArrayList<Linea_Pedido> lista=new ArrayList();
        for (int indice = 0; indice < jsonResponse.length(); indice++) {
            JSONObject jsonObject = jsonResponse.getJSONObject(indice);
            String codigo = jsonObject.getString("codigo");
            String codigo_articulo = jsonObject.getString("codigo_articulo");
            String cantidad = jsonObject.getString("cantidad");
            String precio = jsonObject.getString("precio");
            String codigo_pedido = jsonObject.getString("codigo_pedido");
            lista.add(new Linea_Pedido(codigo,codigo_articulo,cantidad,precio,codigo_pedido));
        }
        return lista;
    }
    
    // API PEDIDOS
    public ArrayList<Pedido> getPedidos(){
        JSONArray jsonResponse = api.getResponse("/pedidos");
        ArrayList<Pedido> lista=new ArrayList();
        for (int indice = 0; indice < jsonResponse.length(); indice++) {
            JSONObject jsonObject = jsonResponse.getJSONObject(indice);
            String codigo = jsonObject.getString("codigo");
            String fecha = jsonObject.getString("fecha");
            String recibido = jsonObject.getString("recibido");
            lista.add(new Pedido(codigo,fecha,recibido));
        }
        return lista;
    }
    
    
}
