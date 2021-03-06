package proxyjob.proxijob.model

import com.parse.ParseClassName
import com.parse.ParseFile
import com.parse.ParseObject
import com.parse.ParseUser
import java.util.*
import kotlin.collections.ArrayList

/**
 * Created by alexandre on 04/02/2018.
 */
@ParseClassName("Jobs")
class Jobs : ParseObject() {
    var job: String?
        get() = this.getString("job")
        set(value) {
            this.put("job", value)
        }
    var description: String?
        get() = this.getString("description")
        set(value) {
            this.put("description", value)
        }
    var price: String?
        get() = this.getString("price")
        set(value) {
            this.put("price", value)
        }
    var status: String?
        get() = this.getString("status")
        set(value) {
            this.put("status", value)
        }
    var contract: Contracts?
        get() = this.get("contract") as Contracts
        set(value) {
            this.put("contract", ParseObject.createWithoutData("Contracts", (value!!.objectId)))
        }
    var contractClient: Contracts?
        get() = this.get("contractClient") as Contracts
        set(value) {
            this.put("contractClient", ParseObject.createWithoutData("Contracts", (value!!.objectId)))
        }
    var dateStart: Date?
        get() = this.getDate("dateStart")
        set(value) {
            this.put("dateStart", value)
        }
    var dateEnd: Date?
        get() = this.getDate("dateEnd")
        set(value) {
            this.put("dateEnd", value)
        }
    var client: KUser?
        get() = this.get("clients") as KUser
        set(value) {
            this.put("clients", ParseObject.createWithoutData("_User", (value!!.objectId)))
        }
    var company: Company?
        get() = this.get("company") as Company
        set(value) {
            this.put("company", ParseObject.createWithoutData("Company", (value!!.objectId)))
        }
    var postule: ArrayList<String>?
        get() = this.get("postule") as ArrayList<String>
        set(value) {
            this.put("postule", value)
        }

}