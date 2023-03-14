package com.example.examenu2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class Regalos : AppCompatActivity() {
    var menu = ArrayList<Detalles>()
    private var adapter: AdaptadorDetalles? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regalos)

        var menuOption: String? = intent.getStringExtra("menuType")
        agregarDetalles(menuOption)

        adapter = AdaptadorDetalles(this, menu)

        var gridview: GridView = findViewById(R.id.gridView)
        gridview.adapter = adapter
    }

    fun agregarDetalles(opcion:String?){
        when(opcion){
            "Detalles"->{
                menu.add(Detalles(R.drawable.cumplebotanas, "$280"))
                menu.add(Detalles(R.drawable.cumplecheve, "$320"))
                menu.add(Detalles(R.drawable.cumpleescolar, "$330"))
                menu.add(Detalles(R.drawable.cumplesnack, "$190"))
                menu.add(Detalles(R.drawable.cumplevinos, "$150"))
                menu.add(Detalles(R.drawable.cumplevinos, "$370"))

            }
            "Globos"->{
                menu.add(Detalles(R.drawable.globoamor, "$450"))
                menu.add(Detalles(R.drawable.globocumple, "$260"))
                menu.add(Detalles(R.drawable.globofestejo, "$820"))
                menu.add(Detalles(R.drawable.globos, "$260"))
                menu.add(Detalles(R.drawable.globonum, "$760"))
                menu.add(Detalles(R.drawable.globoregalo, "$240"))

            }
            "Peluches"->{
                menu.add(Detalles(R.drawable.peluchemario, "$320"))
                menu.add(Detalles(R.drawable.pelucheminecraft, "$320"))
                menu.add(Detalles(R.drawable.peluchepeppa, "$290"))
                menu.add(Detalles(R.drawable.peluchesony, "$330"))
                menu.add(Detalles(R.drawable.peluchestich, "$280"))
                menu.add(Detalles(R.drawable.peluches, "$"))
                menu.add(Detalles(R.drawable.peluchevarios, "$195"))

            }
            "Regalos"->{
                menu.add(Detalles(R.drawable.regaloazul, "$80"))
                menu.add(Detalles(R.drawable.regalocolores, "$85"))
                menu.add(Detalles(R.drawable.regalos, "$"))
                menu.add(Detalles(R.drawable.regalobebe, "$140"))
                menu.add(Detalles(R.drawable.regalocajas, "$75"))
                menu.add(Detalles(R.drawable.regalovarios, "$80"))

            }
            "Tazas"->{
                menu.add(Detalles(R.drawable.tazaabuela, "$120"))
                menu.add(Detalles(R.drawable.tazalove, "$120"))
                menu.add(Detalles(R.drawable.tazaquiero, "$260"))
                menu.add(Detalles(R.drawable.tazas, "$280"))
            }
        }
    }

    private class AdaptadorDetalles: BaseAdapter{
        var detalles = ArrayList<Detalles>()
        var contexto: Context?=null

        constructor(contexto:Context, detalle:ArrayList<Detalles>){
            this.detalles=detalle
            this.contexto = contexto
        }

        override fun getCount(): Int {
            return detalles.size
        }

        override fun getItem(p0: Int): Any {
            return detalles[0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var det=detalles[p0]
            var inflador= LayoutInflater.from(contexto)
            var vista= inflador.inflate(R.layout.activity_detalle_regalos,null)

            var imagen = vista.findViewById(R.id.iv_regalo_imagen) as ImageView
            var precio = vista.findViewById(R.id.tv_regalo_precio) as TextView

            imagen.setImageResource(det.image)
            precio.setText(det.precio)
            return vista
        }

    }
}