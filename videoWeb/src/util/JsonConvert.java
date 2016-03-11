package util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;
public class JsonConvert {
 public static JSONObject message(String message, boolean success) {
          Map map = new HashMap();
          map.put("success", success);
          map.put("message", message);
          return JSONObject.fromObject(map);
 }
public static JSONObject generate(List list) {
          Map map = new HashMap();
          map.put("totalProperty", list.size());
          map.put("root", list);
          return JSONObject.fromObject(map);
 }
public static JSONObject javabean2json(Object object, String message,
           boolean success) {
          Map map = new HashMap();
          map.put("success", success);
          map.put("message", message);
          map.put("data", object);
          return JSONObject.fromObject(map);
 }
public static JSONObject objectcollect2json(List list, String total) {
          Map map = new HashMap();
          map.put("totalProperty", total);
          map.put("root", list);
          return JSONObject.fromObject(map);
 }
public static JSONArray getJSONArrayFormString(String str) {
          if (str == null || str.trim().length() == 0) {
           return null;
          }
          JSONArray jsonArray = null;
          try {
           jsonArray = JSONArray.fromObject(str);
          } catch (JSONException e) {
           e.printStackTrace();
          }
          return jsonArray;
 }
public static JSONObject StringToJSONOBject(String str) {
          if (str == null || str.trim().length() == 0) {
           return null;
          }
          JSONObject jsonObject = null;
          try {
           jsonObject = JSONObject.fromObject(str);
          } catch (JSONException e) {
           e.printStackTrace();
          }
          return jsonObject;
 }
}