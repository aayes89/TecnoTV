package tecnotvlf;

public class TecnoTVLF {

    public static void main(String[] args) {
        jRokuV v = new jRokuV();
        v.setVisible(true);
        /*Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        List<String> listas = new ArrayList<>();
        String mainUrl = "https://spinoff.link/listas-premium/";
        String urlRoku = "http://192.168.1.27:8060";
        //http://192.168.1.27:8060/launch/63218?live=false&autoCookie=false&debugVideoHud=false&url=http%3A%2F%2Fclubtv.link%2FMR1603%2Fkey4513%2Flista1.php%3Fc%3Da056%26token%3DTECNOTVGENERADORTV%26f%3D.m3u8&fmt=Auto&d

        try {

            URL url = new URL(mainUrl);
            URLConnection connection = url.openConnection();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.contains("m3u")) {
                        downloadM3U(line, listas);
                    }
                }
            }
            if (!listas.isEmpty()) {
                System.out.println("Resultados: \nElije la que deseas enviar.");
                int opc = 1;
                for (String lURL : listas) {
                    System.out.println(opc + " - " + lURL);
                    opc++;
                }
                String param = "/launch/63218?live=false&autoCookie=false&debugVideoHud=false&url=";
                String param1 = listas.get(in.nextInt());
                String param2 = "&fmt=Auto&drmParams=%7B%7D&headers=%7B%7D&metada=%7B%22isFullHD%22%3Afalse%7D&cookies=%5B%5D";
               
                sb.append(urlRoku).append(param).append(URLEncoder.encode(param1,"utf-8")).append(param2);
                System.out.println("URL formed: " + sb.toString());
               
                System.out.println("Enviando canal seleccionado a Roku");
                doPOST(sb.toString());
                System.out.println("Disfruta tu Roku");
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(TecnoTVLF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TecnoTVLF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static String doPOST(String url) {
        try {
            // Crear una conexión HTTP
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // Configurar la solicitud como POST
            con.setRequestMethod("POST");

            // Habilitar el envío de datos
            con.setDoOutput(true);

            // Escribir los parámetros en el cuerpo de la solicitud
            //try (OutputStream os = con.getOutputStream()) {
            //    byte[] input = parametros.getBytes("utf-8");
            //    os.write(input, 0, input.length);
            //}
            // Leer la respuesta del servidor
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                return response.toString();
            }
        } catch (IOException e) {
            System.out.println("IOE: " + e.getMessage());
            return null;
        }
    }

    static void downloadM3U(String url, List<String> result) {

        try {
            String extractedUrl = extractURL(url);
            URL m3uUrl = new URL(extractedUrl);
            URLConnection connection = m3uUrl.openConnection();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.contains("History")) {
                        //System.out.println(line);
                        line = br.readLine();
                        result.add(line);
                        //System.out.println(line);
                    }
                }
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(TecnoTVLF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TecnoTVLF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static String extractURL(String line) {
        String extracted = "";
        Pattern pattern = Pattern.compile("value=\"(.*?)\"");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            extracted = matcher.group(1);
        }
        return extracted;
    }*/
    }
}
