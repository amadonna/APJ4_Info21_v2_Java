package ru.arnaliev.school21.info21_v2_java.controllers.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.arnaliev.school21.info21_v2_java.model.Peer;
import ru.arnaliev.school21.info21_v2_java.service.PeerService;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/data")
public class PeersController {
    private final PeerService service;

    @Autowired
    public PeersController(PeerService service) {
        this.service = service;
    }
    @GetMapping
    public String dataPage() {
        return "data/data";
    }
    @RequestMapping("/peers")
    public String getPeers(Model model) {
        List<Peer> peers = service.findAll();
        model.addAttribute("peers", peers);
        return "data/peers";
    }
    @PostMapping("/addPeer")
    public String addPeer(@RequestParam String nickname,
                          @RequestParam @DateTimeFormat(pattern = "dd-MM-yyyy") Date birthday) {
        service.save(new Peer(nickname, birthday));
        return "redirect:/data/peers";
    }
}
