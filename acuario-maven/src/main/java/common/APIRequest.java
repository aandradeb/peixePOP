package common;

import acuario.Sala;
import org.json.JSONArray;
import org.json.JSONObject;
import tienda.Cliente;

import java.util.ArrayList;

public class APIRequest {

    private final APIConfig api = new APIConfig();

    // MÃ‰TODOS AÃ‘ADIDOS PARA EL ACUARIO
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

    // API TRABAJADORES
    public ArrayList<Trabajador> getTrabajadores() {
        JSONArray jsonResponse = api.getResponse("/trabajadores");
        ArrayList<Trabajador> lista=new ArrayList();
        for (int indice = 0; indice < jsonResponse.length(); indice++) {
            JSONObject jsonObject = jsonResponse.getJSONObject(indice);
            String codigo = jsonObject.getString("codigo");
            String nombre = jsonObject.getString("nombre");
            String direccion = jsonObject.getString("direccion");
            String telefono = jsonObject.getString("telefono");
            String salario = jsonObject.getString("salario");
            lista.add(new Trabajador(codigo,nombre,direccion,telefono,salario));
        }
        return lista;
    }


    // API TIBURONES
    public ArrayList<Tiburon> getTriburones() {
        JSONArray jsonResponse = api.getResponse("/tiburones");
        ArrayList<Tiburon> lista=new ArrayList();
        for (int indice = 0; indice < jsonResponse.length(); indice++) {
            JSONObject jsonObject = jsonResponse.getJSONObject(indice);
            String codigo = jsonObject.getString("codigo");
            String nombre = jsonObject.getString("nombre");
            String tamano = jsonObject.getString("tamano");
            String codigo_estanque = jsonObject.getString("codigo_estanque");
            lista.add(new Tiburon(codigo,nombre,tamano,codigo_estanque));
        }
        return lista;
    }


    // API PLANTAS
    public ArrayList<Planta> getPlantas(){
        JSONArray jsonResponse = api.getResponse("/plantas");
        ArrayList<Planta> lista=new ArrayList();
        for (int indice = 0; indice < jsonResponse.length(); indice++) {
            JSONObject jsonObject = jsonResponse.getJSONObject(indice);
            String codigo = jsonObject.getString("codigo");
            String medioDeVida = jsonObject.getString("medio_de_vida");
            String nombre = jsonObject.getString("nombre");
            String cod_estanque="";
            String cod_sala="";
            switch (medioDeVida){   //Retornamos solo el cod_estanque o cod_sala en base a medioDeVida.
                case "Acuatico":
                    cod_estanque=jsonObject.getString("codigo_estanque");
                    break;
                case "Terrestre":
                    cod_sala = jsonObject.getString("codigo_sala");
                    break;
            }
            lista.add(new Planta(codigo,medioDeVida,nombre,cod_estanque, cod_sala));
        }
        return lista;
    }


    // API ARTICULOS
    /*public ArrayList<Articulo> getArticulos(){
        JSONArray jsonResponse = api.getResponse("/articulos");
        ArrayList<Articulo> lista=new ArrayList();
        for (int indice = 0; indice < jsonResponse.length(); indice++) {
            JSONObject jsonObject = jsonResponse.getJSONObject(indice);
            String codigo = jsonObject.getString("codigo");
            String descripcion = jsonObject.getString("descripcion");
            String stock = jsonObject.getString("stock");
            String precio = jsonObject.getString("precio");
            String tipoArticulo = jsonObject.getString("tipo_articulo");
            lista.add(new Articulo(codigo,descripcion,stock,precio,tipoArticulo));
        }
        return lista;
    }*/
    
    // API ENTRADAS
    /*public ArrayList<Entrada> getEntradas(){
        JSONArray jsonResponse = api.getResponse("/entradas");
        ArrayList<Entrada> lista=new ArrayList();
        for (int indice = 0; indice < jsonResponse.length(); indice++) {
            JSONObject jsonObject = jsonResponse.getJSONObject(indice);
            String codigo = jsonObject.getString("codigo");
            String edad = jsonObject.getString("edad");
            String precio = jsonObject.getString("precio");
            String tipo = jsonObject.getString("tipo");
            String codigoEvento = jsonObject.getString("codigo_evento");
            String fecha = jsonObject.getString("fecha");
            String codigoCliente = jsonObject.getString("codigo_cliente");

            lista.add(new Entrada(codigo,edad,precio,tipo,codigoEvento,fecha,codigoCliente));
        }
        return lista;
    }*/
        
    // API EVENTOS
    /*public ArrayList<Evento> getEventos(){
        JSONArray jsonResponse = api.getResponse("/eventos");
        ArrayList<Evento> lista=new ArrayList();
        for (int indice = 0; indice < jsonResponse.length(); indice++) {
            JSONObject jsonObject = jsonResponse.getJSONObject(indice);
            String codigo = jsonObject.getString("codigo");
            String nombre = jsonObject.getString("nombre");
            String fecha = jsonObject.getString("fecha");
            String precio = jsonObject.getString("precio");
            String duracion = jsonObject.getString("duracion");
            String requisitoEdad = jsonObject.getString("requisito_edad");
            String aforo = jsonObject.getString("aforo");

            lista.add(new Evento(codigo,nombre,fecha,precio,duracion,requisitoEdad,aforo));
        }
        return lista;
    }*/
    

    // API FACTURAS
    /*public ArrayList<Factura> getFacturas(){
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
    }*/
    
}

