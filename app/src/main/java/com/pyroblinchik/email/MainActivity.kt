package com.pyroblinchik.email

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    fun buttonSendEmail(view: View?) {
//        try {
//            val stringSenderEmail = "spdworkpost@gmail.com"
//            val stringReceiverEmail = "spdworkpost@gmail.com"
//            val stringPasswordSenderEmail = "21Mike02"
//            val stringHost = "smtp.gmail.com"
//            val properties: Properties = System.getProperties()
//            properties.put("mail.smtp.host", stringHost)
//            properties.put("mail.smtp.port", "465")
//            properties.put("mail.smtp.ssl.enable", "true")
//            properties.put("mail.smtp.auth", "true")
//            val session: javax.mail.Session =
//                Session.getInstance(properties, object : Authenticator() {
//                    protected val passwordAuthentication: PasswordAuthentication?
//                        protected get() = PasswordAuthentication(
//                            stringSenderEmail,
//                            stringPasswordSenderEmail
//                        )
//                })
//            val mimeMessage = MimeMessage(session)
//            mimeMessage.addRecipient(Message.RecipientType.TO, InternetAddress(stringReceiverEmail))
//            mimeMessage.setSubject("Subject: Android App email")
//            mimeMessage.setText("Hello, \n\nWorld")
//            val thread = Thread {
//                try {
//                    Transport.send(mimeMessage)
//                } catch (e: MessagingException) {
//                    e.printStackTrace()
//                }
//            }
//            thread.start()
//        } catch (e: AddressException) {
//            e.printStackTrace()
//        } catch (e: MessagingException) {
//            e.printStackTrace()
//        }
//    }
}