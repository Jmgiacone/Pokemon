package pokemon.core;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public enum Species
{
    BULBASAUR(Generation1.BULBASAUR),
    IVYSAUR(Generation1.IVYSAUR),
    VENUSAUR(Generation1.VENUSAUR),
    CHARMANDER(Generation1.CHARMANDER),
    CHARMELEON(Generation1.CHARMELEON),
    CHARIZARD(Generation1.CHARIZARD),
    SQUIRTLE(Generation1.SQUIRTLE),
    WARTORTLE(Generation1.WARTORTLE),
    BLASTOISE(Generation1.BLASTOISE),
    CATERPIE(Generation1.CATERPIE),
    METAPOD(Generation1.METAPOD),
    BUTTERFREE(Generation1.BUTTERFREE),
    WEEDLE(Generation1.WEEDLE),
    KAKUNA(Generation1.KAKUNA),
    BEEDRILL(Generation1.BEEDRILL),
    PIDGEY(Generation1.PIDGEY),
    PIDGEOTTO(Generation1.PIDGEOTTO),
    PIDGEOT(Generation1.PIDGEOT),
    RATTATA(Generation1.RATTATA),
    RATICATE(Generation1.RATICATE),
    SPEAROW(Generation1.SPEAROW),
    FEAROW(Generation1.FEAROW),
    EKANS(Generation1.EKANS),
    ARBOK(Generation1.ARBOK),
    PIKACHU(Generation1.PIKACHU),
    RAICHU(Generation1.RAICHU),
    SANDSHREW(Generation1.SANDSHREW),
    SANDSLASH(Generation1.SANDSLASH),
    NIDORAN_FEMALE(Generation1.NIDORAN_FEMALE),
    NIDORINA(Generation1.NIDORINA),
    NIDOQUEEN(Generation1.NIDOQUEEN),
    NIDORAN_MALE(Generation1.NIDORAN_MALE),
    NIDORINO(Generation1.NIDORINO),
    NIDOKING(Generation1.NIDOKING),
    CLEFAIRY(Generation1.CLEFAIRY),
    CLEFABLE(Generation1.CLEFABLE),
    VULPIX(Generation1.VULPIX),
    NINETALES(Generation1.NINETALES),
    JIGGLYPUFF(Generation1.JIGGLYPUFF),
    WIGGLYTUFF(Generation1.WIGGLYTUFF),
    ZUBAT(Generation1.ZUBAT),
    GOLBAT(Generation1.GOLBAT),
    ODDISH(Generation1.ODDISH),
    GLOOM(Generation1.GLOOM),
    VILEPLUME(Generation1.VILEPLUME),
    PARAS(Generation1.PARAS),
    PARASECT(Generation1.PARASECT),
    VENONAT(Generation1.VENONAT),
    VENOMOTH(Generation1.VENOMOTH),
    DIGLETT(Generation1.DIGLETT),
    DUGTRIO(Generation1.DUGTRIO),
    MEOWTH(Generation1.MEOWTH),
    PERSIAN(Generation1.PERSIAN),
    PSYDUCK(Generation1.PSYDUCK),
    GOLDUCK(Generation1.GOLDUCK),
    MANKEY(Generation1.MANKEY),
    PRIMEAPE(Generation1.PRIMEAPE),
    GROWLITHE(Generation1.GROWLITHE),
    ARCANINE(Generation1.ARCANINE),
    POLIWAG(Generation1.POLIWAG),
    POLIWHIRL(Generation1.POLIWHIRL),
    POLIWRATH(Generation1.POLIWRATH),
    ABRA(Generation1.ABRA),
    KADABRA(Generation1.KADABRA),
    ALAKAZAM(Generation1.ALAKAZAM),
    MACHOP(Generation1.MACHOP),
    MACHOKE(Generation1.MACHOKE),
    MACHAMP(Generation1.MACHAMP),
    BELLSPROUT(Generation1.BELLSPROUT),
    WEEPINBELL(Generation1.WEEPINBELL),
    VICTREEBEL(Generation1.VICTREEBEL),
    TENTACOOL(Generation1.TENTACOOL),
    TENTACRUEL(Generation1.TENTACRUEL),
    GEODUDE(Generation1.GEODUDE),
    GRAVELER(Generation1.GRAVELER),
    GOLEM(Generation1.GOLEM),
    PONYTA(Generation1.PONYTA),
    RAPIDASH(Generation1.RAPIDASH),
    SLOWPOKE(Generation1.SLOWPOKE),
    SLOWBRO(Generation1.SLOWBRO),
    MAGNEMITE(Generation1.MAGNEMITE),
    MAGNETON(Generation1.MAGNETON),
    FARFETCH_D(Generation1.FARFETCH_D),
    DODUO(Generation1.DODUO),
    DODRIO(Generation1.DODRIO),
    SEEL(Generation1.SEEL),
    DEWGONG(Generation1.DEWGONG),
    GRIMER(Generation1.GRIMER),
    MUK(Generation1.MUK),
    SHELLDER(Generation1.SHELLDER),
    CLOYSTER(Generation1.CLOYSTER),
    GASTLY(Generation1.GASTLY),
    HAUNTER(Generation1.HAUNTER),
    GENGAR(Generation1.GENGAR),
    ONIX(Generation1.ONIX),
    DROWZEE(Generation1.DROWZEE),
    HYPNO(Generation1.HYPNO),
    KRABBY(Generation1.KRABBY),
    KINGLER(Generation1.KINGLER),
    VOLTORB(Generation1.VOLTORB),
    ELECTRODE(Generation1.ELECTRODE),
    EXEGGCUTE(Generation1.EXEGGCUTE),
    EXEGGUTOR(Generation1.EXEGGUTOR),
    CUBONE(Generation1.CUBONE),
    MAROWAK(Generation1.MAROWAK),
    HITMONLEE(Generation1.HITMONLEE),
    HITMONCHAN(Generation1.HITMONCHAN),
    LICKITUNG(Generation1.LICKITUNG),
    KOFFING(Generation1.KOFFING),
    WEEZING(Generation1.WEEZING),
    RHYHORN(Generation1.RHYHORN),
    RHYDON(Generation1.RHYDON),
    CHANSEY(Generation1.CHANSEY),
    TANGELA(Generation1.TANGELA),
    KANGASKHAN(Generation1.KANGASKHAN),
    HORSEA(Generation1.HORSEA),
    SEADRA(Generation1.SEADRA),
    GOLDEEN(Generation1.GOLDEEN),
    SEAKING(Generation1.SEAKING),
    STARYU(Generation1.STARYU),
    STARMIE(Generation1.STARMIE),
    MR_MIME(Generation1.MR_MIME),
    SCYTHER(Generation1.SCYTHER),
    JYNX(Generation1.JYNX),
    ELECTABUZZ(Generation1.ELECTABUZZ),
    MAGMAR(Generation1.MAGMAR),
    PINSIR(Generation1.PINSIR),
    TAUROS(Generation1.TAUROS),
    MAGIKARP(Generation1.MAGIKARP),
    GYARADOS(Generation1.GYARADOS),
    LAPRAS(Generation1.LAPRAS),
    DITTO(Generation1.DITTO),
    EEVEE(Generation1.EEVEE),
    VAPOREON(Generation1.VAPOREON),
    JOLTEON(Generation1.JOLTEON),
    FLAREON(Generation1.FLAREON),
    PORYGON(Generation1.PORYGON),
    OMANYTE(Generation1.OMANYTE),
    OMASTAR(Generation1.OMASTAR),
    KABUTO(Generation1.KABUTO),
    KABUTOPS(Generation1.KABUTOPS),
    AERODACTYL(Generation1.AERODACTYL),
    SNORLAX(Generation1.SNORLAX),
    ARTICUNO(Generation1.ARTICUNO),
    ZAPDOS(Generation1.ZAPDOS),
    MOLTRES(Generation1.MOLTRES),
    DRATINI(Generation1.DRATINI),
    DRAGONAIR(Generation1.DRAGONAIR),
    DRAGONITE(Generation1.DRAGONITE),
    MEWTWO(Generation1.MEWTWO),
    MEW(Generation1.MEW),
    CHIKORITA(Generation2.CHIKORITA),
    BAYLEEF(Generation2.BAYLEEF),
    MEGANIUM(Generation2.MEGANIUM),
    CYNDAQUIL(Generation2.CYNDAQUIL),
    QUILAVA(Generation2.QUILAVA),
    TYPHLOSION(Generation2.TYPHLOSION),
    TOTODILE(Generation2.TOTODILE),
    CROCONAW(Generation2.CROCONAW),
    FERALIGATR(Generation2.FERALIGATR),
    SENTRET(Generation2.SENTRET),
    FURRET(Generation2.FURRET),
    HOOTHOOT(Generation2.HOOTHOOT),
    NOCTOWL(Generation2.NOCTOWL),
    LEDYBA(Generation2.LEDYBA),
    LEDIAN(Generation2.LEDIAN),
    SPINARAK(Generation2.SPINARAK),
    ARIADOS(Generation2.ARIADOS),
    CROBAT(Generation2.CROBAT),
    CHINCHOU(Generation2.CHINCHOU),
    LANTURN(Generation2.LANTURN),
    PICHU(Generation2.PICHU),
    CLEFFA(Generation2.CLEFFA),
    IGGLYBUFF(Generation2.IGGLYBUFF),
    TOGEPI(Generation2.TOGEPI),
    TOGETIC(Generation2.TOGETIC),
    NATU(Generation2.NATU),
    XATU(Generation2.XATU),
    MAREEP(Generation2.MAREEP),
    FLAAFFY(Generation2.FLAAFFY),
    AMPHAROS(Generation2.AMPHAROS),
    BELLOSSOM(Generation2.BELLOSSOM),
    MARILL(Generation2.MARILL),
    AZUMARILL(Generation2.AZUMARILL),
    SUDOWOODO(Generation2.SUDOWOODO),
    POLITOED(Generation2.POLITOED),
    HOPPIP(Generation2.HOPPIP),
    SKIPLOOM(Generation2.SKIPLOOM),
    JUMPLUFF(Generation2.JUMPLUFF),
    AIPOM(Generation2.AIPOM),
    SUNKERN(Generation2.SUNKERN),
    SUNFLORA(Generation2.SUNFLORA),
    YANMA(Generation2.YANMA),
    WOOPER(Generation2.WOOPER),
    QUAGSIRE(Generation2.QUAGSIRE),
    ESPEON(Generation2.ESPEON),
    UMBREON(Generation2.UMBREON),
    MURKROW(Generation2.MURKROW),
    SLOWKING(Generation2.SLOWKING),
    MISDREAVUS(Generation2.MISDREAVUS),
    UNOWN(Generation2.UNOWN),
    WOBBUFFET(Generation2.WOBBUFFET),
    GIRAFARIG(Generation2.GIRAFARIG),
    PINECO(Generation2.PINECO),
    FORRETRESS(Generation2.FORRETRESS),
    DUNSPARCE(Generation2.DUNSPARCE),
    GLIGAR(Generation2.GLIGAR),
    STEELIX(Generation2.STEELIX),
    SNUBBULL(Generation2.SNUBBULL),
    GRANBULL(Generation2.GRANBULL),
    QWILFISH(Generation2.QWILFISH),
    SCIZOR(Generation2.SCIZOR),
    SHUCKLE(Generation2.SHUCKLE),
    HERACROSS(Generation2.HERACROSS),
    SNEASEL(Generation2.SNEASEL),
    TEDDIURSA(Generation2.TEDDIURSA),
    URSARING(Generation2.URSARING),
    SLUGMA(Generation2.SLUGMA),
    MAGCARGO(Generation2.MAGCARGO),
    SWINUB(Generation2.SWINUB),
    PILOSWINE(Generation2.PILOSWINE),
    CORSOLA(Generation2.CORSOLA),
    REMORAID(Generation2.REMORAID),
    OCTILLERY(Generation2.OCTILLERY),
    DELIBIRD(Generation2.DELIBIRD),
    MANTINE(Generation2.MANTINE),
    SKARMORY(Generation2.SKARMORY),
    HOUNDOUR(Generation2.HOUNDOUR),
    HOUNDOOM(Generation2.HOUNDOOM),
    KINGDRA(Generation2.KINGDRA),
    PHANPY(Generation2.PHANPY),
    DONPHAN(Generation2.DONPHAN),
    PORYGON2(Generation2.PORYGON2),
    STANTLER(Generation2.STANTLER),
    SMEARGLE(Generation2.SMEARGLE),
    TYROGUE(Generation2.TYROGUE),
    HITMONTOP(Generation2.HITMONTOP),
    SMOOCHUM(Generation2.SMOOCHUM),
    ELEKID(Generation2.ELEKID),
    MAGBY(Generation2.MAGBY),
    MILTANK(Generation2.MILTANK),
    BLISSEY(Generation2.BLISSEY),
    RAIKOU(Generation2.RAIKOU),
    ENTEI(Generation2.ENTEI),
    SUICUNE(Generation2.SUICUNE),
    LARVITAR(Generation2.LARVITAR),
    PUPITAR(Generation2.PUPITAR),
    TYRANITAR(Generation2.TYRANITAR),
    LUGIA(Generation2.LUGIA),
    HO_OH(Generation2.HO_OH),
    CELEBI(Generation2.CELEBI),
    TREECKO(Generation3.TREECKO),
    GROVYLE(Generation3.GROVYLE),
    SCEPTILE(Generation3.SCEPTILE),
    TORCHIC(Generation3.TORCHIC),
    COMBUSKEN(Generation3.COMBUSKEN),
    BLAZIKEN(Generation3.BLAZIKEN),
    MUDKIP(Generation3.MUDKIP),
    MARSHTOMP(Generation3.MARSHTOMP),
    SWAMPERT(Generation3.SWAMPERT),
    POOCHYENA(Generation3.POOCHYENA),
    MIGHTYENA(Generation3.MIGHTYENA),
    ZIGZAGOON(Generation3.ZIGZAGOON),
    LINOONE(Generation3.LINOONE),
    WURMPLE(Generation3.WURMPLE),
    SILCOON(Generation3.SILCOON),
    BEAUTIFLY(Generation3.BEAUTIFLY),
    CASCOON(Generation3.CASCOON),
    DUSTOX(Generation3.DUSTOX),
    LOTAD(Generation3.LOTAD),
    LOMBRE(Generation3.LOMBRE),
    LUDICOLO(Generation3.LUDICOLO),
    SEEDOT(Generation3.SEEDOT),
    NUZLEAF(Generation3.NUZLEAF),
    SHIFTRY(Generation3.SHIFTRY),
    TAILLOW(Generation3.TAILLOW),
    SWELLOW(Generation3.SWELLOW),
    WINGULL(Generation3.WINGULL),
    PELIPPER(Generation3.PELIPPER),
    RALTS(Generation3.RALTS),
    KIRLIA(Generation3.KIRLIA),
    GARDEVOIR(Generation3.GARDEVOIR),
    SURSKIT(Generation3.SURSKIT),
    MASQUERAIN(Generation3.MASQUERAIN),
    SHROOMISH(Generation3.SHROOMISH),
    BRELOOM(Generation3.BRELOOM),
    SLAKOTH(Generation3.SLAKOTH),
    VIGOROTH(Generation3.VIGOROTH),
    SLAKING(Generation3.SLAKING),
    NINCADA(Generation3.NINCADA),
    NINJASK(Generation3.NINJASK),
    SHEDINJA(Generation3.SHEDINJA),
    WHISMUR(Generation3.WHISMUR),
    LOUDRED(Generation3.LOUDRED),
    EXPLOUD(Generation3.EXPLOUD),
    MAKUHITA(Generation3.MAKUHITA),
    HARIYAMA(Generation3.HARIYAMA),
    AZURILL(Generation3.AZURILL),
    NOSEPASS(Generation3.NOSEPASS),
    SKITTY(Generation3.SKITTY),
    DELCATTY(Generation3.DELCATTY),
    SABLEYE(Generation3.SABLEYE),
    MAWILE(Generation3.MAWILE),
    ARON(Generation3.ARON),
    LAIRON(Generation3.LAIRON),
    AGGRON(Generation3.AGGRON),
    MEDITITE(Generation3.MEDITITE),
    MEDICHAM(Generation3.MEDICHAM),
    ELECTRIKE(Generation3.ELECTRIKE),
    MANECTRIC(Generation3.MANECTRIC),
    PLUSLE(Generation3.PLUSLE),
    MINUN(Generation3.MINUN),
    VOLBEAT(Generation3.VOLBEAT),
    ILLUMISE(Generation3.ILLUMISE),
    ROSELIA(Generation3.ROSELIA),
    GULPIN(Generation3.GULPIN),
    SWALOT(Generation3.SWALOT),
    CARVANHA(Generation3.CARVANHA),
    SHARPEDO(Generation3.SHARPEDO),
    WAILMER(Generation3.WAILMER),
    WAILORD(Generation3.WAILORD),
    NUMEL(Generation3.NUMEL),
    CAMERUPT(Generation3.CAMERUPT),
    TORKOAL(Generation3.TORKOAL),
    SPOINK(Generation3.SPOINK),
    GRUMPIG(Generation3.GRUMPIG),
    SPINDA(Generation3.SPINDA),
    TRAPINCH(Generation3.TRAPINCH),
    VIBRAVA(Generation3.VIBRAVA),
    FLYGON(Generation3.FLYGON),
    CACNEA(Generation3.CACNEA),
    CACTURNE(Generation3.CACTURNE),
    SWABLU(Generation3.SWABLU),
    ALTARIA(Generation3.ALTARIA),
    ZANGOOSE(Generation3.ZANGOOSE),
    SEVIPER(Generation3.SEVIPER),
    LUNATONE(Generation3.LUNATONE),
    SOLROCK(Generation3.SOLROCK),
    BARBOACH(Generation3.BARBOACH),
    WHISCASH(Generation3.WHISCASH),
    CORPHISH(Generation3.CORPHISH),
    CRAWDAUNT(Generation3.CRAWDAUNT),
    BALTOY(Generation3.BALTOY),
    CLAYDOL(Generation3.CLAYDOL),
    LILEEP(Generation3.LILEEP),
    CRADILY(Generation3.CRADILY),
    ANORITH(Generation3.ANORITH),
    ARMALDO(Generation3.ARMALDO),
    FEEBAS(Generation3.FEEBAS),
    MILOTIC(Generation3.MILOTIC),
    CASTFORM(Generation3.CASTFORM),
    CASTFORM_SUNNY(Generation3.CASTFORM_SUNNY),
    CASTFORM_RAINY(Generation3.CASTFORM_RAINY),
    CASTFORM_SNOWY(Generation3.CASTFORM_SNOWY),
    KECLEON(Generation3.KECLEON),
    SHUPPET(Generation3.SHUPPET),
    BANETTE(Generation3.BANETTE),
    DUSKULL(Generation3.DUSKULL),
    DUSCLOPS(Generation3.DUSCLOPS),
    TROPIUS(Generation3.TROPIUS),
    CHIMECHO(Generation3.CHIMECHO),
    ABSOL(Generation3.ABSOL),
    WYNAUT(Generation3.WYNAUT),
    SNORUNT(Generation3.SNORUNT),
    GLALIE(Generation3.GLALIE),
    SPHEAL(Generation3.SPHEAL),
    SEALEO(Generation3.SEALEO),
    WALREIN(Generation3.WALREIN),
    CLAMPERL(Generation3.CLAMPERL),
    HUNTAIL(Generation3.HUNTAIL),
    GOREBYSS(Generation3.GOREBYSS),
    RELICANTH(Generation3.RELICANTH),
    LUVDISC(Generation3.LUVDISC),
    BAGON(Generation3.BAGON),
    SHELGON(Generation3.SHELGON),
    SALAMENCE(Generation3.SALAMENCE),
    BELDUM(Generation3.BELDUM),
    METANG(Generation3.METANG),
    METAGROSS(Generation3.METAGROSS),
    REGIROCK(Generation3.REGIROCK),
    REGICE(Generation3.REGICE),
    REGISTEEL(Generation3.REGISTEEL),
    LATIAS(Generation3.LATIAS),
    LATIOS(Generation3.LATIOS),
    KYOGRE(Generation3.KYOGRE),
    GROUDON(Generation3.GROUDON),
    RAYQUAZA(Generation3.RAYQUAZA),
    JIRACHI(Generation3.JIRACHI),
    DEOXYS_NORMAL(Generation3.DEOXYS_NORMAL),
    DEOXYS_SPEED(Generation3.DEOXYS_SPEED),
    DEOXYS_ATTACK(Generation3.DEOXYS_ATTACK),
    DEOXYS_DEFENSE(Generation3.DEOXYS_DEFENSE),
    TURTWIG(Generation4.TURTWIG),
    GROTLE(Generation4.GROTLE),
    TORTERRA(Generation4.TORTERRA),
    CHIMCHAR(Generation4.CHIMCHAR),
    MONFERNO(Generation4.MONFERNO),
    INFERNAPE(Generation4.INFERNAPE),
    PIPLUP(Generation4.PIPLUP),
    PRINPLUP(Generation4.PRINPLUP),
    EMPOLEON(Generation4.EMPOLEON),
    STARLY(Generation4.STARLY),
    STARAVIA(Generation4.STARAVIA),
    STARAPTOR(Generation4.STARAPTOR),
    BIDOOF(Generation4.BIDOOF),
    BIBAREL(Generation4.BIBAREL),
    KRICKETOT(Generation4.KRICKETOT),
    KRICKETUNE(Generation4.KRICKETUNE),
    SHINX(Generation4.SHINX),
    LUXIO(Generation4.LUXIO),
    LUXRAY(Generation4.LUXRAY),
    BUDEW(Generation4.BUDEW),
    ROSERADE(Generation4.ROSERADE),
    CRANIDOS(Generation4.CRANIDOS),
    RAMPARDOS(Generation4.RAMPARDOS),
    SHIELDON(Generation4.SHIELDON),
    BASTIODON(Generation4.BASTIODON),
    BURMY(Generation4.BURMY),
    WORMADAM(Generation4.WORMADAM),
    MOTHIM(Generation4.MOTHIM),
    COMBEE(Generation4.COMBEE),
    VESPIQUEN(Generation4.VESPIQUEN),
    PACHIRISU(Generation4.PACHIRISU),
    BUIZEL(Generation4.BUIZEL),
    FLOATZEL(Generation4.FLOATZEL),
    CHERUBI(Generation4.CHERUBI),
    CHERRIM(Generation4.CHERRIM),
    SHELLOS(Generation4.SHELLOS),
    GASTRODON(Generation4.GASTRODON),
    AMBIPOM(Generation4.AMBIPOM),
    DRIFLOON(Generation4.DRIFLOON),
    DRIFBLIM(Generation4.DRIFBLIM),
    BUNEARY(Generation4.BUNEARY),
    LOPUNNY(Generation4.LOPUNNY),
    MISMAGIUS(Generation4.MISMAGIUS),
    HONCHKROW(Generation4.HONCHKROW),
    GLAMEOW(Generation4.GLAMEOW),
    PURUGLY(Generation4.PURUGLY),
    CHINGLING(Generation4.CHINGLING),
    STUNKY(Generation4.STUNKY),
    SKUNTANK(Generation4.SKUNTANK),
    BRONZOR(Generation4.BRONZOR),
    BRONZONG(Generation4.BRONZONG),
    BONSLY(Generation4.BONSLY),
    MIME_JR(Generation4.MIME_JR),
    HAPPINY(Generation4.HAPPINY),
    CHATOT(Generation4.CHATOT),
    SPIRITOMB(Generation4.SPIRITOMB),
    GIBLE(Generation4.GIBLE),
    GABITE(Generation4.GABITE),
    GARCHOMP(Generation4.GARCHOMP),
    MUNCHLAX(Generation4.MUNCHLAX),
    RIOLU(Generation4.RIOLU),
    LUCARIO(Generation4.LUCARIO),
    HIPPOPOTAS(Generation4.HIPPOPOTAS),
    HIPPOWDON(Generation4.HIPPOWDON),
    SKORUPI(Generation4.SKORUPI),
    DRAPION(Generation4.DRAPION),
    CROAGUNK(Generation4.CROAGUNK),
    TOXICROAK(Generation4.TOXICROAK),
    CARNIVINE(Generation4.CARNIVINE),
    FINNEON(Generation4.FINNEON),
    LUMINEON(Generation4.LUMINEON),
    MANTYKE(Generation4.MANTYKE),
    SNOVER(Generation4.SNOVER),
    ABOMASNOW(Generation4.ABOMASNOW),
    WEAVILE(Generation4.WEAVILE),
    MAGNEZONE(Generation4.MAGNEZONE),
    LICKILICKY(Generation4.LICKILICKY),
    RHYPERIOR(Generation4.RHYPERIOR),
    TANGROWTH(Generation4.TANGROWTH),
    ELECTIVIRE(Generation4.ELECTIVIRE),
    MAGMORTAR(Generation4.MAGMORTAR),
    TOGEKISS(Generation4.TOGEKISS),
    YANMEGA(Generation4.YANMEGA),
    LEAFEON(Generation4.LEAFEON),
    GLACEON(Generation4.GLACEON),
    GLISCOR(Generation4.GLISCOR),
    MAMOSWINE(Generation4.MAMOSWINE),
    PORYGON_Z(Generation4.PORYGON_Z),
    GALLADE(Generation4.GALLADE),
    PROBOPASS(Generation4.PROBOPASS),
    DUSKNOIR(Generation4.DUSKNOIR),
    FROSLASS(Generation4.FROSLASS),
    ROTOM(Generation4.ROTOM),
    ROTOM_FAN(Generation4.ROTOM_FAN),
    ROTOM_FROST(Generation4.ROTOM_FROST),
    ROTOM_HEAT(Generation4.ROTOM_HEAT),
    ROTOM_MOW(Generation4.ROTOM_MOW),
    ROTOM_WASH(Generation4.ROTOM_WASH),
    UXIE(Generation4.UXIE),
    MESPRIT(Generation4.MESPRIT),
    AZELF(Generation4.AZELF),
    DIALGA(Generation4.DIALGA),
    PALKIA(Generation4.PALKIA),
    HEATRAN(Generation4.HEATRAN),
    REGIGIGAS(Generation4.REGIGIGAS),
    GIRATINA_ALTERED(Generation4.GIRATINA_ALTERED),
    GIRATINA_ORIGIN(Generation4.GIRATINA_ORIGIN),
    CRESSELIA(Generation4.CRESSELIA),
    PHIONE(Generation4.PHIONE),
    MANAPHY(Generation4.MANAPHY),
    DARKRAI(Generation4.DARKRAI),
    SHAYMIN_LAND(Generation4.SHAYMIN_LAND),
    SHAYMIN_SKY(Generation4.SHAYMIN_SKY),
    ARCEUS(Generation4.ARCEUS),
    VICTINI(Generation5.VICTINI),
    SNIVY(Generation5.SNIVY),
    SERVINE(Generation5.SERVINE),
    SERPERIOR(Generation5.SERPERIOR),
    TEPIG(Generation5.TEPIG),
    PIGNITE(Generation5.PIGNITE),
    EMBOAR(Generation5.EMBOAR),
    OSHAWOTT(Generation5.OSHAWOTT),
    DEWOTT(Generation5.DEWOTT),
    SAMUROTT(Generation5.SAMUROTT),
    PATRAT(Generation5.PATRAT),
    WATCHOG(Generation5.WATCHOG),
    LILLIPUP(Generation5.LILLIPUP),
    HERDIER(Generation5.HERDIER),
    STOUTLAND(Generation5.STOUTLAND),
    PURRLOIN(Generation5.PURRLOIN),
    LIEPARD(Generation5.LIEPARD),
    PANSAGE(Generation5.PANSAGE),
    SIMISAGE(Generation5.SIMISAGE),
    PANSEAR(Generation5.PANSEAR),
    SIMISEAR(Generation5.SIMISEAR),
    PANPOUR(Generation5.PANPOUR),
    SIMIPOUR(Generation5.SIMIPOUR),
    MUNNA(Generation5.MUNNA),
    MUSHARNA(Generation5.MUSHARNA),
    PIDOVE(Generation5.PIDOVE),
    TRANQUILL(Generation5.TRANQUILL),
    UNFEZANT(Generation5.UNFEZANT),
    BLITZLE(Generation5.BLITZLE),
    ZEBSTRIKA(Generation5.ZEBSTRIKA),
    ROGGENROLA(Generation5.ROGGENROLA),
    BOLDORE(Generation5.BOLDORE),
    GIGALITH(Generation5.GIGALITH),
    WOOBAT(Generation5.WOOBAT),
    SWOOBAT(Generation5.SWOOBAT),
    DRILBUR(Generation5.DRILBUR),
    EXCADRILL(Generation5.EXCADRILL),
    AUDINO(Generation5.AUDINO),
    TIMBURR(Generation5.TIMBURR),
    GURDURR(Generation5.GURDURR),
    CONKELDURR(Generation5.CONKELDURR),
    TYMPOLE(Generation5.TYMPOLE),
    PALPITOAD(Generation5.PALPITOAD),
    SEISMITOAD(Generation5.SEISMITOAD),
    THROH(Generation5.THROH),
    SAWK(Generation5.SAWK),
    SEWADDLE(Generation5.SEWADDLE),
    SWADLOON(Generation5.SWADLOON),
    LEAVANNY(Generation5.LEAVANNY),
    VENIPEDE(Generation5.VENIPEDE),
    WHIRLIPEDE(Generation5.WHIRLIPEDE),
    SCOLIPEDE(Generation5.SCOLIPEDE),
    COTTONEE(Generation5.COTTONEE),
    WHIMSICOTT(Generation5.WHIMSICOTT),
    PETILIL(Generation5.PETILIL),
    LILLIGANT(Generation5.LILLIGANT),
    BASCULIN(Generation5.BASCULIN),
    SANDILE(Generation5.SANDILE),
    KROKOROK(Generation5.KROKOROK),
    KROOKODILE(Generation5.KROOKODILE),
    DARUMAKA(Generation5.DARUMAKA),
    DARMANITAN_STANDARD(Generation5.DARMANITAN_STANDARD),
    DARMANITAN_ZEN(Generation5.DARMANITAN_ZEN),
    MARACTUS(Generation5.MARACTUS),
    DWEBBLE(Generation5.DWEBBLE),
    CRUSTLE(Generation5.CRUSTLE),
    SCRAGGY(Generation5.SCRAGGY),
    SCRAFTY(Generation5.SCRAFTY),
    SIGILYPH(Generation5.SIGILYPH),
    YAMASK(Generation5.YAMASK),
    COFAGRIGUS(Generation5.COFAGRIGUS),
    TIRTOUGA(Generation5.TIRTOUGA),
    CARRACOSTA(Generation5.CARRACOSTA),
    ARCHEN(Generation5.ARCHEN),
    ARCHEOPS(Generation5.ARCHEOPS),
    TRUBBISH(Generation5.TRUBBISH),
    GARBODOR(Generation5.GARBODOR),
    ZORUA(Generation5.ZORUA),
    ZOROARK(Generation5.ZOROARK),
    MINCCINO(Generation5.MINCCINO),
    CINCCINO(Generation5.CINCCINO),
    GOTHITA(Generation5.GOTHITA),
    GOTHORITA(Generation5.GOTHORITA),
    GOTHITELLE(Generation5.GOTHITELLE),
    SOLOSIS(Generation5.SOLOSIS),
    DUOSION(Generation5.DUOSION),
    REUNICLUS(Generation5.REUNICLUS),
    DUCKLETT(Generation5.DUCKLETT),
    SWANNA(Generation5.SWANNA),
    VANILLITE(Generation5.VANILLITE),
    VANILLISH(Generation5.VANILLISH),
    VANILLUXE(Generation5.VANILLUXE),
    DEERLING(Generation5.DEERLING),
    SAWSBUCK(Generation5.SAWSBUCK),
    EMOLGA(Generation5.EMOLGA),
    KARRABLAST(Generation5.KARRABLAST),
    ESCAVALIER(Generation5.ESCAVALIER),
    FOONGUS(Generation5.FOONGUS),
    AMOONGUSS(Generation5.AMOONGUSS),
    FRILLISH(Generation5.FRILLISH),
    JELLICENT(Generation5.JELLICENT),
    ALOMOMOLA(Generation5.ALOMOMOLA),
    JOLTIK(Generation5.JOLTIK),
    GALVANTULA(Generation5.GALVANTULA),
    FERROSEED(Generation5.FERROSEED),
    FERROTHORN(Generation5.FERROTHORN),
    KLINK(Generation5.KLINK),
    KLANG(Generation5.KLANG),
    KLINKLANG(Generation5.KLINKLANG),
    TYNAMO(Generation5.TYNAMO),
    EELEKTRIK(Generation5.EELEKTRIK),
    EELEKTROSS(Generation5.EELEKTROSS),
    ELGYEM(Generation5.ELGYEM),
    BEHEEYEM(Generation5.BEHEEYEM),
    LITWICK(Generation5.LITWICK),
    LAMPENT(Generation5.LAMPENT),
    CHANDELURE(Generation5.CHANDELURE),
    AXEW(Generation5.AXEW),
    FRAXURE(Generation5.FRAXURE),
    HAXORUS(Generation5.HAXORUS),
    CUBCHOO(Generation5.CUBCHOO),
    BEARTIC(Generation5.BEARTIC),
    CRYOGONAL(Generation5.CRYOGONAL),
    SHELMET(Generation5.SHELMET),
    ACCELGOR(Generation5.ACCELGOR),
    STUNFISK(Generation5.STUNFISK),
    MIENFOO(Generation5.MIENFOO),
    MIENSHAO(Generation5.MIENSHAO),
    DRUDDIGON(Generation5.DRUDDIGON),
    GOLETT(Generation5.GOLETT),
    GOLURK(Generation5.GOLURK),
    PAWNIARD(Generation5.PAWNIARD),
    BISHARP(Generation5.BISHARP),
    BOUFFALANT(Generation5.BOUFFALANT),
    RUFFLET(Generation5.RUFFLET),
    BRAVIARY(Generation5.BRAVIARY),
    VULLABY(Generation5.VULLABY),
    MANDIBUZZ(Generation5.MANDIBUZZ),
    HEATMOR(Generation5.HEATMOR),
    DURANT(Generation5.DURANT),
    DEINO(Generation5.DEINO),
    ZWEILOUS(Generation5.ZWEILOUS),
    HYDREIGON(Generation5.HYDREIGON),
    LARVESTA(Generation5.LARVESTA),
    VOLCARONA(Generation5.VOLCARONA),
    COBALION(Generation5.COBALION),
    TERRAKION(Generation5.TERRAKION),
    VIRIZION(Generation5.VIRIZION),
    TORNADUS_INCARNATE(Generation5.TORNADUS_INCARNATE),
    TORNADUS_THERIAN(Generation5.TORNADUS_THERIAN),
    THUNDURUS_INCARNATE(Generation5.THUNDURUS_INCARNATE),
    THUNDURUS_THERIAN(Generation5.THUNDURUS_THERIAN),
    RESHIRAM(Generation5.RESHIRAM),
    ZEKROM(Generation5.ZEKROM),
    LANDORUS_INCARNATE(Generation5.LANDORUS_INCARNATE),
    LANDORUS_THERIAN(Generation5.LANDORUS_THERIAN),
    KYUREM(Generation5.KYUREM),
    KYUREM_BLACK(Generation5.KYUREM_BLACK),
    KYUREM_WHITE(Generation5.KYUREM_WHITE),
    KELDEO(Generation5.KELDEO),
    KELDEO_RESOLUTE(Generation5.KELDEO_RESOLUTE),
    MELOETTA_ARIA(Generation5.MELOETTA_ARIA),
    MELOETTA_PIROUETTE(Generation5.MELOETTA_PIROUETTE),
    GENESECT(Generation5.GENESECT);

    private enum Generation1
    {
        BULBASAUR("Bulbasaur", "001", (short)45, new short[] {45, 49, 49, 65, 65, 45}, (byte)64, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 3, 7, 9, 13, 13, 15, 19, 21, 25, 27, 31, 33, 37}, new Move[] {Move.TACKLE, Move.GROWL, Move.LEECH_SEED, Move.VINE_WHIP, Move.POISONPOWDER, Move.SLEEP_POWDER, Move.TAKE_DOWN, Move.RAZOR_LEAF, Move.SWEET_SCENT, Move.GROWTH, Move.DOUBLE_EDGE, Move.WORRY_SEED, Move.SYNTHESIS, Move.SEED_BOMB}), Type.GRASS, Type.POISON),
        IVYSAUR("Ivysaur", "002", (short)45, new short[] {60, 62, 63, 80, 80, 60}, (byte)142, new byte[] {0, 0, 0, 1, 1, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 3, 7, 9, 13, 13, 15, 20, 23, 28, 31, 36, 39, 44}, new Move[] {Move.TACKLE, Move.GROWL, Move.LEECH_SEED, Move.GROWL, Move.LEECH_SEED, Move.VINE_WHIP, Move.POISONPOWDER, Move.SLEEP_POWDER, Move.TAKE_DOWN, Move.RAZOR_LEAF, Move.SWEET_SCENT, Move.GROWTH, Move.DOUBLE_EDGE, Move.WORRY_SEED, Move.SYNTHESIS, Move.SOLARBEAM}), Type.GRASS, Type.POISON),
        VENUSAUR("Venusaur", "003", (short)45, new short[] {80, 82, 83, 100, 100, 80}, (byte)236, new byte[] {0, 0, 0, 2, 1, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 3, 7, 9, 13, 13, 15, 20, 23, 28, 31, 32, 39, 45, 53}, new Move[] {Move.TACKLE, Move.GROWL, Move.LEECH_SEED, Move.VINE_WHIP, Move.GROWL, Move.LEECH_SEED, Move.VINE_WHIP, Move.POISONPOWDER, Move.SLEEP_POWDER, Move.TAKE_DOWN, Move.RAZOR_LEAF, Move.SWEET_SCENT, Move.GROWTH, Move.DOUBLE_EDGE, Move.PETAL_DANCE, Move.WORRY_SEED, Move.SYNTHESIS, Move.SOLARBEAM}), Type.GRASS, Type.POISON),
        CHARMANDER("Charmander", "004", (short)45, new short[] {39, 52, 43, 60, 50, 65}, (byte)62, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 7, 10, 16, 19, 25, 28, 34, 37, 43, 46}, new Move[] {Move.SCRATCH, Move.GROWL, Move.EMBER, Move.SMOKESCREEN, Move.DRAGON_RAGE, Move.SCARY_FACE, Move.FIRE_FANG, Move.FLAME_BURST, Move.SLASH, Move.FLAMETHROWER, Move.FIRE_SPIN, Move.INFERNO}), Type.FIRE),
        CHARMELEON("Charmeleon", "005", (short)45, new short[] {58, 64, 58, 80, 65, 80}, (byte)142, new byte[] {0, 0, 0, 1, 0, 1}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 7, 10, 17, 21, 28, 32, 39, 43, 50, 54}, new Move[] {Move.SCRATCH, Move.GROWL, Move.EMBER, Move.EMBER, Move.SMOKESCREEN, Move.DRAGON_RAGE, Move.SCARY_FACE, Move.FIRE_FANG, Move.FLAME_BURST, Move.SLASH, Move.FLAMETHROWER, Move.FIRE_SPIN, Move.INFERNO}), Type.FIRE),
        CHARIZARD("Charizard", "006", (short)45, new short[] {78, 84, 78, 109, 85, 100}, (byte)240, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 7, 10, 17, 21, 28, 32, 36, 41, 47, 56, 62, 71, 77}, new Move[] {Move.DRAGON_CLAW, Move.SHADOW_CLAW, Move.AIR_SLASH, Move.SCRATCH, Move.GROWL, Move.EMBER, Move.SMOKESCREEN, Move.EMBER, Move.SMOKESCREEN, Move.DRAGON_RAGE, Move.SCARY_FACE, Move.FIRE_FANG, Move.FLAME_BURST, Move.WING_ATTACK, Move.SLASH, Move.FLAMETHROWER, Move.FIRE_SPIN, Move.INFERNO, Move.HEAT_WAVE, Move.FLARE_BLITZ}), Type.FIRE, Type.FLYING),
        SQUIRTLE("Squirtle", "007", (short)45, new short[] {44, 48, 65, 50, 64, 43}, (byte)63, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40}, new Move[] {Move.TACKLE, Move.TAIL_WHIP, Move.BUBBLE, Move.WITHDRAW, Move.WATER_GUN, Move.BITE, Move.RAPID_SPIN, Move.PROTECT, Move.WATER_PULSE, Move.AQUA_TAIL, Move.SKULL_BASH, Move.IRON_DEFENSE, Move.RAIN_DANCE, Move.HYDRO_PUMP}), Type.WATER),
        WARTORTLE("Wartortle", "008", (short)45, new short[] {59, 63, 80, 65, 80, 58}, (byte)142, new byte[] {0, 0, 1, 0, 1, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 4, 7, 10, 13, 16, 20, 24, 28, 32, 36, 40, 44, 48}, new Move[] {Move.TACKLE, Move.TAIL_WHIP, Move.BUBBLE, Move.TAIL_WHIP, Move.BUBBLE, Move.WITHDRAW, Move.WATER_GUN, Move.BITE, Move.RAPID_SPIN, Move.PROTECT, Move.WATER_PULSE, Move.AQUA_TAIL, Move.SKULL_BASH, Move.IRON_DEFENSE, Move.RAIN_DANCE, Move.HYDRO_PUMP}), Type.WATER),
        BLASTOISE("Blastoise", "009", (short)45, new short[] {79, 83, 100, 85, 105, 78}, (byte)239, new byte[] {0, 0, 0, 0, 3, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 4, 7, 10, 13, 16, 20, 24, 28, 32, 39, 46, 53, 60}, new Move[] {Move.FLASH_CANNON, Move.TACKLE, Move.TAIL_WHIP, Move.BUBBLE, Move.WITHDRAW, Move.TAIL_WHIP, Move.BUBBLE, Move.WITHDRAW, Move.WATER_GUN, Move.BITE, Move.RAPID_SPIN, Move.PROTECT, Move.WATER_PULSE, Move.AQUA_TAIL, Move.SKULL_BASH, Move.IRON_DEFENSE, Move.RAIN_DANCE, Move.HYDRO_PUMP}), Type.WATER),
        CATERPIE("Caterpie", "010", (short)255, new short[] {45, 30, 35, 20, 20, 45}, (byte)39, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 15}, new Move[] {Move.TACKLE, Move.STRING_SHOT, Move.BUG_BITE}), Type.BUG),
        METAPOD("Metapod", "011", (short)120, new short[] {50, 20, 55, 25, 25, 30}, (byte)72, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 7}, new Move[] {Move.HARDEN, Move.HARDEN}), Type.BUG),
        BUTTERFREE("Butterfree", "012", (short)45, new short[] {60, 45, 50, 80, 80, 70}, (byte)173, new byte[] {0, 0, 0, 2, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 10, 12, 12, 12, 16, 18, 22, 24, 28, 30, 34, 36, 40, 42, 46}, new Move[] {Move.CONFUSION, Move.CONFUSION, Move.POISONPOWDER, Move.STUN_SPORE, Move.SLEEP_POWDER, Move.GUST, Move.SUPERSONIC, Move.WHIRLWIND, Move.PSYBEAM, Move.SILVER_WIND, Move.TAILWIND, Move.RAGE_POWDER, Move.SAFEGUARD, Move.CAPTIVATE, Move.BUG_BUZZ, Move.QUIVER_DANCE}), Type.BUG, Type.FLYING),
        WEEDLE("Weedle", "013", (short)255, new short[] {40, 35, 30, 20, 20, 50}, (byte)39, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 15}, new Move[] {Move.POISON_STING, Move.STRING_SHOT, Move.BUG_BITE}), Type.BUG, Type.POISON),
        KAKUNA("Kakuna", "014", (short)120, new short[] {45, 25, 50, 25, 25, 35}, (byte)72, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 7}, new Move[] {Move.HARDEN, Move.HARDEN}), Type.BUG, Type.POISON),
        BEEDRILL("Beedrill", "015", (short)45, new short[] {65, 80, 40, 45, 80, 75}, (byte)173, new byte[] {0, 2, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40}, new Move[] {Move.FURY_ATTACK, Move.FURY_ATTACK, Move.FOCUS_ENERGY, Move.TWINEEDLE, Move.RAGE, Move.PURSUIT, Move.TOXIC_SPIKES, Move.PIN_MISSILE, Move.AGILITY, Move.ASSURANCE, Move.POISON_JAB, Move.ENDEAVOR}), Type.BUG, Type.POISON),
        PIDGEY("Pidgey", "016", (short)255, new short[] {40, 45, 40, 35, 35, 56}, (byte)50, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53}, new Move[] {Move.TACKLE, Move.SAND_ATTACK, Move.GUST, Move.QUICK_ATTACK, Move.WHIRLWIND, Move.TWISTER, Move.FEATHERDANCE, Move.AGILITY, Move.WING_ATTACK, Move.ROOST, Move.TAILWIND, Move.MIRROR_MOVE, Move.AIR_SLASH, Move.HURRICANE}), Type.NORMAL, Type.FLYING),
        PIDGEOTTO("Pidgeotto", "017", (short)120, new short[] {63, 60, 55, 50, 50, 71}, (byte)113, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 22, 27, 32, 37, 42, 47, 52, 57, 62}, new Move[] {Move.TACKLE, Move.SAND_ATTACK, Move.GUST, Move.SAND_ATTACK, Move.GUST, Move.QUICK_ATTACK, Move.WHIRLWIND, Move.TWISTER, Move.FEATHERDANCE, Move.AGILITY, Move.WING_ATTACK, Move.ROOST, Move.TAILWIND, Move.MIRROR_MOVE, Move.AIR_SLASH, Move.HURRICANE}), Type.NORMAL, Type.FLYING),
        PIDGEOT("Pidgeot", "018", (short)45, new short[] {83, 80, 75, 70, 70, 91}, (byte)172, new byte[] {0, 0, 0, 0, 0, 3}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 5, 9, 13, 17, 22, 27, 32, 38, 44, 50, 56, 62, 68}, new Move[] {Move.TACKLE, Move.SAND_ATTACK, Move.GUST, Move.QUICK_ATTACK, Move.SAND_ATTACK, Move.GUST, Move.QUICK_ATTACK, Move.WHIRLWIND, Move.TWISTER, Move.FEATHERDANCE, Move.AGILITY, Move.WING_ATTACK, Move.ROOST, Move.TAILWIND, Move.MIRROR_MOVE, Move.AIR_SLASH, Move.HURRICANE}), Type.NORMAL, Type.FLYING),
        RATTATA("Rattata", "019", (short)255, new short[] {30, 56, 35, 25, 35, 72}, (byte)57, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34}, new Move[] {Move.TACKLE, Move.TAIL_WHIP, Move.QUICK_ATTACK, Move.FOCUS_ENERGY, Move.BITE, Move.PURSUIT, Move.HYPER_FANG, Move.SUCKER_PUNCH, Move.CRUNCH, Move.ASSURANCE, Move.SUPER_FANG, Move.DOUBLE_EDGE, Move.ENDEAVOR}), Type.NORMAL),
        RATICATE("Raticate", "020", (short)127, new short[] {55, 81, 60, 50, 70, 97}, (byte)116, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 4, 7, 10, 13, 16, 19, 20, 24, 29, 34, 39, 44}, new Move[] {Move.SWORDS_DANCE, Move.TACKLE, Move.TAIL_WHIP, Move.QUICK_ATTACK, Move.FOCUS_ENERGY, Move.QUICK_ATTACK, Move.FOCUS_ENERGY, Move.BITE, Move.PURSUIT, Move.HYPER_FANG, Move.SUCKER_PUNCH, Move.SCARY_FACE, Move.CRUNCH, Move.ASSURANCE, Move.SUPER_FANG, Move.DOUBLE_EDGE, Move.ENDEAVOR}), Type.NORMAL),
        SPEAROW("Spearow", "021", (short)255, new short[] {40, 60, 30, 31, 31, 70}, (byte)58, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37}, new Move[] {Move.PECK, Move.GROWL, Move.LEER, Move.FURY_ATTACK, Move.PURSUIT, Move.AERIAL_ACE, Move.MIRROR_MOVE, Move.AGILITY, Move.ASSURANCE, Move.ROOST, Move.DRILL_PECK}), Type.NORMAL, Type.FLYING),
        FEAROW("Fearow", "022", (short)90, new short[] {65, 90, 65, 61, 61, 100}, (byte)162, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 9, 13, 17, 23, 29, 35, 41, 47, 53}, new Move[] {Move.PLUCK, Move.PECK, Move.GROWL, Move.LEER, Move.FURY_ATTACK, Move.LEER, Move.FURY_ATTACK, Move.PURSUIT, Move.AERIAL_ACE, Move.MIRROR_MOVE, Move.AGILITY, Move.ASSURANCE, Move.ROOST, Move.DRILL_PECK, Move.DRILL_RUN}), Type.NORMAL, Type.FLYING),
        EKANS("Ekans", "023", (short)255, new short[] {35, 60, 44, 40, 54, 55}, (byte)62, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 4, 9, 12, 17, 20, 25, 25, 25, 28, 33, 36, 41, 44, 49}, new Move[] {Move.WRAP, Move.LEER, Move.POISON_STING, Move.BITE, Move.GLARE, Move.SCREECH, Move.ACID, Move.STOCKPILE, Move.SWALLOW, Move.SPIT_UP, Move.ACID_SPRAY, Move.MUD_BOMB, Move.GASTRO_ACID, Move.HAZE, Move.COIL, Move.GUNK_SHOT}), Type.POISON),
        ARBOK("Arbok", "024", (short)90, new short[] {60, 85, 69, 65, 79, 80}, (byte)147, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 4, 9, 12, 17, 20, 22, 27, 27, 27, 32, 39, 44, 51, 56, 63}, new Move[] {Move.ICE_FANG, Move.THUNDER_FANG, Move.FIRE_FANG, Move.WRAP, Move.LEER, Move.POISON_STING, Move.BITE, Move.POISON_STING, Move.BITE, Move.GLARE, Move.SCREECH, Move.ACID, Move.CRUNCH, Move.STOCKPILE, Move.SWALLOW, Move.SPIT_UP, Move.ACID_SPRAY, Move.MUD_BOMB, Move.GASTRO_ACID, Move.HAZE, Move.COIL, Move.GUNK_SHOT}), Type.POISON),
        PIKACHU("Pikachu", "025", (short)190, new short[] {35, 55, 30, 50, 40, 90}, (byte)82, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 10, 13, 18, 21, 26, 29, 34, 37, 42, 45, 50}, new Move[] {Move.GROWL, Move.THUNDERSHOCK, Move.TAIL_WHIP, Move.THUNDER_WAVE, Move.QUICK_ATTACK, Move.ELECTRO_BALL, Move.DOUBLE_TEAM, Move.SLAM, Move.THUNDERBOLT, Move.FEINT, Move.AGILITY, Move.DISCHARGE, Move.LIGHT_SCREEN, Move.THUNDER}), Type.ELECTRIC),
        RAICHU("Raichu", "026", (short)75, new short[] {60, 90, 55, 90, 80, 100}, (byte)122, new byte[] {0, 0, 0, 0, 0, 3}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0}, new Move[] {Move.THUNDERSHOCK, Move.TAIL_WHIP, Move.QUICK_ATTACK, Move.THUNDERBOLT}), Type.ELECTRIC),
        SANDSHREW("Sandshrew", "027", (short)255, new short[] {50, 75, 85, 20, 30, 40}, (byte)93, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 3, 5, 7, 9, 11, 14, 17, 20, 23, 26, 30, 34, 38, 42, 46}, new Move[] {Move.SCRATCH, Move.DEFENSE_CURL, Move.SAND_ATTACK, Move.POISON_STING, Move.ROLLOUT, Move.RAPID_SPIN, Move.SWIFT, Move.FURY_CUTTER, Move.MAGNITUDE, Move.FURY_SWIPES, Move.SAND_TOMB, Move.SLASH, Move.DIG, Move.GYRO_BALL, Move.SWORDS_DANCE, Move.SANDSTORM, Move.EARTHQUAKE}), Type.GROUND),
        SANDSLASH("Sandslash", "028", (short)90, new short[] {75, 100, 110, 45, 55, 65}, (byte)163, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 3, 5, 7, 9, 11, 14, 17, 20, 22, 23, 26, 30, 34, 38, 42, 46, -1}, new Move[] {Move.SCRATCH, Move.DEFENSE_CURL, Move.SAND_ATTACK, Move.POISON_STING, Move.SAND_ATTACK, Move.POISON_STING, Move.ROLLOUT, Move.RAPID_SPIN, Move.SWIFT, Move.FURY_CUTTER, Move.MAGNITUDE, Move.FURY_SWIPES, Move.CRUSH_CLAW, Move.SAND_TOMB, Move.SLASH, Move.DIG, Move.GYRO_BALL, Move.SWORDS_DANCE, Move.SANDSTORM, Move.EARTHQUAKE, Move.DEFENSE_CURL}), Type.GROUND),
        NIDORAN_FEMALE("Nidoran%E2%99%80", "029", (short)235, new short[] {55, 47, 52, 40, 40, 41}, (byte)59, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.FEMALE_ONLY, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 7, 9, 13, 19, 21, 25, 31, 33, 37, 43, 45}, new Move[] {Move.GROWL, Move.SCRATCH, Move.TAIL_WHIP, Move.DOUBLE_KICK, Move.POISON_STING, Move.FURY_SWIPES, Move.BITE, Move.HELPING_HAND, Move.TOXIC_SPIKES, Move.FLATTER, Move.CRUNCH, Move.CAPTIVATE, Move.POISON_FANG}), Type.POISON),
        NIDORINA("Nidorina", "030", (short)120, new short[] {70, 62, 67, 55, 55, 56}, (byte)117, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.FEMALE_ONLY, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 7, 9, 13, 20, 23, 28, 35, 38, 43, 50, 58}, new Move[] {Move.GROWL, Move.SCRATCH, Move.TAIL_WHIP, Move.DOUBLE_KICK, Move.POISON_STING, Move.FURY_SWIPES, Move.BITE, Move.HELPING_HAND, Move.TOXIC_SPIKES, Move.FLATTER, Move.CRUNCH, Move.CAPTIVATE, Move.POISON_FANG}), Type.POISON),
        NIDOQUEEN("Nidoqueen", "031", (short)45, new short[] {90, 82, 87, 75, 85, 76}, (byte)194, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.FEMALE_ONLY, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 23, 35, 43, 58}, new Move[] {Move.SCRATCH, Move.TAIL_WHIP, Move.DOUBLE_KICK, Move.POISON_STING, Move.CHIP_AWAY, Move.BODY_SLAM, Move.EARTH_POWER, Move.SUPERPOWER}), Type.POISON, Type.GROUND),
        NIDORAN_MALE("Nidoran%E2%99%82", "032", (short)235, new short[] {46, 57, 40, 40, 40, 50}, (byte)60, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 7, 9, 13, 19, 21, 25, 31, 33, 37, 43, 45}, new Move[] {Move.LEER, Move.PECK, Move.FOCUS_ENERGY, Move.DOUBLE_KICK, Move.POISON_STING, Move.FURY_ATTACK, Move.HORN_ATTACK, Move.HELPING_HAND, Move.TOXIC_SPIKES, Move.FLATTER, Move.POISON_JAB, Move.CAPTIVATE, Move.HORN_DRILL}), Type.POISON),
        NIDORINO("Nidorino", "033", (short)120, new short[] {61, 72, 57, 55, 55, 65}, (byte)118, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 7, 9, 13, 20, 23, 28, 35, 38, 43, 50, 58}, new Move[] {Move.LEER, Move.PECK, Move.FOCUS_ENERGY, Move.DOUBLE_KICK, Move.POISON_STING, Move.FURY_ATTACK, Move.HORN_ATTACK, Move.HELPING_HAND, Move.TOXIC_SPIKES, Move.FLATTER, Move.POISON_JAB, Move.CAPTIVATE, Move.HORN_DRILL}), Type.POISON),
        NIDOKING("Nidoking", "034", (short)45, new short[] {81, 92, 77, 85, 75, 85}, (byte)195, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 23, 35, 43, 58}, new Move[] {Move.PECK, Move.FOCUS_ENERGY, Move.DOUBLE_KICK, Move.POISON_STING, Move.CHIP_AWAY, Move.THRASH, Move.EARTH_POWER, Move.MEGAHORN}), Type.POISON, Type.GROUND),
        CLEFAIRY("Clefairy", "035", (short)150, new short[] {70, 45, 48, 60, 65, 35}, (byte)68, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52, 55, 58}, new Move[] {Move.POUND, Move.GROWL, Move.ENCORE, Move.SING, Move.DOUBLESLAP, Move.DEFENSE_CURL, Move.FOLLOW_ME, Move.BESTOW, Move.WAKE_UP_SLAP, Move.MINIMIZE, Move.STORED_POWER, Move.METRONOME, Move.COSMIC_POWER, Move.LUCKY_CHANT, Move.BODY_SLAM, Move.MOONLIGHT, Move.LIGHT_SCREEN, Move.GRAVITY, Move.METEOR_MASH, Move.HEALING_WISH, Move.AFTER_YOU}), Type.NORMAL),
        CLEFABLE("Clefable", "036", (short)25, new short[] {95, 70, 73, 85, 90, 60}, (byte)129, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 0}, new Move[] {Move.SING, Move.DOUBLESLAP, Move.MINIMIZE, Move.METRONOME}), Type.NORMAL),
        VULPIX("Vulpix", "037", (short)190, new short[] {38, 41, 40, 50, 65, 65}, (byte)63, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 7, 10, 12, 15, 18, 20, 23, 26, 28, 31, 34, 36, 39, 42, 44, 47, 50}, new Move[] {Move.EMBER, Move.TAIL_WHIP, Move.ROAR, Move.QUICK_ATTACK, Move.FIRE_SPIN, Move.CONFUSE_RAY, Move.IMPRISON, Move.FAINT_ATTACK, Move.FLAME_BURST, Move.WILL_O_WISP, Move.HEX, Move.PAYBACK, Move.FLAMETHROWER, Move.SAFEGUARD, Move.EXTRASENSORY, Move.FIRE_BLAST, Move.GRUDGE, Move.CAPTIVATE, Move.INFERNO}), Type.FIRE),
        NINETALES("Ninetales", "038", (short)75, new short[] {73, 76, 75, 81, 100, 100}, (byte)178, new byte[] {0, 0, 0, 0, 1, 1}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0}, new Move[] {Move.NASTY_PLOT, Move.EMBER, Move.QUICK_ATTACK, Move.CONFUSE_RAY, Move.SAFEGUARD}), Type.FIRE),
        JIGGLYPUFF("Jigglypuff", "039", (short)170, new short[] {115, 45, 20, 45, 25, 20}, (byte)76, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53}, new Move[] {Move.SING, Move.DEFENSE_CURL, Move.POUND, Move.DISABLE, Move.ROUND, Move.ROLLOUT, Move.DOUBLESLAP, Move.REST, Move.BODY_SLAM, Move.GYRO_BALL, Move.WAKE_UP_SLAP, Move.MIMIC, Move.HYPER_VOICE, Move.DOUBLE_EDGE}), Type.NORMAL),
        WIGGLYTUFF("Wigglytuff", "040", (short)50, new short[] {140, 70, 45, 75, 50, 45}, (byte)109, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 0}, new Move[] {Move.SING, Move.DISABLE, Move.DEFENSE_CURL, Move.DOUBLESLAP}), Type.NORMAL),
        ZUBAT("Zubat", "041", (short)255, new short[] {40, 45, 35, 30, 40, 55}, (byte)54, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 8, 12, 15, 19, 23, 26, 30, 34, 37, 41, 45}, new Move[] {Move.LEECH_LIFE, Move.SUPERSONIC, Move.ASTONISH, Move.BITE, Move.WING_ATTACK, Move.CONFUSE_RAY, Move.SWIFT, Move.AIR_CUTTER, Move.ACROBATICS, Move.MEAN_LOOK, Move.POISON_FANG, Move.HAZE, Move.AIR_SLASH}), Type.POISON, Type.FLYING),
        GOLBAT("Golbat", "042", (short)90, new short[] {75, 80, 70, 65, 75, 90}, (byte)171, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 4, 8, 12, 15, 19, 24, 28, 33, 38, 42, 47, 52}, new Move[] {Move.SCREECH, Move.LEECH_LIFE, Move.SUPERSONIC, Move.ASTONISH, Move.SUPERSONIC, Move.ASTONISH, Move.BITE, Move.WING_ATTACK, Move.CONFUSE_RAY, Move.SWIFT, Move.AIR_CUTTER, Move.ACROBATICS, Move.MEAN_LOOK, Move.POISON_FANG, Move.HAZE, Move.AIR_SLASH}), Type.POISON, Type.FLYING),
        ODDISH("Oddish", "043", (short)255, new short[] {45, 50, 55, 75, 65, 30}, (byte)78, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 5, 9, 13, 15, 17, 21, 25, 29, 33, 37, 41}, new Move[] {Move.ABSORB, Move.SWEET_SCENT, Move.ACID, Move.POISONPOWDER, Move.STUN_SPORE, Move.SLEEP_POWDER, Move.MEGA_DRAIN, Move.LUCKY_CHANT, Move.NATURAL_GIFT, Move.MOONLIGHT, Move.GIGA_DRAIN, Move.PETAL_DANCE}), Type.GRASS, Type.POISON),
        GLOOM("Gloom", "044", (short)120, new short[] {60, 65, 70, 85, 75, 40}, (byte)132, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 15, 17, 23, 29, 35, 41, 47, 53}, new Move[] {Move.ABSORB, Move.SWEET_SCENT, Move.ACID, Move.SWEET_SCENT, Move.ACID, Move.POISONPOWDER, Move.STUN_SPORE, Move.SLEEP_POWDER, Move.MEGA_DRAIN, Move.LUCKY_CHANT, Move.NATURAL_GIFT, Move.MOONLIGHT, Move.GIGA_DRAIN, Move.PETAL_DANCE}), Type.GRASS, Type.POISON),
        VILEPLUME("Vileplume", "045", (short)45, new short[] {75, 80, 85, 100, 90, 50}, (byte)184, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 53, 65}, new Move[] {Move.MEGA_DRAIN, Move.AROMATHERAPY, Move.STUN_SPORE, Move.POISONPOWDER, Move.PETAL_DANCE, Move.SOLARBEAM}), Type.GRASS, Type.POISON),
        PARAS("Paras", "046", (short)190, new short[] {35, 70, 55, 45, 55, 25}, (byte)70, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 6, 6, 11, 17, 22, 27, 33, 38, 43, 49, 54}, new Move[] {Move.SCRATCH, Move.STUN_SPORE, Move.POISONPOWDER, Move.LEECH_LIFE, Move.FURY_CUTTER, Move.SPORE, Move.SLASH, Move.GROWTH, Move.GIGA_DRAIN, Move.AROMATHERAPY, Move.RAGE_POWDER, Move.X_SCISSOR}), Type.BUG, Type.GRASS),
        PARASECT("Parasect", "047", (short)75, new short[] {60, 95, 80, 60, 80, 30}, (byte)128, new byte[] {0, 2, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 6, 6, 11, 17, 22, 29, 37, 44, 51, 59, 66}, new Move[] {Move.CROSS_POISON, Move.SCRATCH, Move.STUN_SPORE, Move.POISONPOWDER, Move.LEECH_LIFE, Move.STUN_SPORE, Move.POISONPOWDER, Move.LEECH_LIFE, Move.FURY_CUTTER, Move.SPORE, Move.SLASH, Move.GROWTH, Move.GIGA_DRAIN, Move.AROMATHERAPY, Move.RAGE_POWDER, Move.X_SCISSOR}), Type.BUG, Type.GRASS),
        VENONAT("Venonat", "048", (short)190, new short[] {60, 55, 50, 40, 55, 45}, (byte)75, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 11, 13, 17, 23, 25, 29, 35, 37, 41, 47}, new Move[] {Move.TACKLE, Move.DISABLE, Move.FORESIGHT, Move.SUPERSONIC, Move.CONFUSION, Move.POISONPOWDER, Move.LEECH_LIFE, Move.STUN_SPORE, Move.PSYBEAM, Move.SLEEP_POWDER, Move.SIGNAL_BEAM, Move.ZEN_HEADBUTT, Move.POISON_FANG, Move.PSYCHIC}), Type.BUG, Type.POISON),
        VENOMOTH("Venomoth", "049", (short)75, new short[] {70, 65, 60, 90, 75, 90}, (byte)138, new byte[] {0, 0, 0, 1, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 11, 13, 17, 23, 25, 29, 31, 37, 41, 47, 55, 59, 63}, new Move[] {Move.SILVER_WIND, Move.TACKLE, Move.DISABLE, Move.FORESIGHT, Move.SUPERSONIC, Move.SUPERSONIC, Move.CONFUSION, Move.POISONPOWDER, Move.LEECH_LIFE, Move.STUN_SPORE, Move.PSYBEAM, Move.SLEEP_POWDER, Move.GUST, Move.SIGNAL_BEAM, Move.ZEN_HEADBUTT, Move.POISON_FANG, Move.PSYCHIC, Move.BUG_BUZZ, Move.QUIVER_DANCE}), Type.BUG, Type.POISON),
        DIGLETT("Diglett", "050", (short)255, new short[] {10, 55, 25, 35, 45, 95}, (byte)81, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 4, 7, 12, 15, 18, 23, 26, 29, 34, 37, 40, 45}, new Move[] {Move.SCRATCH, Move.SAND_ATTACK, Move.GROWL, Move.ASTONISH, Move.MUD_SLAP, Move.MAGNITUDE, Move.BULLDOZE, Move.SUCKER_PUNCH, Move.MUD_BOMB, Move.EARTH_POWER, Move.DIG, Move.SLASH, Move.EARTHQUAKE, Move.FISSURE}), Type.GROUND),
        DUGTRIO("Dugtrio", "051", (short)50, new short[] {35, 80, 50, 50, 70, 120}, (byte)153, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 4, 7, 12, 15, 18, 23, 26, 28, 33, 40, 45, 50, 57}, new Move[] {Move.NIGHT_SLASH, Move.TRI_ATTACK, Move.SCRATCH, Move.SAND_ATTACK, Move.GROWL, Move.GROWL, Move.ASTONISH, Move.MUD_SLAP, Move.MAGNITUDE, Move.BULLDOZE, Move.SUCKER_PUNCH, Move.SAND_TOMB, Move.MUD_BOMB, Move.EARTH_POWER, Move.DIG, Move.SLASH, Move.EARTHQUAKE, Move.FISSURE}), Type.GROUND),
        MEOWTH("Meowth", "052", (short)255, new short[] {40, 45, 35, 40, 40, 90}, (byte)69, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 6, 9, 14, 17, 22, 25, 30, 33, 38, 41, 46, 49, 54}, new Move[] {Move.SCRATCH, Move.GROWL, Move.BITE, Move.FAKE_OUT, Move.FURY_SWIPES, Move.SCREECH, Move.FAINT_ATTACK, Move.TAUNT, Move.PAY_DAY, Move.SLASH, Move.NASTY_PLOT, Move.ASSURANCE, Move.CAPTIVATE, Move.NIGHT_SLASH, Move.FEINT}), Type.NORMAL),
        PERSIAN("Persian", "053", (short)90, new short[] {65, 70, 60, 65, 65, 115}, (byte)154, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 6, 9, 14, 17, 22, 25, 28, 32, 37, 44, 49, 56, 61, 68}, new Move[] {Move.SWITCHEROO, Move.SCRATCH, Move.GROWL, Move.BITE, Move.FAKE_OUT, Move.BITE, Move.FAKE_OUT, Move.FURY_SWIPES, Move.SCREECH, Move.FAINT_ATTACK, Move.TAUNT, Move.SWIFT, Move.POWER_GEM, Move.SLASH, Move.NASTY_PLOT, Move.ASSURANCE, Move.CAPTIVATE, Move.NIGHT_SLASH, Move.FEINT}), Type.NORMAL),
        PSYDUCK("Psyduck", "054", (short)190, new short[] {50, 52, 48, 65, 50, 55}, (byte)64, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 39, 43, 46, 50}, new Move[] {Move.WATER_SPORT, Move.SCRATCH, Move.TAIL_WHIP, Move.WATER_GUN, Move.DISABLE, Move.CONFUSION, Move.WATER_PULSE, Move.FURY_SWIPES, Move.SCREECH, Move.ZEN_HEADBUTT, Move.AQUA_TAIL, Move.SOAK, Move.PSYCH_UP, Move.AMNESIA, Move.HYDRO_PUMP, Move.WONDER_ROOM}), Type.WATER),
        GOLDUCK("Golduck", "055", (short)75, new short[] {80, 82, 78, 95, 80, 85}, (byte)175, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 38, 43, 49, 54, 60}, new Move[] {Move.AQUA_JET, Move.WATER_SPORT, Move.SCRATCH, Move.TAIL_WHIP, Move.WATER_GUN, Move.TAIL_WHIP, Move.WATER_GUN, Move.DISABLE, Move.CONFUSION, Move.WATER_PULSE, Move.FURY_SWIPES, Move.SCREECH, Move.ZEN_HEADBUTT, Move.AQUA_TAIL, Move.SOAK, Move.PSYCH_UP, Move.AMNESIA, Move.HYDRO_PUMP, Move.WONDER_ROOM}), Type.WATER),
        MANKEY("Mankey", "056", (short)190, new short[] {40, 80, 35, 35, 45, 70}, (byte)61, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 9, 13, 17, 21, 25, 33, 37, 41, 45, 49, 53}, new Move[] {Move.COVET, Move.SCRATCH, Move.LOW_KICK, Move.LEER, Move.FOCUS_ENERGY, Move.FURY_SWIPES, Move.KARATE_CHOP, Move.SEISMIC_TOSS, Move.SCREECH, Move.ASSURANCE, Move.SWAGGER, Move.CROSS_CHOP, Move.THRASH, Move.PUNISHMENT, Move.CLOSE_COMBAT, Move.FINAL_GAMBIT}), Type.FIGHTING),
        PRIMEAPE("Primeape", "057", (short)75, new short[] {65, 105, 60, 60, 70, 95}, (byte)159, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 9, 13, 17, 21, 25, 28, 35, 41, 47, 53, 59, 63}, new Move[] {Move.FLING, Move.SCRATCH, Move.LOW_KICK, Move.LEER, Move.FOCUS_ENERGY, Move.FURY_SWIPES, Move.KARATE_CHOP, Move.SEISMIC_TOSS, Move.SCREECH, Move.ASSURANCE, Move.RAGE, Move.SWAGGER, Move.CROSS_CHOP, Move.THRASH, Move.PUNISHMENT, Move.CLOSE_COMBAT, Move.FINAL_GAMBIT}), Type.FIGHTING),
        GROWLITHE("Growlithe", "058", (short)190, new short[] {55, 70, 45, 70, 50, 60}, (byte)70, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 6, 8, 10, 12, 17, 19, 21, 23, 28, 30, 32, 34, 39, 41, 43, 45}, new Move[] {Move.BITE, Move.ROAR, Move.EMBER, Move.LEER, Move.ODOR_SLEUTH, Move.HELPING_HAND, Move.FLAME_WHEEL, Move.REVERSAL, Move.FIRE_FANG, Move.TAKE_DOWN, Move.FLAME_BURST, Move.AGILITY, Move.RETALIATE, Move.FLAMETHROWER, Move.CRUNCH, Move.HEAT_WAVE, Move.OUTRAGE, Move.FLARE_BLITZ}), Type.FIRE),
        ARCANINE("Arcanine", "059", (short)75, new short[] {90, 110, 80, 100, 80, 95}, (byte)194, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 34}, new Move[] {Move.THUNDER_FANG, Move.BITE, Move.ROAR, Move.FIRE_FANG, Move.ODOR_SLEUTH, Move.EXTREMESPEED}), Type.FIRE),
        POLIWAG("Poliwag", "060", (short)255, new short[] {40, 50, 40, 40, 40, 90}, (byte)60, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 5, 8, 11, 15, 18, 21, 25, 28, 31, 35, 38, 41}, new Move[] {Move.WATER_SPORT, Move.BUBBLE, Move.HYPNOSIS, Move.WATER_GUN, Move.DOUBLESLAP, Move.RAIN_DANCE, Move.BODY_SLAM, Move.BUBBLEBEAM, Move.MUD_SHOT, Move.BELLY_DRUM, Move.WAKE_UP_SLAP, Move.HYDRO_PUMP, Move.MUD_BOMB}), Type.WATER),
        POLIWHIRL("Poliwhirl", "061", (short)120, new short[] {65, 65, 65, 50, 50, 90}, (byte)135, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 5, 8, 11, 15, 18, 21, 27, 32, 37, 43, 48, 53}, new Move[] {Move.WATER_SPORT, Move.BUBBLE, Move.HYPNOSIS, Move.BUBBLE, Move.HYPNOSIS, Move.WATER_GUN, Move.DOUBLESLAP, Move.RAIN_DANCE, Move.BODY_SLAM, Move.BUBBLEBEAM, Move.MUD_SHOT, Move.BELLY_DRUM, Move.WAKE_UP_SLAP, Move.HYDRO_PUMP, Move.MUD_BOMB}), Type.WATER),
        POLIWRATH("Poliwrath", "062", (short)45, new short[] {90, 85, 95, 70, 90, 70}, (byte)225, new byte[] {0, 0, 3, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 32, 43, 53}, new Move[] {Move.BUBBLEBEAM, Move.HYPNOSIS, Move.DOUBLESLAP, Move.SUBMISSION, Move.DYNAMICPUNCH, Move.MIND_READER, Move.CIRCLE_THROW}), Type.WATER, Type.FIGHTING),
        ABRA("Abra", "063", (short)200, new short[] {25, 20, 15, 105, 55, 90}, (byte)62, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0}, new Move[] {Move.TELEPORT}), Type.PSYCHIC),
        KADABRA("Kadabra", "064", (short)100, new short[] {40, 35, 30, 120, 70, 105}, (byte)140, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 16, 18, 22, 24, 28, 30, 34, 36, 40, 42, 46, 48, 52}, new Move[] {Move.TELEPORT, Move.KINESIS, Move.CONFUSION, Move.CONFUSION, Move.DISABLE, Move.MIRACLE_EYE, Move.ALLY_SWITCH, Move.PSYBEAM, Move.REFLECT, Move.TELEKINESIS, Move.RECOVER, Move.PSYCHO_CUT, Move.ROLE_PLAY, Move.PSYCHIC, Move.FUTURE_SIGHT, Move.TRICK}), Type.PSYCHIC),
        ALAKAZAM("Alakazam", "065", (short)50, new short[] {55, 50, 45, 135, 85, 120}, (byte)221, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 16, 18, 22, 24, 28, 30, 34, 36, 40, 42, 46, 48, 52}, new Move[] {Move.TELEPORT, Move.KINESIS, Move.CONFUSION, Move.CONFUSION, Move.DISABLE, Move.MIRACLE_EYE, Move.ALLY_SWITCH, Move.PSYBEAM, Move.REFLECT, Move.TELEKINESIS, Move.RECOVER, Move.PSYCHO_CUT, Move.CALM_MIND, Move.PSYCHIC, Move.FUTURE_SIGHT, Move.TRICK}), Type.PSYCHIC),
        MACHOP("Machop", "066", (short)180, new short[] {70, 80, 50, 35, 35, 35}, (byte)61, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 7, 10, 13, 19, 22, 25, 31, 34, 37, 43, 46, 49}, new Move[] {Move.LOW_KICK, Move.LEER, Move.FOCUS_ENERGY, Move.KARATE_CHOP, Move.LOW_SWEEP, Move.FORESIGHT, Move.SEISMIC_TOSS, Move.REVENGE, Move.VITAL_THROW, Move.SUBMISSION, Move.WAKE_UP_SLAP, Move.CROSS_CHOP, Move.SCARY_FACE, Move.DYNAMICPUNCH}), Type.FIGHTING),
        MACHOKE("Machoke", "067", (short)90, new short[] {80, 100, 70, 50, 60, 45}, (byte)142, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 7, 10, 13, 19, 22, 25, 32, 36, 40, 44, 51, 55}, new Move[] {Move.LOW_KICK, Move.LEER, Move.FOCUS_ENERGY, Move.KARATE_CHOP, Move.FOCUS_ENERGY, Move.KARATE_CHOP, Move.LOW_SWEEP, Move.FORESIGHT, Move.SEISMIC_TOSS, Move.REVENGE, Move.VITAL_THROW, Move.SUBMISSION, Move.WAKE_UP_SLAP, Move.CROSS_CHOP, Move.SCARY_FACE, Move.DYNAMICPUNCH}), Type.FIGHTING),
        MACHAMP("Machamp", "068", (short)45, new short[] {90, 130, 80, 65, 85, 55}, (byte)227, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 7, 10, 13, 19, 22, 25, 32, 36, 40, 44, 51, 55}, new Move[] {Move.WIDE_GUARD, Move.LOW_KICK, Move.LEER, Move.FOCUS_ENERGY, Move.KARATE_CHOP, Move.FOCUS_ENERGY, Move.KARATE_CHOP, Move.LOW_SWEEP, Move.FORESIGHT, Move.SEISMIC_TOSS, Move.REVENGE, Move.VITAL_THROW, Move.SUBMISSION, Move.WAKE_UP_SLAP, Move.CROSS_CHOP, Move.SCARY_FACE, Move.DYNAMICPUNCH}), Type.FIGHTING),
        BELLSPROUT("Bellsprout", "069", (short)255, new short[] {50, 75, 35, 70, 30, 40}, (byte)60, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 7, 11, 13, 15, 17, 23, 27, 29, 35, 39, 41, 47}, new Move[] {Move.VINE_WHIP, Move.GROWTH, Move.WRAP, Move.SLEEP_POWDER, Move.POISONPOWDER, Move.STUN_SPORE, Move.ACID, Move.KNOCK_OFF, Move.SWEET_SCENT, Move.GASTRO_ACID, Move.RAZOR_LEAF, Move.SLAM, Move.WRING_OUT}), Type.GRASS, Type.POISON),
        WEEPINBELL("Weepinbell", "070", (short)120, new short[] {65, 90, 50, 85, 45, 55}, (byte)137, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 7, 11, 13, 15, 17, 23, 27, 29, 35, 39, 41, 47}, new Move[] {Move.VINE_WHIP, Move.GROWTH, Move.WRAP, Move.GROWTH, Move.WRAP, Move.SLEEP_POWDER, Move.POISONPOWDER, Move.STUN_SPORE, Move.ACID, Move.KNOCK_OFF, Move.SWEET_SCENT, Move.GASTRO_ACID, Move.RAZOR_LEAF, Move.SLAM, Move.WRING_OUT}), Type.GRASS, Type.POISON),
        VICTREEBEL("Victreebel", "071", (short)45, new short[] {80, 105, 65, 100, 60, 70}, (byte)216, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 27, 47, 47}, new Move[] {Move.STOCKPILE, Move.SWALLOW, Move.SPIT_UP, Move.VINE_WHIP, Move.SLEEP_POWDER, Move.SWEET_SCENT, Move.RAZOR_LEAF, Move.LEAF_TORNADO, Move.LEAF_STORM, Move.LEAF_BLADE}), Type.GRASS, Type.POISON),
        TENTACOOL("Tentacool", "072", (short)190, new short[] {40, 40, 35, 50, 100, 70}, (byte)67, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 5, 8, 12, 15, 19, 22, 26, 29, 33, 36, 40, 43, 47, 50, 54}, new Move[] {Move.POISON_STING, Move.SUPERSONIC, Move.CONSTRICT, Move.ACID, Move.TOXIC_SPIKES, Move.BUBBLEBEAM, Move.WRAP, Move.ACID_SPRAY, Move.BARRIER, Move.WATER_PULSE, Move.POISON_JAB, Move.SCREECH, Move.HEX, Move.HYDRO_PUMP, Move.SLUDGE_WAVE, Move.WRING_OUT}), Type.WATER, Type.POISON),
        TENTACRUEL("Tentacruel", "073", (short)60, new short[] {80, 70, 65, 80, 120, 100}, (byte)180, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 34, 38, 43, 47, 52, 56, 61}, new Move[] {Move.POISON_STING, Move.SUPERSONIC, Move.CONSTRICT, Move.SUPERSONIC, Move.CONSTRICT, Move.ACID, Move.TOXIC_SPIKES, Move.BUBBLEBEAM, Move.WRAP, Move.ACID_SPRAY, Move.BARRIER, Move.WATER_PULSE, Move.POISON_JAB, Move.SCREECH, Move.HEX, Move.HYDRO_PUMP, Move.SLUDGE_WAVE, Move.WRING_OUT}), Type.WATER, Type.POISON),
        GEODUDE("Geodude", "074", (short)255, new short[] {40, 80, 100, 30, 30, 20}, (byte)73, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 39, 43, 46, 50}, new Move[] {Move.TACKLE, Move.DEFENSE_CURL, Move.MUD_SPORT, Move.ROCK_POLISH, Move.ROCK_THROW, Move.MAGNITUDE, Move.ROLLOUT, Move.ROCK_BLAST, Move.SMACK_DOWN, Move.SELFDESTRUCT, Move.BULLDOZE, Move.STEALTH_ROCK, Move.EARTHQUAKE, Move.EXPLOSION, Move.DOUBLE_EDGE, Move.STONE_EDGE}), Type.ROCK, Type.GROUND),
        GRAVELER("Graveler", "075", (short)120, new short[] {55, 95, 115, 45, 45, 35}, (byte)134, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 8, 11, 15, 18, 22, 27, 31, 36, 42, 47, 53, 58, 64}, new Move[] {Move.TACKLE, Move.DEFENSE_CURL, Move.MUD_SPORT, Move.ROCK_POLISH, Move.MUD_SPORT, Move.ROCK_POLISH, Move.ROCK_THROW, Move.MAGNITUDE, Move.ROLLOUT, Move.ROCK_BLAST, Move.SMACK_DOWN, Move.SELFDESTRUCT, Move.BULLDOZE, Move.STEALTH_ROCK, Move.EARTHQUAKE, Move.EXPLOSION, Move.DOUBLE_EDGE, Move.STONE_EDGE}), Type.ROCK, Type.GROUND),
        GOLEM("Golem", "076", (short)45, new short[] {80, 110, 130, 55, 65, 45}, (byte)218, new byte[] {0, 0, 3, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 8, 11, 15, 18, 22, 27, 31, 36, 42, 47, 53, 58, 64, 69}, new Move[] {Move.TACKLE, Move.DEFENSE_CURL, Move.MUD_SPORT, Move.ROCK_POLISH, Move.MUD_SPORT, Move.ROCK_POLISH, Move.ROCK_THROW, Move.MAGNITUDE, Move.STEAMROLLER, Move.ROCK_BLAST, Move.SMACK_DOWN, Move.SELFDESTRUCT, Move.BULLDOZE, Move.STEALTH_ROCK, Move.EARTHQUAKE, Move.EXPLOSION, Move.DOUBLE_EDGE, Move.STONE_EDGE, Move.HEAVY_SLAM}), Type.ROCK, Type.GROUND),
        PONYTA("Ponyta", "077", (short)190, new short[] {50, 85, 55, 65, 65, 90}, (byte)82, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 4, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49}, new Move[] {Move.GROWL, Move.TACKLE, Move.TAIL_WHIP, Move.EMBER, Move.FLAME_WHEEL, Move.STOMP, Move.FLAME_CHARGE, Move.FIRE_SPIN, Move.TAKE_DOWN, Move.INFERNO, Move.AGILITY, Move.FIRE_BLAST, Move.BOUNCE, Move.FLARE_BLITZ}), Type.FIRE),
        RAPIDASH("Rapidash", "078", (short)60, new short[] {65, 100, 70, 80, 80, 105}, (byte)175, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 4, 9, 13, 17, 21, 25, 29, 33, 37, 40, 41, 45, 49}, new Move[] {Move.POISON_JAB, Move.MEGAHORN, Move.GROWL, Move.QUICK_ATTACK, Move.TAIL_WHIP, Move.EMBER, Move.TAIL_WHIP, Move.EMBER, Move.FLAME_WHEEL, Move.STOMP, Move.FLAME_CHARGE, Move.FIRE_SPIN, Move.TAKE_DOWN, Move.INFERNO, Move.AGILITY, Move.FURY_ATTACK, Move.FIRE_BLAST, Move.BOUNCE, Move.FLARE_BLITZ}), Type.FIRE),
        SLOWPOKE("Slowpoke", "079", (short)190, new short[] {90, 65, 65, 40, 40, 15}, (byte)63, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 9, 14, 19, 23, 28, 32, 36, 41, 45, 49, 54, 58}, new Move[] {Move.CURSE, Move.YAWN, Move.TACKLE, Move.GROWL, Move.WATER_GUN, Move.CONFUSION, Move.DISABLE, Move.HEADBUTT, Move.WATER_PULSE, Move.ZEN_HEADBUTT, Move.SLACK_OFF, Move.AMNESIA, Move.PSYCHIC, Move.RAIN_DANCE, Move.PSYCH_UP, Move.HEAL_PULSE}), Type.WATER, Type.PSYCHIC),
        SLOWBRO("Slowbro", "080", (short)75, new short[] {95, 75, 110, 100, 80, 30}, (byte)172, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 5, 9, 14, 19, 23, 28, 32, 36, 37, 43, 49, 55, 62, 68}, new Move[] {Move.CURSE, Move.YAWN, Move.TACKLE, Move.GROWL, Move.GROWL, Move.WATER_GUN, Move.CONFUSION, Move.DISABLE, Move.HEADBUTT, Move.WATER_PULSE, Move.ZEN_HEADBUTT, Move.SLACK_OFF, Move.WITHDRAW, Move.AMNESIA, Move.PSYCHIC, Move.RAIN_DANCE, Move.PSYCH_UP, Move.HEAL_PULSE}), Type.WATER, Type.PSYCHIC),
        MAGNEMITE("Magnemite", "081", (short)190, new short[] {25, 35, 70, 95, 55, 45}, (byte)65, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 7, 11, 15, 18, 21, 25, 29, 32, 35, 39, 43, 46, 49, 53, 57}, new Move[] {Move.TACKLE, Move.SUPERSONIC, Move.THUNDERSHOCK, Move.SONICBOOM, Move.THUNDER_WAVE, Move.MAGNET_BOMB, Move.SPARK, Move.MIRROR_SHOT, Move.METAL_SOUND, Move.ELECTRO_BALL, Move.FLASH_CANNON, Move.SCREECH, Move.DISCHARGE, Move.LOCK_ON, Move.MAGNET_RISE, Move.GYRO_BALL, Move.ZAP_CANNON}), Type.ELECTRIC, Type.STEEL),
        MAGNETON("Magneton", "082", (short)60, new short[] {50, 60, 95, 120, 70, 70}, (byte)163, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 4, 7, 11, 15, 18, 21, 25, 29, 34, 39, 45, 51, 56, 62, 67, 73}, new Move[] {Move.TRI_ATTACK, Move.TACKLE, Move.THUNDERSHOCK, Move.SUPERSONIC, Move.SONICBOOM, Move.SUPERSONIC, Move.THUNDERSHOCK, Move.SONICBOOM, Move.THUNDER_WAVE, Move.MAGNET_BOMB, Move.SPARK, Move.MIRROR_SHOT, Move.METAL_SOUND, Move.ELECTRO_BALL, Move.FLASH_CANNON, Move.SCREECH, Move.DISCHARGE, Move.LOCK_ON, Move.MAGNET_RISE, Move.GYRO_BALL, Move.ZAP_CANNON}), Type.ELECTRIC, Type.STEEL),
        FARFETCH_D("Farfetch%27d", "083", (short)45, new short[] {52, 65, 55, 58, 62, 60}, (byte)123, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 7, 9, 13, 19, 21, 25, 31, 33, 37, 43, 45, 49, 55}, new Move[] {Move.POISON_JAB, Move.PECK, Move.SAND_ATTACK, Move.LEER, Move.FURY_CUTTER, Move.FURY_ATTACK, Move.KNOCK_OFF, Move.AERIAL_ACE, Move.SLASH, Move.AIR_CUTTER, Move.SWORDS_DANCE, Move.AGILITY, Move.NIGHT_SLASH, Move.ACROBATICS, Move.FEINT, Move.FALSE_SWIPE, Move.AIR_SLASH, Move.BRAVE_BIRD}), Type.NORMAL, Type.FLYING),
        DODUO("Doduo", "084", (short)190, new short[] {35, 85, 45, 35, 35, 75}, (byte)62, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 10, 14, 19, 23, 28, 32, 37, 41, 46, 50}, new Move[] {Move.PECK, Move.GROWL, Move.QUICK_ATTACK, Move.RAGE, Move.FURY_ATTACK, Move.PURSUIT, Move.UPROAR, Move.ACUPRESSURE, Move.DOUBLE_HIT, Move.AGILITY, Move.DRILL_PECK, Move.ENDEAVOR, Move.THRASH}), Type.NORMAL, Type.FLYING),
        DODRIO("Dodrio", "085", (short)45, new short[] {60, 110, 70, 60, 60, 100}, (byte)161, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 10, 14, 19, 23, 28, 34, 41, 47, 54, 60}, new Move[] {Move.PLUCK, Move.PECK, Move.GROWL, Move.QUICK_ATTACK, Move.RAGE, Move.QUICK_ATTACK, Move.RAGE, Move.FURY_ATTACK, Move.PURSUIT, Move.UPROAR, Move.ACUPRESSURE, Move.TRI_ATTACK, Move.AGILITY, Move.DRILL_PECK, Move.ENDEAVOR, Move.THRASH}), Type.NORMAL, Type.FLYING),
        SEEL("Seel", "086", (short)190, new short[] {65, 45, 55, 45, 70, 45}, (byte)65, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 3, 7, 11, 13, 17, 21, 23, 27, 31, 33, 37, 41, 43, 47, 51, 53}, new Move[] {Move.HEADBUTT, Move.GROWL, Move.WATER_SPORT, Move.ICY_WIND, Move.ENCORE, Move.ICE_SHARD, Move.REST, Move.AQUA_RING, Move.AURORA_BEAM, Move.AQUA_JET, Move.BRINE, Move.TAKE_DOWN, Move.DIVE, Move.AQUA_TAIL, Move.ICE_BEAM, Move.SAFEGUARD, Move.HAIL}), Type.WATER),
        DEWGONG("Dewgong", "087", (short)75, new short[] {90, 70, 80, 70, 95, 70}, (byte)166, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 3, 7, 11, 13, 17, 21, 23, 27, 31, 33, 34, 39, 45, 49, 55, 61, 65}, new Move[] {Move.HEADBUTT, Move.GROWL, Move.SIGNAL_BEAM, Move.ICY_WIND, Move.GROWL, Move.SIGNAL_BEAM, Move.ICY_WIND, Move.ENCORE, Move.ICE_SHARD, Move.REST, Move.AQUA_RING, Move.AURORA_BEAM, Move.AQUA_JET, Move.BRINE, Move.SHEER_COLD, Move.TAKE_DOWN, Move.DIVE, Move.AQUA_TAIL, Move.ICE_BEAM, Move.SAFEGUARD, Move.HAIL}), Type.WATER, Type.ICE),
        GRIMER("Grimer", "088", (short)190, new short[] {80, 80, 50, 40, 50, 25}, (byte)65, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 4, 7, 12, 15, 18, 21, 26, 29, 32, 37, 40, 43, 48}, new Move[] {Move.POISON_GAS, Move.POUND, Move.HARDEN, Move.MUD_SLAP, Move.DISABLE, Move.SLUDGE, Move.MINIMIZE, Move.MUD_BOMB, Move.SLUDGE_BOMB, Move.FLING, Move.SCREECH, Move.SLUDGE_WAVE, Move.ACID_ARMOR, Move.GUNK_SHOT, Move.MEMENTO}), Type.POISON),
        MUK("Muk", "089", (short)75, new short[] {105, 105, 75, 65, 100, 50}, (byte)175, new byte[] {1, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 12, 15, 18, 21, 26, 29, 32, 37, 43, 49, 57}, new Move[] {Move.POISON_GAS, Move.POUND, Move.HARDEN, Move.MUD_SLAP, Move.HARDEN, Move.MUD_SLAP, Move.DISABLE, Move.SLUDGE, Move.MINIMIZE, Move.MUD_BOMB, Move.SLUDGE_BOMB, Move.FLING, Move.SCREECH, Move.SLUDGE_WAVE, Move.ACID_ARMOR, Move.GUNK_SHOT, Move.MEMENTO}), Type.POISON),
        SHELLDER("Shellder", "090", (short)190, new short[] {30, 65, 100, 45, 25, 40}, (byte)61, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 4, 8, 13, 16, 20, 25, 28, 32, 37, 40, 44, 49, 52, 56, 61}, new Move[] {Move.TACKLE, Move.WITHDRAW, Move.SUPERSONIC, Move.ICICLE_SPEAR, Move.PROTECT, Move.LEER, Move.CLAMP, Move.ICE_SHARD, Move.RAZOR_SHELL, Move.AURORA_BEAM, Move.WHIRLPOOL, Move.BRINE, Move.IRON_DEFENSE, Move.ICE_BEAM, Move.SHELL_SMASH, Move.HYDRO_PUMP}), Type.WATER),
        CLOYSTER("Cloyster", "091", (short)60, new short[] {50, 95, 180, 85, 45, 70}, (byte)184, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 13, 28, 52}, new Move[] {Move.TOXIC_SPIKES, Move.WITHDRAW, Move.SUPERSONIC, Move.PROTECT, Move.AURORA_BEAM, Move.SPIKE_CANNON, Move.SPIKES, Move.ICICLE_CRASH}), Type.WATER, Type.ICE),
        GASTLY("Gastly", "092", (short)190, new short[] {30, 35, 30, 100, 35, 80}, (byte)62, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 33, 36, 40, 43, 47}, new Move[] {Move.HYPNOSIS, Move.LICK, Move.SPITE, Move.MEAN_LOOK, Move.CURSE, Move.NIGHT_SHADE, Move.CONFUSE_RAY, Move.SUCKER_PUNCH, Move.PAYBACK, Move.SHADOW_BALL, Move.DREAM_EATER, Move.DARK_PULSE, Move.DESTINY_BOND, Move.HEX, Move.NIGHTMARE}), Type.GHOST, Type.POISON),
        HAUNTER("Haunter", "093", (short)90, new short[] {45, 50, 45, 115, 55, 95}, (byte)142, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 5, 8, 12, 15, 19, 22, 25, 28, 33, 39, 44, 50, 55, 61}, new Move[] {Move.HYPNOSIS, Move.LICK, Move.SPITE, Move.SPITE, Move.MEAN_LOOK, Move.CURSE, Move.NIGHT_SHADE, Move.CONFUSE_RAY, Move.SUCKER_PUNCH, Move.SHADOW_PUNCH, Move.PAYBACK, Move.SHADOW_BALL, Move.DREAM_EATER, Move.DARK_PULSE, Move.DESTINY_BOND, Move.HEX, Move.NIGHTMARE}), Type.GHOST, Type.POISON),
        GENGAR("Gengar", "094", (short)45, new short[] {60, 65, 60, 130, 75, 110}, (byte)225, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 5, 8, 12, 15, 19, 22, 25, 28, 33, 39, 44, 50, 55, 61}, new Move[] {Move.HYPNOSIS, Move.LICK, Move.SPITE, Move.SPITE, Move.MEAN_LOOK, Move.CURSE, Move.NIGHT_SHADE, Move.CONFUSE_RAY, Move.SUCKER_PUNCH, Move.SHADOW_PUNCH, Move.PAYBACK, Move.SHADOW_BALL, Move.DREAM_EATER, Move.DARK_PULSE, Move.DESTINY_BOND, Move.HEX, Move.NIGHTMARE}), Type.GHOST, Type.POISON),
        ONIX("Onix", "095", (short)45, new short[] {35, 45, 160, 30, 45, 70}, (byte)108, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52}, new Move[] {Move.MUD_SPORT, Move.TACKLE, Move.HARDEN, Move.BIND, Move.CURSE, Move.ROCK_THROW, Move.RAGE, Move.ROCK_TOMB, Move.STEALTH_ROCK, Move.ROCK_POLISH, Move.SMACK_DOWN, Move.DRAGONBREATH, Move.SLAM, Move.SCREECH, Move.ROCK_SLIDE, Move.SAND_TOMB, Move.IRON_TAIL, Move.DIG, Move.STONE_EDGE, Move.DOUBLE_EDGE, Move.SANDSTORM}), Type.ROCK, Type.GROUND),
        DROWZEE("Drowzee", "096", (short)190, new short[] {60, 48, 45, 43, 90, 42}, (byte)66, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57, 61}, new Move[] {Move.POUND, Move.HYPNOSIS, Move.DISABLE, Move.CONFUSION, Move.HEADBUTT, Move.POISON_GAS, Move.MEDITATE, Move.PSYBEAM, Move.HEADBUTT, Move.PSYCH_UP, Move.SYNCHRONOISE, Move.ZEN_HEADBUTT, Move.SWAGGER, Move.PSYCHIC, Move.NASTY_PLOT, Move.PSYSHOCK, Move.FUTURE_SIGHT}), Type.PSYCHIC),
        HYPNO("Hypno", "097", (short)75, new short[] {85, 73, 70, 73, 115, 67}, (byte)169, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57, 61}, new Move[] {Move.NIGHTMARE, Move.SWITCHEROO, Move.POUND, Move.HYPNOSIS, Move.DISABLE, Move.CONFUSION, Move.DISABLE, Move.CONFUSION, Move.HEADBUTT, Move.POISON_GAS, Move.MEDITATE, Move.PSYBEAM, Move.HEADBUTT, Move.PSYCH_UP, Move.SYNCHRONOISE, Move.ZEN_HEADBUTT, Move.SWAGGER, Move.PSYCHIC, Move.NASTY_PLOT, Move.PSYSHOCK, Move.FUTURE_SIGHT}), Type.PSYCHIC),
        KRABBY("Krabby", "098", (short)225, new short[] {30, 105, 90, 25, 25, 50}, (byte)65, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 9, 11, 15, 19, 21, 25, 29, 31, 35, 39, 41, 45}, new Move[] {Move.MUD_SPORT, Move.BUBBLE, Move.VICEGRIP, Move.LEER, Move.HARDEN, Move.BUBBLEBEAM, Move.MUD_SHOT, Move.METAL_CLAW, Move.STOMP, Move.PROTECT, Move.GUILLOTINE, Move.SLAM, Move.BRINE, Move.CRABHAMMER, Move.FLAIL}), Type.WATER),
        KINGLER("Kingler", "099", (short)60, new short[] {55, 130, 115, 50, 50, 75}, (byte)166, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 9, 11, 15, 19, 21, 25, 32, 37, 44, 51, 56, 63}, new Move[] {Move.WIDE_GUARD, Move.MUD_SPORT, Move.BUBBLE, Move.VICEGRIP, Move.LEER, Move.VICEGRIP, Move.LEER, Move.HARDEN, Move.BUBBLEBEAM, Move.MUD_SHOT, Move.METAL_CLAW, Move.STOMP, Move.PROTECT, Move.GUILLOTINE, Move.SLAM, Move.BRINE, Move.CRABHAMMER, Move.FLAIL}), Type.WATER),
        VOLTORB("Voltorb", "100", (short)190, new short[] {40, 30, 50, 55, 55, 100}, (byte)66, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 5, 8, 12, 15, 19, 22, 26, 29, 33, 36, 40, 43, 47, 50}, new Move[] {Move.CHARGE, Move.TACKLE, Move.SONICBOOM, Move.SPARK, Move.ROLLOUT, Move.SCREECH, Move.CHARGE_BEAM, Move.LIGHT_SCREEN, Move.ELECTRO_BALL, Move.SELFDESTRUCT, Move.SWIFT, Move.MAGNET_RISE, Move.GYRO_BALL, Move.EXPLOSION, Move.MIRROR_COAT}), Type.ELECTRIC),
        ELECTRODE("Electrode", "101", (short)60, new short[] {60, 50, 70, 80, 80, 140}, (byte)168, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 35, 40, 46, 51, 57, 62}, new Move[] {Move.CHARGE, Move.TACKLE, Move.SONICBOOM, Move.SPARK, Move.TACKLE, Move.SONICBOOM, Move.SPARK, Move.ROLLOUT, Move.SCREECH, Move.CHARGE_BEAM, Move.LIGHT_SCREEN, Move.ELECTRO_BALL, Move.SELFDESTRUCT, Move.SWIFT, Move.MAGNET_RISE, Move.GYRO_BALL, Move.EXPLOSION, Move.MIRROR_COAT}), Type.ELECTRIC),
        EXEGGCUTE("Exeggcute", "102", (short)90, new short[] {60, 40, 80, 60, 45, 40}, (byte)65, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 7, 11, 17, 19, 21, 23, 27, 33, 37, 43, 47, 53, -1}, new Move[] {Move.BARRAGE, Move.UPROAR, Move.HYPNOSIS, Move.REFLECT, Move.LEECH_SEED, Move.BULLET_SEED, Move.STUN_SPORE, Move.POISONPOWDER, Move.SLEEP_POWDER, Move.CONFUSION, Move.WORRY_SEED, Move.NATURAL_GIFT, Move.SOLARBEAM, Move.EXTRASENSORY, Move.BESTOW, Move.PSYCHIC}), Type.GRASS, Type.PSYCHIC),
        EXEGGUTOR("Exeggutor", "103", (short)45, new short[] {95, 95, 85, 125, 65, 55}, (byte)182, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 17, 27, 37, 47}, new Move[] {Move.SEED_BOMB, Move.BARRAGE, Move.HYPNOSIS, Move.CONFUSION, Move.STOMP, Move.PSYSHOCK, Move.EGG_BOMB, Move.WOOD_HAMMER, Move.LEAF_STORM}), Type.GRASS, Type.PSYCHIC),
        CUBONE("Cubone", "104", (short)190, new short[] {50, 50, 95, 40, 50, 35}, (byte)64, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 3, 7, 11, 13, 17, 21, 23, 27, 31, 33, 37, 41, 43, 47}, new Move[] {Move.GROWL, Move.TAIL_WHIP, Move.BONE_CLUB, Move.HEADBUTT, Move.LEER, Move.FOCUS_ENERGY, Move.BONEMERANG, Move.RAGE, Move.FALSE_SWIPE, Move.THRASH, Move.FLING, Move.BONE_RUSH, Move.ENDEAVOR, Move.DOUBLE_EDGE, Move.RETALIATE}), Type.GROUND),
        MAROWAK("Marowak", "105", (short)75, new short[] {60, 80, 110, 50, 80, 45}, (byte)149, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 3, 7, 11, 13, 17, 21, 23, 27, 33, 37, 43, 49, 53, 59}, new Move[] {Move.GROWL, Move.TAIL_WHIP, Move.BONE_CLUB, Move.HEADBUTT, Move.TAIL_WHIP, Move.BONE_CLUB, Move.HEADBUTT, Move.LEER, Move.FOCUS_ENERGY, Move.BONEMERANG, Move.RAGE, Move.FALSE_SWIPE, Move.THRASH, Move.FLING, Move.BONE_RUSH, Move.ENDEAVOR, Move.DOUBLE_EDGE, Move.RETALIATE}), Type.GROUND),
        HITMONLEE("Hitmonlee", "106", (short)45, new short[] {50, 120, 53, 35, 110, 87}, (byte)159, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57, 61}, new Move[] {Move.REVENGE, Move.DOUBLE_KICK, Move.MEDITATE, Move.ROLLING_KICK, Move.JUMP_KICK, Move.BRICK_BREAK, Move.FOCUS_ENERGY, Move.FEINT, Move.HI_JUMP_KICK, Move.MIND_READER, Move.FORESIGHT, Move.WIDE_GUARD, Move.BLAZE_KICK, Move.ENDURE, Move.MEGA_KICK, Move.CLOSE_COMBAT, Move.REVERSAL}), Type.FIGHTING),
        HITMONCHAN("Hitmonchan", "107", (short)45, new short[] {50, 105, 79, 35, 110, 76}, (byte)159, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 6, 11, 16, 16, 21, 26, 31, 36, 36, 36, 41, 46, 51, 56, 61, 66}, new Move[] {Move.REVENGE, Move.COMET_PUNCH, Move.AGILITY, Move.PURSUIT, Move.MACH_PUNCH, Move.BULLET_PUNCH, Move.FEINT, Move.VACUUM_WAVE, Move.QUICK_GUARD, Move.THUNDERPUNCH, Move.ICE_PUNCH, Move.FIRE_PUNCH, Move.SKY_UPPERCUT, Move.MEGA_PUNCH, Move.DETECT, Move.FOCUS_PUNCH, Move.COUNTER, Move.CLOSE_COMBAT}), Type.FIGHTING),
        LICKITUNG("Lickitung", "108", (short)45, new short[] {90, 55, 75, 60, 75, 30}, (byte)77, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57}, new Move[] {Move.LICK, Move.SUPERSONIC, Move.DEFENSE_CURL, Move.KNOCK_OFF, Move.WRAP, Move.STOMP, Move.DISABLE, Move.SLAM, Move.ROLLOUT, Move.CHIP_AWAY, Move.ME_FIRST, Move.REFRESH, Move.SCREECH, Move.POWER_WHIP, Move.WRING_OUT}), Type.NORMAL),
        KOFFING("Koffing", "109", (short)190, new short[] {40, 65, 95, 60, 45, 35}, (byte)68, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 4, 7, 12, 15, 18, 23, 26, 29, 34, 37, 40, 45}, new Move[] {Move.POISON_GAS, Move.TACKLE, Move.SMOG, Move.SMOKESCREEN, Move.ASSURANCE, Move.CLEAR_SMOG, Move.SLUDGE, Move.SELFDESTRUCT, Move.HAZE, Move.GYRO_BALL, Move.SLUDGE_BOMB, Move.EXPLOSION, Move.DESTINY_BOND, Move.MEMENTO}), Type.POISON),
        WEEZING("Weezing", "110", (short)60, new short[] {65, 90, 120, 85, 70, 60}, (byte)172, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 12, 15, 18, 23, 26, 29, 34, 40, 46, 54}, new Move[] {Move.POISON_GAS, Move.TACKLE, Move.SMOG, Move.SMOKESCREEN, Move.SMOG, Move.SMOKESCREEN, Move.ASSURANCE, Move.CLEAR_SMOG, Move.SLUDGE, Move.SELFDESTRUCT, Move.HAZE, Move.DOUBLE_HIT, Move.SLUDGE_BOMB, Move.EXPLOSION, Move.DESTINY_BOND, Move.MEMENTO}), Type.POISON),
        RHYHORN("Rhyhorn", "111", (short)120, new short[] {80, 85, 95, 30, 30, 25}, (byte)69, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 8, 12, 19, 23, 30, 34, 41, 45, 52, 56, 63, 67}, new Move[] {Move.HORN_ATTACK, Move.TAIL_WHIP, Move.STOMP, Move.FURY_ATTACK, Move.SCARY_FACE, Move.ROCK_BLAST, Move.BULLDOZE, Move.CHIP_AWAY, Move.TAKE_DOWN, Move.DRILL_RUN, Move.STONE_EDGE, Move.EARTHQUAKE, Move.HORN_DRILL, Move.MEGAHORN}), Type.GROUND, Type.ROCK),
        RHYDON("Rhydon", "112", (short)60, new short[] {105, 130, 120, 45, 45, 40}, (byte)170, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 9, 12, 19, 23, 30, 34, 41, 42, 47, 56, 62, 71, 77}, new Move[] {Move.HORN_ATTACK, Move.TAIL_WHIP, Move.STOMP, Move.FURY_ATTACK, Move.STOMP, Move.FURY_ATTACK, Move.SCARY_FACE, Move.ROCK_BLAST, Move.BULLDOZE, Move.CHIP_AWAY, Move.TAKE_DOWN, Move.HAMMER_ARM, Move.DRILL_RUN, Move.STONE_EDGE, Move.EARTHQUAKE, Move.HORN_DRILL, Move.MEGAHORN}), Type.GROUND, Type.ROCK),
        CHANSEY("Chansey", "113", (short)30, new short[] {250, 5, 5, 35, 105, 50}, (byte)395, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.FEMALE_ONLY, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 5, 9, 12, 16, 20, 23, 27, 31, 34, 38, 42, 46, 50, 54}, new Move[] {Move.DEFENSE_CURL, Move.POUND, Move.GROWL, Move.TAIL_WHIP, Move.REFRESH, Move.DOUBLESLAP, Move.SOFTBOILED, Move.BESTOW, Move.MINIMIZE, Move.TAKE_DOWN, Move.SING, Move.FLING, Move.HEAL_PULSE, Move.EGG_BOMB, Move.LIGHT_SCREEN, Move.HEALING_WISH, Move.DOUBLE_EDGE}), Type.NORMAL),
        TANGELA("Tangela", "114", (short)45, new short[] {65, 55, 115, 100, 40, 60}, (byte)87, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 4, 7, 10, 14, 17, 20, 23, 27, 30, 33, 36, 40, 43, 46, 49, 53}, new Move[] {Move.INGRAIN, Move.CONSTRICT, Move.SLEEP_POWDER, Move.VINE_WHIP, Move.ABSORB, Move.POISONPOWDER, Move.BIND, Move.GROWTH, Move.MEGA_DRAIN, Move.KNOCK_OFF, Move.STUN_SPORE, Move.NATURAL_GIFT, Move.GIGA_DRAIN, Move.ANCIENTPOWER, Move.SLAM, Move.TICKLE, Move.WRING_OUT, Move.POWER_WHIP}), Type.GRASS),
        KANGASKHAN("Kangaskhan", "115", (short)45, new short[] {105, 95, 80, 40, 80, 90}, (byte)172, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.FEMALE_ONLY, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 7, 10, 13, 19, 22, 25, 31, 34, 37, 43, 46, 49, 55}, new Move[] {Move.COMET_PUNCH, Move.LEER, Move.FAKE_OUT, Move.TAIL_WHIP, Move.BITE, Move.DOUBLE_HIT, Move.RAGE, Move.MEGA_PUNCH, Move.CHIP_AWAY, Move.DIZZY_PUNCH, Move.CRUNCH, Move.ENDURE, Move.OUTRAGE, Move.SUCKER_PUNCH, Move.REVERSAL}), Type.NORMAL),
        HORSEA("Horsea", "116", (short)225, new short[] {30, 40, 70, 70, 25, 60}, (byte)59, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 8, 11, 14, 18, 23, 26, 30, 35, 38, 42}, new Move[] {Move.BUBBLE, Move.SMOKESCREEN, Move.LEER, Move.WATER_GUN, Move.FOCUS_ENERGY, Move.BUBBLEBEAM, Move.AGILITY, Move.TWISTER, Move.BRINE, Move.HYDRO_PUMP, Move.DRAGON_DANCE, Move.DRAGON_PULSE}), Type.WATER),
        SEADRA("Seadra", "117", (short)75, new short[] {55, 65, 95, 95, 45, 85}, (byte)154, new byte[] {0, 0, 1, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 4, 8, 11, 14, 18, 23, 26, 30, 40, 48, 57}, new Move[] {Move.BUBBLE, Move.SMOKESCREEN, Move.LEER, Move.WATER_GUN, Move.SMOKESCREEN, Move.LEER, Move.WATER_GUN, Move.FOCUS_ENERGY, Move.BUBBLEBEAM, Move.AGILITY, Move.TWISTER, Move.BRINE, Move.HYDRO_PUMP, Move.DRAGON_DANCE, Move.DRAGON_PULSE}), Type.WATER),
        GOLDEEN("Goldeen", "118", (short)225, new short[] {45, 67, 60, 35, 50, 63}, (byte)64, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 7, 11, 17, 21, 27, 31, 37, 41, 47, 51, 57}, new Move[] {Move.PECK, Move.TAIL_WHIP, Move.WATER_SPORT, Move.SUPERSONIC, Move.HORN_ATTACK, Move.WATER_PULSE, Move.FLAIL, Move.AQUA_RING, Move.FURY_ATTACK, Move.WATERFALL, Move.HORN_DRILL, Move.AGILITY, Move.SOAK, Move.MEGAHORN}), Type.WATER),
        SEAKING("Seaking", "119", (short)60, new short[] {80, 92, 65, 65, 80, 68}, (byte)158, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 7, 11, 17, 21, 27, 31, 40, 47, 56, 63, 72}, new Move[] {Move.POISON_JAB, Move.PECK, Move.TAIL_WHIP, Move.WATER_SPORT, Move.SUPERSONIC, Move.SUPERSONIC, Move.HORN_ATTACK, Move.WATER_PULSE, Move.FLAIL, Move.AQUA_RING, Move.FURY_ATTACK, Move.WATERFALL, Move.HORN_DRILL, Move.AGILITY, Move.SOAK, Move.MEGAHORN}), Type.WATER),
        STARYU("Staryu", "120", (short)225, new short[] {30, 45, 55, 70, 55, 85}, (byte)68, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 6, 10, 12, 15, 18, 22, 25, 30, 33, 36, 40, 43, 48, 52}, new Move[] {Move.TACKLE, Move.HARDEN, Move.WATER_GUN, Move.RAPID_SPIN, Move.RECOVER, Move.CAMOUFLAGE, Move.SWIFT, Move.BUBBLEBEAM, Move.MINIMIZE, Move.GYRO_BALL, Move.LIGHT_SCREEN, Move.BRINE, Move.REFLECT_TYPE, Move.POWER_GEM, Move.COSMIC_POWER, Move.HYDRO_PUMP}), Type.WATER),
        STARMIE("Starmie", "121", (short)60, new short[] {60, 75, 85, 100, 85, 115}, (byte)182, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 22}, new Move[] {Move.WATER_GUN, Move.RAPID_SPIN, Move.RECOVER, Move.SWIFT, Move.CONFUSE_RAY}), Type.WATER, Type.PSYCHIC),
        MR_MIME("Mr. Mime", "122", (short)45, new short[] {40, 45, 65, 100, 120, 90}, (byte)161, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 4, 8, 11, 15, 15, 18, 22, 22, 25, 29, 32, 36, 39, 43, 46, 50}, new Move[] {Move.MAGICAL_LEAF, Move.QUICK_GUARD, Move.WIDE_GUARD, Move.POWER_SWAP, Move.GUARD_SWAP, Move.BARRIER, Move.CONFUSION, Move.COPYCAT, Move.MEDITATE, Move.DOUBLESLAP, Move.MIMIC, Move.PSYWAVE, Move.ENCORE, Move.LIGHT_SCREEN, Move.REFLECT, Move.PSYBEAM, Move.SUBSTITUTE, Move.RECYCLE, Move.TRICK, Move.PSYCHIC, Move.ROLE_PLAY, Move.BATON_PASS, Move.SAFEGUARD}), Type.PSYCHIC),
        SCYTHER("Scyther", "123", (short)45, new short[] {70, 110, 80, 55, 80, 105}, (byte)100, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57, 61}, new Move[] {Move.VACUUM_WAVE, Move.QUICK_ATTACK, Move.LEER, Move.FOCUS_ENERGY, Move.PURSUIT, Move.FALSE_SWIPE, Move.AGILITY, Move.WING_ATTACK, Move.FURY_CUTTER, Move.SLASH, Move.RAZOR_WIND, Move.DOUBLE_TEAM, Move.X_SCISSOR, Move.NIGHT_SLASH, Move.DOUBLE_HIT, Move.AIR_SLASH, Move.SWORDS_DANCE, Move.FEINT}), Type.BUG, Type.FLYING),
        JYNX("Jynx", "124", (short)45, new short[] {65, 50, 35, 115, 95, 95}, (byte)159, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.FEMALE_ONLY, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 5, 8, 11, 15, 18, 21, 25, 28, 33, 39, 44, 49, 55, 60}, new Move[] {Move.POUND, Move.LICK, Move.LOVELY_KISS, Move.POWDER_SNOW, Move.LICK, Move.LOVELY_KISS, Move.POWDER_SNOW, Move.DOUBLESLAP, Move.ICE_PUNCH, Move.HEART_STAMP, Move.MEAN_LOOK, Move.FAKE_TEARS, Move.WAKE_UP_SLAP, Move.AVALANCHE, Move.BODY_SLAM, Move.WRING_OUT, Move.PERISH_SONG, Move.BLIZZARD}), Type.ICE, Type.PSYCHIC),
        ELECTABUZZ("Electabuzz", "125", (short)45, new short[] {65, 83, 57, 95, 85, 105}, (byte)172, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 36, 42, 49, 55}, new Move[] {Move.QUICK_ATTACK, Move.LEER, Move.THUNDERSHOCK, Move.THUNDERSHOCK, Move.LOW_KICK, Move.SWIFT, Move.SHOCK_WAVE, Move.THUNDER_WAVE, Move.ELECTRO_BALL, Move.LIGHT_SCREEN, Move.THUNDERPUNCH, Move.DISCHARGE, Move.SCREECH, Move.THUNDERBOLT, Move.THUNDER}), Type.ELECTRIC),
        MAGMAR("Magmar", "126", (short)45, new short[] {65, 95, 57, 100, 85, 93}, (byte)173, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 36, 42, 49, 55}, new Move[] {Move.SMOG, Move.LEER, Move.EMBER, Move.EMBER, Move.SMOKESCREEN, Move.FAINT_ATTACK, Move.FIRE_SPIN, Move.CLEAR_SMOG, Move.FLAME_BURST, Move.CONFUSE_RAY, Move.FIRE_PUNCH, Move.LAVA_PLUME, Move.SUNNY_DAY, Move.FLAMETHROWER, Move.FIRE_BLAST}), Type.FIRE),
        PINSIR("Pinsir", "127", (short)45, new short[] {65, 125, 100, 55, 70, 85}, (byte)175, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 4, 8, 11, 15, 18, 22, 26, 29, 33, 36, 40, 43, 47}, new Move[] {Move.VICEGRIP, Move.FOCUS_ENERGY, Move.BIND, Move.SEISMIC_TOSS, Move.HARDEN, Move.REVENGE, Move.BRICK_BREAK, Move.VITAL_THROW, Move.SUBMISSION, Move.X_SCISSOR, Move.STORM_THROW, Move.THRASH, Move.SWORDS_DANCE, Move.SUPERPOWER, Move.GUILLOTINE}), Type.BUG),
        TAUROS("Tauros", "128", (short)45, new short[] {75, 100, 95, 40, 70, 110}, (byte)211, new byte[] {0, 1, 0, 0, 0, 1}, GenderRatio.MALE_ONLY, ExperienceGroup.SLOW,convertToMap(new int[] {0, 3, 5, 8, 11, 15, 19, 24, 29, 35, 41, 48, 55, 63}, new Move[] {Move.TACKLE, Move.TAIL_WHIP, Move.RAGE, Move.HORN_ATTACK, Move.SCARY_FACE, Move.PURSUIT, Move.REST, Move.PAYBACK, Move.WORK_UP, Move.ZEN_HEADBUTT, Move.TAKE_DOWN, Move.SWAGGER, Move.THRASH, Move.GIGA_IMPACT}), Type.NORMAL),
        MAGIKARP("Magikarp", "129", (short)255, new short[] {20, 10, 55, 15, 20, 80}, (byte)40, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 15, 30}, new Move[] {Move.SPLASH, Move.TACKLE, Move.FLAIL}), Type.WATER),
        GYARADOS("Gyarados", "130", (short)45, new short[] {95, 125, 79, 60, 100, 81}, (byte)189, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 20, 23, 26, 29, 32, 35, 38, 41, 44, 47}, new Move[] {Move.THRASH, Move.BITE, Move.DRAGON_RAGE, Move.LEER, Move.TWISTER, Move.ICE_FANG, Move.AQUA_TAIL, Move.RAIN_DANCE, Move.HYDRO_PUMP, Move.DRAGON_DANCE, Move.HYPER_BEAM}), Type.WATER, Type.FLYING),
        LAPRAS("Lapras", "131", (short)45, new short[] {130, 85, 80, 85, 95, 60}, (byte)187, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 4, 7, 10, 14, 18, 22, 27, 32, 37, 43, 49, 55}, new Move[] {Move.SING, Move.GROWL, Move.WATER_GUN, Move.MIST, Move.CONFUSE_RAY, Move.ICE_SHARD, Move.WATER_PULSE, Move.BODY_SLAM, Move.RAIN_DANCE, Move.PERISH_SONG, Move.ICE_BEAM, Move.BRINE, Move.SAFEGUARD, Move.HYDRO_PUMP, Move.SHEER_COLD}), Type.WATER, Type.ICE),
        DITTO("Ditto", "132", (short)35, new short[] {48, 48, 48, 48, 48, 48}, (byte)101, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0}, new Move[] {Move.TRANSFORM}), Type.NORMAL),
        EEVEE("Eevee", "133", (short)45, new short[] {55, 55, 50, 45, 65, 55}, (byte)65, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45}, new Move[] {Move.HELPING_HAND, Move.TACKLE, Move.TAIL_WHIP, Move.SAND_ATTACK, Move.GROWL, Move.QUICK_ATTACK, Move.BITE, Move.COVET, Move.TAKE_DOWN, Move.CHARM, Move.BATON_PASS, Move.DOUBLE_EDGE, Move.LAST_RESORT, Move.TRUMP_CARD}), Type.NORMAL),
        VAPOREON("Vaporeon", "134", (short)45, new short[] {130, 65, 60, 110, 95, 65}, (byte)184, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, -1}, new Move[] {Move.HELPING_HAND, Move.TACKLE, Move.TAIL_WHIP, Move.SAND_ATTACK, Move.WATER_GUN, Move.QUICK_ATTACK, Move.WATER_PULSE, Move.AURORA_BEAM, Move.AQUA_RING, Move.ACID_ARMOR, Move.HAZE, Move.MUDDY_WATER, Move.LAST_RESORT, Move.HYDRO_PUMP, Move.BITE}), Type.WATER),
        JOLTEON("Jolteon", "135", (short)45, new short[] {65, 65, 60, 110, 95, 130}, (byte)184, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45}, new Move[] {Move.HELPING_HAND, Move.TACKLE, Move.TAIL_WHIP, Move.SAND_ATTACK, Move.THUNDERSHOCK, Move.QUICK_ATTACK, Move.DOUBLE_KICK, Move.THUNDER_FANG, Move.PIN_MISSILE, Move.AGILITY, Move.THUNDER_WAVE, Move.DISCHARGE, Move.LAST_RESORT, Move.THUNDER}), Type.ELECTRIC),
        FLAREON("Flareon", "136", (short)45, new short[] {65, 130, 60, 95, 110, 65}, (byte)184, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45}, new Move[] {Move.HELPING_HAND, Move.TACKLE, Move.TAIL_WHIP, Move.SAND_ATTACK, Move.EMBER, Move.QUICK_ATTACK, Move.BITE, Move.FIRE_FANG, Move.FIRE_SPIN, Move.SCARY_FACE, Move.SMOG, Move.LAVA_PLUME, Move.LAST_RESORT, Move.FIRE_BLAST}), Type.FIRE),
        PORYGON("Porygon", "137", (short)45, new short[] {65, 60, 70, 85, 75, 40}, (byte)79, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 7, 12, 18, 23, 29, 34, 40, 45, 51, 56, 62}, new Move[] {Move.CONVERSION_2, Move.TACKLE, Move.CONVERSION, Move.SHARPEN, Move.PSYBEAM, Move.AGILITY, Move.RECOVER, Move.MAGNET_RISE, Move.SIGNAL_BEAM, Move.RECYCLE, Move.DISCHARGE, Move.LOCK_ON, Move.TRI_ATTACK, Move.MAGIC_COAT, Move.ZAP_CANNON}), Type.NORMAL),
        OMANYTE("Omanyte", "138", (short)45, new short[] {35, 40, 100, 90, 55, 35}, (byte)71, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 7, 10, 16, 19, 25, 28, 34, 37, 43, 46, 52, 55}, new Move[] {Move.CONSTRICT, Move.WITHDRAW, Move.BITE, Move.WATER_GUN, Move.ROLLOUT, Move.LEER, Move.MUD_SHOT, Move.BRINE, Move.PROTECT, Move.ANCIENTPOWER, Move.TICKLE, Move.ROCK_BLAST, Move.SHELL_SMASH, Move.HYDRO_PUMP}), Type.ROCK, Type.WATER),
        OMASTAR("Omastar", "139", (short)45, new short[] {70, 60, 125, 115, 70, 55}, (byte)173, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 7, 10, 16, 19, 25, 28, 34, 37, 40, 48, 56, 67, 75}, new Move[] {Move.CONSTRICT, Move.WITHDRAW, Move.BITE, Move.BITE, Move.WATER_GUN, Move.ROLLOUT, Move.LEER, Move.MUD_SHOT, Move.BRINE, Move.PROTECT, Move.ANCIENTPOWER, Move.SPIKE_CANNON, Move.TICKLE, Move.ROCK_BLAST, Move.SHELL_SMASH, Move.HYDRO_PUMP}), Type.ROCK, Type.WATER),
        KABUTO("Kabuto", "140", (short)45, new short[] {30, 80, 90, 55, 45, 55}, (byte)71, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 6, 11, 16, 21, 26, 31, 36, 41, 46, 51}, new Move[] {Move.SCRATCH, Move.HARDEN, Move.ABSORB, Move.LEER, Move.MUD_SHOT, Move.SAND_ATTACK, Move.ENDURE, Move.AQUA_JET, Move.MEGA_DRAIN, Move.METAL_SOUND, Move.ANCIENTPOWER, Move.WRING_OUT}), Type.ROCK, Type.WATER),
        KABUTOPS("Kabutops", "141", (short)45, new short[] {60, 115, 105, 65, 70, 80}, (byte)173, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 6, 11, 16, 21, 26, 31, 36, 40, 45, 54, 63, 72}, new Move[] {Move.FEINT, Move.SCRATCH, Move.HARDEN, Move.ABSORB, Move.LEER, Move.ABSORB, Move.LEER, Move.MUD_SHOT, Move.SAND_ATTACK, Move.ENDURE, Move.AQUA_JET, Move.MEGA_DRAIN, Move.SLASH, Move.METAL_SOUND, Move.ANCIENTPOWER, Move.WRING_OUT, Move.NIGHT_SLASH}), Type.ROCK, Type.WATER),
        AERODACTYL("Aerodactyl", "142", (short)45, new short[] {80, 105, 65, 60, 75, 130}, (byte)180, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 9, 17, 25, 33, 41, 49, 57, 65, 73, 81}, new Move[] {Move.ICE_FANG, Move.FIRE_FANG, Move.THUNDER_FANG, Move.WING_ATTACK, Move.SUPERSONIC, Move.BITE, Move.SCARY_FACE, Move.ROAR, Move.AGILITY, Move.ANCIENTPOWER, Move.CRUNCH, Move.TAKE_DOWN, Move.SKY_DROP, Move.IRON_HEAD, Move.HYPER_BEAM, Move.ROCK_SLIDE, Move.GIGA_IMPACT}), Type.ROCK, Type.FLYING),
        SNORLAX("Snorlax", "143", (short)25, new short[] {160, 110, 65, 65, 110, 30}, (byte)189, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 4, 9, 12, 17, 20, 25, 28, 28, 33, 36, 41, 44, 49, 52, 57}, new Move[] {Move.TACKLE, Move.DEFENSE_CURL, Move.AMNESIA, Move.LICK, Move.BELLY_DRUM, Move.YAWN, Move.CHIP_AWAY, Move.REST, Move.SNORE, Move.SLEEP_TALK, Move.BODY_SLAM, Move.BLOCK, Move.ROLLOUT, Move.CRUNCH, Move.HEAVY_SLAM, Move.GIGA_IMPACT}), Type.NORMAL),
        ARTICUNO("Articuno", "144", (short)3, new short[] {90, 85, 100, 95, 125, 85}, (byte)261, new byte[] {0, 0, 0, 0, 3, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64, 71, 78, 85, 92}, new Move[] {Move.GUST, Move.POWDER_SNOW, Move.MIST, Move.ICE_SHARD, Move.MIND_READER, Move.ANCIENTPOWER, Move.AGILITY, Move.ICE_BEAM, Move.REFLECT, Move.ROOST, Move.TAILWIND, Move.BLIZZARD, Move.SHEER_COLD, Move.HAIL, Move.HURRICANE}), Type.ICE, Type.FLYING),
        ZAPDOS("Zapdos", "145", (short)3, new short[] {90, 90, 85, 125, 90, 100}, (byte)261, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64, 71, 78, 85, 92}, new Move[] {Move.PECK, Move.THUNDERSHOCK, Move.THUNDER_WAVE, Move.DETECT, Move.PLUCK, Move.ANCIENTPOWER, Move.CHARGE, Move.AGILITY, Move.DISCHARGE, Move.ROOST, Move.LIGHT_SCREEN, Move.DRILL_PECK, Move.THUNDER, Move.RAIN_DANCE, Move.ZAP_CANNON}), Type.ELECTRIC, Type.FLYING),
        MOLTRES("Moltres", "146", (short)3, new short[] {90, 100, 90, 125, 85, 90}, (byte)261, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64, 71, 78, 85, 92}, new Move[] {Move.WING_ATTACK, Move.EMBER, Move.FIRE_SPIN, Move.AGILITY, Move.ENDURE, Move.ANCIENTPOWER, Move.FLAMETHROWER, Move.SAFEGUARD, Move.AIR_SLASH, Move.ROOST, Move.HEAT_WAVE, Move.SOLARBEAM, Move.SKY_ATTACK, Move.SUNNY_DAY, Move.HURRICANE}), Type.FIRE, Type.FLYING),
        DRATINI("Dratini", "147", (short)45, new short[] {41, 64, 45, 50, 50, 50}, (byte)60, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 5, 11, 15, 21, 25, 31, 35, 41, 45, 51, 55, 61}, new Move[] {Move.WRAP, Move.LEER, Move.THUNDER_WAVE, Move.TWISTER, Move.DRAGON_RAGE, Move.SLAM, Move.AGILITY, Move.DRAGON_TAIL, Move.AQUA_TAIL, Move.DRAGON_RUSH, Move.SAFEGUARD, Move.DRAGON_DANCE, Move.OUTRAGE, Move.HYPER_BEAM}), Type.DRAGON),
        DRAGONAIR("Dragonair", "148", (short)45, new short[] {61, 84, 65, 70, 70, 70}, (byte)147, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 5, 11, 15, 21, 25, 33, 39, 47, 53, 61, 67, 75}, new Move[] {Move.WRAP, Move.LEER, Move.THUNDER_WAVE, Move.TWISTER, Move.THUNDER_WAVE, Move.TWISTER, Move.DRAGON_RAGE, Move.SLAM, Move.AGILITY, Move.DRAGON_TAIL, Move.AQUA_TAIL, Move.DRAGON_RUSH, Move.SAFEGUARD, Move.DRAGON_DANCE, Move.OUTRAGE, Move.HYPER_BEAM}), Type.DRAGON),
        DRAGONITE("Dragonite", "149", (short)45, new short[] {91, 134, 95, 100, 100, 80}, (byte)270, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 5, 11, 15, 21, 25, 33, 39, 47, 53, 55, 61, 67, 75, 81}, new Move[] {Move.FIRE_PUNCH, Move.THUNDERPUNCH, Move.ROOST, Move.WRAP, Move.LEER, Move.THUNDER_WAVE, Move.TWISTER, Move.THUNDER_WAVE, Move.TWISTER, Move.DRAGON_RAGE, Move.SLAM, Move.AGILITY, Move.DRAGON_TAIL, Move.AQUA_TAIL, Move.DRAGON_RUSH, Move.SAFEGUARD, Move.WING_ATTACK, Move.DRAGON_DANCE, Move.OUTRAGE, Move.HYPER_BEAM, Move.HURRICANE}), Type.DRAGON, Type.FLYING),
        MEWTWO("Mewtwo", "150", (short)3, new short[] {106, 110, 90, 154, 90, 130}, (byte)306, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 57, 64, 71, 79, 86, 93, 100}, new Move[] {Move.CONFUSION, Move.DISABLE, Move.BARRIER, Move.SWIFT, Move.FUTURE_SIGHT, Move.PSYCH_UP, Move.MIRACLE_EYE, Move.MIST, Move.PSYCHO_CUT, Move.AMNESIA, Move.POWER_SWAP, Move.GUARD_SWAP, Move.PSYCHIC, Move.ME_FIRST, Move.RECOVER, Move.SAFEGUARD, Move.AURA_SPHERE, Move.PSYSTRIKE}), Type.PSYCHIC),
        MEW("Mew", "151", (short)45, new short[] {100, 100, 100, 100, 100, 100}, (byte)270, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100}, new Move[] {Move.POUND, Move.REFLECT_TYPE, Move.TRANSFORM, Move.MEGA_PUNCH, Move.METRONOME, Move.PSYCHIC, Move.BARRIER, Move.ANCIENTPOWER, Move.AMNESIA, Move.ME_FIRST, Move.BATON_PASS, Move.NASTY_PLOT, Move.AURA_SPHERE}), Type.PSYCHIC);

        private final Map<Integer, Move> LEARNSET;
        private final ExperienceGroup EXP_GROUP;
        private final Species[] EVOLUTION;
        private final GenderRatio GENDER_RATIO;
        private final short[] BASE_STATS;
        private final byte[] EV_YIELD;
        private final Type[] TYPE;
        private final String NAME, NAT_DEX_NUMBER;
        private final short CATCH_RATE;

        Generation1(final String name, final String dexNumber, final short catchRate, final short[] stats, byte expYield, byte[] evYield,
                GenderRatio ratio, ExperienceGroup group,/*final Species[] evolvesTo,*/ Map<Integer, Move> learnset, final Type... type)
        {
            if(type.length > 2)
            {
                throw new IllegalArgumentException("You must input 1 or 2 types for " + name + ". The types " +
                        Arrays.toString(type) + " are invalid.");
            }
            else if(type.length == 0)
            {
                throw new IllegalArgumentException("You must input at least one type for " + name);
            }

            LEARNSET = new TreeMap<>(learnset);
            GENDER_RATIO = ratio;
            EV_YIELD = new byte[] {evYield[0], evYield[1], evYield[2], evYield[3], evYield[4], evYield[5]};
            BASE_STATS = new short[] {stats[0], stats[1], stats[2], stats[3], stats[4], stats[5]};
            CATCH_RATE = catchRate;
            NAT_DEX_NUMBER = dexNumber;

            NAME = name;
            TYPE = type;

            EVOLUTION = null;
            /*if(evolvesFrom != null)
            {
                switch(evolvesFrom.length)
                {
                    case 1:
                        PREVOLUTION = new Species[]{evolvesFrom[0]};
                        break;
                    case 2:
                        PREVOLUTION = new Species[]{evolvesFrom[0], evolvesFrom[1]};
                        break;
                    case 3:
                        PREVOLUTION = new Species[]{evolvesFrom[0], evolvesFrom[1], evolvesFrom[2]};
                        break;
                    default:
                        PREVOLUTION = new Species[]{evolvesFrom[0], evolvesFrom[1], evolvesFrom[2], evolvesFrom[3]};
                        break;
                }
            }
            else
            {
                PREVOLUTION = null;
            }*/

            /*if(evolvesTo != null)
            {
                switch(evolvesTo.length)
                {
                    case 1:
                        EVOLUTION = new Species[]{evolvesTo[0]};
                        break;
                    case 2:
                        EVOLUTION = new Species[]{evolvesTo[0], evolvesTo[1]};
                        break;
                    case 3:
                        EVOLUTION = new Species[]{evolvesTo[0], evolvesTo[1], evolvesTo[2]};
                        break;
                    default:
                        EVOLUTION = new Species[]{evolvesTo[0], evolvesTo[1], evolvesTo[2], evolvesTo[3]};
                        break;
                }
            }
            else
            {
                EVOLUTION = null;
            }*/

            EXP_GROUP = group;
        }
    }
    private enum Generation2
    {
        CHIKORITA("Chikorita", "152", (short)45, new short[] {45, 49, 65, 49, 65, 45}, (byte)64, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 6, 9, 12, 17, 20, 23, 28, 31, 34, 39, 42, 45}, new Move[] {Move.TACKLE, Move.GROWL, Move.RAZOR_LEAF, Move.POISONPOWDER, Move.SYNTHESIS, Move.REFLECT, Move.MAGICAL_LEAF, Move.NATURAL_GIFT, Move.SWEET_SCENT, Move.LIGHT_SCREEN, Move.BODY_SLAM, Move.SAFEGUARD, Move.AROMATHERAPY, Move.SOLARBEAM}), Type.GRASS),
        BAYLEEF("Bayleef", "153", (short)45, new short[] {60, 62, 80, 63, 80, 60}, (byte)142, new byte[] {0, 0, 1, 0, 1, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 6, 9, 12, 18, 22, 26, 32, 36, 40, 46, 50, 54}, new Move[] {Move.TACKLE, Move.GROWL, Move.RAZOR_LEAF, Move.POISONPOWDER, Move.RAZOR_LEAF, Move.POISONPOWDER, Move.SYNTHESIS, Move.REFLECT, Move.MAGICAL_LEAF, Move.NATURAL_GIFT, Move.SWEET_SCENT, Move.LIGHT_SCREEN, Move.BODY_SLAM, Move.SAFEGUARD, Move.AROMATHERAPY, Move.SOLARBEAM}), Type.GRASS),
        MEGANIUM("Meganium", "154", (short)45, new short[] {80, 82, 100, 83, 100, 80}, (byte)236, new byte[] {0, 0, 1, 0, 2, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 6, 9, 12, 18, 22, 26, 32, 34, 40, 46, 54, 60, 66}, new Move[] {Move.TACKLE, Move.GROWL, Move.RAZOR_LEAF, Move.POISONPOWDER, Move.RAZOR_LEAF, Move.POISONPOWDER, Move.SYNTHESIS, Move.REFLECT, Move.MAGICAL_LEAF, Move.NATURAL_GIFT, Move.PETAL_DANCE, Move.SWEET_SCENT, Move.LIGHT_SCREEN, Move.BODY_SLAM, Move.SAFEGUARD, Move.AROMATHERAPY, Move.SOLARBEAM}), Type.GRASS),
        CYNDAQUIL("Cyndaquil", "155", (short)45, new short[] {39, 52, 43, 60, 50, 65}, (byte)62, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 6, 10, 13, 19, 22, 28, 31, 37, 40, 46, 49, 55, 58}, new Move[] {Move.TACKLE, Move.LEER, Move.SMOKESCREEN, Move.EMBER, Move.QUICK_ATTACK, Move.FLAME_WHEEL, Move.DEFENSE_CURL, Move.FLAME_CHARGE, Move.SWIFT, Move.LAVA_PLUME, Move.FLAMETHROWER, Move.INFERNO, Move.ROLLOUT, Move.DOUBLE_EDGE, Move.ERUPTION}), Type.FIRE),
        QUILAVA("Quilava", "156", (short)45, new short[] {58, 64, 58, 80, 65, 80}, (byte)142, new byte[] {0, 0, 0, 1, 0, 1}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 6, 10, 13, 20, 24, 31, 35, 42, 46, 53, 57, 64, 68}, new Move[] {Move.TACKLE, Move.LEER, Move.SMOKESCREEN, Move.SMOKESCREEN, Move.EMBER, Move.QUICK_ATTACK, Move.FLAME_WHEEL, Move.DEFENSE_CURL, Move.SWIFT, Move.FLAME_CHARGE, Move.LAVA_PLUME, Move.FLAMETHROWER, Move.INFERNO, Move.ROLLOUT, Move.DOUBLE_EDGE, Move.ERUPTION}), Type.FIRE),
        TYPHLOSION("Typhlosion", "157", (short)45, new short[] {78, 84, 78, 109, 85, 100}, (byte)240, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 6, 10, 13, 20, 24, 31, 35, 43, 48, 56, 61, 69, 74}, new Move[] {Move.GYRO_BALL, Move.TACKLE, Move.LEER, Move.SMOKESCREEN, Move.EMBER, Move.SMOKESCREEN, Move.EMBER, Move.QUICK_ATTACK, Move.FLAME_WHEEL, Move.DEFENSE_CURL, Move.SWIFT, Move.FLAME_CHARGE, Move.LAVA_PLUME, Move.FLAMETHROWER, Move.INFERNO, Move.ROLLOUT, Move.DOUBLE_EDGE, Move.ERUPTION}), Type.FIRE),
        TOTODILE("Totodile", "158", (short)45, new short[] {50, 65, 64, 44, 48, 43}, (byte)63, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 6, 8, 13, 15, 20, 22, 27, 29, 34, 36, 41, 43, 48, 50}, new Move[] {Move.SCRATCH, Move.LEER, Move.WATER_GUN, Move.RAGE, Move.BITE, Move.SCARY_FACE, Move.ICE_FANG, Move.FLAIL, Move.CRUNCH, Move.CHIP_AWAY, Move.SLASH, Move.SCREECH, Move.THRASH, Move.AQUA_TAIL, Move.SUPERPOWER, Move.HYDRO_PUMP}), Type.WATER),
        CROCONAW("Croconaw", "159", (short)45, new short[] {65, 80, 80, 59, 63, 58}, (byte)142, new byte[] {0, 1, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 6, 8, 13, 15, 21, 24, 30, 33, 39, 42, 48, 51, 57, 60}, new Move[] {Move.SCRATCH, Move.LEER, Move.WATER_GUN, Move.WATER_GUN, Move.RAGE, Move.BITE, Move.SCARY_FACE, Move.ICE_FANG, Move.FLAIL, Move.CRUNCH, Move.CHIP_AWAY, Move.SLASH, Move.SCREECH, Move.THRASH, Move.AQUA_TAIL, Move.SUPERPOWER, Move.HYDRO_PUMP}), Type.WATER),
        FERALIGATR("Feraligatr", "160", (short)45, new short[] {85, 105, 100, 79, 83, 78}, (byte)239, new byte[] {0, 2, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 6, 8, 13, 15, 21, 24, 30, 32, 37, 45, 50, 58, 63, 71, 76}, new Move[] {Move.SCRATCH, Move.LEER, Move.WATER_GUN, Move.RAGE, Move.WATER_GUN, Move.RAGE, Move.BITE, Move.SCARY_FACE, Move.ICE_FANG, Move.FLAIL, Move.AGILITY, Move.CRUNCH, Move.CHIP_AWAY, Move.SLASH, Move.SCREECH, Move.THRASH, Move.AQUA_TAIL, Move.SUPERPOWER, Move.HYDRO_PUMP}), Type.WATER),
        SENTRET("Sentret", "161", (short)255, new short[] {35, 46, 34, 35, 45, 20}, (byte)43, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 4, 7, 13, 16, 19, 25, 28, 31, 36, 39, 42, 47}, new Move[] {Move.SCRATCH, Move.FORESIGHT, Move.DEFENSE_CURL, Move.QUICK_ATTACK, Move.FURY_SWIPES, Move.HELPING_HAND, Move.FOLLOW_ME, Move.SLAM, Move.REST, Move.SUCKER_PUNCH, Move.AMNESIA, Move.BATON_PASS, Move.ME_FIRST, Move.HYPER_VOICE}), Type.NORMAL),
        FURRET("Furret", "162", (short)90, new short[] {85, 76, 64, 45, 55, 90}, (byte)145, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 13, 17, 21, 28, 32, 36, 42, 46, 50, 56}, new Move[] {Move.SCRATCH, Move.FORESIGHT, Move.DEFENSE_CURL, Move.QUICK_ATTACK, Move.DEFENSE_CURL, Move.QUICK_ATTACK, Move.FURY_SWIPES, Move.HELPING_HAND, Move.FOLLOW_ME, Move.SLAM, Move.REST, Move.SUCKER_PUNCH, Move.AMNESIA, Move.BATON_PASS, Move.ME_FIRST, Move.HYPER_VOICE}), Type.NORMAL),
        HOOTHOOT("Hoothoot", "163", (short)255, new short[] {60, 30, 30, 36, 56, 50}, (byte)52, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57}, new Move[] {Move.TACKLE, Move.GROWL, Move.FORESIGHT, Move.HYPNOSIS, Move.PECK, Move.UPROAR, Move.REFLECT, Move.CONFUSION, Move.ECHOED_VOICE, Move.TAKE_DOWN, Move.AIR_SLASH, Move.ZEN_HEADBUTT, Move.SYNCHRONOISE, Move.EXTRASENSORY, Move.PSYCHO_SHIFT, Move.ROOST, Move.DREAM_EATER}), Type.NORMAL, Type.FLYING),
        NOCTOWL("Noctowl", "164", (short)90, new short[] {100, 50, 50, 76, 96, 70}, (byte)155, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 9, 13, 17, 22, 27, 32, 37, 42, 47, 52, 57, 62, 67}, new Move[] {Move.SKY_ATTACK, Move.TACKLE, Move.GROWL, Move.FORESIGHT, Move.HYPNOSIS, Move.HYPNOSIS, Move.PECK, Move.UPROAR, Move.REFLECT, Move.CONFUSION, Move.ECHOED_VOICE, Move.TAKE_DOWN, Move.AIR_SLASH, Move.ZEN_HEADBUTT, Move.SYNCHRONOISE, Move.EXTRASENSORY, Move.PSYCHO_SHIFT, Move.ROOST, Move.DREAM_EATER}), Type.NORMAL, Type.FLYING),
        LEDYBA("Ledyba", "165", (short)255, new short[] {40, 20, 30, 40, 80, 55}, (byte)53, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 6, 9, 14, 14, 14, 17, 22, 25, 30, 33, 38, 41}, new Move[] {Move.TACKLE, Move.SUPERSONIC, Move.COMET_PUNCH, Move.LIGHT_SCREEN, Move.REFLECT, Move.SAFEGUARD, Move.MACH_PUNCH, Move.BATON_PASS, Move.SILVER_WIND, Move.AGILITY, Move.SWIFT, Move.DOUBLE_EDGE, Move.BUG_BUZZ}), Type.BUG, Type.FLYING),
        LEDIAN("Ledian", "166", (short)90, new short[] {55, 35, 50, 55, 110, 85}, (byte)137, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 6, 9, 14, 14, 14, 17, 24, 29, 36, 41, 48, 53}, new Move[] {Move.TACKLE, Move.SUPERSONIC, Move.COMET_PUNCH, Move.SUPERSONIC, Move.COMET_PUNCH, Move.LIGHT_SCREEN, Move.REFLECT, Move.SAFEGUARD, Move.MACH_PUNCH, Move.BATON_PASS, Move.SILVER_WIND, Move.AGILITY, Move.SWIFT, Move.DOUBLE_EDGE, Move.BUG_BUZZ}), Type.BUG, Type.FLYING),
        SPINARAK("Spinarak", "167", (short)255, new short[] {40, 60, 40, 40, 40, 30}, (byte)50, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 33, 36, 40, 43, 47}, new Move[] {Move.POISON_STING, Move.STRING_SHOT, Move.SCARY_FACE, Move.CONSTRICT, Move.LEECH_LIFE, Move.NIGHT_SHADE, Move.SHADOW_SNEAK, Move.FURY_SWIPES, Move.SUCKER_PUNCH, Move.SPIDER_WEB, Move.AGILITY, Move.PIN_MISSILE, Move.PSYCHIC, Move.POISON_JAB, Move.CROSS_POISON}), Type.BUG, Type.POISON),
        ARIADOS("Ariados", "168", (short)90, new short[] {70, 90, 70, 60, 60, 40}, (byte)137, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 8, 12, 15, 19, 23, 28, 32, 37, 41, 46, 50, 55}, new Move[] {Move.BUG_BITE, Move.POISON_STING, Move.STRING_SHOT, Move.SCARY_FACE, Move.CONSTRICT, Move.SCARY_FACE, Move.CONSTRICT, Move.LEECH_LIFE, Move.NIGHT_SHADE, Move.SHADOW_SNEAK, Move.FURY_SWIPES, Move.SUCKER_PUNCH, Move.SPIDER_WEB, Move.AGILITY, Move.PIN_MISSILE, Move.PSYCHIC, Move.POISON_JAB, Move.CROSS_POISON}), Type.BUG, Type.POISON),
        CROBAT("Crobat", "169", (short)90, new short[] {85, 90, 80, 70, 80, 130}, (byte)241, new byte[] {0, 0, 0, 0, 0, 3}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 4, 8, 12, 15, 19, 24, 28, 33, 38, 42, 47, 52}, new Move[] {Move.CROSS_POISON, Move.SCREECH, Move.LEECH_LIFE, Move.SUPERSONIC, Move.ASTONISH, Move.SUPERSONIC, Move.ASTONISH, Move.BITE, Move.WING_ATTACK, Move.CONFUSE_RAY, Move.SWIFT, Move.AIR_CUTTER, Move.ACROBATICS, Move.MEAN_LOOK, Move.POISON_FANG, Move.HAZE, Move.AIR_SLASH}), Type.POISON, Type.FLYING),
        CHINCHOU("Chinchou", "170", (short)190, new short[] {75, 38, 38, 56, 56, 67}, (byte)66, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 6, 9, 12, 17, 20, 23, 28, 31, 34, 39, 42, 45, 50}, new Move[] {Move.SUPERSONIC, Move.BUBBLE, Move.THUNDER_WAVE, Move.FLAIL, Move.CONFUSE_RAY, Move.WATER_GUN, Move.SPARK, Move.TAKE_DOWN, Move.ELECTRO_BALL, Move.BUBBLEBEAM, Move.SIGNAL_BEAM, Move.DISCHARGE, Move.AQUA_RING, Move.HYDRO_PUMP, Move.CHARGE}), Type.WATER, Type.ELECTRIC),
        LANTURN("Lanturn", "171", (short)75, new short[] {125, 58, 58, 76, 76, 67}, (byte)161, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 6, 9, 12, 17, 20, 23, 27, 27, 27, 30, 35, 40, 47, 52, 57, 64}, new Move[] {Move.BUBBLE, Move.SUPERSONIC, Move.THUNDER_WAVE, Move.THUNDER_WAVE, Move.FLAIL, Move.WATER_GUN, Move.CONFUSE_RAY, Move.SPARK, Move.TAKE_DOWN, Move.STOCKPILE, Move.SWALLOW, Move.SPIT_UP, Move.ELECTRO_BALL, Move.BUBBLEBEAM, Move.SIGNAL_BEAM, Move.DISCHARGE, Move.AQUA_RING, Move.HYDRO_PUMP, Move.CHARGE}), Type.WATER, Type.ELECTRIC),
        PICHU("Pichu", "172", (short)190, new short[] {20, 40, 15, 35, 35, 60}, (byte)41, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 10, 13, 18}, new Move[] {Move.THUNDERSHOCK, Move.CHARM, Move.TAIL_WHIP, Move.THUNDER_WAVE, Move.SWEET_KISS, Move.NASTY_PLOT}), Type.ELECTRIC),
        CLEFFA("Cleffa", "173", (short)150, new short[] {50, 25, 28, 45, 55, 15}, (byte)44, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 4, 7, 10, 13, 16}, new Move[] {Move.POUND, Move.CHARM, Move.ENCORE, Move.SING, Move.SWEET_KISS, Move.COPYCAT, Move.MAGICAL_LEAF}), Type.NORMAL),
        IGGLYBUFF("Igglybuff", "174", (short)170, new short[] {90, 30, 15, 40, 20, 15}, (byte)42, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 5, 9, 13, 17}, new Move[] {Move.SING, Move.CHARM, Move.DEFENSE_CURL, Move.POUND, Move.SWEET_KISS, Move.COPYCAT}), Type.NORMAL),
        TOGEPI("Togepi", "175", (short)190, new short[] {35, 20, 65, 40, 65, 20}, (byte)49, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53}, new Move[] {Move.GROWL, Move.CHARM, Move.METRONOME, Move.SWEET_KISS, Move.YAWN, Move.ENCORE, Move.FOLLOW_ME, Move.BESTOW, Move.WISH, Move.ANCIENTPOWER, Move.SAFEGUARD, Move.BATON_PASS, Move.DOUBLE_EDGE, Move.LAST_RESORT, Move.AFTER_YOU}), Type.NORMAL),
        TOGETIC("Togetic", "176", (short)75, new short[] {55, 40, 85, 80, 105, 40}, (byte)142, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53}, new Move[] {Move.MAGICAL_LEAF, Move.GROWL, Move.CHARM, Move.METRONOME, Move.SWEET_KISS, Move.METRONOME, Move.SWEET_KISS, Move.YAWN, Move.ENCORE, Move.FOLLOW_ME, Move.BESTOW, Move.WISH, Move.ANCIENTPOWER, Move.SAFEGUARD, Move.BATON_PASS, Move.DOUBLE_EDGE, Move.LAST_RESORT, Move.AFTER_YOU}), Type.NORMAL, Type.FLYING),
        NATU("Natu", "177", (short)190, new short[] {40, 50, 45, 70, 45, 70}, (byte)64, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 6, 9, 12, 17, 20, 23, 28, 33, 36, 39, 44, 47, 47, 50}, new Move[] {Move.PECK, Move.LEER, Move.NIGHT_SHADE, Move.TELEPORT, Move.LUCKY_CHANT, Move.MIRACLE_EYE, Move.ME_FIRST, Move.CONFUSE_RAY, Move.WISH, Move.PSYCHO_SHIFT, Move.FUTURE_SIGHT, Move.STORED_POWER, Move.OMINOUS_WIND, Move.POWER_SWAP, Move.GUARD_SWAP, Move.PSYCHIC}), Type.PSYCHIC, Type.FLYING),
        XATU("Xatu", "178", (short)75, new short[] {65, 75, 70, 95, 70, 95}, (byte)165, new byte[] {0, 0, 0, 1, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 6, 9, 12, 17, 20, 23, 27, 30, 37, 42, 47, 54, 54, 59, 66}, new Move[] {Move.PECK, Move.LEER, Move.NIGHT_SHADE, Move.TELEPORT, Move.LUCKY_CHANT, Move.MIRACLE_EYE, Move.ME_FIRST, Move.CONFUSE_RAY, Move.TAILWIND, Move.WISH, Move.PSYCHO_SHIFT, Move.FUTURE_SIGHT, Move.STORED_POWER, Move.OMINOUS_WIND, Move.POWER_SWAP, Move.GUARD_SWAP, Move.PSYCHIC}), Type.PSYCHIC, Type.FLYING),
        MAREEP("Mareep", "179", (short)235, new short[] {55, 40, 40, 65, 45, 35}, (byte)56, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 39, 43, 46}, new Move[] {Move.TACKLE, Move.GROWL, Move.THUNDER_WAVE, Move.THUNDERSHOCK, Move.COTTON_SPORE, Move.CHARGE, Move.TAKE_DOWN, Move.ELECTRO_BALL, Move.CONFUSE_RAY, Move.POWER_GEM, Move.DISCHARGE, Move.COTTON_GUARD, Move.SIGNAL_BEAM, Move.LIGHT_SCREEN, Move.THUNDER}), Type.ELECTRIC),
        FLAAFFY("Flaaffy", "180", (short)120, new short[] {70, 55, 55, 80, 60, 45}, (byte)128, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 8, 11, 16, 20, 25, 29, 34, 38, 43, 47, 52, 56, -1}, new Move[] {Move.TACKLE, Move.GROWL, Move.THUNDER_WAVE, Move.THUNDERSHOCK, Move.THUNDER_WAVE, Move.THUNDERSHOCK, Move.COTTON_SPORE, Move.CHARGE, Move.TAKE_DOWN, Move.ELECTRO_BALL, Move.CONFUSE_RAY, Move.POWER_GEM, Move.DISCHARGE, Move.COTTON_GUARD, Move.SIGNAL_BEAM, Move.LIGHT_SCREEN, Move.THUNDER, Move.GROWL}), Type.ELECTRIC),
        AMPHAROS("Ampharos", "181", (short)45, new short[] {90, 75, 75, 115, 90, 55}, (byte)225, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, -1, 4, 8, 11, 16, 20, 25, 29, 30, 35, 40, 46, 51, 57, 62}, new Move[] {Move.FIRE_PUNCH, Move.TACKLE, Move.GROWL, Move.THUNDER_WAVE, Move.THUNDERSHOCK, Move.GROWL, Move.THUNDER_WAVE, Move.THUNDERSHOCK, Move.COTTON_SPORE, Move.CHARGE, Move.TAKE_DOWN, Move.ELECTRO_BALL, Move.CONFUSE_RAY, Move.THUNDERPUNCH, Move.POWER_GEM, Move.DISCHARGE, Move.COTTON_GUARD, Move.SIGNAL_BEAM, Move.LIGHT_SCREEN, Move.THUNDER}), Type.ELECTRIC),
        BELLOSSOM("Bellossom", "182", (short)45, new short[] {75, 80, 85, 90, 100, 50}, (byte)216, new byte[] {0, 0, 0, 0, 3, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 23, 53}, new Move[] {Move.LEAF_BLADE, Move.MEGA_DRAIN, Move.SWEET_SCENT, Move.STUN_SPORE, Move.SUNNY_DAY, Move.MAGICAL_LEAF, Move.LEAF_STORM}), Type.GRASS),
        MARILL("Marill", "183", (short)190, new short[] {70, 20, 50, 20, 50, 40}, (byte)88, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 2, 5, 7, 10, 10, 13, 16, 20, 23, 28, 31, 37, 40}, new Move[] {Move.TACKLE, Move.BUBBLE, Move.TAIL_WHIP, Move.WATER_SPORT, Move.WATER_GUN, Move.DEFENSE_CURL, Move.ROLLOUT, Move.BUBBLEBEAM, Move.HELPING_HAND, Move.AQUA_TAIL, Move.DOUBLE_EDGE, Move.AQUA_RING, Move.RAIN_DANCE, Move.SUPERPOWER, Move.HYDRO_PUMP}), Type.WATER),
        AZUMARILL("Azumarill", "184", (short)75, new short[] {100, 50, 80, 50, 80, 50}, (byte)185, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 0, -1, -1, 2, 5, 7, 10, 10, 13, 16, 21, 25, 31, 35, 42, 46}, new Move[] {Move.TACKLE, Move.BUBBLE, Move.TAIL_WHIP, Move.WATER_SPORT, Move.WATER_GUN, Move.DEFENSE_CURL, Move.TAIL_WHIP, Move.WATER_SPORT, Move.WATER_GUN, Move.DEFENSE_CURL, Move.ROLLOUT, Move.BUBBLEBEAM, Move.HELPING_HAND, Move.AQUA_TAIL, Move.DOUBLE_EDGE, Move.AQUA_RING, Move.RAIN_DANCE, Move.SUPERPOWER, Move.HYDRO_PUMP}), Type.WATER),
        SUDOWOODO("Sudowoodo", "185", (short)65, new short[] {70, 100, 115, 30, 65, 30}, (byte)144, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 8, 12, 15, 15, 19, 22, 26, 29, 33, 36, 40, 43, 47}, new Move[] {Move.WOOD_HAMMER, Move.COPYCAT, Move.FLAIL, Move.LOW_KICK, Move.ROCK_THROW, Move.FLAIL, Move.LOW_KICK, Move.ROCK_THROW, Move.MIMIC, Move.SLAM, Move.FAINT_ATTACK, Move.ROCK_TOMB, Move.BLOCK, Move.ROCK_SLIDE, Move.COUNTER, Move.SUCKER_PUNCH, Move.DOUBLE_EDGE, Move.STONE_EDGE, Move.HAMMER_ARM}), Type.ROCK),
        POLITOED("Politoed", "186", (short)45, new short[] {90, 75, 75, 90, 100, 70}, (byte)225, new byte[] {0, 0, 0, 0, 3, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 27, 37, 48}, new Move[] {Move.BUBBLEBEAM, Move.HYPNOSIS, Move.DOUBLESLAP, Move.PERISH_SONG, Move.SWAGGER, Move.BOUNCE, Move.HYPER_VOICE}), Type.WATER),
        HOPPIP("Hoppip", "187", (short)255, new short[] {35, 35, 40, 35, 55, 50}, (byte)50, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 4, 7, 10, 12, 14, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49}, new Move[] {Move.SPLASH, Move.SYNTHESIS, Move.TAIL_WHIP, Move.TACKLE, Move.POISONPOWDER, Move.STUN_SPORE, Move.SLEEP_POWDER, Move.BULLET_SEED, Move.LEECH_SEED, Move.MEGA_DRAIN, Move.ACROBATICS, Move.RAGE_POWDER, Move.COTTON_SPORE, Move.U_TURN, Move.WORRY_SEED, Move.GIGA_DRAIN, Move.BOUNCE, Move.MEMENTO}), Type.GRASS, Type.FLYING),
        SKIPLOOM("Skiploom", "188", (short)120, new short[] {55, 45, 50, 45, 65, 80}, (byte)119, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 10, 12, 14, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 60}, new Move[] {Move.SPLASH, Move.SYNTHESIS, Move.TAIL_WHIP, Move.TACKLE, Move.SYNTHESIS, Move.TAIL_WHIP, Move.TACKLE, Move.POISONPOWDER, Move.STUN_SPORE, Move.SLEEP_POWDER, Move.BULLET_SEED, Move.LEECH_SEED, Move.MEGA_DRAIN, Move.ACROBATICS, Move.RAGE_POWDER, Move.COTTON_SPORE, Move.U_TURN, Move.WORRY_SEED, Move.GIGA_DRAIN, Move.BOUNCE, Move.MEMENTO}), Type.GRASS, Type.FLYING),
        JUMPLUFF("Jumpluff", "189", (short)45, new short[] {75, 55, 70, 55, 85, 110}, (byte)203, new byte[] {0, 0, 0, 0, 0, 3}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 10, 12, 14, 16, 20, 24, 29, 34, 39, 44, 49, 54, 59, 64, 69}, new Move[] {Move.SPLASH, Move.SYNTHESIS, Move.TAIL_WHIP, Move.TACKLE, Move.SYNTHESIS, Move.TAIL_WHIP, Move.TACKLE, Move.POISONPOWDER, Move.STUN_SPORE, Move.SLEEP_POWDER, Move.BULLET_SEED, Move.LEECH_SEED, Move.MEGA_DRAIN, Move.ACROBATICS, Move.RAGE_POWDER, Move.COTTON_SPORE, Move.U_TURN, Move.WORRY_SEED, Move.GIGA_DRAIN, Move.BOUNCE, Move.MEMENTO}), Type.GRASS, Type.FLYING),
        AIPOM("Aipom", "190", (short)45, new short[] {55, 70, 55, 40, 55, 85}, (byte)72, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 39, 43}, new Move[] {Move.SCRATCH, Move.TAIL_WHIP, Move.SAND_ATTACK, Move.ASTONISH, Move.BATON_PASS, Move.TICKLE, Move.FURY_SWIPES, Move.SWIFT, Move.SCREECH, Move.AGILITY, Move.DOUBLE_HIT, Move.FLING, Move.NASTY_PLOT, Move.LAST_RESORT}), Type.NORMAL),
        SUNKERN("Sunkern", "191", (short)235, new short[] {30, 30, 30, 30, 30, 30}, (byte)36, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43}, new Move[] {Move.ABSORB, Move.GROWTH, Move.INGRAIN, Move.GRASSWHISTLE, Move.MEGA_DRAIN, Move.LEECH_SEED, Move.RAZOR_LEAF, Move.WORRY_SEED, Move.GIGA_DRAIN, Move.ENDEAVOR, Move.SYNTHESIS, Move.NATURAL_GIFT, Move.SOLARBEAM, Move.DOUBLE_EDGE, Move.SUNNY_DAY, Move.SEED_BOMB}), Type.GRASS),
        SUNFLORA("Sunflora", "192", (short)120, new short[] {75, 75, 55, 105, 85, 30}, (byte)149, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43}, new Move[] {Move.ABSORB, Move.POUND, Move.GROWTH, Move.INGRAIN, Move.GRASSWHISTLE, Move.MEGA_DRAIN, Move.LEECH_SEED, Move.RAZOR_LEAF, Move.WORRY_SEED, Move.GIGA_DRAIN, Move.BULLET_SEED, Move.PETAL_DANCE, Move.NATURAL_GIFT, Move.SOLARBEAM, Move.DOUBLE_EDGE, Move.SUNNY_DAY, Move.LEAF_STORM}), Type.GRASS),
        YANMA("Yanma", "193", (short)75, new short[] {65, 65, 45, 75, 45, 95}, (byte)78, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 6, 11, 14, 17, 22, 27, 30, 33, 38, 43, 46, 49, 54, 57}, new Move[] {Move.TACKLE, Move.FORESIGHT, Move.QUICK_ATTACK, Move.DOUBLE_TEAM, Move.SONICBOOM, Move.DETECT, Move.SUPERSONIC, Move.UPROAR, Move.PURSUIT, Move.ANCIENTPOWER, Move.HYPNOSIS, Move.WING_ATTACK, Move.SCREECH, Move.U_TURN, Move.AIR_SLASH, Move.BUG_BUZZ}), Type.BUG, Type.FLYING),
        WOOPER("Wooper", "194", (short)255, new short[] {55, 45, 45, 25, 25, 15}, (byte)42, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 9, 15, 19, 23, 29, 33, 37, 43, 43, 47}, new Move[] {Move.WATER_GUN, Move.TAIL_WHIP, Move.MUD_SPORT, Move.MUD_SHOT, Move.SLAM, Move.MUD_BOMB, Move.AMNESIA, Move.YAWN, Move.EARTHQUAKE, Move.RAIN_DANCE, Move.MIST, Move.HAZE, Move.MUDDY_WATER}), Type.WATER, Type.GROUND),
        QUAGSIRE("Quagsire", "195", (short)90, new short[] {95, 85, 85, 65, 65, 35}, (byte)151, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 9, 15, 19, 24, 31, 36, 41, 48, 48, 53}, new Move[] {Move.WATER_GUN, Move.TAIL_WHIP, Move.MUD_SPORT, Move.MUD_SPORT, Move.MUD_SHOT, Move.SLAM, Move.MUD_BOMB, Move.AMNESIA, Move.YAWN, Move.EARTHQUAKE, Move.RAIN_DANCE, Move.MIST, Move.HAZE, Move.MUDDY_WATER}), Type.WATER, Type.GROUND),
        ESPEON("Espeon", "196", (short)45, new short[] {65, 65, 60, 130, 95, 110}, (byte)184, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45}, new Move[] {Move.HELPING_HAND, Move.TACKLE, Move.TAIL_WHIP, Move.SAND_ATTACK, Move.CONFUSION, Move.QUICK_ATTACK, Move.SWIFT, Move.PSYBEAM, Move.FUTURE_SIGHT, Move.PSYCH_UP, Move.MORNING_SUN, Move.PSYCHIC, Move.LAST_RESORT, Move.POWER_SWAP}), Type.PSYCHIC),
        UMBREON("Umbreon", "197", (short)45, new short[] {95, 65, 110, 60, 130, 65}, (byte)184, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45}, new Move[] {Move.HELPING_HAND, Move.TACKLE, Move.TAIL_WHIP, Move.SAND_ATTACK, Move.PURSUIT, Move.QUICK_ATTACK, Move.CONFUSE_RAY, Move.FAINT_ATTACK, Move.ASSURANCE, Move.SCREECH, Move.MOONLIGHT, Move.MEAN_LOOK, Move.LAST_RESORT, Move.GUARD_SWAP}), Type.DARK),
        MURKROW("Murkrow", "198", (short)30, new short[] {60, 85, 42, 85, 42, 91}, (byte)81, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 5, 11, 15, 21, 25, 31, 35, 41, 45, 51, 55, 61, 65}, new Move[] {Move.PECK, Move.ASTONISH, Move.PURSUIT, Move.HAZE, Move.WING_ATTACK, Move.NIGHT_SHADE, Move.ASSURANCE, Move.TAUNT, Move.FAINT_ATTACK, Move.MEAN_LOOK, Move.FOUL_PLAY, Move.TAILWIND, Move.SUCKER_PUNCH, Move.TORMENT, Move.QUASH}), Type.DARK, Type.FLYING),
        SLOWKING("Slowking", "199", (short)70, new short[] {95, 75, 80, 100, 110, 30}, (byte)172, new byte[] {0, 0, 0, 0, 3, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 9, 14, 19, 23, 28, 32, 36, 41, 45, 49, 54, 58}, new Move[] {Move.POWER_GEM, Move.HIDDEN_POWER, Move.CURSE, Move.YAWN, Move.TACKLE, Move.GROWL, Move.WATER_GUN, Move.CONFUSION, Move.DISABLE, Move.HEADBUTT, Move.WATER_PULSE, Move.ZEN_HEADBUTT, Move.NASTY_PLOT, Move.SWAGGER, Move.PSYCHIC, Move.TRUMP_CARD, Move.PSYCH_UP, Move.HEAL_PULSE}), Type.WATER, Type.PSYCHIC),
        MISDREAVUS("Misdreavus", "200", (short)45, new short[] {60, 60, 60, 85, 85, 85}, (byte)87, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 5, 10, 14, 19, 23, 28, 32, 37, 41, 46, 50, 55}, new Move[] {Move.GROWL, Move.PSYWAVE, Move.SPITE, Move.ASTONISH, Move.CONFUSE_RAY, Move.MEAN_LOOK, Move.HEX, Move.PSYBEAM, Move.PAIN_SPLIT, Move.PAYBACK, Move.SHADOW_BALL, Move.PERISH_SONG, Move.GRUDGE, Move.POWER_GEM}), Type.GHOST),
        UNOWN("Unown", "201", (short)225, new short[] {48, 72, 48, 72, 48, 48}, (byte)118, new byte[] {0, 1, 0, 1, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0}, new Move[] {Move.HIDDEN_POWER}), Type.PSYCHIC),
        WOBBUFFET("Wobbuffet", "202", (short)45, new short[] {190, 33, 58, 33, 58, 33}, (byte)142, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0}, new Move[] {Move.COUNTER, Move.MIRROR_COAT, Move.SAFEGUARD, Move.DESTINY_BOND}), Type.PSYCHIC),
        GIRAFARIG("Girafarig", "203", (short)60, new short[] {70, 80, 65, 90, 65, 85}, (byte)159, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 5, 10, 14, 19, 23, 28, 32, 37, 41, 46}, new Move[] {Move.POWER_SWAP, Move.GUARD_SWAP, Move.ASTONISH, Move.TACKLE, Move.GROWL, Move.CONFUSION, Move.ODOR_SLEUTH, Move.STOMP, Move.AGILITY, Move.PSYBEAM, Move.BATON_PASS, Move.ASSURANCE, Move.DOUBLE_HIT, Move.PSYCHIC, Move.ZEN_HEADBUTT, Move.CRUNCH}), Type.NORMAL, Type.PSYCHIC),
        PINECO("Pineco", "204", (short)190, new short[] {50, 65, 90, 35, 35, 15}, (byte)58, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 6, 9, 12, 17, 20, 23, 28, 31, 34, 39, 42, 45}, new Move[] {Move.TACKLE, Move.PROTECT, Move.SELFDESTRUCT, Move.BUG_BITE, Move.TAKE_DOWN, Move.RAPID_SPIN, Move.BIDE, Move.NATURAL_GIFT, Move.SPIKES, Move.PAYBACK, Move.EXPLOSION, Move.IRON_DEFENSE, Move.GYRO_BALL, Move.DOUBLE_EDGE}), Type.BUG),
        FORRETRESS("Forretress", "205", (short)75, new short[] {75, 90, 140, 60, 60, 40}, (byte)163, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 6, 9, 12, 17, 20, 23, 28, 31, 32, 36, 42, 46, 50, 56, 60, 64, 70}, new Move[] {Move.TOXIC_SPIKES, Move.TACKLE, Move.PROTECT, Move.SELFDESTRUCT, Move.BUG_BITE, Move.SELFDESTRUCT, Move.BUG_BITE, Move.TAKE_DOWN, Move.RAPID_SPIN, Move.BIDE, Move.NATURAL_GIFT, Move.SPIKES, Move.MIRROR_SHOT, Move.AUTOTOMIZE, Move.PAYBACK, Move.EXPLOSION, Move.IRON_DEFENSE, Move.GYRO_BALL, Move.DOUBLE_EDGE, Move.MAGNET_RISE, Move.ZAP_CANNON, Move.HEAVY_SLAM}), Type.BUG, Type.STEEL),
        DUNSPARCE("Dunsparce", "206", (short)190, new short[] {100, 70, 70, 65, 65, 45}, (byte)145, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49}, new Move[] {Move.RAGE, Move.DEFENSE_CURL, Move.ROLLOUT, Move.SPITE, Move.PURSUIT, Move.SCREECH, Move.YAWN, Move.ANCIENTPOWER, Move.TAKE_DOWN, Move.ROOST, Move.GLARE, Move.DIG, Move.DOUBLE_EDGE, Move.COIL, Move.ENDURE, Move.DRILL_RUN, Move.ENDEAVOR, Move.FLAIL}), Type.NORMAL),
        GLIGAR("Gligar", "207", (short)60, new short[] {65, 75, 105, 35, 65, 85}, (byte)86, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 4, 7, 10, 13, 16, 19, 22, 27, 30, 35, 40, 45, 50, 55}, new Move[] {Move.POISON_STING, Move.SAND_ATTACK, Move.HARDEN, Move.KNOCK_OFF, Move.QUICK_ATTACK, Move.FURY_CUTTER, Move.FAINT_ATTACK, Move.ACROBATICS, Move.SLASH, Move.U_TURN, Move.SCREECH, Move.X_SCISSOR, Move.SKY_UPPERCUT, Move.SWORDS_DANCE, Move.GUILLOTINE}), Type.GROUND, Type.FLYING),
        STEELIX("Steelix", "208", (short)25, new short[] {75, 85, 200, 55, 65, 30}, (byte)179, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52}, new Move[] {Move.THUNDER_FANG, Move.ICE_FANG, Move.FIRE_FANG, Move.MUD_SPORT, Move.TACKLE, Move.HARDEN, Move.BIND, Move.CURSE, Move.ROCK_THROW, Move.RAGE, Move.ROCK_TOMB, Move.STEALTH_ROCK, Move.AUTOTOMIZE, Move.SMACK_DOWN, Move.DRAGONBREATH, Move.SLAM, Move.SCREECH, Move.ROCK_SLIDE, Move.CRUNCH, Move.IRON_TAIL, Move.DIG, Move.STONE_EDGE, Move.DOUBLE_EDGE, Move.SANDSTORM}), Type.STEEL, Type.GROUND),
        SNUBBULL("Snubbull", "209", (short)190, new short[] {60, 80, 50, 40, 40, 30}, (byte)60, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 7, 13, 19, 25, 31, 37, 43, 49}, new Move[] {Move.ICE_FANG, Move.FIRE_FANG, Move.THUNDER_FANG, Move.TACKLE, Move.SCARY_FACE, Move.TAIL_WHIP, Move.CHARM, Move.BITE, Move.LICK, Move.HEADBUTT, Move.ROAR, Move.RAGE, Move.TAKE_DOWN, Move.PAYBACK, Move.CRUNCH}), Type.NORMAL),
        GRANBULL("Granbull", "210", (short)75, new short[] {90, 120, 75, 60, 60, 45}, (byte)158, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 7, 13, 19, 27, 35, 43, 51, 59, 67}, new Move[] {Move.ICE_FANG, Move.FIRE_FANG, Move.THUNDER_FANG, Move.TACKLE, Move.SCARY_FACE, Move.TAIL_WHIP, Move.CHARM, Move.BITE, Move.LICK, Move.HEADBUTT, Move.ROAR, Move.RAGE, Move.TAKE_DOWN, Move.PAYBACK, Move.CRUNCH, Move.OUTRAGE}), Type.NORMAL),
        QWILFISH("Qwilfish", "211", (short)45, new short[] {65, 95, 75, 55, 55, 85}, (byte)86, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 9, 9, 13, 17, 21, 25, 25, 29, 33, 37, 41, 45, 49, 53, 57}, new Move[] {Move.SPIKES, Move.TACKLE, Move.POISON_STING, Move.HARDEN, Move.MINIMIZE, Move.WATER_GUN, Move.ROLLOUT, Move.TOXIC_SPIKES, Move.STOCKPILE, Move.SPIT_UP, Move.REVENGE, Move.BRINE, Move.PIN_MISSILE, Move.TAKE_DOWN, Move.AQUA_TAIL, Move.POISON_JAB, Move.DESTINY_BOND, Move.HYDRO_PUMP}), Type.WATER, Type.POISON),
        SCIZOR("Scizor", "212", (short)25, new short[] {70, 130, 100, 55, 80, 65}, (byte)175, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57, 61}, new Move[] {Move.BULLET_PUNCH, Move.QUICK_ATTACK, Move.LEER, Move.FOCUS_ENERGY, Move.PURSUIT, Move.FALSE_SWIPE, Move.AGILITY, Move.METAL_CLAW, Move.FURY_CUTTER, Move.SLASH, Move.RAZOR_WIND, Move.IRON_DEFENSE, Move.X_SCISSOR, Move.NIGHT_SLASH, Move.DOUBLE_HIT, Move.IRON_HEAD, Move.SWORDS_DANCE, Move.FEINT}), Type.BUG, Type.STEEL),
        SHUCKLE("Shuckle", "213", (short)190, new short[] {20, 10, 230, 10, 230, 5}, (byte)177, new byte[] {0, 0, 1, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 5, 9, 12, 16, 20, 23, 27, 31, 34, 38, 42, 45, 45, 49}, new Move[] {Move.WITHDRAW, Move.CONSTRICT, Move.BIDE, Move.ROLLOUT, Move.ENCORE, Move.WRAP, Move.STRUGGLE_BUG, Move.SAFEGUARD, Move.REST, Move.ROCK_THROW, Move.GASTRO_ACID, Move.POWER_TRICK, Move.SHELL_SMASH, Move.ROCK_SLIDE, Move.BUG_BITE, Move.POWER_SPLIT, Move.GUARD_SPLIT, Move.STONE_EDGE}), Type.BUG, Type.ROCK),
        HERACROSS("Heracross", "214", (short)45, new short[] {80, 125, 75, 40, 95, 85}, (byte)175, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 7, 10, 16, 19, 25, 28, 34, 37, 43, 46}, new Move[] {Move.NIGHT_SLASH, Move.TACKLE, Move.LEER, Move.HORN_ATTACK, Move.ENDURE, Move.FURY_ATTACK, Move.AERIAL_ACE, Move.CHIP_AWAY, Move.COUNTER, Move.BRICK_BREAK, Move.TAKE_DOWN, Move.CLOSE_COMBAT, Move.FEINT, Move.REVERSAL, Move.MEGAHORN}), Type.BUG, Type.FIGHTING),
        SNEASEL("Sneasel", "215", (short)60, new short[] {55, 95, 55, 35, 75, 115}, (byte)86, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 8, 10, 14, 16, 20, 22, 25, 28, 32, 35, 40, 44, 47}, new Move[] {Move.SCRATCH, Move.LEER, Move.TAUNT, Move.QUICK_ATTACK, Move.FAINT_ATTACK, Move.ICY_WIND, Move.FURY_SWIPES, Move.AGILITY, Move.METAL_CLAW, Move.HONE_CLAWS, Move.BEAT_UP, Move.SCREECH, Move.SLASH, Move.SNATCH, Move.PUNISHMENT, Move.ICE_SHARD}), Type.DARK, Type.ICE),
        TEDDIURSA("Teddiursa", "216", (short)120, new short[] {60, 80, 50, 50, 50, 40}, (byte)66, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 8, 15, 22, 29, 36, 43, 43, 50, 57}, new Move[] {Move.COVET, Move.SCRATCH, Move.LEER, Move.LICK, Move.FAKE_TEARS, Move.FURY_SWIPES, Move.FAINT_ATTACK, Move.SWEET_SCENT, Move.SLASH, Move.CHARM, Move.REST, Move.SNORE, Move.THRASH, Move.FLING}), Type.NORMAL),
        URSARING("Ursaring", "217", (short)60, new short[] {90, 130, 75, 75, 75, 55}, (byte)175, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 8, 15, 22, 29, 38, 47, 49, 58, 67}, new Move[] {Move.COVET, Move.SCRATCH, Move.LEER, Move.LICK, Move.FAKE_TEARS, Move.FURY_SWIPES, Move.FAINT_ATTACK, Move.SWEET_SCENT, Move.SLASH, Move.SCARY_FACE, Move.REST, Move.SNORE, Move.THRASH, Move.HAMMER_ARM}), Type.NORMAL),
        SLUGMA("Slugma", "218", (short)190, new short[] {40, 40, 40, 70, 40, 20}, (byte)50, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 10, 14, 19, 23, 28, 31, 38, 41, 46, 50, 55}, new Move[] {Move.YAWN, Move.SMOG, Move.EMBER, Move.ROCK_THROW, Move.HARDEN, Move.RECOVER, Move.FLAME_BURST, Move.ANCIENTPOWER, Move.AMNESIA, Move.LAVA_PLUME, Move.ROCK_SLIDE, Move.BODY_SLAM, Move.FLAMETHROWER, Move.EARTH_POWER}), Type.FIRE),
        MAGCARGO("Magcargo", "219", (short)75, new short[] {50, 50, 120, 80, 80, 30}, (byte)144, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 5, 10, 14, 19, 23, 28, 32, 37, 38, 44, 52, 59, 67}, new Move[] {Move.YAWN, Move.SMOG, Move.EMBER, Move.ROCK_THROW, Move.EMBER, Move.ROCK_THROW, Move.HARDEN, Move.RECOVER, Move.FLAME_BURST, Move.ANCIENTPOWER, Move.AMNESIA, Move.LAVA_PLUME, Move.SHELL_SMASH, Move.ROCK_SLIDE, Move.BODY_SLAM, Move.FLAMETHROWER, Move.EARTH_POWER}), Type.FIRE, Type.ROCK),
        SWINUB("Swinub", "220", (short)225, new short[] {50, 50, 40, 30, 30, 50}, (byte)50, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 5, 8, 11, 14, 18, 21, 24, 28, 35, 37, 40, 44, 48}, new Move[] {Move.TACKLE, Move.ODOR_SLEUTH, Move.MUD_SPORT, Move.POWDER_SNOW, Move.MUD_SLAP, Move.ENDURE, Move.MUD_BOMB, Move.ICY_WIND, Move.ICE_SHARD, Move.TAKE_DOWN, Move.MIST, Move.EARTHQUAKE, Move.FLAIL, Move.BLIZZARD, Move.AMNESIA}), Type.ICE, Type.GROUND),
        PILOSWINE("Piloswine", "221", (short)75, new short[] {100, 100, 80, 60, 60, 50}, (byte)158, new byte[] {1, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 8, 11, 14, 18, 21, 24, 28, 33, 37, 41, 46, 52, 58}, new Move[] {Move.ANCIENTPOWER, Move.PECK, Move.ODOR_SLEUTH, Move.MUD_SPORT, Move.POWDER_SNOW, Move.MUD_SPORT, Move.POWDER_SNOW, Move.MUD_SLAP, Move.ENDURE, Move.MUD_BOMB, Move.ICY_WIND, Move.ICE_FANG, Move.TAKE_DOWN, Move.FURY_ATTACK, Move.MIST, Move.THRASH, Move.EARTHQUAKE, Move.BLIZZARD, Move.AMNESIA}), Type.ICE, Type.GROUND),
        CORSOLA("Corsola", "222", (short)60, new short[] {55, 55, 85, 65, 85, 35}, (byte)133, new byte[] {0, 0, 1, 0, 1, 0}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 4, 8, 10, 13, 17, 20, 23, 27, 29, 31, 35, 38, 41, 45, 47, 52}, new Move[] {Move.TACKLE, Move.HARDEN, Move.BUBBLE, Move.RECOVER, Move.REFRESH, Move.BUBBLEBEAM, Move.ANCIENTPOWER, Move.LUCKY_CHANT, Move.SPIKE_CANNON, Move.IRON_DEFENSE, Move.ROCK_BLAST, Move.ENDURE, Move.AQUA_RING, Move.POWER_GEM, Move.MIRROR_COAT, Move.EARTH_POWER, Move.FLAIL}), Type.WATER, Type.ROCK),
        REMORAID("Remoraid", "223", (short)190, new short[] {35, 65, 35, 65, 35, 65}, (byte)60, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 6, 10, 14, 18, 22, 26, 30, 34, 38, 42, 46, 50}, new Move[] {Move.WATER_GUN, Move.LOCK_ON, Move.PSYBEAM, Move.AURORA_BEAM, Move.BUBBLEBEAM, Move.FOCUS_ENERGY, Move.WATER_PULSE, Move.SIGNAL_BEAM, Move.ICE_BEAM, Move.BULLET_SEED, Move.HYDRO_PUMP, Move.HYPER_BEAM, Move.SOAK}), Type.WATER),
        OCTILLERY("Octillery", "224", (short)75, new short[] {75, 105, 75, 105, 75, 45}, (byte)168, new byte[] {0, 1, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 6, 10, 14, 18, 22, 25, 28, 34, 40, 46, 52, 58, 64}, new Move[] {Move.GUNK_SHOT, Move.ROCK_BLAST, Move.WATER_GUN, Move.CONSTRICT, Move.PSYBEAM, Move.AURORA_BEAM, Move.CONSTRICT, Move.PSYBEAM, Move.AURORA_BEAM, Move.BUBBLEBEAM, Move.FOCUS_ENERGY, Move.OCTAZOOKA, Move.WRING_OUT, Move.SIGNAL_BEAM, Move.ICE_BEAM, Move.BULLET_SEED, Move.HYDRO_PUMP, Move.HYPER_BEAM, Move.SOAK}), Type.WATER),
        DELIBIRD("Delibird", "225", (short)45, new short[] {45, 55, 45, 65, 45, 75}, (byte)116, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0}, new Move[] {Move.PRESENT}), Type.ICE, Type.FLYING),
        MANTINE("Mantine", "226", (short)25, new short[] {65, 40, 70, 80, 140, 70}, (byte)163, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 3, 7, 11, 14, 16, 19, 23, 27, 32, 36, 39, 46, 49}, new Move[] {Move.PSYBEAM, Move.BULLET_SEED, Move.SIGNAL_BEAM, Move.TACKLE, Move.BUBBLE, Move.SUPERSONIC, Move.BUBBLEBEAM, Move.SUPERSONIC, Move.BUBBLEBEAM, Move.CONFUSE_RAY, Move.WING_ATTACK, Move.HEADBUTT, Move.WATER_PULSE, Move.WIDE_GUARD, Move.TAKE_DOWN, Move.AGILITY, Move.AIR_SLASH, Move.AQUA_RING, Move.BOUNCE, Move.HYDRO_PUMP}), Type.WATER, Type.FLYING),
        SKARMORY("Skarmory", "227", (short)25, new short[] {65, 80, 140, 40, 70, 70}, (byte)163, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 6, 9, 12, 17, 20, 23, 28, 31, 34, 39, 42, 45, 50}, new Move[] {Move.LEER, Move.PECK, Move.SAND_ATTACK, Move.SWIFT, Move.AGILITY, Move.FURY_ATTACK, Move.FEINT, Move.AIR_CUTTER, Move.SPIKES, Move.METAL_SOUND, Move.STEEL_WING, Move.AUTOTOMIZE, Move.AIR_SLASH, Move.SLASH, Move.NIGHT_SLASH}), Type.STEEL, Type.FLYING),
        HOUNDOUR("Houndour", "228", (short)120, new short[] {45, 60, 30, 80, 50, 65}, (byte)66, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 4, 8, 13, 17, 20, 25, 28, 32, 37, 40, 44, 49, 52, 56}, new Move[] {Move.LEER, Move.EMBER, Move.HOWL, Move.SMOG, Move.ROAR, Move.BITE, Move.ODOR_SLEUTH, Move.BEAT_UP, Move.FIRE_FANG, Move.FAINT_ATTACK, Move.EMBARGO, Move.FOUL_PLAY, Move.FLAMETHROWER, Move.CRUNCH, Move.NASTY_PLOT, Move.INFERNO}), Type.DARK, Type.FIRE),
        HOUNDOOM("Houndoom", "229", (short)45, new short[] {75, 90, 50, 110, 80, 95}, (byte)175, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 4, 8, 13, 16, 20, 26, 30, 35, 41, 45, 50, 56, 60, 65}, new Move[] {Move.THUNDER_FANG, Move.LEER, Move.EMBER, Move.HOWL, Move.SMOG, Move.HOWL, Move.SMOG, Move.ROAR, Move.BITE, Move.ODOR_SLEUTH, Move.BEAT_UP, Move.FIRE_FANG, Move.FAINT_ATTACK, Move.EMBARGO, Move.FOUL_PLAY, Move.FLAMETHROWER, Move.CRUNCH, Move.NASTY_PLOT, Move.INFERNO}), Type.DARK, Type.FIRE),
        KINGDRA("Kingdra", "230", (short)45, new short[] {75, 95, 95, 95, 95, 85}, (byte)243, new byte[] {0, 1, 0, 1, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 4, 8, 11, 14, 18, 23, 26, 30, 40, 48, 57}, new Move[] {Move.YAWN, Move.BUBBLE, Move.SMOKESCREEN, Move.LEER, Move.WATER_GUN, Move.SMOKESCREEN, Move.LEER, Move.WATER_GUN, Move.FOCUS_ENERGY, Move.BUBBLEBEAM, Move.AGILITY, Move.TWISTER, Move.BRINE, Move.HYDRO_PUMP, Move.DRAGON_DANCE, Move.DRAGON_PULSE}), Type.WATER, Type.DRAGON),
        PHANPY("Phanpy", "231", (short)120, new short[] {90, 60, 60, 40, 40, 40}, (byte)66, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 6, 10, 15, 19, 24, 28, 33, 37, 42}, new Move[] {Move.ODOR_SLEUTH, Move.TACKLE, Move.GROWL, Move.DEFENSE_CURL, Move.FLAIL, Move.TAKE_DOWN, Move.ROLLOUT, Move.NATURAL_GIFT, Move.SLAM, Move.ENDURE, Move.CHARM, Move.LAST_RESORT, Move.DOUBLE_EDGE}), Type.GROUND),
        DONPHAN("Donphan", "232", (short)60, new short[] {90, 120, 120, 60, 60, 50}, (byte)175, new byte[] {0, 1, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 6, 10, 15, 19, 24, 25, 31, 39, 46, 54}, new Move[] {Move.FIRE_FANG, Move.THUNDER_FANG, Move.HORN_ATTACK, Move.GROWL, Move.DEFENSE_CURL, Move.BULLDOZE, Move.RAPID_SPIN, Move.KNOCK_OFF, Move.ROLLOUT, Move.MAGNITUDE, Move.SLAM, Move.FURY_ATTACK, Move.ASSURANCE, Move.SCARY_FACE, Move.EARTHQUAKE, Move.GIGA_IMPACT}), Type.GROUND),
        PORYGON2("Porygon2", "233", (short)45, new short[] {85, 80, 90, 105, 95, 60}, (byte)180, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 7, 12, 18, 23, 29, 34, 40, 45, 51, 56, 62, 67}, new Move[] {Move.CONVERSION_2, Move.TACKLE, Move.CONVERSION, Move.DEFENSE_CURL, Move.PSYBEAM, Move.AGILITY, Move.RECOVER, Move.MAGNET_RISE, Move.SIGNAL_BEAM, Move.RECYCLE, Move.DISCHARGE, Move.LOCK_ON, Move.TRI_ATTACK, Move.MAGIC_COAT, Move.ZAP_CANNON, Move.HYPER_BEAM}), Type.NORMAL),
        STANTLER("Stantler", "234", (short)45, new short[] {73, 95, 62, 85, 65, 85}, (byte)163, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 3, 7, 10, 13, 16, 21, 23, 27, 33, 38, 43, 49, 53, 55}, new Move[] {Move.TACKLE, Move.LEER, Move.ASTONISH, Move.HYPNOSIS, Move.STOMP, Move.SAND_ATTACK, Move.TAKE_DOWN, Move.CONFUSE_RAY, Move.CALM_MIND, Move.ROLE_PLAY, Move.ZEN_HEADBUTT, Move.JUMP_KICK, Move.IMPRISON, Move.CAPTIVATE, Move.ME_FIRST}), Type.NORMAL),
        SMEARGLE("Smeargle", "235", (short)45, new short[] {55, 20, 35, 20, 45, 75}, (byte)88, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 11, 21, 31, 41, 51, 61, 71, 81, 91}, new Move[] {Move.SKETCH, Move.SKETCH, Move.SKETCH, Move.SKETCH, Move.SKETCH, Move.SKETCH, Move.SKETCH, Move.SKETCH, Move.SKETCH, Move.SKETCH}), Type.NORMAL),
        TYROGUE("Tyrogue", "236", (short)75, new short[] {35, 35, 35, 35, 35, 35}, (byte)42, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0}, new Move[] {Move.TACKLE, Move.HELPING_HAND, Move.FAKE_OUT, Move.FORESIGHT}), Type.FIGHTING),
        HITMONTOP("Hitmontop", "237", (short)45, new short[] {50, 95, 95, 35, 110, 70}, (byte)159, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 6, 10, 15, 19, 24, 28, 33, 37, 42, 46, 46, 51, 55, 60}, new Move[] {Move.REVENGE, Move.ROLLING_KICK, Move.FOCUS_ENERGY, Move.PURSUIT, Move.QUICK_ATTACK, Move.TRIPLE_KICK, Move.RAPID_SPIN, Move.COUNTER, Move.FEINT, Move.AGILITY, Move.GYRO_BALL, Move.WIDE_GUARD, Move.QUICK_GUARD, Move.DETECT, Move.CLOSE_COMBAT, Move.ENDEAVOR}), Type.FIGHTING),
        SMOOCHUM("Smoochum", "238", (short)45, new short[] {45, 30, 15, 85, 65, 65}, (byte)61, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.FEMALE_ONLY, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 5, 8, 11, 15, 18, 21, 25, 28, 31, 35, 38, 41, 45, 48}, new Move[] {Move.POUND, Move.LICK, Move.SWEET_KISS, Move.POWDER_SNOW, Move.CONFUSION, Move.SING, Move.HEART_STAMP, Move.MEAN_LOOK, Move.FAKE_TEARS, Move.LUCKY_CHANT, Move.AVALANCHE, Move.PSYCHIC, Move.COPYCAT, Move.PERISH_SONG, Move.BLIZZARD}), Type.ICE, Type.PSYCHIC),
        ELEKID("Elekid", "239", (short)45, new short[] {45, 63, 37, 65, 55, 95}, (byte)72, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 33, 36, 40, 43}, new Move[] {Move.QUICK_ATTACK, Move.LEER, Move.THUNDERSHOCK, Move.LOW_KICK, Move.SWIFT, Move.SHOCK_WAVE, Move.THUNDER_WAVE, Move.ELECTRO_BALL, Move.LIGHT_SCREEN, Move.THUNDERPUNCH, Move.DISCHARGE, Move.SCREECH, Move.THUNDERBOLT, Move.THUNDER}), Type.ELECTRIC),
        MAGBY("Magby", "240", (short)45, new short[] {45, 75, 37, 70, 55, 83}, (byte)73, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 33, 36, 40, 43}, new Move[] {Move.SMOG, Move.LEER, Move.EMBER, Move.SMOKESCREEN, Move.FAINT_ATTACK, Move.FIRE_SPIN, Move.CLEAR_SMOG, Move.FLAME_BURST, Move.CONFUSE_RAY, Move.FIRE_PUNCH, Move.LAVA_PLUME, Move.SUNNY_DAY, Move.FLAMETHROWER, Move.FIRE_BLAST}), Type.FIRE),
        MILTANK("Miltank", "241", (short)45, new short[] {95, 80, 105, 40, 70, 100}, (byte)172, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.FEMALE_ONLY, ExperienceGroup.SLOW,convertToMap(new int[] {0, 3, 5, 8, 11, 15, 19, 24, 29, 35, 41, 48, 55}, new Move[] {Move.TACKLE, Move.GROWL, Move.DEFENSE_CURL, Move.STOMP, Move.MILK_DRINK, Move.BIDE, Move.ROLLOUT, Move.BODY_SLAM, Move.ZEN_HEADBUTT, Move.CAPTIVATE, Move.GYRO_BALL, Move.HEAL_BELL, Move.WAKE_UP_SLAP}), Type.NORMAL),
        BLISSEY("Blissey", "242", (short)30, new short[] {255, 10, 10, 75, 135, 55}, (byte)608, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.FEMALE_ONLY, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 5, 9, 12, 16, 20, 23, 27, 31, 34, 38, 42, 46, 50, 54}, new Move[] {Move.DEFENSE_CURL, Move.POUND, Move.GROWL, Move.TAIL_WHIP, Move.REFRESH, Move.DOUBLESLAP, Move.SOFTBOILED, Move.BESTOW, Move.MINIMIZE, Move.TAKE_DOWN, Move.SING, Move.FLING, Move.HEAL_PULSE, Move.EGG_BOMB, Move.LIGHT_SCREEN, Move.HEALING_WISH, Move.DOUBLE_EDGE}), Type.NORMAL),
        RAIKOU("Raikou", "243", (short)3, new short[] {90, 85, 75, 115, 100, 115}, (byte)261, new byte[] {0, 0, 0, 1, 0, 2}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64, 71, 78, 85}, new Move[] {Move.BITE, Move.LEER, Move.THUNDERSHOCK, Move.ROAR, Move.QUICK_ATTACK, Move.SPARK, Move.REFLECT, Move.CRUNCH, Move.THUNDER_FANG, Move.DISCHARGE, Move.EXTRASENSORY, Move.RAIN_DANCE, Move.CALM_MIND, Move.THUNDER}), Type.ELECTRIC),
        ENTEI("Entei", "244", (short)3, new short[] {115, 115, 85, 90, 75, 100}, (byte)261, new byte[] {1, 2, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64, 71, 78, 85}, new Move[] {Move.BITE, Move.LEER, Move.EMBER, Move.ROAR, Move.FIRE_SPIN, Move.STOMP, Move.FLAMETHROWER, Move.SWAGGER, Move.FIRE_FANG, Move.LAVA_PLUME, Move.EXTRASENSORY, Move.FIRE_BLAST, Move.CALM_MIND, Move.ERUPTION}), Type.FIRE),
        SUICUNE("Suicune", "245", (short)3, new short[] {100, 75, 115, 90, 115, 85}, (byte)261, new byte[] {0, 0, 1, 0, 2, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64, 71, 78, 85}, new Move[] {Move.BITE, Move.LEER, Move.BUBBLEBEAM, Move.RAIN_DANCE, Move.GUST, Move.AURORA_BEAM, Move.MIST, Move.MIRROR_COAT, Move.ICE_FANG, Move.TAILWIND, Move.EXTRASENSORY, Move.HYDRO_PUMP, Move.CALM_MIND, Move.BLIZZARD}), Type.WATER),
        LARVITAR("Larvitar", "246", (short)45, new short[] {50, 64, 50, 45, 50, 41}, (byte)60, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 5, 10, 14, 19, 23, 28, 32, 37, 41, 46, 50, 55}, new Move[] {Move.BITE, Move.LEER, Move.SANDSTORM, Move.SCREECH, Move.CHIP_AWAY, Move.ROCK_SLIDE, Move.SCARY_FACE, Move.THRASH, Move.DARK_PULSE, Move.PAYBACK, Move.CRUNCH, Move.EARTHQUAKE, Move.STONE_EDGE, Move.HYPER_BEAM}), Type.ROCK, Type.GROUND),
        PUPITAR("Pupitar", "247", (short)45, new short[] {70, 84, 70, 65, 70, 51}, (byte)144, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 5, 10, 14, 19, 23, 28, 34, 41, 47, 54, 60, 67}, new Move[] {Move.BITE, Move.LEER, Move.SANDSTORM, Move.SCREECH, Move.SANDSTORM, Move.SCREECH, Move.CHIP_AWAY, Move.ROCK_SLIDE, Move.SCARY_FACE, Move.THRASH, Move.DARK_PULSE, Move.PAYBACK, Move.CRUNCH, Move.EARTHQUAKE, Move.STONE_EDGE, Move.HYPER_BEAM}), Type.ROCK, Type.GROUND),
        TYRANITAR("Tyranitar", "248", (short)45, new short[] {100, 134, 110, 95, 100, 61}, (byte)270, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 5, 10, 14, 19, 23, 28, 34, 41, 47, 54, 63, 73, 82}, new Move[] {Move.THUNDER_FANG, Move.ICE_FANG, Move.FIRE_FANG, Move.BITE, Move.LEER, Move.SANDSTORM, Move.SCREECH, Move.SANDSTORM, Move.SCREECH, Move.CHIP_AWAY, Move.ROCK_SLIDE, Move.SCARY_FACE, Move.THRASH, Move.DARK_PULSE, Move.PAYBACK, Move.CRUNCH, Move.EARTHQUAKE, Move.STONE_EDGE, Move.HYPER_BEAM, Move.GIGA_IMPACT}), Type.ROCK, Type.DARK),
        LUGIA("Lugia", "249", (short)3, new short[] {106, 90, 130, 90, 154, 110}, (byte)306, new byte[] {0, 0, 0, 0, 3, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 9, 15, 23, 29, 37, 43, 50, 57, 65, 71, 79, 85, 93, 99}, new Move[] {Move.WHIRLWIND, Move.WEATHER_BALL, Move.GUST, Move.DRAGON_RUSH, Move.EXTRASENSORY, Move.RAIN_DANCE, Move.HYDRO_PUMP, Move.AEROBLAST, Move.PUNISHMENT, Move.ANCIENTPOWER, Move.SAFEGUARD, Move.RECOVER, Move.FUTURE_SIGHT, Move.NATURAL_GIFT, Move.CALM_MIND, Move.SKY_ATTACK}), Type.PSYCHIC, Type.FLYING),
        HO_OH("Ho-Oh", "250", (short)3, new short[] {106, 130, 90, 110, 154, 90}, (byte)306, new byte[] {0, 0, 0, 0, 3, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 9, 15, 23, 29, 37, 43, 50, 57, 65, 71, 79, 85, 93, 99}, new Move[] {Move.WHIRLWIND, Move.WEATHER_BALL, Move.GUST, Move.BRAVE_BIRD, Move.EXTRASENSORY, Move.SUNNY_DAY, Move.FIRE_BLAST, Move.SACRED_FIRE, Move.PUNISHMENT, Move.ANCIENTPOWER, Move.SAFEGUARD, Move.RECOVER, Move.FUTURE_SIGHT, Move.NATURAL_GIFT, Move.CALM_MIND, Move.SKY_ATTACK}), Type.FIRE, Type.FLYING),
        CELEBI("Celebi", "251", (short)45, new short[] {100, 100, 100, 100, 100, 100}, (byte)270, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 10, 19, 28, 37, 46, 55, 64, 73, 82, 91}, new Move[] {Move.LEECH_SEED, Move.CONFUSION, Move.RECOVER, Move.HEAL_BELL, Move.SAFEGUARD, Move.MAGICAL_LEAF, Move.ANCIENTPOWER, Move.BATON_PASS, Move.NATURAL_GIFT, Move.HEAL_BLOCK, Move.FUTURE_SIGHT, Move.HEALING_WISH, Move.LEAF_STORM, Move.PERISH_SONG}), Type.PSYCHIC, Type.GRASS);

        private final Map<Integer, Move> LEARNSET;
        private final ExperienceGroup EXP_GROUP;
        private final Species[] EVOLUTION;
        private final GenderRatio GENDER_RATIO;
        private final short[] BASE_STATS;
        private final byte[] EV_YIELD;
        private final Type[] TYPE;
        private final String NAME, NAT_DEX_NUMBER;
        private final short CATCH_RATE;

        Generation2(final String name, final String dexNumber, final short catchRate, final short[] stats, byte expYield, byte[] evYield,
                    GenderRatio ratio, ExperienceGroup group,/*final Species[] evolvesTo,*/ Map<Integer, Move> learnset, final Type... type)
        {
            if(type.length > 2)
            {
                throw new IllegalArgumentException("You must input 1 or 2 types for " + name + ". The types " +
                        Arrays.toString(type) + " are invalid.");
            }
            else if(type.length == 0)
            {
                throw new IllegalArgumentException("You must input at least one type for " + name);
            }

            LEARNSET = new TreeMap<>(learnset);
            GENDER_RATIO = ratio;
            EV_YIELD = new byte[] {evYield[0], evYield[1], evYield[2], evYield[3], evYield[4], evYield[5]};
            BASE_STATS = new short[] {stats[0], stats[1], stats[2], stats[3], stats[4], stats[5]};
            CATCH_RATE = catchRate;
            NAT_DEX_NUMBER = dexNumber;

            NAME = name;
            TYPE = type;

            EVOLUTION = null;
            /*if(evolvesFrom != null)
            {
                switch(evolvesFrom.length)
                {
                    case 1:
                        PREVOLUTION = new Species[]{evolvesFrom[0]};
                        break;
                    case 2:
                        PREVOLUTION = new Species[]{evolvesFrom[0], evolvesFrom[1]};
                        break;
                    case 3:
                        PREVOLUTION = new Species[]{evolvesFrom[0], evolvesFrom[1], evolvesFrom[2]};
                        break;
                    default:
                        PREVOLUTION = new Species[]{evolvesFrom[0], evolvesFrom[1], evolvesFrom[2], evolvesFrom[3]};
                        break;
                }
            }
            else
            {
                PREVOLUTION = null;
            }*/

            /*if(evolvesTo != null)
            {
                switch(evolvesTo.length)
                {
                    case 1:
                        EVOLUTION = new Species[]{evolvesTo[0]};
                        break;
                    case 2:
                        EVOLUTION = new Species[]{evolvesTo[0], evolvesTo[1]};
                        break;
                    case 3:
                        EVOLUTION = new Species[]{evolvesTo[0], evolvesTo[1], evolvesTo[2]};
                        break;
                    default:
                        EVOLUTION = new Species[]{evolvesTo[0], evolvesTo[1], evolvesTo[2], evolvesTo[3]};
                        break;
                }
            }
            else
            {
                EVOLUTION = null;
            }*/

            EXP_GROUP = group;
        }
    }
    private enum Generation3
    {
        TREECKO("Treecko", "252", (short)45, new short[] {40, 45, 35, 65, 55, 70}, (byte)62, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 6, 11, 16, 21, 26, 31, 36, 41, 46, 51}, new Move[] {Move.POUND, Move.LEER, Move.ABSORB, Move.QUICK_ATTACK, Move.PURSUIT, Move.SCREECH, Move.MEGA_DRAIN, Move.AGILITY, Move.SLAM, Move.DETECT, Move.GIGA_DRAIN, Move.ENERGY_BALL}), Type.GRASS),
        GROVYLE("Grovyle", "253", (short)45, new short[] {50, 65, 45, 85, 65, 95}, (byte)142, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 6, 11, 16, 17, 23, 29, 35, 41, 47, 53, 59}, new Move[] {Move.POUND, Move.LEER, Move.ABSORB, Move.QUICK_ATTACK, Move.ABSORB, Move.QUICK_ATTACK, Move.FURY_CUTTER, Move.PURSUIT, Move.SCREECH, Move.LEAF_BLADE, Move.AGILITY, Move.SLAM, Move.DETECT, Move.FALSE_SWIPE, Move.LEAF_STORM}), Type.GRASS),
        SCEPTILE("Sceptile", "254", (short)45, new short[] {70, 85, 65, 105, 85, 120}, (byte)239, new byte[] {0, 0, 0, 0, 0, 3}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 6, 11, 16, 17, 23, 29, 35, 43, 51, 59, 67}, new Move[] {Move.NIGHT_SLASH, Move.POUND, Move.LEER, Move.ABSORB, Move.QUICK_ATTACK, Move.ABSORB, Move.QUICK_ATTACK, Move.X_SCISSOR, Move.PURSUIT, Move.SCREECH, Move.LEAF_BLADE, Move.AGILITY, Move.SLAM, Move.DETECT, Move.FALSE_SWIPE, Move.LEAF_STORM}), Type.GRASS),
        TORCHIC("Torchic", "255", (short)45, new short[] {45, 60, 40, 70, 50, 45}, (byte)62, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 7, 10, 16, 19, 25, 28, 34, 37, 43}, new Move[] {Move.SCRATCH, Move.GROWL, Move.FOCUS_ENERGY, Move.EMBER, Move.PECK, Move.SAND_ATTACK, Move.FIRE_SPIN, Move.QUICK_ATTACK, Move.SLASH, Move.MIRROR_MOVE, Move.FLAMETHROWER}), Type.FIRE),
        COMBUSKEN("Combusken", "256", (short)45, new short[] {60, 85, 60, 85, 60, 55}, (byte)142, new byte[] {0, 1, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 7, 13, 16, 17, 21, 28, 32, 39, 43, 50, 54}, new Move[] {Move.SCRATCH, Move.GROWL, Move.FOCUS_ENERGY, Move.EMBER, Move.FOCUS_ENERGY, Move.EMBER, Move.DOUBLE_KICK, Move.PECK, Move.SAND_ATTACK, Move.BULK_UP, Move.QUICK_ATTACK, Move.SLASH, Move.MIRROR_MOVE, Move.SKY_UPPERCUT, Move.FLARE_BLITZ}), Type.FIRE, Type.FIGHTING),
        BLAZIKEN("Blaziken", "257", (short)45, new short[] {80, 120, 70, 110, 70, 80}, (byte)239, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 7, 13, 16, 17, 21, 28, 32, 36, 42, 49, 59, 66}, new Move[] {Move.FIRE_PUNCH, Move.HI_JUMP_KICK, Move.SCRATCH, Move.GROWL, Move.FOCUS_ENERGY, Move.EMBER, Move.FOCUS_ENERGY, Move.EMBER, Move.DOUBLE_KICK, Move.PECK, Move.SAND_ATTACK, Move.BULK_UP, Move.QUICK_ATTACK, Move.BLAZE_KICK, Move.SLASH, Move.BRAVE_BIRD, Move.SKY_UPPERCUT, Move.FLARE_BLITZ}), Type.FIRE, Type.FIGHTING),
        MUDKIP("Mudkip", "258", (short)45, new short[] {50, 70, 50, 50, 50, 40}, (byte)62, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 6, 10, 15, 19, 24, 28, 33, 37, 42, 46}, new Move[] {Move.TACKLE, Move.GROWL, Move.MUD_SLAP, Move.WATER_GUN, Move.BIDE, Move.FORESIGHT, Move.MUD_SPORT, Move.TAKE_DOWN, Move.WHIRLPOOL, Move.PROTECT, Move.HYDRO_PUMP, Move.ENDEAVOR}), Type.WATER),
        MARSHTOMP("Marshtomp", "259", (short)45, new short[] {70, 85, 70, 60, 70, 50}, (byte)142, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 6, 10, 15, 16, 20, 25, 31, 37, 42, 46, 53}, new Move[] {Move.TACKLE, Move.GROWL, Move.MUD_SLAP, Move.WATER_GUN, Move.MUD_SLAP, Move.WATER_GUN, Move.BIDE, Move.MUD_SHOT, Move.FORESIGHT, Move.MUD_BOMB, Move.TAKE_DOWN, Move.MUDDY_WATER, Move.PROTECT, Move.EARTHQUAKE, Move.ENDEAVOR}), Type.WATER, Type.GROUND),
        SWAMPERT("Swampert", "260", (short)45, new short[] {100, 110, 90, 85, 90, 60}, (byte)241, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 6, 10, 15, 16, 20, 25, 31, 39, 46, 52, 61, 69}, new Move[] {Move.TACKLE, Move.GROWL, Move.MUD_SLAP, Move.WATER_GUN, Move.MUD_SLAP, Move.WATER_GUN, Move.BIDE, Move.MUD_SHOT, Move.FORESIGHT, Move.MUD_BOMB, Move.TAKE_DOWN, Move.MUDDY_WATER, Move.PROTECT, Move.EARTHQUAKE, Move.ENDEAVOR, Move.HAMMER_ARM}), Type.WATER, Type.GROUND),
        POOCHYENA("Poochyena", "261", (short)255, new short[] {35, 55, 35, 30, 30, 35}, (byte)44, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53}, new Move[] {Move.TACKLE, Move.HOWL, Move.SAND_ATTACK, Move.BITE, Move.ODOR_SLEUTH, Move.ROAR, Move.SWAGGER, Move.ASSURANCE, Move.SCARY_FACE, Move.TAUNT, Move.EMBARGO, Move.TAKE_DOWN, Move.SUCKER_PUNCH, Move.CRUNCH}), Type.DARK),
        MIGHTYENA("Mightyena", "262", (short)127, new short[] {70, 90, 70, 60, 60, 70}, (byte)147, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 5, 9, 13, 17, 22, 27, 32, 37, 42, 47, 52, 57, 62}, new Move[] {Move.TACKLE, Move.HOWL, Move.SAND_ATTACK, Move.BITE, Move.HOWL, Move.SAND_ATTACK, Move.BITE, Move.ODOR_SLEUTH, Move.ROAR, Move.SWAGGER, Move.ASSURANCE, Move.SCARY_FACE, Move.TAUNT, Move.EMBARGO, Move.TAKE_DOWN, Move.THIEF, Move.SUCKER_PUNCH}), Type.DARK),
        ZIGZAGOON("Zigzagoon", "263", (short)255, new short[] {38, 30, 41, 30, 41, 60}, (byte)48, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49}, new Move[] {Move.TACKLE, Move.GROWL, Move.TAIL_WHIP, Move.HEADBUTT, Move.SAND_ATTACK, Move.ODOR_SLEUTH, Move.MUD_SPORT, Move.PIN_MISSILE, Move.COVET, Move.BESTOW, Move.FLAIL, Move.REST, Move.BELLY_DRUM, Move.FLING}), Type.NORMAL),
        LINOONE("Linoone", "264", (short)90, new short[] {78, 70, 61, 50, 61, 100}, (byte)147, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 9, 13, 17, 23, 29, 35, 41, 47, 53, 59, 65}, new Move[] {Move.SWITCHEROO, Move.TACKLE, Move.GROWL, Move.TAIL_WHIP, Move.HEADBUTT, Move.TAIL_WHIP, Move.HEADBUTT, Move.SAND_ATTACK, Move.ODOR_SLEUTH, Move.MUD_SPORT, Move.FURY_SWIPES, Move.COVET, Move.BESTOW, Move.SLASH, Move.REST, Move.BELLY_DRUM, Move.FLING}), Type.NORMAL),
        WURMPLE("Wurmple", "265", (short)255, new short[] {45, 45, 35, 20, 30, 20}, (byte)39, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 15}, new Move[] {Move.TACKLE, Move.STRING_SHOT, Move.POISON_STING, Move.BUG_BITE}), Type.BUG),
        SILCOON("Silcoon", "266", (short)120, new short[] {50, 35, 55, 25, 25, 15}, (byte)72, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 7}, new Move[] {Move.HARDEN, Move.HARDEN}), Type.BUG),
        BEAUTIFLY("Beautifly", "267", (short)45, new short[] {60, 70, 50, 90, 50, 65}, (byte)173, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 10, 13, 17, 20, 24, 27, 31, 34, 38, 41, 45}, new Move[] {Move.ABSORB, Move.ABSORB, Move.GUST, Move.STUN_SPORE, Move.MORNING_SUN, Move.MEGA_DRAIN, Move.WHIRLWIND, Move.ATTRACT, Move.SILVER_WIND, Move.GIGA_DRAIN, Move.BUG_BUZZ, Move.QUIVER_DANCE}), Type.BUG, Type.FLYING),
        CASCOON("Cascoon", "268", (short)120, new short[] {50, 35, 55, 25, 25, 15}, (byte)41, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 7}, new Move[] {Move.HARDEN, Move.HARDEN}), Type.BUG),
        DUSTOX("Dustox", "269", (short)45, new short[] {60, 50, 70, 50, 90, 65}, (byte)135, new byte[] {0, 0, 0, 0, 3, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 10, 13, 17, 20, 24, 27, 31, 34, 38, 41, 45}, new Move[] {Move.CONFUSION, Move.CONFUSION, Move.GUST, Move.PROTECT, Move.MOONLIGHT, Move.PSYBEAM, Move.WHIRLWIND, Move.LIGHT_SCREEN, Move.SILVER_WIND, Move.TOXIC, Move.BUG_BUZZ, Move.QUIVER_DANCE}), Type.BUG, Type.POISON),
        LOTAD("Lotad", "270", (short)255, new short[] {40, 30, 30, 40, 50, 30}, (byte)44, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 3, 5, 7, 11, 15, 19, 25, 31, 37, 45}, new Move[] {Move.ASTONISH, Move.GROWL, Move.ABSORB, Move.NATURE_POWER, Move.MIST, Move.NATURAL_GIFT, Move.MEGA_DRAIN, Move.BUBBLEBEAM, Move.ZEN_HEADBUTT, Move.RAIN_DANCE, Move.ENERGY_BALL}), Type.WATER, Type.GRASS),
        LOMBRE("Lombre", "271", (short)120, new short[] {60, 50, 50, 60, 70, 50}, (byte)119, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 3, 5, 7, 11, 15, 19, 25, 31, 37, 45}, new Move[] {Move.ASTONISH, Move.GROWL, Move.ABSORB, Move.NATURE_POWER, Move.FAKE_OUT, Move.FURY_SWIPES, Move.WATER_SPORT, Move.BUBBLEBEAM, Move.ZEN_HEADBUTT, Move.UPROAR, Move.HYDRO_PUMP}), Type.WATER, Type.GRASS),
        LUDICOLO("Ludicolo", "272", (short)45, new short[] {80, 70, 70, 90, 100, 70}, (byte)216, new byte[] {0, 0, 0, 0, 3, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0}, new Move[] {Move.ASTONISH, Move.GROWL, Move.MEGA_DRAIN, Move.NATURE_POWER}), Type.WATER, Type.GRASS),
        SEEDOT("Seedot", "273", (short)255, new short[] {40, 40, 50, 30, 30, 30}, (byte)44, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 3, 7, 13, 21, 31, 43}, new Move[] {Move.BIDE, Move.HARDEN, Move.GROWTH, Move.NATURE_POWER, Move.SYNTHESIS, Move.SUNNY_DAY, Move.EXPLOSION}), Type.GRASS),
        NUZLEAF("Nuzleaf", "274", (short)120, new short[] {70, 70, 40, 60, 40, 60}, (byte)119, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 3, 7, 13, 19, 25, 31, 37, 43, 49}, new Move[] {Move.RAZOR_LEAF, Move.POUND, Move.HARDEN, Move.GROWTH, Move.NATURE_POWER, Move.FAKE_OUT, Move.TORMENT, Move.FAINT_ATTACK, Move.RAZOR_WIND, Move.SWAGGER, Move.EXTRASENSORY}), Type.GRASS, Type.DARK),
        SHIFTRY("Shiftry", "275", (short)45, new short[] {90, 100, 60, 90, 60, 80}, (byte)216, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 19, 49}, new Move[] {Move.FAINT_ATTACK, Move.WHIRLWIND, Move.NASTY_PLOT, Move.RAZOR_LEAF, Move.LEAF_TORNADO, Move.LEAF_STORM}), Type.GRASS, Type.DARK),
        TAILLOW("Taillow", "276", (short)200, new short[] {40, 55, 30, 30, 30, 85}, (byte)54, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 4, 8, 13, 19, 26, 34, 43, 53}, new Move[] {Move.PECK, Move.GROWL, Move.FOCUS_ENERGY, Move.QUICK_ATTACK, Move.WING_ATTACK, Move.DOUBLE_TEAM, Move.ENDEAVOR, Move.AERIAL_ACE, Move.AGILITY, Move.AIR_SLASH}), Type.NORMAL, Type.FLYING),
        SWELLOW("Swellow", "277", (short)45, new short[] {60, 85, 60, 50, 50, 125}, (byte)151, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 4, 8, 13, 19, 28, 38, 49, 61}, new Move[] {Move.PLUCK, Move.PECK, Move.GROWL, Move.FOCUS_ENERGY, Move.QUICK_ATTACK, Move.FOCUS_ENERGY, Move.QUICK_ATTACK, Move.WING_ATTACK, Move.DOUBLE_TEAM, Move.ENDEAVOR, Move.AERIAL_ACE, Move.AGILITY, Move.AIR_SLASH}), Type.NORMAL, Type.FLYING),
        WINGULL("Wingull", "278", (short)190, new short[] {40, 30, 30, 55, 30, 85}, (byte)54, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 6, 9, 14, 17, 22, 26, 30, 33, 38, 42, 46, 49}, new Move[] {Move.GROWL, Move.WATER_GUN, Move.SUPERSONIC, Move.WING_ATTACK, Move.MIST, Move.WATER_PULSE, Move.QUICK_ATTACK, Move.ROOST, Move.PURSUIT, Move.AIR_CUTTER, Move.AGILITY, Move.AERIAL_ACE, Move.AIR_SLASH, Move.HURRICANE}), Type.WATER, Type.FLYING),
        PELIPPER("Pelipper", "279", (short)45, new short[] {60, 50, 100, 85, 70, 65}, (byte)151, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 6, 9, 14, 17, 22, 25, 28, 34, 39, 39, 39, 46, 52, 58, 63}, new Move[] {Move.SOAK, Move.GROWL, Move.WATER_GUN, Move.WATER_SPORT, Move.WING_ATTACK, Move.SUPERSONIC, Move.WING_ATTACK, Move.MIST, Move.WATER_PULSE, Move.PAYBACK, Move.PROTECT, Move.ROOST, Move.BRINE, Move.STOCKPILE, Move.SWALLOW, Move.SPIT_UP, Move.FLING, Move.TAILWIND, Move.HYDRO_PUMP, Move.HURRICANE}), Type.WATER, Type.FLYING),
        RALTS("Ralts", "280", (short)235, new short[] {28, 25, 25, 45, 35, 40}, (byte)40, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 6, 10, 12, 17, 21, 23, 28, 32, 34, 39, 43, 45, 50, 54}, new Move[] {Move.GROWL, Move.CONFUSION, Move.DOUBLE_TEAM, Move.TELEPORT, Move.LUCKY_CHANT, Move.MAGICAL_LEAF, Move.HEAL_PULSE, Move.CALM_MIND, Move.PSYCHIC, Move.IMPRISON, Move.FUTURE_SIGHT, Move.CHARM, Move.HYPNOSIS, Move.DREAM_EATER, Move.STORED_POWER}), Type.PSYCHIC),
        KIRLIA("Kirlia", "281", (short)120, new short[] {38, 35, 35, 65, 55, 50}, (byte)97, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 6, 10, 12, 17, 22, 25, 31, 36, 39, 45, 50, 53, 59, 64}, new Move[] {Move.GROWL, Move.CONFUSION, Move.DOUBLE_TEAM, Move.TELEPORT, Move.CONFUSION, Move.DOUBLE_TEAM, Move.TELEPORT, Move.LUCKY_CHANT, Move.MAGICAL_LEAF, Move.HEAL_PULSE, Move.CALM_MIND, Move.PSYCHIC, Move.IMPRISON, Move.FUTURE_SIGHT, Move.CHARM, Move.HYPNOSIS, Move.DREAM_EATER, Move.STORED_POWER}), Type.PSYCHIC),
        GARDEVOIR("Gardevoir", "282", (short)45, new short[] {68, 65, 65, 125, 115, 80}, (byte)233, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 6, 10, 12, 17, 22, 25, 33, 40, 45, 53, 60, 65, 73, 80}, new Move[] {Move.HEALING_WISH, Move.GROWL, Move.CONFUSION, Move.DOUBLE_TEAM, Move.TELEPORT, Move.CONFUSION, Move.DOUBLE_TEAM, Move.TELEPORT, Move.WISH, Move.MAGICAL_LEAF, Move.HEAL_PULSE, Move.CALM_MIND, Move.PSYCHIC, Move.IMPRISON, Move.FUTURE_SIGHT, Move.CAPTIVATE, Move.HYPNOSIS, Move.DREAM_EATER, Move.STORED_POWER}), Type.PSYCHIC),
        SURSKIT("Surskit", "283", (short)200, new short[] {40, 30, 32, 50, 52, 65}, (byte)54, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 7, 13, 19, 25, 31, 37, 37, 43}, new Move[] {Move.BUBBLE, Move.QUICK_ATTACK, Move.SWEET_SCENT, Move.WATER_SPORT, Move.BUBBLEBEAM, Move.AGILITY, Move.MIST, Move.HAZE, Move.BATON_PASS}), Type.BUG, Type.WATER),
        MASQUERAIN("Masquerain", "284", (short)75, new short[] {70, 60, 62, 80, 82, 60}, (byte)145, new byte[] {0, 0, 0, 1, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 7, 13, 19, 22, 26, 33, 40, 47, 54, 61, 68}, new Move[] {Move.OMINOUS_WIND, Move.BUBBLE, Move.QUICK_ATTACK, Move.SWEET_SCENT, Move.WATER_SPORT, Move.QUICK_ATTACK, Move.SWEET_SCENT, Move.WATER_SPORT, Move.GUST, Move.SCARY_FACE, Move.STUN_SPORE, Move.SILVER_WIND, Move.AIR_SLASH, Move.WHIRLWIND, Move.BUG_BUZZ, Move.QUIVER_DANCE}), Type.BUG, Type.FLYING),
        SHROOMISH("Shroomish", "285", (short)255, new short[] {60, 40, 60, 40, 60, 35}, (byte)59, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FLUCTUATING,convertToMap(new int[] {0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45}, new Move[] {Move.ABSORB, Move.TACKLE, Move.STUN_SPORE, Move.LEECH_SEED, Move.MEGA_DRAIN, Move.HEADBUTT, Move.POISONPOWDER, Move.WORRY_SEED, Move.GROWTH, Move.GIGA_DRAIN, Move.SEED_BOMB, Move.SPORE}), Type.GRASS),
        BRELOOM("Breloom", "286", (short)90, new short[] {60, 130, 80, 60, 60, 70}, (byte)161, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FLUCTUATING,convertToMap(new int[] {0, 0, 0, 0, 5, 9, 13, 17, 21, 23, 25, 29, 33, 37, 41, 45}, new Move[] {Move.ABSORB, Move.TACKLE, Move.STUN_SPORE, Move.LEECH_SEED, Move.TACKLE, Move.STUN_SPORE, Move.LEECH_SEED, Move.MEGA_DRAIN, Move.HEADBUTT, Move.MACH_PUNCH, Move.COUNTER, Move.FORCE_PALM, Move.SKY_UPPERCUT, Move.MIND_READER, Move.SEED_BOMB, Move.DYNAMICPUNCH}), Type.GRASS, Type.FIGHTING),
        SLAKOTH("Slakoth", "287", (short)255, new short[] {60, 60, 60, 35, 35, 30}, (byte)56, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 7, 13, 19, 25, 31, 37, 43, 49}, new Move[] {Move.SCRATCH, Move.YAWN, Move.ENCORE, Move.SLACK_OFF, Move.FAINT_ATTACK, Move.AMNESIA, Move.COVET, Move.CHIP_AWAY, Move.COUNTER, Move.FLAIL}), Type.NORMAL),
        VIGOROTH("Vigoroth", "288", (short)120, new short[] {80, 80, 80, 55, 55, 90}, (byte)154, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 7, 13, 19, 25, 31, 37, 43, 49, 55}, new Move[] {Move.SCRATCH, Move.FOCUS_ENERGY, Move.ENCORE, Move.UPROAR, Move.ENCORE, Move.UPROAR, Move.FURY_SWIPES, Move.ENDURE, Move.SLASH, Move.COUNTER, Move.CHIP_AWAY, Move.FOCUS_PUNCH, Move.REVERSAL}), Type.NORMAL),
        SLAKING("Slaking", "289", (short)45, new short[] {150, 160, 100, 95, 65, 100}, (byte)252, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 7, 13, 19, 25, 31, 36, 37, 43, 49, 55, 61, 67}, new Move[] {Move.SCRATCH, Move.YAWN, Move.ENCORE, Move.SLACK_OFF, Move.ENCORE, Move.SLACK_OFF, Move.FAINT_ATTACK, Move.AMNESIA, Move.COVET, Move.SWAGGER, Move.CHIP_AWAY, Move.COUNTER, Move.FLAIL, Move.FLING, Move.PUNISHMENT, Move.HAMMER_ARM}), Type.NORMAL),
        NINCADA("Nincada", "290", (short)255, new short[] {31, 45, 90, 30, 30, 40}, (byte)53, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 0, 5, 9, 14, 19, 25, 31, 38, 45}, new Move[] {Move.SCRATCH, Move.HARDEN, Move.LEECH_LIFE, Move.SAND_ATTACK, Move.FURY_SWIPES, Move.MIND_READER, Move.FALSE_SWIPE, Move.MUD_SLAP, Move.METAL_CLAW, Move.DIG}), Type.BUG, Type.GROUND),
        NINJASK("Ninjask", "291", (short)120, new short[] {61, 90, 45, 50, 50, 160}, (byte)160, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 9, 14, 19, 20, 20, 20, 25, 31, 38, 45, 52}, new Move[] {Move.BUG_BITE, Move.SCRATCH, Move.HARDEN, Move.LEECH_LIFE, Move.SAND_ATTACK, Move.LEECH_LIFE, Move.SAND_ATTACK, Move.FURY_SWIPES, Move.MIND_READER, Move.DOUBLE_TEAM, Move.FURY_CUTTER, Move.SCREECH, Move.SWORDS_DANCE, Move.SLASH, Move.AGILITY, Move.BATON_PASS, Move.X_SCISSOR}), Type.BUG, Type.FLYING),
        SHEDINJA("Shedinja", "292", (short)45, new short[] {1, 90, 45, 30, 30, 40}, (byte)83, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 0, 5, 9, 14, 19, 25, 31, 38, 45, 52, 59}, new Move[] {Move.SCRATCH, Move.HARDEN, Move.LEECH_LIFE, Move.SAND_ATTACK, Move.FURY_SWIPES, Move.MIND_READER, Move.SPITE, Move.CONFUSE_RAY, Move.SHADOW_SNEAK, Move.GRUDGE, Move.HEAL_BLOCK, Move.SHADOW_BALL}), Type.BUG, Type.GHOST),
        WHISMUR("Whismur", "293", (short)190, new short[] {64, 51, 23, 51, 23, 28}, (byte)48, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 5, 11, 15, 21, 25, 31, 35, 41, 45, 45, 51}, new Move[] {Move.POUND, Move.UPROAR, Move.ASTONISH, Move.HOWL, Move.SUPERSONIC, Move.STOMP, Move.SCREECH, Move.ROAR, Move.SYNCHRONOISE, Move.REST, Move.SLEEP_TALK, Move.HYPER_VOICE}), Type.NORMAL),
        LOUDRED("Loudred", "294", (short)120, new short[] {84, 71, 43, 71, 43, 48}, (byte)126, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 5, 11, 15, 20, 23, 29, 37, 43, 51, 57, 57, 65}, new Move[] {Move.POUND, Move.UPROAR, Move.ASTONISH, Move.HOWL, Move.UPROAR, Move.ASTONISH, Move.HOWL, Move.BITE, Move.SUPERSONIC, Move.STOMP, Move.SCREECH, Move.ROAR, Move.SYNCHRONOISE, Move.REST, Move.SLEEP_TALK, Move.HYPER_VOICE}), Type.NORMAL),
        EXPLOUD("Exploud", "295", (short)45, new short[] {104, 91, 63, 91, 63, 68}, (byte)216, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 5, 11, 15, 20, 23, 29, 37, 40, 45, 55, 55, 63, 71, 79}, new Move[] {Move.ICE_FANG, Move.FIRE_FANG, Move.THUNDER_FANG, Move.POUND, Move.UPROAR, Move.ASTONISH, Move.HOWL, Move.UPROAR, Move.ASTONISH, Move.HOWL, Move.BITE, Move.SUPERSONIC, Move.STOMP, Move.SCREECH, Move.CRUNCH, Move.ROAR, Move.SYNCHRONOISE, Move.REST, Move.SLEEP_TALK, Move.HYPER_VOICE, Move.HYPER_BEAM}), Type.NORMAL),
        MAKUHITA("Makuhita", "296", (short)180, new short[] {72, 60, 30, 20, 30, 25}, (byte)47, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.FLUCTUATING,convertToMap(new int[] {0, 0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46}, new Move[] {Move.TACKLE, Move.FOCUS_ENERGY, Move.SAND_ATTACK, Move.ARM_THRUST, Move.VITAL_THROW, Move.FAKE_OUT, Move.WHIRLWIND, Move.KNOCK_OFF, Move.SMELLINGSALT, Move.BELLY_DRUM, Move.FORCE_PALM, Move.SEISMIC_TOSS, Move.WAKE_UP_SLAP, Move.ENDURE, Move.CLOSE_COMBAT, Move.REVERSAL, Move.HEAVY_SLAM}), Type.FIGHTING),
        HARIYAMA("Hariyama", "297", (short)200, new short[] {144, 120, 60, 40, 60, 50}, (byte)166, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.FLUCTUATING,convertToMap(new int[] {0, 0, 0, 0, 0, 4, 7, 10, 13, 16, 19, 22, 27, 32, 37, 42, 47, 52, 57, 62}, new Move[] {Move.BRINE, Move.TACKLE, Move.FOCUS_ENERGY, Move.SAND_ATTACK, Move.ARM_THRUST, Move.SAND_ATTACK, Move.ARM_THRUST, Move.VITAL_THROW, Move.FAKE_OUT, Move.WHIRLWIND, Move.KNOCK_OFF, Move.SMELLINGSALT, Move.BELLY_DRUM, Move.FORCE_PALM, Move.SEISMIC_TOSS, Move.WAKE_UP_SLAP, Move.ENDURE, Move.CLOSE_COMBAT, Move.REVERSAL, Move.HEAVY_SLAM}), Type.FIGHTING),
        AZURILL("Azurill", "298", (short)150, new short[] {50, 20, 40, 20, 40, 20}, (byte)38, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 2, 5, 7, 10, 13, 16, 20, 23}, new Move[] {Move.SPLASH, Move.BUBBLE, Move.TAIL_WHIP, Move.WATER_SPORT, Move.WATER_GUN, Move.CHARM, Move.BUBBLEBEAM, Move.HELPING_HAND, Move.SLAM, Move.BOUNCE}), Type.NORMAL),
        NOSEPASS("Nosepass", "299", (short)255, new short[] {30, 45, 135, 45, 90, 30}, (byte)75, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 39, 43, 46, 50, 50}, new Move[] {Move.TACKLE, Move.HARDEN, Move.BLOCK, Move.ROCK_THROW, Move.THUNDER_WAVE, Move.ROCK_BLAST, Move.REST, Move.SPARK, Move.ROCK_SLIDE, Move.POWER_GEM, Move.SANDSTORM, Move.DISCHARGE, Move.EARTH_POWER, Move.STONE_EDGE, Move.LOCK_ON, Move.ZAP_CANNON}), Type.ROCK),
        SKITTY("Skitty", "300", (short)255, new short[] {50, 45, 45, 35, 35, 50}, (byte)52, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 39, 42, 46}, new Move[] {Move.FAKE_OUT, Move.GROWL, Move.TAIL_WHIP, Move.TACKLE, Move.FORESIGHT, Move.ATTRACT, Move.SING, Move.DOUBLESLAP, Move.COPYCAT, Move.ASSIST, Move.CHARM, Move.FAINT_ATTACK, Move.WAKE_UP_SLAP, Move.COVET, Move.HEAL_BELL, Move.DOUBLE_EDGE, Move.CAPTIVATE}), Type.NORMAL),
        DELCATTY("Delcatty", "301", (short)60, new short[] {70, 65, 65, 55, 55, 70}, (byte)133, new byte[] {1, 0, 0, 0, 0, 1}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 0}, new Move[] {Move.FAKE_OUT, Move.ATTRACT, Move.SING, Move.DOUBLESLAP}), Type.NORMAL),
        SABLEYE("Sableye", "302", (short)45, new short[] {50, 75, 75, 65, 65, 50}, (byte)133, new byte[] {0, 1, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 39, 43, 46, 50, 53, 57, 60}, new Move[] {Move.LEER, Move.SCRATCH, Move.FORESIGHT, Move.NIGHT_SHADE, Move.ASTONISH, Move.FURY_SWIPES, Move.FAKE_OUT, Move.DETECT, Move.SHADOW_SNEAK, Move.KNOCK_OFF, Move.FAINT_ATTACK, Move.PUNISHMENT, Move.SHADOW_CLAW, Move.POWER_GEM, Move.CONFUSE_RAY, Move.FOUL_PLAY, Move.ZEN_HEADBUTT, Move.SHADOW_BALL, Move.MEAN_LOOK}), Type.DARK, Type.GHOST),
        MAWILE("Mawile", "303", (short)45, new short[] {50, 85, 85, 55, 55, 50}, (byte)133, new byte[] {0, 1, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 6, 11, 16, 21, 26, 31, 36, 41, 46, 51, 51, 51, 56}, new Move[] {Move.ASTONISH, Move.FAKE_TEARS, Move.BITE, Move.SWEET_SCENT, Move.VICEGRIP, Move.FAINT_ATTACK, Move.BATON_PASS, Move.CRUNCH, Move.IRON_DEFENSE, Move.SUCKER_PUNCH, Move.STOCKPILE, Move.SWALLOW, Move.SPIT_UP, Move.IRON_HEAD}), Type.STEEL),
        ARON("Aron", "304", (short)180, new short[] {50, 70, 100, 40, 40, 30}, (byte)66, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 39, 43, 46, 50}, new Move[] {Move.TACKLE, Move.HARDEN, Move.MUD_SLAP, Move.HEADBUTT, Move.METAL_CLAW, Move.IRON_DEFENSE, Move.ROAR, Move.TAKE_DOWN, Move.IRON_HEAD, Move.PROTECT, Move.METAL_SOUND, Move.IRON_TAIL, Move.AUTOTOMIZE, Move.HEAVY_SLAM, Move.DOUBLE_EDGE, Move.METAL_BURST}), Type.STEEL, Type.ROCK),
        LAIRON("Lairon", "305", (short)90, new short[] {60, 90, 140, 50, 50, 40}, (byte)151, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 8, 11, 15, 18, 22, 25, 29, 34, 40, 45, 51, 56, 62, -1}, new Move[] {Move.TACKLE, Move.HARDEN, Move.MUD_SLAP, Move.HEADBUTT, Move.MUD_SLAP, Move.HEADBUTT, Move.METAL_CLAW, Move.IRON_DEFENSE, Move.ROAR, Move.TAKE_DOWN, Move.IRON_HEAD, Move.PROTECT, Move.METAL_SOUND, Move.IRON_TAIL, Move.AUTOTOMIZE, Move.HEAVY_SLAM, Move.DOUBLE_EDGE, Move.METAL_BURST, Move.HARDEN}), Type.STEEL, Type.ROCK),
        AGGRON("Aggron", "306", (short)45, new short[] {70, 110, 180, 60, 60, 50}, (byte)239, new byte[] {0, 0, 3, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, -1, 4, 8, 11, 15, 18, 22, 25, 29, 34, 40, 48, 57, 65, 74}, new Move[] {Move.TACKLE, Move.HARDEN, Move.MUD_SLAP, Move.HEADBUTT, Move.HARDEN, Move.MUD_SLAP, Move.HEADBUTT, Move.METAL_CLAW, Move.IRON_DEFENSE, Move.ROAR, Move.TAKE_DOWN, Move.IRON_HEAD, Move.PROTECT, Move.METAL_SOUND, Move.IRON_TAIL, Move.AUTOTOMIZE, Move.HEAVY_SLAM, Move.DOUBLE_EDGE, Move.METAL_BURST}), Type.STEEL, Type.ROCK),
        MEDITITE("Meditite", "307", (short)180, new short[] {30, 40, 55, 40, 55, 60}, (byte)56, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 39, 43, 46, 50}, new Move[] {Move.BIDE, Move.MEDITATE, Move.CONFUSION, Move.DETECT, Move.HIDDEN_POWER, Move.MIND_READER, Move.FEINT, Move.CALM_MIND, Move.FORCE_PALM, Move.HI_JUMP_KICK, Move.PSYCH_UP, Move.ACUPRESSURE, Move.POWER_TRICK, Move.REVERSAL, Move.RECOVER}), Type.FIGHTING, Type.PSYCHIC),
        MEDICHAM("Medicham", "308", (short)90, new short[] {60, 60, 75, 60, 75, 80}, (byte)144, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 42, 49, 55, 62}, new Move[] {Move.FIRE_PUNCH, Move.THUNDERPUNCH, Move.ICE_PUNCH, Move.BIDE, Move.MEDITATE, Move.CONFUSION, Move.DETECT, Move.MEDITATE, Move.CONFUSION, Move.DETECT, Move.HIDDEN_POWER, Move.MIND_READER, Move.FEINT, Move.CALM_MIND, Move.FORCE_PALM, Move.HI_JUMP_KICK, Move.PSYCH_UP, Move.ACUPRESSURE, Move.POWER_TRICK, Move.REVERSAL, Move.RECOVER}), Type.FIGHTING, Type.PSYCHIC),
        ELECTRIKE("Electrike", "309", (short)120, new short[] {40, 45, 40, 65, 40, 65}, (byte)59, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 4, 9, 12, 17, 20, 25, 28, 33, 36, 41, 44, 49, 52}, new Move[] {Move.TACKLE, Move.THUNDER_WAVE, Move.LEER, Move.HOWL, Move.QUICK_ATTACK, Move.SPARK, Move.ODOR_SLEUTH, Move.BITE, Move.THUNDER_FANG, Move.ROAR, Move.DISCHARGE, Move.CHARGE, Move.WILD_CHARGE, Move.THUNDER}), Type.ELECTRIC),
        MANECTRIC("Manectric", "310", (short)45, new short[] {70, 75, 60, 105, 60, 105}, (byte)166, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 4, 9, 12, 17, 20, 25, 30, 37, 42, 49, 54, 61, 66}, new Move[] {Move.FIRE_FANG, Move.TACKLE, Move.THUNDER_WAVE, Move.LEER, Move.HOWL, Move.THUNDER_WAVE, Move.LEER, Move.HOWL, Move.QUICK_ATTACK, Move.SPARK, Move.ODOR_SLEUTH, Move.BITE, Move.THUNDER_FANG, Move.ROAR, Move.DISCHARGE, Move.CHARGE, Move.WILD_CHARGE, Move.THUNDER}), Type.ELECTRIC),
        PLUSLE("Plusle", "311", (short)200, new short[] {60, 50, 40, 85, 75, 95}, (byte)142, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 3, 7, 10, 15, 17, 21, 24, 29, 31, 35, 38, 42, 44, 48, 51, 56, 63}, new Move[] {Move.GROWL, Move.THUNDER_WAVE, Move.QUICK_ATTACK, Move.HELPING_HAND, Move.SPARK, Move.ENCORE, Move.FAKE_TEARS, Move.COPYCAT, Move.ELECTRO_BALL, Move.SWIFT, Move.FAKE_TEARS, Move.CHARGE, Move.THUNDER, Move.BATON_PASS, Move.AGILITY, Move.LAST_RESORT, Move.NASTY_PLOT, Move.ENTRAINMENT}), Type.ELECTRIC),
        MINUN("Minun", "312", (short)200, new short[] {60, 40, 50, 75, 85, 95}, (byte)142, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 3, 7, 10, 15, 17, 21, 24, 29, 31, 35, 38, 42, 44, 48, 51, 56, 63}, new Move[] {Move.GROWL, Move.THUNDER_WAVE, Move.QUICK_ATTACK, Move.HELPING_HAND, Move.SPARK, Move.ENCORE, Move.CHARM, Move.COPYCAT, Move.ELECTRO_BALL, Move.SWIFT, Move.FAKE_TEARS, Move.CHARGE, Move.THUNDER, Move.BATON_PASS, Move.AGILITY, Move.TRUMP_CARD, Move.NASTY_PLOT, Move.ENTRAINMENT}), Type.ELECTRIC),
        VOLBEAT("Volbeat", "313", (short)150, new short[] {65, 73, 55, 47, 75, 85}, (byte)140, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.MALE_ONLY, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45}, new Move[] {Move.FLASH, Move.TACKLE, Move.DOUBLE_TEAM, Move.CONFUSE_RAY, Move.MOONLIGHT, Move.QUICK_ATTACK, Move.TAIL_GLOW, Move.SIGNAL_BEAM, Move.PROTECT, Move.HELPING_HAND, Move.ZEN_HEADBUTT, Move.BUG_BUZZ, Move.DOUBLE_EDGE}), Type.BUG),
        ILLUMISE("Illumise", "314", (short)150, new short[] {65, 47, 55, 73, 75, 85}, (byte)140, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.FEMALE_ONLY, ExperienceGroup.FLUCTUATING,convertToMap(new int[] {0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45}, new Move[] {Move.TACKLE, Move.SWEET_SCENT, Move.CHARM, Move.MOONLIGHT, Move.QUICK_ATTACK, Move.WISH, Move.ENCORE, Move.FLATTER, Move.HELPING_HAND, Move.ZEN_HEADBUTT, Move.BUG_BUZZ, Move.COVET}), Type.BUG),
        ROSELIA("Roselia", "315", (short)150, new short[] {50, 60, 45, 100, 80, 65}, (byte)140, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46}, new Move[] {Move.ABSORB, Move.GROWTH, Move.POISON_STING, Move.STUN_SPORE, Move.MEGA_DRAIN, Move.LEECH_SEED, Move.MAGICAL_LEAF, Move.GRASSWHISTLE, Move.GIGA_DRAIN, Move.TOXIC_SPIKES, Move.SWEET_SCENT, Move.INGRAIN, Move.PETAL_DANCE, Move.TOXIC, Move.AROMATHERAPY, Move.SYNTHESIS}), Type.GRASS, Type.POISON),
        GULPIN("Gulpin", "316", (short)225, new short[] {70, 43, 53, 43, 53, 40}, (byte)60, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FLUCTUATING,convertToMap(new int[] {0, 6, 9, 14, 17, 23, 28, 34, 39, 39, 39, 44, 49, 54, 59}, new Move[] {Move.POUND, Move.YAWN, Move.POISON_GAS, Move.SLUDGE, Move.AMNESIA, Move.ENCORE, Move.TOXIC, Move.ACID_SPRAY, Move.STOCKPILE, Move.SPIT_UP, Move.SWALLOW, Move.SLUDGE_BOMB, Move.GASTRO_ACID, Move.WRING_OUT, Move.GUNK_SHOT}), Type.POISON),
        SWALOT("Swalot", "317", (short)75, new short[] {100, 73, 83, 73, 83, 55}, (byte)163, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FLUCTUATING,convertToMap(new int[] {0, 0, 0, 0, 6, 9, 14, 17, 23, 26, 30, 38, 45, 45, 45, 52, 59, 66, 73}, new Move[] {Move.POUND, Move.YAWN, Move.POISON_GAS, Move.SLUDGE, Move.YAWN, Move.POISON_GAS, Move.SLUDGE, Move.AMNESIA, Move.ENCORE, Move.BODY_SLAM, Move.TOXIC, Move.ACID_SPRAY, Move.STOCKPILE, Move.SPIT_UP, Move.SWALLOW, Move.SLUDGE_BOMB, Move.GASTRO_ACID, Move.WRING_OUT, Move.GUNK_SHOT}), Type.POISON),
        CARVANHA("Carvanha", "318", (short)225, new short[] {45, 90, 20, 65, 20, 65}, (byte)61, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 6, 8, 11, 16, 18, 21, 26, 28, 31, 36, 38}, new Move[] {Move.LEER, Move.BITE, Move.RAGE, Move.FOCUS_ENERGY, Move.SCARY_FACE, Move.ICE_FANG, Move.SCREECH, Move.SWAGGER, Move.ASSURANCE, Move.CRUNCH, Move.AQUA_JET, Move.AGILITY, Move.TAKE_DOWN}), Type.WATER, Type.DARK),
        SHARPEDO("Sharpedo", "319", (short)60, new short[] {70, 120, 40, 95, 40, 95}, (byte)161, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 6, 8, 11, 16, 18, 21, 26, 28, 30, 34, 40, 45, 50, 56}, new Move[] {Move.FEINT, Move.LEER, Move.BITE, Move.RAGE, Move.FOCUS_ENERGY, Move.RAGE, Move.FOCUS_ENERGY, Move.SCARY_FACE, Move.ICE_FANG, Move.SCREECH, Move.SWAGGER, Move.ASSURANCE, Move.CRUNCH, Move.SLASH, Move.AQUA_JET, Move.TAUNT, Move.AGILITY, Move.SKULL_BASH, Move.NIGHT_SLASH}), Type.WATER, Type.DARK),
        WAILMER("Wailmer", "320", (short)125, new short[] {130, 70, 35, 70, 35, 60}, (byte)80, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FLUCTUATING,convertToMap(new int[] {0, 4, 7, 11, 14, 17, 21, 24, 27, 31, 34, 37, 41, 44, 47, 50}, new Move[] {Move.SPLASH, Move.GROWL, Move.WATER_GUN, Move.ROLLOUT, Move.WHIRLPOOL, Move.ASTONISH, Move.WATER_PULSE, Move.MIST, Move.REST, Move.BRINE, Move.WATER_SPOUT, Move.AMNESIA, Move.DIVE, Move.BOUNCE, Move.HYDRO_PUMP, Move.HEAVY_SLAM}), Type.WATER),
        WAILORD("Wailord", "321", (short)60, new short[] {170, 90, 45, 90, 45, 60}, (byte)175, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FLUCTUATING,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 11, 14, 17, 21, 24, 27, 31, 34, 37, 46, 54, 62, 70}, new Move[] {Move.SPLASH, Move.GROWL, Move.WATER_GUN, Move.ROLLOUT, Move.GROWL, Move.WATER_GUN, Move.ROLLOUT, Move.WHIRLPOOL, Move.ASTONISH, Move.WATER_PULSE, Move.MIST, Move.REST, Move.BRINE, Move.WATER_SPOUT, Move.AMNESIA, Move.DIVE, Move.BOUNCE, Move.HYDRO_PUMP, Move.HEAVY_SLAM}), Type.WATER),
        NUMEL("Numel", "322", (short)255, new short[] {60, 60, 40, 65, 45, 35}, (byte)61, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 31, 36, 40, 43, 47}, new Move[] {Move.GROWL, Move.TACKLE, Move.EMBER, Move.MAGNITUDE, Move.FOCUS_ENERGY, Move.FLAME_BURST, Move.AMNESIA, Move.LAVA_PLUME, Move.EARTH_POWER, Move.CURSE, Move.TAKE_DOWN, Move.YAWN, Move.EARTHQUAKE, Move.FLAMETHROWER, Move.DOUBLE_EDGE}), Type.FIRE, Type.GROUND),
        CAMERUPT("Camerupt", "323", (short)150, new short[] {70, 100, 70, 105, 75, 40}, (byte)161, new byte[] {0, 1, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 31, 33, 39, 46, 52, 59}, new Move[] {Move.GROWL, Move.TACKLE, Move.EMBER, Move.MAGNITUDE, Move.EMBER, Move.MAGNITUDE, Move.FOCUS_ENERGY, Move.FLAME_BURST, Move.AMNESIA, Move.LAVA_PLUME, Move.EARTH_POWER, Move.CURSE, Move.TAKE_DOWN, Move.ROCK_SLIDE, Move.YAWN, Move.EARTHQUAKE, Move.ERUPTION, Move.FISSURE}), Type.FIRE, Type.GROUND),
        TORKOAL("Torkoal", "324", (short)90, new short[] {70, 85, 140, 85, 70, 20}, (byte)165, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 7, 12, 17, 20, 23, 28, 33, 36, 39, 44, 49, 52, 55, 60, 65}, new Move[] {Move.EMBER, Move.SMOG, Move.WITHDRAW, Move.CURSE, Move.FIRE_SPIN, Move.SMOKESCREEN, Move.RAPID_SPIN, Move.FLAMETHROWER, Move.BODY_SLAM, Move.PROTECT, Move.LAVA_PLUME, Move.IRON_DEFENSE, Move.AMNESIA, Move.FLAIL, Move.HEAT_WAVE, Move.INFERNO, Move.SHELL_SMASH}), Type.FIRE),
        SPOINK("Spoink", "325", (short)255, new short[] {60, 25, 35, 70, 80, 60}, (byte)66, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 7, 10, 14, 15, 18, 21, 26, 29, 29, 33, 38, 40, 44, 50}, new Move[] {Move.SPLASH, Move.PSYWAVE, Move.ODOR_SLEUTH, Move.PSYBEAM, Move.PSYCH_UP, Move.CONFUSE_RAY, Move.MAGIC_COAT, Move.ZEN_HEADBUTT, Move.REST, Move.SNORE, Move.POWER_GEM, Move.PSYSHOCK, Move.PAYBACK, Move.PSYCHIC, Move.BOUNCE}), Type.PSYCHIC),
        GRUMPIG("Grumpig", "326", (short)60, new short[] {80, 45, 65, 90, 110, 80}, (byte)165, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 0, 7, 10, 14, 15, 18, 21, 26, 29, 29, 35, 42, 46, 52, 60}, new Move[] {Move.SPLASH, Move.PSYWAVE, Move.ODOR_SLEUTH, Move.PSYBEAM, Move.PSYWAVE, Move.ODOR_SLEUTH, Move.PSYBEAM, Move.PSYCH_UP, Move.CONFUSE_RAY, Move.MAGIC_COAT, Move.ZEN_HEADBUTT, Move.REST, Move.SNORE, Move.POWER_GEM, Move.PSYSHOCK, Move.PAYBACK, Move.PSYCHIC, Move.BOUNCE}), Type.PSYCHIC),
        SPINDA("Spinda", "327", (short)255, new short[] {60, 60, 60, 60, 60, 60}, (byte)126, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 5, 10, 14, 19, 23, 28, 32, 37, 41, 46, 50, 55}, new Move[] {Move.TACKLE, Move.UPROAR, Move.COPYCAT, Move.FAINT_ATTACK, Move.PSYBEAM, Move.HYPNOSIS, Move.DIZZY_PUNCH, Move.SUCKER_PUNCH, Move.TEETER_DANCE, Move.PSYCH_UP, Move.DOUBLE_EDGE, Move.FLAIL, Move.THRASH}), Type.NORMAL),
        TRAPINCH("Trapinch", "328", (short)255, new short[] {45, 100, 45, 45, 45, 10}, (byte)58, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 4, 7, 10, 13, 17, 21, 25, 29, 34, 39, 44, 49, 55, 61, 67, 73}, new Move[] {Move.BITE, Move.SAND_ATTACK, Move.FAINT_ATTACK, Move.SAND_TOMB, Move.MUD_SLAP, Move.BIDE, Move.BULLDOZE, Move.ROCK_SLIDE, Move.DIG, Move.CRUNCH, Move.EARTH_POWER, Move.SANDSTORM, Move.HYPER_BEAM, Move.EARTHQUAKE, Move.FEINT, Move.SUPERPOWER, Move.FISSURE}), Type.GROUND),
        VIBRAVA("Vibrava", "329", (short)120, new short[] {50, 70, 50, 50, 50, 70}, (byte)119, new byte[] {0, 1, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 10, 13, 17, 21, 25, 29, 34, 35, 39, 44, 49}, new Move[] {Move.SONICBOOM, Move.SAND_ATTACK, Move.FAINT_ATTACK, Move.SAND_TOMB, Move.SAND_ATTACK, Move.FAINT_ATTACK, Move.SAND_TOMB, Move.MUD_SLAP, Move.BIDE, Move.BULLDOZE, Move.ROCK_SLIDE, Move.SUPERSONIC, Move.SCREECH, Move.DRAGONBREATH, Move.EARTH_POWER, Move.SANDSTORM, Move.HYPER_BEAM}), Type.GROUND, Type.DRAGON),
        FLYGON("Flygon", "330", (short)45, new short[] {80, 100, 80, 80, 80, 100}, (byte)234, new byte[] {0, 1, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 10, 13, 17, 21, 25, 29, 34, 35, 39, 44, 45, 49, 55}, new Move[] {Move.SONICBOOM, Move.SAND_ATTACK, Move.FAINT_ATTACK, Move.SAND_TOMB, Move.SAND_ATTACK, Move.FAINT_ATTACK, Move.SAND_TOMB, Move.MUD_SLAP, Move.BIDE, Move.BULLDOZE, Move.ROCK_SLIDE, Move.SUPERSONIC, Move.SCREECH, Move.DRAGONBREATH, Move.EARTH_POWER, Move.SANDSTORM, Move.DRAGON_TAIL, Move.HYPER_BEAM, Move.DRAGON_CLAW}), Type.GROUND, Type.DRAGON),
        CACNEA("Cacnea", "331", (short)190, new short[] {50, 85, 40, 85, 40, 35}, (byte)67, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57}, new Move[] {Move.POISON_STING, Move.LEER, Move.ABSORB, Move.GROWTH, Move.LEECH_SEED, Move.SAND_ATTACK, Move.PIN_MISSILE, Move.INGRAIN, Move.FAINT_ATTACK, Move.SPIKES, Move.SUCKER_PUNCH, Move.PAYBACK, Move.NEEDLE_ARM, Move.COTTON_SPORE, Move.SANDSTORM, Move.DESTINY_BOND}), Type.GRASS),
        CACTURNE("Cacturne", "332", (short)60, new short[] {70, 115, 60, 115, 60, 55}, (byte)166, new byte[] {0, 1, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 35, 41, 47, 53, 59, 65, 71}, new Move[] {Move.REVENGE, Move.POISON_STING, Move.LEER, Move.ABSORB, Move.GROWTH, Move.ABSORB, Move.GROWTH, Move.LEECH_SEED, Move.SAND_ATTACK, Move.PIN_MISSILE, Move.INGRAIN, Move.FAINT_ATTACK, Move.SPIKES, Move.SUCKER_PUNCH, Move.PAYBACK, Move.NEEDLE_ARM, Move.COTTON_SPORE, Move.SANDSTORM, Move.DESTINY_BOND}), Type.GRASS, Type.DARK),
        SWABLU("Swablu", "333", (short)255, new short[] {45, 40, 60, 40, 75, 50}, (byte)62, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 0, 4, 8, 10, 13, 15, 18, 21, 25, 29, 34, 39, 42, 48}, new Move[] {Move.PECK, Move.GROWL, Move.ASTONISH, Move.SING, Move.FURY_ATTACK, Move.SAFEGUARD, Move.MIST, Move.ROUND, Move.NATURAL_GIFT, Move.TAKE_DOWN, Move.REFRESH, Move.MIRROR_MOVE, Move.COTTON_GUARD, Move.DRAGON_PULSE, Move.PERISH_SONG}), Type.NORMAL, Type.FLYING),
        ALTARIA("Altaria", "334", (short)45, new short[] {75, 70, 90, 70, 105, 80}, (byte)172, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 0, 0, 0, 0, 4, 8, 10, 13, 15, 18, 21, 25, 29, 34, 35, 42, 48, 57, 64}, new Move[] {Move.PLUCK, Move.PECK, Move.GROWL, Move.ASTONISH, Move.SING, Move.ASTONISH, Move.SING, Move.FURY_ATTACK, Move.SAFEGUARD, Move.MIST, Move.ROUND, Move.NATURAL_GIFT, Move.TAKE_DOWN, Move.REFRESH, Move.DRAGON_DANCE, Move.DRAGONBREATH, Move.COTTON_GUARD, Move.DRAGON_PULSE, Move.PERISH_SONG, Move.SKY_ATTACK}), Type.DRAGON, Type.FLYING),
        ZANGOOSE("Zangoose", "335", (short)90, new short[] {73, 115, 60, 60, 60, 90}, (byte)160, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 33, 36, 40, 43, 47}, new Move[] {Move.SCRATCH, Move.LEER, Move.QUICK_ATTACK, Move.FURY_CUTTER, Move.PURSUIT, Move.SLASH, Move.EMBARGO, Move.CRUSH_CLAW, Move.REVENGE, Move.FALSE_SWIPE, Move.DETECT, Move.X_SCISSOR, Move.TAUNT, Move.SWORDS_DANCE, Move.CLOSE_COMBAT}), Type.NORMAL),
        SEVIPER("Seviper", "336", (short)90, new short[] {73, 100, 60, 100, 60, 65}, (byte)160, new byte[] {0, 1, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FLUCTUATING,convertToMap(new int[] {0, 0, 5, 9, 12, 16, 20, 23, 27, 31, 34, 38, 42, 45, 49, 53}, new Move[] {Move.WRAP, Move.LICK, Move.BITE, Move.SWAGGER, Move.POISON_TAIL, Move.SCREECH, Move.VENOSHOCK, Move.GLARE, Move.POISON_FANG, Move.NIGHT_SLASH, Move.GASTRO_ACID, Move.HAZE, Move.POISON_JAB, Move.CRUNCH, Move.COIL, Move.WRING_OUT}), Type.POISON),
        LUNATONE("Lunatone", "337", (short)45, new short[] {70, 55, 65, 95, 85, 70}, (byte)154, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53}, new Move[] {Move.TACKLE, Move.HARDEN, Move.CONFUSION, Move.ROCK_THROW, Move.HYPNOSIS, Move.ROCK_POLISH, Move.PSYWAVE, Move.EMBARGO, Move.ROCK_SLIDE, Move.COSMIC_POWER, Move.PSYCHIC, Move.HEAL_BLOCK, Move.STONE_EDGE, Move.FUTURE_SIGHT, Move.EXPLOSION, Move.MAGIC_ROOM}), Type.ROCK, Type.PSYCHIC),
        SOLROCK("Solrock", "338", (short)45, new short[] {70, 95, 85, 55, 65, 70}, (byte)154, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53}, new Move[] {Move.TACKLE, Move.HARDEN, Move.CONFUSION, Move.ROCK_THROW, Move.FIRE_SPIN, Move.ROCK_POLISH, Move.PSYWAVE, Move.EMBARGO, Move.ROCK_SLIDE, Move.COSMIC_POWER, Move.PSYCHIC, Move.HEAL_BLOCK, Move.STONE_EDGE, Move.SOLARBEAM, Move.EXPLOSION, Move.WONDER_ROOM}), Type.ROCK, Type.PSYCHIC),
        BARBOACH("Barboach", "339", (short)190, new short[] {50, 48, 43, 46, 41, 60}, (byte)58, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 6, 6, 10, 14, 18, 22, 26, 31, 31, 35, 39, 43, 47}, new Move[] {Move.MUD_SLAP, Move.MUD_SPORT, Move.WATER_SPORT, Move.WATER_GUN, Move.MUD_BOMB, Move.AMNESIA, Move.WATER_PULSE, Move.MAGNITUDE, Move.REST, Move.SNORE, Move.AQUA_TAIL, Move.EARTHQUAKE, Move.FUTURE_SIGHT, Move.FISSURE}), Type.WATER, Type.GROUND),
        WHISCASH("Whiscash", "340", (short)75, new short[] {110, 78, 73, 76, 71, 60}, (byte)164, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 6, 6, 10, 14, 18, 22, 26, 33, 33, 39, 45, 51, 57}, new Move[] {Move.ZEN_HEADBUTT, Move.TICKLE, Move.MUD_SLAP, Move.MUD_SPORT, Move.WATER_SPORT, Move.MUD_SPORT, Move.WATER_SPORT, Move.WATER_GUN, Move.MUD_BOMB, Move.AMNESIA, Move.WATER_PULSE, Move.MAGNITUDE, Move.REST, Move.SNORE, Move.AQUA_TAIL, Move.EARTHQUAKE, Move.FUTURE_SIGHT, Move.FISSURE}), Type.WATER, Type.GROUND),
        CORPHISH("Corphish", "341", (short)205, new short[] {43, 80, 65, 50, 35, 35}, (byte)62, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FLUCTUATING,convertToMap(new int[] {0, 7, 10, 13, 20, 23, 26, 32, 35, 38, 44, 47, 53}, new Move[] {Move.BUBBLE, Move.HARDEN, Move.VICEGRIP, Move.LEER, Move.BUBBLEBEAM, Move.PROTECT, Move.KNOCK_OFF, Move.TAUNT, Move.NIGHT_SLASH, Move.CRABHAMMER, Move.SWORDS_DANCE, Move.CRUNCH, Move.GUILLOTINE}), Type.WATER),
        CRAWDAUNT("Crawdaunt", "342", (short)155, new short[] {63, 120, 85, 90, 55, 55}, (byte)164, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FLUCTUATING,convertToMap(new int[] {0, 0, 0, 0, 7, 10, 13, 20, 23, 26, 30, 34, 39, 44, 52, 57, 65}, new Move[] {Move.BUBBLE, Move.HARDEN, Move.VICEGRIP, Move.LEER, Move.HARDEN, Move.VICEGRIP, Move.LEER, Move.BUBBLEBEAM, Move.PROTECT, Move.KNOCK_OFF, Move.SWIFT, Move.TAUNT, Move.NIGHT_SLASH, Move.CRABHAMMER, Move.SWORDS_DANCE, Move.CRUNCH, Move.GUILLOTINE}), Type.WATER, Type.DARK),
        BALTOY("Baltoy", "343", (short)255, new short[] {40, 40, 55, 40, 70, 55}, (byte)60, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 4, 7, 10, 13, 17, 21, 25, 28, 31, 34, 34, 37, 41, 45, 49}, new Move[] {Move.HARDEN, Move.CONFUSION, Move.RAPID_SPIN, Move.MUD_SLAP, Move.ROCK_TOMB, Move.PSYBEAM, Move.POWER_TRICK, Move.ANCIENTPOWER, Move.SELFDESTRUCT, Move.EXTRASENSORY, Move.COSMIC_POWER, Move.GUARD_SPLIT, Move.POWER_SPLIT, Move.EARTH_POWER, Move.SANDSTORM, Move.HEAL_BLOCK, Move.EXPLOSION}), Type.GROUND, Type.PSYCHIC),
        CLAYDOL("Claydol", "344", (short)90, new short[] {60, 70, 105, 70, 120, 75}, (byte)175, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 10, 13, 17, 21, 25, 28, 31, 34, 34, 36, 40, 47, 54, 61, -1}, new Move[] {Move.TELEPORT, Move.HARDEN, Move.CONFUSION, Move.RAPID_SPIN, Move.RAPID_SPIN, Move.MUD_SLAP, Move.ROCK_TOMB, Move.PSYBEAM, Move.POWER_TRICK, Move.ANCIENTPOWER, Move.SELFDESTRUCT, Move.EXTRASENSORY, Move.COSMIC_POWER, Move.GUARD_SPLIT, Move.POWER_SPLIT, Move.HYPER_BEAM, Move.EARTH_POWER, Move.SANDSTORM, Move.HEAL_BLOCK, Move.EXPLOSION, Move.HARDEN}), Type.GROUND, Type.PSYCHIC),
        LILEEP("Lileep", "345", (short)45, new short[] {66, 41, 77, 61, 87, 23}, (byte)71, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 57, 57, 64}, new Move[] {Move.ASTONISH, Move.CONSTRICT, Move.ACID, Move.INGRAIN, Move.CONFUSE_RAY, Move.AMNESIA, Move.GASTRO_ACID, Move.ANCIENTPOWER, Move.ENERGY_BALL, Move.STOCKPILE, Move.SPIT_UP, Move.SWALLOW, Move.WRING_OUT}), Type.ROCK, Type.GRASS),
        CRADILY("Cradily", "346", (short)45, new short[] {86, 81, 97, 81, 107, 43}, (byte)173, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 0, 0, 0, 8, 15, 22, 29, 36, 46, 56, 66, 66, 66, 76}, new Move[] {Move.ASTONISH, Move.CONSTRICT, Move.ACID, Move.INGRAIN, Move.ACID, Move.INGRAIN, Move.CONFUSE_RAY, Move.AMNESIA, Move.ANCIENTPOWER, Move.GASTRO_ACID, Move.ENERGY_BALL, Move.STOCKPILE, Move.SPIT_UP, Move.SWALLOW, Move.WRING_OUT}), Type.ROCK, Type.GRASS),
        ANORITH("Anorith", "347", (short)45, new short[] {45, 95, 50, 40, 50, 75}, (byte)71, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 0, 7, 13, 19, 25, 31, 37, 43, 49, 55, 61}, new Move[] {Move.SCRATCH, Move.HARDEN, Move.MUD_SPORT, Move.WATER_GUN, Move.METAL_CLAW, Move.PROTECT, Move.ANCIENTPOWER, Move.FURY_CUTTER, Move.SLASH, Move.ROCK_BLAST, Move.CRUSH_CLAW, Move.X_SCISSOR}), Type.ROCK, Type.BUG),
        ARMALDO("Armaldo", "348", (short)45, new short[] {75, 125, 100, 70, 80, 45}, (byte)173, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 0, 0, 0, 7, 13, 19, 25, 31, 37, 46, 55, 67, 73}, new Move[] {Move.SCRATCH, Move.HARDEN, Move.MUD_SPORT, Move.WATER_GUN, Move.MUD_SPORT, Move.WATER_GUN, Move.METAL_CLAW, Move.PROTECT, Move.ANCIENTPOWER, Move.FURY_CUTTER, Move.SLASH, Move.ROCK_BLAST, Move.CRUSH_CLAW, Move.X_SCISSOR}), Type.ROCK, Type.BUG),
        FEEBAS("Feebas", "349", (short)255, new short[] {20, 15, 20, 10, 55, 80}, (byte)40, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 15, 30}, new Move[] {Move.SPLASH, Move.TACKLE, Move.FLAIL}), Type.WATER),
        MILOTIC("Milotic", "350", (short)60, new short[] {95, 60, 79, 100, 125, 81}, (byte)189, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49}, new Move[] {Move.WATER_GUN, Move.WRAP, Move.WATER_SPORT, Move.REFRESH, Move.WATER_PULSE, Move.TWISTER, Move.RECOVER, Move.CAPTIVATE, Move.AQUA_TAIL, Move.RAIN_DANCE, Move.HYDRO_PUMP, Move.ATTRACT, Move.SAFEGUARD, Move.AQUA_RING}), Type.WATER),
        CASTFORM("Castform", "351", (short)45, new short[] {70, 70, 70, 70, 70, 70}, (byte)147, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 10, 10, 10, 15, 20, 20, 20, 30, 40, 40, 40}, new Move[] {Move.TACKLE, Move.WATER_GUN, Move.EMBER, Move.POWDER_SNOW, Move.HEADBUTT, Move.RAIN_DANCE, Move.SUNNY_DAY, Move.HAIL, Move.WEATHER_BALL, Move.HYDRO_PUMP, Move.FIRE_BLAST, Move.BLIZZARD}), Type.NORMAL),
        CASTFORM_SUNNY("Castform", "351", (short)45, new short[] {70, 70, 70, 70, 70, 70}, (byte)147, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 10, 10, 10, 15, 20, 20, 20, 30, 40, 40, 40}, new Move[] {Move.TACKLE, Move.WATER_GUN, Move.EMBER, Move.POWDER_SNOW, Move.HEADBUTT, Move.RAIN_DANCE, Move.SUNNY_DAY, Move.HAIL, Move.WEATHER_BALL, Move.HYDRO_PUMP, Move.FIRE_BLAST, Move.BLIZZARD}), Type.FIRE),
        CASTFORM_RAINY("Castform", "351", (short)45, new short[] {70, 70, 70, 70, 70, 70}, (byte)147, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 10, 10, 10, 15, 20, 20, 20, 30, 40, 40, 40}, new Move[] {Move.TACKLE, Move.WATER_GUN, Move.EMBER, Move.POWDER_SNOW, Move.HEADBUTT, Move.RAIN_DANCE, Move.SUNNY_DAY, Move.HAIL, Move.WEATHER_BALL, Move.HYDRO_PUMP, Move.FIRE_BLAST, Move.BLIZZARD}), Type.WATER),
        CASTFORM_SNOWY("Castform", "351", (short)45, new short[] {70, 70, 70, 70, 70, 70}, (byte)147, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 10, 10, 10, 15, 20, 20, 20, 30, 40, 40, 40}, new Move[] {Move.TACKLE, Move.WATER_GUN, Move.EMBER, Move.POWDER_SNOW, Move.HEADBUTT, Move.RAIN_DANCE, Move.SUNNY_DAY, Move.HAIL, Move.WEATHER_BALL, Move.HYDRO_PUMP, Move.FIRE_BLAST, Move.BLIZZARD}), Type.ICE),
        KECLEON("Kecleon", "352", (short)200, new short[] {60, 90, 70, 60, 120, 40}, (byte)154, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 4, 7, 10, 14, 18, 22, 27, 32, 37, 43, 49, 55, 58}, new Move[] {Move.THIEF, Move.TAIL_WHIP, Move.ASTONISH, Move.LICK, Move.SCRATCH, Move.BIND, Move.FAINT_ATTACK, Move.FURY_SWIPES, Move.FEINT, Move.PSYBEAM, Move.SHADOW_SNEAK, Move.SLASH, Move.SCREECH, Move.SUBSTITUTE, Move.SUCKER_PUNCH, Move.SHADOW_CLAW, Move.ANCIENTPOWER, Move.SYNCHRONOISE}), Type.NORMAL),
        SHUPPET("Shuppet", "353", (short)225, new short[] {44, 75, 35, 63, 33, 45}, (byte)59, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 4, 7, 10, 13, 16, 19, 22, 26, 30, 34, 38, 42, 46, 50}, new Move[] {Move.KNOCK_OFF, Move.SCREECH, Move.NIGHT_SHADE, Move.SPITE, Move.WILL_O_WISP, Move.SHADOW_SNEAK, Move.CURSE, Move.FAINT_ATTACK, Move.HEX, Move.SHADOW_BALL, Move.SUCKER_PUNCH, Move.EMBARGO, Move.SNATCH, Move.GRUDGE, Move.TRICK}), Type.GHOST),
        BANETTE("Banette", "354", (short)45, new short[] {64, 115, 65, 83, 63, 65}, (byte)159, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 10, 13, 16, 19, 22, 26, 30, 34, 40, 46, 52, 58}, new Move[] {Move.KNOCK_OFF, Move.SCREECH, Move.NIGHT_SHADE, Move.CURSE, Move.SCREECH, Move.NIGHT_SHADE, Move.SPITE, Move.WILL_O_WISP, Move.SHADOW_SNEAK, Move.CURSE, Move.FAINT_ATTACK, Move.HEX, Move.SHADOW_BALL, Move.SUCKER_PUNCH, Move.EMBARGO, Move.SNATCH, Move.GRUDGE, Move.TRICK}), Type.GHOST),
        DUSKULL("Duskull", "355", (short)190, new short[] {20, 40, 90, 30, 90, 25}, (byte)59, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 6, 9, 14, 17, 22, 25, 30, 33, 38, 41, 46, 49}, new Move[] {Move.LEER, Move.NIGHT_SHADE, Move.DISABLE, Move.FORESIGHT, Move.ASTONISH, Move.CONFUSE_RAY, Move.SHADOW_SNEAK, Move.PURSUIT, Move.CURSE, Move.WILL_O_WISP, Move.HEX, Move.MEAN_LOOK, Move.PAYBACK, Move.FUTURE_SIGHT}), Type.GHOST),
        DUSCLOPS("Dusclops", "356", (short)90, new short[] {40, 70, 130, 60, 130, 25}, (byte)159, new byte[] {0, 0, 1, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 6, 9, 14, 17, 22, 25, 30, 33, 37, 42, 49, 58, 61}, new Move[] {Move.FIRE_PUNCH, Move.ICE_PUNCH, Move.THUNDERPUNCH, Move.GRAVITY, Move.BIND, Move.LEER, Move.NIGHT_SHADE, Move.DISABLE, Move.DISABLE, Move.FORESIGHT, Move.ASTONISH, Move.CONFUSE_RAY, Move.SHADOW_SNEAK, Move.PURSUIT, Move.CURSE, Move.WILL_O_WISP, Move.SHADOW_PUNCH, Move.HEX, Move.MEAN_LOOK, Move.PAYBACK, Move.FUTURE_SIGHT}), Type.GHOST),
        TROPIUS("Tropius", "357", (short)200, new short[] {99, 68, 83, 72, 87, 51}, (byte)161, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 7, 11, 17, 21, 27, 31, 37, 41, 47, 51, 57, 61, 67, 71}, new Move[] {Move.LEER, Move.GUST, Move.GROWTH, Move.RAZOR_LEAF, Move.STOMP, Move.SWEET_SCENT, Move.WHIRLWIND, Move.MAGICAL_LEAF, Move.BODY_SLAM, Move.SYNTHESIS, Move.LEAF_TORNADO, Move.AIR_SLASH, Move.BESTOW, Move.SOLARBEAM, Move.NATURAL_GIFT, Move.LEAF_STORM}), Type.GRASS, Type.FLYING),
        CHIMECHO("Chimecho", "358", (short)45, new short[] {65, 50, 70, 95, 80, 65}, (byte)149, new byte[] {0, 0, 0, 1, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 6, 9, 14, 17, 22, 25, 30, 33, 38, 41, 46, 49, 54, 57}, new Move[] {Move.WRAP, Move.GROWL, Move.ASTONISH, Move.CONFUSION, Move.UPROAR, Move.TAKE_DOWN, Move.YAWN, Move.PSYWAVE, Move.DOUBLE_EDGE, Move.HEAL_BELL, Move.SAFEGUARD, Move.EXTRASENSORY, Move.HEAL_PULSE, Move.SYNCHRONOISE, Move.HEALING_WISH}), Type.PSYCHIC),
        ABSOL("Absol", "359", (short)30, new short[] {65, 130, 60, 75, 60, 75}, (byte)163, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 4, 9, 12, 17, 20, 25, 28, 33, 36, 41, 44, 49, 52, 57, 60, 65}, new Move[] {Move.SCRATCH, Move.FEINT, Move.LEER, Move.QUICK_ATTACK, Move.PURSUIT, Move.TAUNT, Move.BITE, Move.DOUBLE_TEAM, Move.SLASH, Move.SWORDS_DANCE, Move.FUTURE_SIGHT, Move.NIGHT_SLASH, Move.DETECT, Move.PSYCHO_CUT, Move.SUCKER_PUNCH, Move.RAZOR_WIND, Move.ME_FIRST, Move.PERISH_SONG}), Type.DARK),
        WYNAUT("Wynaut", "360", (short)125, new short[] {95, 23, 48, 23, 48, 23}, (byte)52, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 15, 15, 15, 15}, new Move[] {Move.SPLASH, Move.CHARM, Move.ENCORE, Move.COUNTER, Move.MIRROR_COAT, Move.SAFEGUARD, Move.DESTINY_BOND}), Type.PSYCHIC),
        SNORUNT("Snorunt", "361", (short)190, new short[] {50, 50, 50, 50, 50, 50}, (byte)60, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 4, 10, 13, 19, 22, 28, 31, 37, 40, 46}, new Move[] {Move.POWDER_SNOW, Move.LEER, Move.DOUBLE_TEAM, Move.BITE, Move.ICY_WIND, Move.HEADBUTT, Move.PROTECT, Move.ICE_FANG, Move.CRUNCH, Move.ICE_SHARD, Move.HAIL, Move.BLIZZARD}), Type.ICE),
        GLALIE("Glalie", "362", (short)75, new short[] {80, 80, 80, 80, 80, 80}, (byte)168, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 4, 10, 13, 19, 22, 28, 31, 37, 40, 51, 59}, new Move[] {Move.POWDER_SNOW, Move.LEER, Move.DOUBLE_TEAM, Move.BITE, Move.DOUBLE_TEAM, Move.BITE, Move.ICY_WIND, Move.HEADBUTT, Move.PROTECT, Move.ICE_FANG, Move.CRUNCH, Move.ICE_BEAM, Move.HAIL, Move.BLIZZARD, Move.SHEER_COLD}), Type.ICE),
        SPHEAL("Spheal", "363", (short)255, new short[] {70, 40, 50, 55, 50, 25}, (byte)58, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 7, 13, 19, 25, 31, 37, 37, 43, 49}, new Move[] {Move.DEFENSE_CURL, Move.POWDER_SNOW, Move.GROWL, Move.WATER_GUN, Move.ENCORE, Move.ICE_BALL, Move.BODY_SLAM, Move.AURORA_BEAM, Move.HAIL, Move.REST, Move.SNORE, Move.BLIZZARD, Move.SHEER_COLD}), Type.ICE, Type.WATER),
        SEALEO("Sealeo", "364", (short)120, new short[] {90, 60, 70, 75, 70, 45}, (byte)144, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 7, 13, 19, 25, 31, 32, 39, 39, 47, 55}, new Move[] {Move.POWDER_SNOW, Move.GROWL, Move.WATER_GUN, Move.ENCORE, Move.ENCORE, Move.ICE_BALL, Move.BODY_SLAM, Move.AURORA_BEAM, Move.HAIL, Move.SWAGGER, Move.REST, Move.SNORE, Move.BLIZZARD, Move.SHEER_COLD}), Type.ICE, Type.WATER),
        WALREIN("Walrein", "365", (short)45, new short[] {110, 80, 90, 95, 90, 65}, (byte)239, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 7, 13, 19, 25, 31, 32, 39, 39, 44, 52, 65}, new Move[] {Move.CRUNCH, Move.POWDER_SNOW, Move.GROWL, Move.WATER_GUN, Move.ENCORE, Move.ENCORE, Move.ICE_BALL, Move.BODY_SLAM, Move.AURORA_BEAM, Move.HAIL, Move.SWAGGER, Move.REST, Move.SNORE, Move.ICE_FANG, Move.BLIZZARD, Move.SHEER_COLD}), Type.ICE, Type.WATER),
        CLAMPERL("Clamperl", "366", (short)255, new short[] {35, 64, 85, 74, 55, 32}, (byte)69, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 0, 0, 0, 51}, new Move[] {Move.CLAMP, Move.WATER_GUN, Move.WHIRLPOOL, Move.IRON_DEFENSE, Move.SHELL_SMASH}), Type.WATER),
        HUNTAIL("Huntail", "367", (short)60, new short[] {55, 104, 105, 94, 75, 52}, (byte)170, new byte[] {0, 1, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 6, 10, 15, 19, 24, 28, 33, 37, 42, 46, 51}, new Move[] {Move.WHIRLPOOL, Move.BITE, Move.SCREECH, Move.WATER_PULSE, Move.SCARY_FACE, Move.ICE_FANG, Move.BRINE, Move.BATON_PASS, Move.DIVE, Move.CRUNCH, Move.AQUA_TAIL, Move.HYDRO_PUMP}), Type.WATER),
        GOREBYSS("Gorebyss", "368", (short)60, new short[] {55, 84, 105, 114, 75, 52}, (byte)170, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 6, 10, 15, 19, 24, 28, 33, 37, 42, 46, 51}, new Move[] {Move.WHIRLPOOL, Move.CONFUSION, Move.AGILITY, Move.WATER_PULSE, Move.AMNESIA, Move.AQUA_RING, Move.CAPTIVATE, Move.BATON_PASS, Move.DIVE, Move.PSYCHIC, Move.AQUA_TAIL, Move.HYDRO_PUMP}), Type.WATER),
        RELICANTH("Relicanth", "369", (short)25, new short[] {100, 90, 130, 45, 65, 55}, (byte)170, new byte[] {1, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64, 71, 78}, new Move[] {Move.TACKLE, Move.HARDEN, Move.WATER_GUN, Move.ROCK_TOMB, Move.YAWN, Move.TAKE_DOWN, Move.MUD_SPORT, Move.ANCIENTPOWER, Move.DOUBLE_EDGE, Move.DIVE, Move.REST, Move.HYDRO_PUMP, Move.HEAD_SMASH}), Type.WATER, Type.ROCK),
        LUVDISC("Luvdisc", "370", (short)225, new short[] {43, 30, 55, 40, 65, 97}, (byte)116, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 4, 7, 9, 14, 17, 22, 27, 31, 37, 40, 46, 51, 55}, new Move[] {Move.TACKLE, Move.CHARM, Move.WATER_GUN, Move.AGILITY, Move.TAKE_DOWN, Move.LUCKY_CHANT, Move.WATER_PULSE, Move.ATTRACT, Move.FLAIL, Move.SWEET_KISS, Move.HYDRO_PUMP, Move.AQUA_RING, Move.CAPTIVATE, Move.SAFEGUARD}), Type.WATER),
        BAGON("Bagon", "371", (short)45, new short[] {45, 75, 60, 40, 30, 50}, (byte)60, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 5, 10, 16, 20, 25, 31, 35, 40, 46, 50, 55}, new Move[] {Move.RAGE, Move.BITE, Move.LEER, Move.HEADBUTT, Move.FOCUS_ENERGY, Move.EMBER, Move.DRAGONBREATH, Move.ZEN_HEADBUTT, Move.SCARY_FACE, Move.CRUNCH, Move.DRAGON_CLAW, Move.DOUBLE_EDGE}), Type.DRAGON),
        SHELGON("Shelgon", "372", (short)45, new short[] {65, 95, 100, 60, 50, 50}, (byte)147, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 5, 10, 16, 20, 25, 30, 32, 37, 43, 50, 55, 61}, new Move[] {Move.RAGE, Move.BITE, Move.LEER, Move.HEADBUTT, Move.BITE, Move.LEER, Move.HEADBUTT, Move.FOCUS_ENERGY, Move.EMBER, Move.PROTECT, Move.DRAGONBREATH, Move.ZEN_HEADBUTT, Move.SCARY_FACE, Move.CRUNCH, Move.DRAGON_CLAW, Move.DOUBLE_EDGE}), Type.DRAGON),
        SALAMENCE("Salamence", "373", (short)45, new short[] {95, 135, 80, 110, 80, 100}, (byte)270, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 5, 10, 16, 20, 25, 30, 32, 37, 43, 50, 53, 61, 70, 80}, new Move[] {Move.FIRE_FANG, Move.THUNDER_FANG, Move.RAGE, Move.BITE, Move.LEER, Move.HEADBUTT, Move.BITE, Move.LEER, Move.HEADBUTT, Move.FOCUS_ENERGY, Move.EMBER, Move.PROTECT, Move.DRAGONBREATH, Move.ZEN_HEADBUTT, Move.SCARY_FACE, Move.FLY, Move.CRUNCH, Move.DRAGON_CLAW, Move.DOUBLE_EDGE, Move.DRAGON_TAIL}), Type.DRAGON, Type.FLYING),
        BELDUM("Beldum", "374", (short)3, new short[] {40, 55, 80, 35, 60, 30}, (byte)60, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0}, new Move[] {Move.TAKE_DOWN}), Type.STEEL, Type.PSYCHIC),
        METANG("Metang", "375", (short)3, new short[] {60, 75, 100, 55, 80, 50}, (byte)147, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 20, 20, 23, 26, 29, 32, 35, 38, 41, 44, 47, 50}, new Move[] {Move.MAGNET_RISE, Move.TAKE_DOWN, Move.METAL_CLAW, Move.CONFUSION, Move.CONFUSION, Move.METAL_CLAW, Move.PURSUIT, Move.MIRACLE_EYE, Move.ZEN_HEADBUTT, Move.BULLET_PUNCH, Move.SCARY_FACE, Move.AGILITY, Move.PSYCHIC, Move.METEOR_MASH, Move.IRON_DEFENSE, Move.HYPER_BEAM}), Type.STEEL, Type.PSYCHIC),
        METAGROSS("Metagross", "376", (short)3, new short[] {80, 135, 130, 95, 90, 70}, (byte)270, new byte[] {0, 0, 3, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 20, 20, 23, 26, 29, 32, 35, 38, 41, 44, 45, 53, 62}, new Move[] {Move.MAGNET_RISE, Move.TAKE_DOWN, Move.METAL_CLAW, Move.CONFUSION, Move.CONFUSION, Move.METAL_CLAW, Move.PURSUIT, Move.MIRACLE_EYE, Move.ZEN_HEADBUTT, Move.BULLET_PUNCH, Move.SCARY_FACE, Move.AGILITY, Move.PSYCHIC, Move.METEOR_MASH, Move.HAMMER_ARM, Move.IRON_DEFENSE, Move.HYPER_BEAM}), Type.STEEL, Type.PSYCHIC),
        REGIROCK("Regirock", "377", (short)3, new short[] {80, 100, 200, 50, 100, 50}, (byte)261, new byte[] {0, 0, 3, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 9, 17, 25, 33, 41, 49, 57, 65, 73, 81, 89}, new Move[] {Move.EXPLOSION, Move.STOMP, Move.ROCK_THROW, Move.CURSE, Move.SUPERPOWER, Move.ANCIENTPOWER, Move.IRON_DEFENSE, Move.CHARGE_BEAM, Move.LOCK_ON, Move.ZAP_CANNON, Move.STONE_EDGE, Move.HAMMER_ARM, Move.HYPER_BEAM}), Type.ROCK),
        REGICE("Regice", "378", (short)3, new short[] {80, 50, 100, 100, 200, 50}, (byte)261, new byte[] {0, 0, 0, 0, 3, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 9, 17, 25, 33, 41, 49, 57, 65, 73, 81, 89}, new Move[] {Move.EXPLOSION, Move.STOMP, Move.ICY_WIND, Move.CURSE, Move.SUPERPOWER, Move.ANCIENTPOWER, Move.AMNESIA, Move.CHARGE_BEAM, Move.LOCK_ON, Move.ZAP_CANNON, Move.ICE_BEAM, Move.HAMMER_ARM, Move.HYPER_BEAM}), Type.ICE),
        REGISTEEL("Registeel", "379", (short)3, new short[] {80, 75, 150, 75, 150, 50}, (byte)261, new byte[] {0, 0, 2, 0, 1, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 9, 17, 25, 33, 41, 41, 49, 57, 65, 73, 73, 81, 89}, new Move[] {Move.EXPLOSION, Move.STOMP, Move.METAL_CLAW, Move.CURSE, Move.SUPERPOWER, Move.ANCIENTPOWER, Move.IRON_DEFENSE, Move.AMNESIA, Move.CHARGE_BEAM, Move.LOCK_ON, Move.ZAP_CANNON, Move.IRON_HEAD, Move.FLASH_CANNON, Move.HAMMER_ARM, Move.HYPER_BEAM}), Type.STEEL),
        LATIAS("Latias", "380", (short)3, new short[] {80, 80, 90, 110, 130, 110}, (byte)270, new byte[] {0, 0, 0, 0, 3, 0}, GenderRatio.FEMALE_ONLY, ExperienceGroup.SLOW,convertToMap(new int[] {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85}, new Move[] {Move.PSYWAVE, Move.WISH, Move.HELPING_HAND, Move.SAFEGUARD, Move.DRAGONBREATH, Move.WATER_SPORT, Move.REFRESH, Move.MIST_BALL, Move.ZEN_HEADBUTT, Move.RECOVER, Move.PSYCHO_SHIFT, Move.CHARM, Move.PSYCHIC, Move.HEAL_PULSE, Move.REFLECT_TYPE, Move.GUARD_SPLIT, Move.DRAGON_PULSE, Move.HEALING_WISH}), Type.DRAGON, Type.PSYCHIC),
        LATIOS("Latios", "381", (short)3, new short[] {80, 90, 80, 130, 110, 110}, (byte)270, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.SLOW,convertToMap(new int[] {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85}, new Move[] {Move.PSYWAVE, Move.HEAL_BLOCK, Move.HELPING_HAND, Move.SAFEGUARD, Move.DRAGONBREATH, Move.PROTECT, Move.REFRESH, Move.LUSTER_PURGE, Move.ZEN_HEADBUTT, Move.RECOVER, Move.PSYCHO_SHIFT, Move.DRAGON_DANCE, Move.PSYCHIC, Move.HEAL_PULSE, Move.TELEKINESIS, Move.POWER_SPLIT, Move.DRAGON_PULSE, Move.MEMENTO}), Type.DRAGON, Type.PSYCHIC),
        KYOGRE("Kyogre", "382", (short)5, new short[] {100, 100, 90, 150, 140, 90}, (byte)302, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 5, 15, 20, 30, 35, 45, 50, 60, 65, 75, 80, 90}, new Move[] {Move.WATER_PULSE, Move.SCARY_FACE, Move.BODY_SLAM, Move.MUDDY_WATER, Move.AQUA_RING, Move.ICE_BEAM, Move.ANCIENTPOWER, Move.WATER_SPOUT, Move.CALM_MIND, Move.AQUA_TAIL, Move.SHEER_COLD, Move.DOUBLE_EDGE, Move.HYDRO_PUMP}), Type.WATER),
        GROUDON("Groudon", "383", (short)5, new short[] {100, 150, 140, 100, 90, 90}, (byte)302, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 5, 15, 20, 30, 35, 45, 50, 60, 65, 75, 80, 90}, new Move[] {Move.MUD_SHOT, Move.SCARY_FACE, Move.LAVA_PLUME, Move.HAMMER_ARM, Move.REST, Move.EARTHQUAKE, Move.ANCIENTPOWER, Move.ERUPTION, Move.BULK_UP, Move.EARTH_POWER, Move.FISSURE, Move.SOLARBEAM, Move.FIRE_BLAST}), Type.GROUND),
        RAYQUAZA("Rayquaza", "384", (short)3, new short[] {105, 150, 90, 150, 90, 95}, (byte)306, new byte[] {0, 2, 0, 1, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 5, 15, 20, 30, 35, 45, 50, 60, 65, 75, 80, 90}, new Move[] {Move.TWISTER, Move.SCARY_FACE, Move.CRUNCH, Move.HYPER_VOICE, Move.REST, Move.AIR_SLASH, Move.ANCIENTPOWER, Move.OUTRAGE, Move.DRAGON_DANCE, Move.FLY, Move.EXTREMESPEED, Move.HYPER_BEAM, Move.DRAGON_PULSE}), Type.DRAGON, Type.FLYING),
        JIRACHI("Jirachi", "385", (short)3, new short[] {100, 100, 100, 100, 100, 100}, (byte)270, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70}, new Move[] {Move.WISH, Move.CONFUSION, Move.REST, Move.SWIFT, Move.HELPING_HAND, Move.PSYCHIC, Move.REFRESH, Move.REST, Move.ZEN_HEADBUTT, Move.DOUBLE_EDGE, Move.GRAVITY, Move.HEALING_WISH, Move.FUTURE_SIGHT, Move.COSMIC_POWER, Move.LAST_RESORT, Move.DOOM_DESIRE}), Type.STEEL, Type.PSYCHIC),
        DEOXYS_NORMAL("Deoxys", "386", (short)3, new short[] {50, 150, 50, 150, 50, 150}, (byte)270, new byte[] {0, 1, 0, 1, 0, 1}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 9, 17, 25, 33, 41, 49, 57, 65, 73, 81, 89, 97}, new Move[] {Move.LEER, Move.WRAP, Move.NIGHT_SHADE, Move.TELEPORT, Move.KNOCK_OFF, Move.PURSUIT, Move.PSYCHIC, Move.SNATCH, Move.PSYCHO_SHIFT, Move.ZEN_HEADBUTT, Move.COSMIC_POWER, Move.RECOVER, Move.PSYCHO_BOOST, Move.HYPER_BEAM}), Type.PSYCHIC),
        DEOXYS_ATTACK("Deoxys", "386", (short)3, new short[] {50, 180, 20, 180, 20, 150}, (byte)270, new byte[] {0, 2, 0, 1, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 9, 17, 25, 33, 41, 49, 57, 65, 73, 81, 89, 97}, new Move[] {Move.LEER, Move.WRAP, Move.NIGHT_SHADE, Move.TELEPORT, Move.KNOCK_OFF, Move.PURSUIT, Move.PSYCHIC, Move.SNATCH, Move.PSYCHO_SHIFT, Move.ZEN_HEADBUTT, Move.COSMIC_POWER, Move.RECOVER, Move.PSYCHO_BOOST, Move.HYPER_BEAM}), Type.PSYCHIC),
        DEOXYS_DEFENSE("Deoxys", "386", (short)3, new short[] {50, 70, 160, 70, 160, 90}, (byte)270, new byte[] {0, 0, 2, 0, 1, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 9, 17, 25, 33, 41, 49, 57, 65, 73, 81, 89, 97}, new Move[] {Move.LEER, Move.WRAP, Move.NIGHT_SHADE, Move.TELEPORT, Move.KNOCK_OFF, Move.PURSUIT, Move.PSYCHIC, Move.SNATCH, Move.PSYCHO_SHIFT, Move.ZEN_HEADBUTT, Move.COSMIC_POWER, Move.RECOVER, Move.PSYCHO_BOOST, Move.HYPER_BEAM}), Type.PSYCHIC),
        DEOXYS_SPEED("Deoxys", "386", (short)3, new short[] {50, 95, 90, 95, 90, 180}, (byte)270, new byte[] {0, 0, 0, 0, 0, 3}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 9, 17, 25, 33, 41, 49, 57, 65, 73, 81, 89, 97}, new Move[] {Move.LEER, Move.WRAP, Move.NIGHT_SHADE, Move.TELEPORT, Move.KNOCK_OFF, Move.PURSUIT, Move.PSYCHIC, Move.SNATCH, Move.PSYCHO_SHIFT, Move.ZEN_HEADBUTT, Move.COSMIC_POWER, Move.RECOVER, Move.PSYCHO_BOOST, Move.HYPER_BEAM}), Type.PSYCHIC);


        private final Map<Integer, Move> LEARNSET;
        private final ExperienceGroup EXP_GROUP;
        private final Species[] EVOLUTION;
        private final GenderRatio GENDER_RATIO;
        private final short[] BASE_STATS;
        private final byte[] EV_YIELD;
        private final Type[] TYPE;
        private final String NAME, NAT_DEX_NUMBER;
        private final short CATCH_RATE;

        Generation3(final String name, final String dexNumber, final short catchRate, final short[] stats, byte expYield, byte[] evYield,
                    GenderRatio ratio, ExperienceGroup group,/*final Species[] evolvesTo,*/ Map<Integer, Move> learnset, final Type... type)
        {
            if(type.length > 2)
            {
                throw new IllegalArgumentException("You must input 1 or 2 types for " + name + ". The types " +
                        Arrays.toString(type) + " are invalid.");
            }
            else if(type.length == 0)
            {
                throw new IllegalArgumentException("You must input at least one type for " + name);
            }

            LEARNSET = new TreeMap<>(learnset);
            GENDER_RATIO = ratio;
            EV_YIELD = new byte[] {evYield[0], evYield[1], evYield[2], evYield[3], evYield[4], evYield[5]};
            BASE_STATS = new short[] {stats[0], stats[1], stats[2], stats[3], stats[4], stats[5]};
            CATCH_RATE = catchRate;
            NAT_DEX_NUMBER = dexNumber;

            NAME = name;
            TYPE = type;

            EVOLUTION = null;
            /*if(evolvesFrom != null)
            {
                switch(evolvesFrom.length)
                {
                    case 1:
                        PREVOLUTION = new Species[]{evolvesFrom[0]};
                        break;
                    case 2:
                        PREVOLUTION = new Species[]{evolvesFrom[0], evolvesFrom[1]};
                        break;
                    case 3:
                        PREVOLUTION = new Species[]{evolvesFrom[0], evolvesFrom[1], evolvesFrom[2]};
                        break;
                    default:
                        PREVOLUTION = new Species[]{evolvesFrom[0], evolvesFrom[1], evolvesFrom[2], evolvesFrom[3]};
                        break;
                }
            }
            else
            {
                PREVOLUTION = null;
            }*/

            /*if(evolvesTo != null)
            {
                switch(evolvesTo.length)
                {
                    case 1:
                        EVOLUTION = new Species[]{evolvesTo[0]};
                        break;
                    case 2:
                        EVOLUTION = new Species[]{evolvesTo[0], evolvesTo[1]};
                        break;
                    case 3:
                        EVOLUTION = new Species[]{evolvesTo[0], evolvesTo[1], evolvesTo[2]};
                        break;
                    default:
                        EVOLUTION = new Species[]{evolvesTo[0], evolvesTo[1], evolvesTo[2], evolvesTo[3]};
                        break;
                }
            }
            else
            {
                EVOLUTION = null;
            }*/

            EXP_GROUP = group;
        }
    }
    private enum Generation4
    {
        TURTWIG("Turtwig", "387", (short)45, new short[] {55, 68, 64, 45, 55, 31}, (byte)64, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45}, new Move[] {Move.TACKLE, Move.WITHDRAW, Move.ABSORB, Move.RAZOR_LEAF, Move.CURSE, Move.BITE, Move.MEGA_DRAIN, Move.LEECH_SEED, Move.SYNTHESIS, Move.CRUNCH, Move.GIGA_DRAIN, Move.LEAF_STORM}), Type.GRASS),
        GROTLE("Grotle", "388", (short)45, new short[] {75, 89, 85, 55, 65, 36}, (byte)142, new byte[] {0, 1, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 22, 27, 32, 37, 42, 47, 52}, new Move[] {Move.TACKLE, Move.WITHDRAW, Move.WITHDRAW, Move.ABSORB, Move.RAZOR_LEAF, Move.CURSE, Move.BITE, Move.MEGA_DRAIN, Move.LEECH_SEED, Move.SYNTHESIS, Move.CRUNCH, Move.GIGA_DRAIN, Move.LEAF_STORM}), Type.GRASS),
        TORTERRA("Torterra", "389", (short)45, new short[] {95, 109, 105, 75, 85, 56}, (byte)236, new byte[] {0, 2, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 9, 13, 17, 22, 27, 32, 33, 39, 45, 51, 57}, new Move[] {Move.WOOD_HAMMER, Move.TACKLE, Move.WITHDRAW, Move.ABSORB, Move.RAZOR_LEAF, Move.WITHDRAW, Move.ABSORB, Move.RAZOR_LEAF, Move.CURSE, Move.BITE, Move.MEGA_DRAIN, Move.EARTHQUAKE, Move.LEECH_SEED, Move.SYNTHESIS, Move.CRUNCH, Move.GIGA_DRAIN, Move.LEAF_STORM}), Type.GRASS, Type.GROUND),
        CHIMCHAR("Chimchar", "390", (short)45, new short[] {44, 58, 44, 58, 44, 61}, (byte)62, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 7, 9, 15, 17, 23, 25, 31, 33, 39, 41, 47}, new Move[] {Move.SCRATCH, Move.LEER, Move.EMBER, Move.TAUNT, Move.FURY_SWIPES, Move.FLAME_WHEEL, Move.NASTY_PLOT, Move.TORMENT, Move.FACADE, Move.FIRE_SPIN, Move.ACROBATICS, Move.SLACK_OFF, Move.FLAMETHROWER}), Type.FIRE),
        MONFERNO("Monferno", "391", (short)45, new short[] {64, 78, 52, 78, 52, 81}, (byte)142, new byte[] {0, 0, 0, 1, 0, 1}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 7, 9, 14, 16, 19, 26, 29, 36, 39, 46, 49, 56}, new Move[] {Move.SCRATCH, Move.LEER, Move.EMBER, Move.EMBER, Move.TAUNT, Move.MACH_PUNCH, Move.FURY_SWIPES, Move.FLAME_WHEEL, Move.FEINT, Move.TORMENT, Move.CLOSE_COMBAT, Move.FIRE_SPIN, Move.ACROBATICS, Move.SLACK_OFF, Move.FLARE_BLITZ}), Type.FIRE, Type.FIGHTING),
        INFERNAPE("Infernape", "392", (short)45, new short[] {76, 104, 71, 104, 71, 108}, (byte)240, new byte[] {0, 1, 0, 1, 0, 1}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 7, 9, 14, 16, 19, 26, 29, 36, 42, 52, 58, 68}, new Move[] {Move.SCRATCH, Move.LEER, Move.EMBER, Move.TAUNT, Move.EMBER, Move.TAUNT, Move.MACH_PUNCH, Move.FURY_SWIPES, Move.FLAME_WHEEL, Move.FEINT, Move.PUNISHMENT, Move.CLOSE_COMBAT, Move.FIRE_SPIN, Move.ACROBATICS, Move.CALM_MIND, Move.FLARE_BLITZ}), Type.FIRE, Type.FIGHTING),
        PIPLUP("Piplup", "393", (short)45, new short[] {53, 51, 53, 61, 56, 40}, (byte)63, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 39, 43}, new Move[] {Move.POUND, Move.GROWL, Move.BUBBLE, Move.WATER_SPORT, Move.PECK, Move.BUBBLEBEAM, Move.BIDE, Move.FURY_ATTACK, Move.BRINE, Move.WHIRLPOOL, Move.MIST, Move.DRILL_PECK, Move.HYDRO_PUMP}), Type.WATER),
        PRINPLUP("Prinplup", "394", (short)45, new short[] {64, 66, 68, 81, 76, 50}, (byte)142, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 4, 8, 11, 15, 16, 19, 24, 28, 33, 37, 42, 46, 51}, new Move[] {Move.TACKLE, Move.GROWL, Move.GROWL, Move.BUBBLE, Move.WATER_SPORT, Move.PECK, Move.METAL_CLAW, Move.BUBBLEBEAM, Move.BIDE, Move.FURY_ATTACK, Move.BRINE, Move.WHIRLPOOL, Move.MIST, Move.DRILL_PECK, Move.HYDRO_PUMP}), Type.WATER),
        EMPOLEON("Empoleon", "395", (short)45, new short[] {84, 86, 88, 111, 101, 60}, (byte)239, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 4, 8, 11, 15, 16, 19, 24, 28, 33, 36, 39, 46, 52, 59}, new Move[] {Move.TACKLE, Move.GROWL, Move.BUBBLE, Move.GROWL, Move.BUBBLE, Move.SWORDS_DANCE, Move.PECK, Move.METAL_CLAW, Move.BUBBLEBEAM, Move.SWAGGER, Move.FURY_ATTACK, Move.BRINE, Move.AQUA_JET, Move.WHIRLPOOL, Move.MIST, Move.DRILL_PECK, Move.HYDRO_PUMP}), Type.WATER, Type.STEEL),
        STARLY("Starly", "396", (short)255, new short[] {40, 55, 30, 30, 30, 60}, (byte)49, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41}, new Move[] {Move.TACKLE, Move.GROWL, Move.QUICK_ATTACK, Move.WING_ATTACK, Move.DOUBLE_TEAM, Move.ENDEAVOR, Move.WHIRLWIND, Move.AERIAL_ACE, Move.TAKE_DOWN, Move.AGILITY, Move.BRAVE_BIRD, Move.FINAL_GAMBIT}), Type.NORMAL, Type.FLYING),
        STARAVIA("Staravia", "397", (short)120, new short[] {55, 75, 50, 40, 40, 80}, (byte)119, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 18, 23, 28, 33, 38, 43, 48}, new Move[] {Move.TACKLE, Move.GROWL, Move.QUICK_ATTACK, Move.QUICK_ATTACK, Move.WING_ATTACK, Move.DOUBLE_TEAM, Move.ENDEAVOR, Move.WHIRLWIND, Move.AERIAL_ACE, Move.TAKE_DOWN, Move.AGILITY, Move.BRAVE_BIRD, Move.FINAL_GAMBIT}), Type.NORMAL, Type.FLYING),
        STARAPTOR("Staraptor", "398", (short)45, new short[] {85, 120, 70, 50, 50, 100}, (byte)214, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 5, 9, 13, 18, 23, 28, 33, 34, 41, 49, 57}, new Move[] {Move.TACKLE, Move.GROWL, Move.QUICK_ATTACK, Move.WING_ATTACK, Move.QUICK_ATTACK, Move.WING_ATTACK, Move.DOUBLE_TEAM, Move.ENDEAVOR, Move.WHIRLWIND, Move.AERIAL_ACE, Move.TAKE_DOWN, Move.CLOSE_COMBAT, Move.AGILITY, Move.BRAVE_BIRD, Move.FINAL_GAMBIT}), Type.NORMAL, Type.FLYING),
        BIDOOF("Bidoof", "399", (short)255, new short[] {59, 45, 40, 35, 40, 31}, (byte)50, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45}, new Move[] {Move.TACKLE, Move.GROWL, Move.DEFENSE_CURL, Move.ROLLOUT, Move.HEADBUTT, Move.HYPER_FANG, Move.YAWN, Move.AMNESIA, Move.TAKE_DOWN, Move.SUPER_FANG, Move.SUPERPOWER, Move.CURSE}), Type.NORMAL),
        BIBAREL("Bibarel", "400", (short)127, new short[] {79, 85, 60, 55, 60, 71}, (byte)144, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 9, 13, 15, 18, 23, 28, 33, 38, 43, 48, 53}, new Move[] {Move.TACKLE, Move.GROWL, Move.GROWL, Move.DEFENSE_CURL, Move.ROLLOUT, Move.WATER_GUN, Move.HEADBUTT, Move.HYPER_FANG, Move.YAWN, Move.AMNESIA, Move.TAKE_DOWN, Move.SUPER_FANG, Move.SUPERPOWER, Move.CURSE}), Type.NORMAL, Type.WATER),
        KRICKETOT("Kricketot", "401", (short)255, new short[] {37, 25, 41, 25, 41, 25}, (byte)39, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 6, 16}, new Move[] {Move.GROWL, Move.BIDE, Move.STRUGGLE_BUG, Move.BUG_BITE}), Type.BUG),
        KRICKETUNE("Kricketune", "402", (short)45, new short[] {77, 85, 51, 55, 51, 65}, (byte)134, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 10, 14, 18, 22, 26, 30, 34, 38, 42, 46, 50}, new Move[] {Move.GROWL, Move.BIDE, Move.FURY_CUTTER, Move.LEECH_LIFE, Move.SING, Move.FOCUS_ENERGY, Move.SLASH, Move.X_SCISSOR, Move.SCREECH, Move.TAUNT, Move.NIGHT_SLASH, Move.BUG_BUZZ, Move.PERISH_SONG}), Type.BUG),
        SHINX("Shinx", "403", (short)235, new short[] {45, 65, 34, 40, 34, 45}, (byte)53, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45}, new Move[] {Move.TACKLE, Move.LEER, Move.CHARGE, Move.SPARK, Move.BITE, Move.ROAR, Move.SWAGGER, Move.THUNDER_FANG, Move.CRUNCH, Move.SCARY_FACE, Move.DISCHARGE, Move.WILD_CHARGE}), Type.ELECTRIC),
        LUXIO("Luxio", "404", (short)120, new short[] {60, 85, 49, 60, 49, 60}, (byte)127, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 5, 9, 13, 18, 23, 28, 33, 38, 43, 48, 53}, new Move[] {Move.TACKLE, Move.LEER, Move.LEER, Move.CHARGE, Move.SPARK, Move.BITE, Move.ROAR, Move.SWAGGER, Move.THUNDER_FANG, Move.CRUNCH, Move.SCARY_FACE, Move.DISCHARGE, Move.WILD_CHARGE}), Type.ELECTRIC),
        LUXRAY("Luxray", "405", (short)45, new short[] {80, 120, 79, 95, 79, 70}, (byte)235, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 18, 23, 28, 35, 42, 49, 56, 63}, new Move[] {Move.TACKLE, Move.LEER, Move.CHARGE, Move.LEER, Move.CHARGE, Move.SPARK, Move.BITE, Move.ROAR, Move.SWAGGER, Move.THUNDER_FANG, Move.CRUNCH, Move.SCARY_FACE, Move.DISCHARGE, Move.WILD_CHARGE}), Type.ELECTRIC),
        BUDEW("Budew", "406", (short)255, new short[] {40, 30, 35, 50, 70, 55}, (byte)56, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 4, 7, 10, 13, 16}, new Move[] {Move.ABSORB, Move.GROWTH, Move.WATER_SPORT, Move.STUN_SPORE, Move.MEGA_DRAIN, Move.WORRY_SEED}), Type.GRASS, Type.POISON),
        ROSERADE("Roserade", "407", (short)75, new short[] {60, 70, 55, 125, 105, 90}, (byte)227, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0}, new Move[] {Move.WEATHER_BALL, Move.POISON_STING, Move.MEGA_DRAIN, Move.MAGICAL_LEAF, Move.SWEET_SCENT}), Type.GRASS, Type.POISON),
        CRANIDOS("Cranidos", "408", (short)45, new short[] {67, 125, 40, 30, 30, 58}, (byte)70, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 0, 6, 10, 15, 19, 24, 28, 33, 37, 42, 46}, new Move[] {Move.HEADBUTT, Move.LEER, Move.FOCUS_ENERGY, Move.PURSUIT, Move.TAKE_DOWN, Move.SCARY_FACE, Move.ASSURANCE, Move.CHIP_AWAY, Move.ANCIENTPOWER, Move.ZEN_HEADBUTT, Move.SCREECH, Move.HEAD_SMASH}), Type.ROCK),
        RAMPARDOS("Rampardos", "409", (short)45, new short[] {97, 165, 60, 65, 50, 58}, (byte)173, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 0, 6, 10, 15, 19, 24, 28, 30, 36, 43, 51, 58}, new Move[] {Move.HEADBUTT, Move.LEER, Move.FOCUS_ENERGY, Move.PURSUIT, Move.TAKE_DOWN, Move.SCARY_FACE, Move.ASSURANCE, Move.CHIP_AWAY, Move.ENDEAVOR, Move.ANCIENTPOWER, Move.ZEN_HEADBUTT, Move.SCREECH, Move.HEAD_SMASH}), Type.ROCK),
        SHIELDON("Shieldon", "410", (short)45, new short[] {30, 42, 118, 42, 88, 30}, (byte)70, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 0, 6, 10, 15, 19, 24, 28, 33, 37, 42, 46}, new Move[] {Move.TACKLE, Move.PROTECT, Move.TAUNT, Move.METAL_SOUND, Move.TAKE_DOWN, Move.IRON_DEFENSE, Move.SWAGGER, Move.ANCIENTPOWER, Move.ENDURE, Move.METAL_BURST, Move.IRON_HEAD, Move.HEAVY_SLAM}), Type.ROCK, Type.STEEL),
        BASTIODON("Bastiodon", "411", (short)45, new short[] {60, 52, 168, 47, 138, 30}, (byte)173, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 0, 0, 0, 6, 10, 15, 19, 24, 28, 30, 36, 43, 51, 58}, new Move[] {Move.TACKLE, Move.PROTECT, Move.TAUNT, Move.METAL_SOUND, Move.TAUNT, Move.METAL_SOUND, Move.TAKE_DOWN, Move.IRON_DEFENSE, Move.SWAGGER, Move.ANCIENTPOWER, Move.BLOCK, Move.ENDURE, Move.METAL_BURST, Move.IRON_HEAD, Move.HEAVY_SLAM}), Type.ROCK, Type.STEEL),
        BURMY("Burmy", "412", (short)120, new short[] {40, 29, 45, 29, 45, 36}, (byte)45, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 10, 15, 20}, new Move[] {Move.PROTECT, Move.TACKLE, Move.BUG_BITE, Move.HIDDEN_POWER}), Type.BUG),
        WORMADAM("Wormadam", "413", (short)45, new short[] {60, 59, 85, 79, 105, 36}, (byte)148, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.FEMALE_ONLY, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 10, 15, 20, 23, 26, 29, 32, 35, 38, 41, 44, 47}, new Move[] {Move.TACKLE, Move.PROTECT, Move.BUG_BITE, Move.HIDDEN_POWER, Move.CONFUSION, Move.RAZOR_LEAF, Move.GROWTH, Move.PSYBEAM, Move.CAPTIVATE, Move.FLAIL, Move.ATTRACT, Move.PSYCHIC, Move.LEAF_STORM}), Type.BUG, Type.GRASS),
        MOTHIM("Mothim", "414", (short)45, new short[] {70, 94, 50, 94, 50, 66}, (byte)148, new byte[] {0, 1, 0, 1, 0, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 10, 15, 20, 23, 26, 29, 32, 35, 38, 41, 44, 47, 50}, new Move[] {Move.TACKLE, Move.PROTECT, Move.BUG_BITE, Move.HIDDEN_POWER, Move.CONFUSION, Move.GUST, Move.POISONPOWDER, Move.PSYBEAM, Move.CAMOUFLAGE, Move.SILVER_WIND, Move.AIR_SLASH, Move.PSYCHIC, Move.BUG_BUZZ, Move.QUIVER_DANCE}), Type.BUG, Type.FLYING),
        COMBEE("Combee", "415", (short)120, new short[] {30, 30, 42, 30, 42, 70}, (byte)49, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 13, 29}, new Move[] {Move.SWEET_SCENT, Move.GUST, Move.BUG_BITE, Move.BUG_BUZZ}), Type.BUG, Type.FLYING),
        VESPIQUEN("Vespiquen", "416", (short)45, new short[] {70, 80, 102, 80, 102, 40}, (byte)166, new byte[] {0, 0, 1, 0, 1, 0}, GenderRatio.FEMALE_ONLY, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53}, new Move[] {Move.SWEET_SCENT, Move.GUST, Move.POISON_STING, Move.CONFUSE_RAY, Move.FURY_CUTTER, Move.PURSUIT, Move.FURY_SWIPES, Move.DEFEND_ORDER, Move.SLASH, Move.POWER_GEM, Move.HEAL_ORDER, Move.TOXIC, Move.AIR_SLASH, Move.CAPTIVATE, Move.ATTACK_ORDER, Move.SWAGGER, Move.DESTINY_BOND}), Type.BUG, Type.FLYING),
        PACHIRISU("Pachirisu", "417", (short)200, new short[] {60, 45, 70, 45, 90, 95}, (byte)142, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49}, new Move[] {Move.GROWL, Move.BIDE, Move.QUICK_ATTACK, Move.CHARM, Move.SPARK, Move.ENDURE, Move.SWIFT, Move.ELECTRO_BALL, Move.SWEET_KISS, Move.THUNDER_WAVE, Move.SUPER_FANG, Move.DISCHARGE, Move.LAST_RESORT, Move.HYPER_FANG}), Type.ELECTRIC),
        BUIZEL("Buizel", "418", (short)190, new short[] {55, 65, 35, 60, 30, 85}, (byte)66, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 7, 11, 15, 18, 21, 24, 27, 31, 35, 38, 41, 45}, new Move[] {Move.SONICBOOM, Move.GROWL, Move.WATER_SPORT, Move.QUICK_ATTACK, Move.WATER_GUN, Move.PURSUIT, Move.SWIFT, Move.AQUA_JET, Move.DOUBLE_HIT, Move.WHIRLPOOL, Move.RAZOR_WIND, Move.AQUA_TAIL, Move.AGILITY, Move.HYDRO_PUMP}), Type.WATER),
        FLOATZEL("Floatzel", "419", (short)75, new short[] {85, 105, 55, 85, 50, 115}, (byte)173, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 4, 7, 11, 15, 18, 21, 24, 29, 35, 41, 46, 51, 57}, new Move[] {Move.ICE_FANG, Move.CRUNCH, Move.SONICBOOM, Move.GROWL, Move.WATER_SPORT, Move.QUICK_ATTACK, Move.GROWL, Move.WATER_SPORT, Move.QUICK_ATTACK, Move.WATER_GUN, Move.PURSUIT, Move.SWIFT, Move.AQUA_JET, Move.DOUBLE_HIT, Move.WHIRLPOOL, Move.RAZOR_WIND, Move.AQUA_TAIL, Move.AGILITY, Move.HYDRO_PUMP}), Type.WATER),
        CHERUBI("Cherubi", "420", (short)190, new short[] {45, 35, 45, 62, 53, 35}, (byte)55, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 7, 10, 13, 19, 22, 28, 31, 37, 40}, new Move[] {Move.MORNING_SUN, Move.TACKLE, Move.GROWTH, Move.LEECH_SEED, Move.HELPING_HAND, Move.MAGICAL_LEAF, Move.SUNNY_DAY, Move.WORRY_SEED, Move.TAKE_DOWN, Move.SOLARBEAM, Move.LUCKY_CHANT}), Type.GRASS),
        CHERRIM("Cherrim", "421", (short)75, new short[] {70, 60, 70, 87, 78, 85}, (byte)158, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 7, 10, 13, 19, 22, 25, 30, 35, 43, 48}, new Move[] {Move.MORNING_SUN, Move.TACKLE, Move.GROWTH, Move.GROWTH, Move.LEECH_SEED, Move.HELPING_HAND, Move.MAGICAL_LEAF, Move.SUNNY_DAY, Move.PETAL_DANCE, Move.WORRY_SEED, Move.TAKE_DOWN, Move.SOLARBEAM, Move.LUCKY_CHANT}), Type.GRASS),
        SHELLOS("Shellos", "422", (short)190, new short[] {76, 48, 48, 57, 62, 34}, (byte)65, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 2, 4, 7, 11, 16, 22, 29, 37, 46}, new Move[] {Move.MUD_SLAP, Move.MUD_SPORT, Move.HARDEN, Move.WATER_PULSE, Move.MUD_BOMB, Move.HIDDEN_POWER, Move.RAIN_DANCE, Move.BODY_SLAM, Move.MUDDY_WATER, Move.RECOVER}), Type.WATER),
        GASTRODON("Gastrodon", "423", (short)75, new short[] {111, 83, 68, 92, 82, 39}, (byte)166, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 2, 4, 7, 11, 16, 22, 29, 41, 54}, new Move[] {Move.MUD_SLAP, Move.MUD_SPORT, Move.HARDEN, Move.WATER_PULSE, Move.MUD_SPORT, Move.HARDEN, Move.WATER_PULSE, Move.MUD_BOMB, Move.HIDDEN_POWER, Move.RAIN_DANCE, Move.BODY_SLAM, Move.MUDDY_WATER, Move.RECOVER}), Type.WATER, Type.GROUND),
        AMBIPOM("Ambipom", "424", (short)45, new short[] {75, 100, 66, 60, 66, 115}, (byte)169, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 39, 43}, new Move[] {Move.SCRATCH, Move.TAIL_WHIP, Move.SAND_ATTACK, Move.ASTONISH, Move.SAND_ATTACK, Move.ASTONISH, Move.BATON_PASS, Move.TICKLE, Move.FURY_SWIPES, Move.SWIFT, Move.SCREECH, Move.AGILITY, Move.DOUBLE_HIT, Move.FLING, Move.NASTY_PLOT, Move.LAST_RESORT}), Type.NORMAL),
        DRIFLOON("Drifloon", "425", (short)125, new short[] {90, 50, 34, 60, 44, 70}, (byte)70, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FLUCTUATING,convertToMap(new int[] {0, 0, 4, 8, 13, 16, 20, 25, 27, 32, 32, 36, 40, 44, 50}, new Move[] {Move.CONSTRICT, Move.MINIMIZE, Move.ASTONISH, Move.GUST, Move.FOCUS_ENERGY, Move.PAYBACK, Move.OMINOUS_WIND, Move.STOCKPILE, Move.HEX, Move.SWALLOW, Move.SPIT_UP, Move.SHADOW_BALL, Move.AMNESIA, Move.BATON_PASS, Move.EXPLOSION}), Type.GHOST, Type.FLYING),
        DRIFBLIM("Drifblim", "426", (short)60, new short[] {150, 80, 44, 90, 54, 80}, (byte)174, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FLUCTUATING,convertToMap(new int[] {0, 0, 0, 0, 4, 8, 13, 16, 20, 25, 27, 34, 34, 40, 46, 52, 60}, new Move[] {Move.CONSTRICT, Move.MINIMIZE, Move.ASTONISH, Move.GUST, Move.ASTONISH, Move.GUST, Move.FOCUS_ENERGY, Move.PAYBACK, Move.OMINOUS_WIND, Move.STOCKPILE, Move.HEX, Move.SWALLOW, Move.SPIT_UP, Move.SHADOW_BALL, Move.AMNESIA, Move.BATON_PASS, Move.EXPLOSION}), Type.GHOST, Type.FLYING),
        BUNEARY("Buneary", "427", (short)190, new short[] {55, 66, 44, 44, 56, 85}, (byte)70, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 6, 13, 16, 23, 26, 33, 36, 43, 46, 53, 56, 63}, new Move[] {Move.SPLASH, Move.POUND, Move.DEFENSE_CURL, Move.FORESIGHT, Move.ENDURE, Move.FRUSTRATION, Move.QUICK_ATTACK, Move.JUMP_KICK, Move.BATON_PASS, Move.AGILITY, Move.DIZZY_PUNCH, Move.AFTER_YOU, Move.CHARM, Move.ENTRAINMENT, Move.BOUNCE, Move.HEALING_WISH}), Type.NORMAL),
        LOPUNNY("Lopunny", "428", (short)60, new short[] {65, 76, 84, 54, 96, 105}, (byte)168, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 6, 13, 16, 23, 26, 33, 36, 43, 46, 53, 56, 63}, new Move[] {Move.MIRROR_COAT, Move.MAGIC_COAT, Move.SPLASH, Move.POUND, Move.DEFENSE_CURL, Move.FORESIGHT, Move.ENDURE, Move.RETURN, Move.QUICK_ATTACK, Move.JUMP_KICK, Move.BATON_PASS, Move.AGILITY, Move.DIZZY_PUNCH, Move.AFTER_YOU, Move.CHARM, Move.ENTRAINMENT, Move.BOUNCE, Move.HEALING_WISH}), Type.NORMAL),
        MISMAGIUS("Mismagius", "429", (short)45, new short[] {60, 60, 60, 105, 105, 105}, (byte)173, new byte[] {0, 0, 0, 1, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0}, new Move[] {Move.LUCKY_CHANT, Move.MAGICAL_LEAF, Move.GROWL, Move.PSYWAVE, Move.SPITE, Move.ASTONISH}), Type.GHOST),
        HONCHKROW("Honchkrow", "430", (short)30, new short[] {100, 125, 52, 105, 52, 71}, (byte)177, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 25, 35, 45, 55, 65, 75}, new Move[] {Move.ASTONISH, Move.PURSUIT, Move.HAZE, Move.WING_ATTACK, Move.SWAGGER, Move.NASTY_PLOT, Move.FOUL_PLAY, Move.NIGHT_SLASH, Move.QUASH, Move.DARK_PULSE}), Type.DARK, Type.FLYING),
        GLAMEOW("Glameow", "431", (short)190, new short[] {49, 55, 42, 42, 37, 85}, (byte)62, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 5, 8, 13, 17, 20, 25, 29, 32, 37, 41, 44, 48}, new Move[] {Move.FAKE_OUT, Move.SCRATCH, Move.GROWL, Move.HYPNOSIS, Move.FAINT_ATTACK, Move.FURY_SWIPES, Move.CHARM, Move.ASSIST, Move.CAPTIVATE, Move.SLASH, Move.SUCKER_PUNCH, Move.ATTRACT, Move.HONE_CLAWS}), Type.NORMAL),
        PURUGLY("Purugly", "432", (short)75, new short[] {71, 82, 64, 64, 59, 112}, (byte)158, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 5, 8, 13, 17, 20, 25, 29, 32, 37, 38, 45, 52, 60}, new Move[] {Move.FAKE_OUT, Move.SCRATCH, Move.GROWL, Move.SCRATCH, Move.GROWL, Move.HYPNOSIS, Move.FAINT_ATTACK, Move.FURY_SWIPES, Move.CHARM, Move.ASSIST, Move.CAPTIVATE, Move.SLASH, Move.SWAGGER, Move.BODY_SLAM, Move.ATTRACT, Move.HONE_CLAWS}), Type.NORMAL),
        CHINGLING("Chingling", "433", (short)120, new short[] {45, 30, 50, 65, 50, 45}, (byte)57, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 6, 9, 14, 17, 22, 25}, new Move[] {Move.WRAP, Move.GROWL, Move.ASTONISH, Move.CONFUSION, Move.UPROAR, Move.LAST_RESORT, Move.ENTRAINMENT}), Type.PSYCHIC),
        STUNKY("Stunky", "434", (short)225, new short[] {63, 63, 47, 41, 41, 74}, (byte)66, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 4, 7, 10, 14, 18, 22, 27, 32, 37, 43, 49}, new Move[] {Move.SCRATCH, Move.FOCUS_ENERGY, Move.POISON_GAS, Move.SCREECH, Move.FURY_SWIPES, Move.SMOKESCREEN, Move.FEINT, Move.SLASH, Move.TOXIC, Move.ACID_SPRAY, Move.NIGHT_SLASH, Move.MEMENTO, Move.EXPLOSION}), Type.POISON, Type.DARK),
        SKUNTANK("Skuntank", "435", (short)60, new short[] {103, 93, 67, 71, 61, 84}, (byte)168, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 4, 7, 10, 14, 18, 22, 27, 32, 34, 41, 51, 61}, new Move[] {Move.SCRATCH, Move.FOCUS_ENERGY, Move.POISON_GAS, Move.POISON_GAS, Move.SCREECH, Move.FURY_SWIPES, Move.SMOKESCREEN, Move.FEINT, Move.SLASH, Move.TOXIC, Move.ACID_SPRAY, Move.FLAMETHROWER, Move.NIGHT_SLASH, Move.MEMENTO, Move.EXPLOSION}), Type.POISON, Type.DARK),
        BRONZOR("Bronzor", "436", (short)255, new short[] {57, 24, 86, 24, 86, 23}, (byte)60, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 9, 11, 15, 19, 21, 25, 29, 31, 35, 39, 41, 45, 49}, new Move[] {Move.TACKLE, Move.CONFUSION, Move.HYPNOSIS, Move.IMPRISON, Move.CONFUSE_RAY, Move.PSYWAVE, Move.IRON_DEFENSE, Move.FAINT_ATTACK, Move.SAFEGUARD, Move.FUTURE_SIGHT, Move.METAL_SOUND, Move.GYRO_BALL, Move.EXTRASENSORY, Move.PAYBACK, Move.HEAL_BLOCK, Move.HEAVY_SLAM}), Type.STEEL, Type.PSYCHIC),
        BRONZONG("Bronzong", "437", (short)90, new short[] {67, 89, 116, 79, 116, 33}, (byte)175, new byte[] {0, 0, 1, 0, 1, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 5, 9, 11, 15, 19, 21, 25, 29, 31, 33, 36, 42, 46, 52, 58}, new Move[] {Move.SUNNY_DAY, Move.RAIN_DANCE, Move.TACKLE, Move.CONFUSION, Move.HYPNOSIS, Move.IMPRISON, Move.HYPNOSIS, Move.IMPRISON, Move.CONFUSE_RAY, Move.PSYWAVE, Move.IRON_DEFENSE, Move.FAINT_ATTACK, Move.SAFEGUARD, Move.FUTURE_SIGHT, Move.METAL_SOUND, Move.BLOCK, Move.GYRO_BALL, Move.EXTRASENSORY, Move.PAYBACK, Move.HEAL_BLOCK, Move.HEAVY_SLAM}), Type.STEEL, Type.PSYCHIC),
        BONSLY("Bonsly", "438", (short)255, new short[] {50, 80, 95, 10, 45, 10}, (byte)58, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 33, 36, 40}, new Move[] {Move.FAKE_TEARS, Move.COPYCAT, Move.FLAIL, Move.LOW_KICK, Move.ROCK_THROW, Move.SLAM, Move.FAINT_ATTACK, Move.ROCK_TOMB, Move.BLOCK, Move.ROCK_SLIDE, Move.MIMIC, Move.SUCKER_PUNCH, Move.DOUBLE_EDGE}), Type.ROCK),
        MIME_JR("Mime Jr.", "439", (short)145, new short[] {20, 25, 45, 70, 90, 60}, (byte)62, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 4, 8, 11, 15, 18, 22, 22, 25, 29, 32, 36, 39, 43, 46, 50}, new Move[] {Move.TICKLE, Move.BARRIER, Move.CONFUSION, Move.COPYCAT, Move.MEDITATE, Move.DOUBLESLAP, Move.MIMIC, Move.ENCORE, Move.LIGHT_SCREEN, Move.REFLECT, Move.PSYBEAM, Move.SUBSTITUTE, Move.RECYCLE, Move.TRICK, Move.PSYCHIC, Move.ROLE_PLAY, Move.BATON_PASS, Move.SAFEGUARD}), Type.PSYCHIC),
        HAPPINY("Happiny", "440", (short)130, new short[] {100, 5, 5, 15, 65, 30}, (byte)110, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.FEMALE_ONLY, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 5, 9, 12}, new Move[] {Move.POUND, Move.CHARM, Move.COPYCAT, Move.REFRESH, Move.SWEET_KISS}), Type.NORMAL),
        CHATOT("Chatot", "441", (short)30, new short[] {76, 65, 45, 92, 42, 91}, (byte)144, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57}, new Move[] {Move.PECK, Move.GROWL, Move.MIRROR_MOVE, Move.SING, Move.FURY_ATTACK, Move.CHATTER, Move.TAUNT, Move.ROUND, Move.MIMIC, Move.ECHOED_VOICE, Move.ROOST, Move.UPROAR, Move.SYNCHRONOISE, Move.FEATHERDANCE, Move.HYPER_VOICE}), Type.NORMAL, Type.FLYING),
        SPIRITOMB("Spiritomb", "442", (short)100, new short[] {50, 92, 108, 92, 108, 35}, (byte)170, new byte[] {0, 0, 1, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 7, 13, 19, 25, 31, 37, 43, 49}, new Move[] {Move.CURSE, Move.PURSUIT, Move.CONFUSE_RAY, Move.SPITE, Move.SHADOW_SNEAK, Move.FAINT_ATTACK, Move.HYPNOSIS, Move.DREAM_EATER, Move.OMINOUS_WIND, Move.SUCKER_PUNCH, Move.NASTY_PLOT, Move.MEMENTO, Move.DARK_PULSE}), Type.GHOST, Type.DARK),
        GIBLE("Gible", "443", (short)45, new short[] {58, 70, 45, 40, 45, 42}, (byte)60, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 3, 7, 13, 15, 19, 25, 27, 31, 37}, new Move[] {Move.TACKLE, Move.SAND_ATTACK, Move.DRAGON_RAGE, Move.SANDSTORM, Move.TAKE_DOWN, Move.SAND_TOMB, Move.SLASH, Move.DRAGON_CLAW, Move.DIG, Move.DRAGON_RUSH}), Type.DRAGON, Type.GROUND),
        GABITE("Gabite", "444", (short)45, new short[] {68, 90, 65, 50, 55, 82}, (byte)144, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 3, 7, 13, 15, 19, 24, 28, 33, 40, 49}, new Move[] {Move.TACKLE, Move.SAND_ATTACK, Move.SAND_ATTACK, Move.DRAGON_RAGE, Move.SANDSTORM, Move.TAKE_DOWN, Move.SAND_TOMB, Move.DUAL_CHOP, Move.SLASH, Move.DRAGON_CLAW, Move.DIG, Move.DRAGON_RUSH}), Type.DRAGON, Type.GROUND),
        GARCHOMP("Garchomp", "445", (short)45, new short[] {108, 130, 95, 80, 85, 102}, (byte)270, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 3, 7, 13, 15, 19, 24, 28, 33, 40, 48, 55}, new Move[] {Move.FIRE_FANG, Move.TACKLE, Move.SAND_ATTACK, Move.DRAGON_RAGE, Move.SANDSTORM, Move.SAND_ATTACK, Move.DRAGON_RAGE, Move.SANDSTORM, Move.TAKE_DOWN, Move.SAND_TOMB, Move.DUAL_CHOP, Move.SLASH, Move.DRAGON_CLAW, Move.DIG, Move.CRUNCH, Move.DRAGON_RUSH}), Type.DRAGON, Type.GROUND),
        MUNCHLAX("Munchlax", "446", (short)50, new short[] {135, 85, 40, 40, 85, 5}, (byte)78, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 4, 9, 12, 17, 20, 25, 28, 33, 36, 41, 44, 49, 52, 57}, new Move[] {Move.METRONOME, Move.ODOR_SLEUTH, Move.TACKLE, Move.DEFENSE_CURL, Move.AMNESIA, Move.LICK, Move.RECYCLE, Move.SCREECH, Move.CHIP_AWAY, Move.STOCKPILE, Move.SWALLOW, Move.BODY_SLAM, Move.FLING, Move.ROLLOUT, Move.NATURAL_GIFT, Move.SNATCH, Move.LAST_RESORT}), Type.NORMAL),
        RIOLU("Riolu", "447", (short)75, new short[] {40, 70, 40, 35, 40, 60}, (byte)57, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 6, 11, 15, 19, 24, 29, 47, 55}, new Move[] {Move.FORESIGHT, Move.QUICK_ATTACK, Move.ENDURE, Move.COUNTER, Move.FEINT, Move.FORCE_PALM, Move.COPYCAT, Move.SCREECH, Move.REVERSAL, Move.NASTY_PLOT, Move.FINAL_GAMBIT}), Type.FIGHTING),
        LUCARIO("Lucario", "448", (short)45, new short[] {70, 110, 70, 115, 70, 90}, (byte)184, new byte[] {0, 1, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 6, 11, 15, 19, 24, 29, 33, 37, 42, 47, 51, 55, 60, 65}, new Move[] {Move.DARK_PULSE, Move.FORESIGHT, Move.QUICK_ATTACK, Move.DETECT, Move.METAL_CLAW, Move.COUNTER, Move.FEINT, Move.FORCE_PALM, Move.ME_FIRST, Move.METAL_SOUND, Move.BONE_RUSH, Move.QUICK_GUARD, Move.SWORDS_DANCE, Move.HEAL_PULSE, Move.CALM_MIND, Move.AURA_SPHERE, Move.CLOSE_COMBAT, Move.DRAGON_PULSE, Move.EXTREMESPEED}), Type.FIGHTING, Type.STEEL),
        HIPPOPOTAS("Hippopotas", "449", (short)140, new short[] {68, 72, 78, 38, 42, 32}, (byte)66, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 7, 13, 19, 19, 25, 31, 37, 44, 50}, new Move[] {Move.TACKLE, Move.SAND_ATTACK, Move.BITE, Move.YAWN, Move.TAKE_DOWN, Move.DIG, Move.SAND_TOMB, Move.CRUNCH, Move.EARTHQUAKE, Move.DOUBLE_EDGE, Move.FISSURE}), Type.GROUND),
        HIPPOWDON("Hippowdon", "450", (short)60, new short[] {108, 112, 118, 68, 72, 47}, (byte)184, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 7, 13, 19, 19, 25, 31, 40, 50, 60}, new Move[] {Move.ICE_FANG, Move.FIRE_FANG, Move.THUNDER_FANG, Move.TACKLE, Move.SAND_ATTACK, Move.BITE, Move.YAWN, Move.BITE, Move.YAWN, Move.TAKE_DOWN, Move.DIG, Move.SAND_TOMB, Move.CRUNCH, Move.EARTHQUAKE, Move.DOUBLE_EDGE, Move.FISSURE}), Type.GROUND),
        SKORUPI("Skorupi", "451", (short)120, new short[] {40, 50, 90, 30, 55, 65}, (byte)66, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 16, 20, 23, 27, 30, 34, 38, 41, 45, 49}, new Move[] {Move.BITE, Move.POISON_STING, Move.LEER, Move.KNOCK_OFF, Move.PIN_MISSILE, Move.ACUPRESSURE, Move.PURSUIT, Move.BUG_BITE, Move.POISON_FANG, Move.VENOSHOCK, Move.HONE_CLAWS, Move.TOXIC_SPIKES, Move.NIGHT_SLASH, Move.SCARY_FACE, Move.CRUNCH, Move.CROSS_POISON}), Type.POISON, Type.BUG),
        DRAPION("Drapion", "452", (short)45, new short[] {70, 90, 110, 60, 75, 95}, (byte)175, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 5, 9, 13, 16, 20, 23, 27, 30, 34, 38, 43, 49, 57}, new Move[] {Move.THUNDER_FANG, Move.ICE_FANG, Move.FIRE_FANG, Move.BITE, Move.POISON_STING, Move.LEER, Move.KNOCK_OFF, Move.KNOCK_OFF, Move.PIN_MISSILE, Move.ACUPRESSURE, Move.PURSUIT, Move.BUG_BITE, Move.POISON_FANG, Move.VENOSHOCK, Move.HONE_CLAWS, Move.TOXIC_SPIKES, Move.NIGHT_SLASH, Move.SCARY_FACE, Move.CRUNCH, Move.CROSS_POISON}), Type.POISON, Type.DARK),
        CROAGUNK("Croagunk", "453", (short)140, new short[] {48, 61, 40, 61, 40, 50}, (byte)60, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 3, 8, 10, 15, 17, 22, 24, 29, 31, 36, 38, 43, 45, 50}, new Move[] {Move.ASTONISH, Move.MUD_SLAP, Move.POISON_STING, Move.TAUNT, Move.PURSUIT, Move.FAINT_ATTACK, Move.REVENGE, Move.SWAGGER, Move.MUD_BOMB, Move.SUCKER_PUNCH, Move.VENOSHOCK, Move.NASTY_PLOT, Move.POISON_JAB, Move.SLUDGE_BOMB, Move.FLATTER}), Type.POISON, Type.FIGHTING),
        TOXICROAK("Toxicroak", "454", (short)75, new short[] {83, 106, 65, 86, 65, 85}, (byte)172, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 3, 8, 10, 15, 17, 22, 24, 29, 31, 36, 41, 49, 54, 62}, new Move[] {Move.ASTONISH, Move.MUD_SLAP, Move.POISON_STING, Move.MUD_SLAP, Move.POISON_STING, Move.TAUNT, Move.PURSUIT, Move.FAINT_ATTACK, Move.REVENGE, Move.SWAGGER, Move.MUD_BOMB, Move.SUCKER_PUNCH, Move.VENOSHOCK, Move.NASTY_PLOT, Move.POISON_JAB, Move.SLUDGE_BOMB, Move.FLATTER}), Type.POISON, Type.FIGHTING),
        CARNIVINE("Carnivine", "455", (short)200, new short[] {74, 100, 72, 90, 72, 46}, (byte)159, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 7, 11, 17, 21, 27, 31, 37, 37, 37, 41, 47, 51}, new Move[] {Move.BIND, Move.GROWTH, Move.BITE, Move.VINE_WHIP, Move.SWEET_SCENT, Move.INGRAIN, Move.FAINT_ATTACK, Move.LEAF_TORNADO, Move.STOCKPILE, Move.SPIT_UP, Move.SWALLOW, Move.CRUNCH, Move.WRING_OUT, Move.POWER_WHIP}), Type.GRASS),
        FINNEON("Finneon", "456", (short)190, new short[] {49, 49, 56, 49, 61, 66}, (byte)66, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 6, 10, 13, 17, 22, 26, 29, 33, 38, 42, 45, 49, 54}, new Move[] {Move.POUND, Move.WATER_GUN, Move.ATTRACT, Move.RAIN_DANCE, Move.GUST, Move.WATER_PULSE, Move.CAPTIVATE, Move.SAFEGUARD, Move.AQUA_RING, Move.WHIRLPOOL, Move.U_TURN, Move.BOUNCE, Move.SILVER_WIND, Move.SOAK}), Type.WATER),
        LUMINEON("Lumineon", "457", (short)75, new short[] {69, 69, 76, 69, 86, 91}, (byte)161, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.ERRATIC,convertToMap(new int[] {0, 0, 0, 6, 10, 13, 17, 22, 26, 29, 35, 42, 48, 53, 59, 66}, new Move[] {Move.POUND, Move.WATER_GUN, Move.ATTRACT, Move.WATER_GUN, Move.ATTRACT, Move.RAIN_DANCE, Move.GUST, Move.WATER_PULSE, Move.CAPTIVATE, Move.SAFEGUARD, Move.AQUA_RING, Move.WHIRLPOOL, Move.U_TURN, Move.BOUNCE, Move.SILVER_WIND, Move.SOAK}), Type.WATER),
        MANTYKE("Mantyke", "458", (short)25, new short[] {45, 20, 50, 60, 120, 50}, (byte)69, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 3, 7, 11, 14, 16, 19, 23, 27, 32, 36, 39, 46, 49}, new Move[] {Move.TACKLE, Move.BUBBLE, Move.SUPERSONIC, Move.BUBBLEBEAM, Move.CONFUSE_RAY, Move.WING_ATTACK, Move.HEADBUTT, Move.WATER_PULSE, Move.WIDE_GUARD, Move.TAKE_DOWN, Move.AGILITY, Move.AIR_SLASH, Move.AQUA_RING, Move.BOUNCE, Move.HYDRO_PUMP}), Type.WATER, Type.FLYING),
        SNOVER("Snover", "459", (short)120, new short[] {60, 62, 50, 62, 60, 40}, (byte)67, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 26, 31, 36, 41, 46}, new Move[] {Move.POWDER_SNOW, Move.LEER, Move.RAZOR_LEAF, Move.ICY_WIND, Move.GRASSWHISTLE, Move.SWAGGER, Move.MIST, Move.ICE_SHARD, Move.INGRAIN, Move.WOOD_HAMMER, Move.BLIZZARD, Move.SHEER_COLD}), Type.GRASS, Type.ICE),
        ABOMASNOW("Abomasnow", "460", (short)60, new short[] {90, 92, 75, 92, 85, 60}, (byte)173, new byte[] {0, 1, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 9, 13, 17, 21, 26, 31, 36, 47, 58}, new Move[] {Move.ICE_PUNCH, Move.POWDER_SNOW, Move.LEER, Move.RAZOR_LEAF, Move.ICY_WIND, Move.RAZOR_LEAF, Move.ICY_WIND, Move.GRASSWHISTLE, Move.SWAGGER, Move.MIST, Move.ICE_SHARD, Move.INGRAIN, Move.WOOD_HAMMER, Move.BLIZZARD, Move.SHEER_COLD}), Type.GRASS, Type.ICE),
        WEAVILE("Weavile", "461", (short)45, new short[] {70, 120, 65, 45, 85, 125}, (byte)179, new byte[] {0, 1, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 8, 10, 14, 16, 20, 22, 25, 28, 32, 35, 40, 44, 47}, new Move[] {Move.EMBARGO, Move.REVENGE, Move.ASSURANCE, Move.SCRATCH, Move.LEER, Move.TAUNT, Move.QUICK_ATTACK, Move.QUICK_ATTACK, Move.FAINT_ATTACK, Move.ICY_WIND, Move.FURY_SWIPES, Move.NASTY_PLOT, Move.METAL_CLAW, Move.HONE_CLAWS, Move.FLING, Move.SCREECH, Move.NIGHT_SLASH, Move.SNATCH, Move.PUNISHMENT, Move.DARK_PULSE}), Type.DARK, Type.ICE),
        MAGNEZONE("Magnezone", "462", (short)30, new short[] {70, 70, 115, 130, 90, 60}, (byte)241, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 4, 7, 11, 15, 18, 21, 25, 29, 34, 39, 45, 51, 56, 62, 67, 73}, new Move[] {Move.MIRROR_COAT, Move.BARRIER, Move.TACKLE, Move.SUPERSONIC, Move.THUNDERSHOCK, Move.SONICBOOM, Move.SUPERSONIC, Move.THUNDERSHOCK, Move.SONICBOOM, Move.THUNDER_WAVE, Move.MAGNET_BOMB, Move.SPARK, Move.MIRROR_SHOT, Move.METAL_SOUND, Move.ELECTRO_BALL, Move.FLASH_CANNON, Move.SCREECH, Move.DISCHARGE, Move.LOCK_ON, Move.MAGNET_RISE, Move.GYRO_BALL, Move.ZAP_CANNON}), Type.ELECTRIC, Type.STEEL),
        LICKILICKY("Lickilicky", "463", (short)30, new short[] {110, 85, 95, 80, 95, 50}, (byte)180, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57, 61}, new Move[] {Move.LICK, Move.SUPERSONIC, Move.DEFENSE_CURL, Move.KNOCK_OFF, Move.WRAP, Move.STOMP, Move.DISABLE, Move.SLAM, Move.ROLLOUT, Move.CHIP_AWAY, Move.ME_FIRST, Move.REFRESH, Move.SCREECH, Move.POWER_WHIP, Move.WRING_OUT, Move.GYRO_BALL}), Type.NORMAL),
        RHYPERIOR("Rhyperior", "464", (short)30, new short[] {115, 140, 130, 55, 55, 40}, (byte)241, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 9, 19, 19, 23, 30, 41, 42, 47, 56, 62, 71, 77, 86}, new Move[] {Move.POISON_JAB, Move.HORN_ATTACK, Move.TAIL_WHIP, Move.STOMP, Move.FURY_ATTACK, Move.STOMP, Move.FURY_ATTACK, Move.SCARY_FACE, Move.ROCK_BLAST, Move.CHIP_AWAY, Move.TAKE_DOWN, Move.HAMMER_ARM, Move.DRILL_RUN, Move.STONE_EDGE, Move.EARTHQUAKE, Move.HORN_DRILL, Move.MEGAHORN, Move.ROCK_WRECKER}), Type.GROUND, Type.ROCK),
        TANGROWTH("Tangrowth", "465", (short)30, new short[] {100, 100, 125, 110, 50, 50}, (byte)187, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 4, 7, 10, 14, 17, 20, 23, 27, 30, 33, 36, 40, 43, 46, 49, 53, 56}, new Move[] {Move.INGRAIN, Move.CONSTRICT, Move.SLEEP_POWDER, Move.VINE_WHIP, Move.ABSORB, Move.POISONPOWDER, Move.BIND, Move.GROWTH, Move.MEGA_DRAIN, Move.KNOCK_OFF, Move.STUN_SPORE, Move.NATURAL_GIFT, Move.GIGA_DRAIN, Move.ANCIENTPOWER, Move.SLAM, Move.TICKLE, Move.WRING_OUT, Move.POWER_WHIP, Move.BLOCK}), Type.GRASS),
        ELECTIVIRE("Electivire", "466", (short)30, new short[] {75, 123, 67, 95, 85, 95}, (byte)243, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 36, 42, 49, 55, 62}, new Move[] {Move.FIRE_PUNCH, Move.QUICK_ATTACK, Move.LEER, Move.THUNDERSHOCK, Move.LOW_KICK, Move.THUNDERSHOCK, Move.LOW_KICK, Move.SWIFT, Move.SHOCK_WAVE, Move.THUNDER_WAVE, Move.ELECTRO_BALL, Move.LIGHT_SCREEN, Move.THUNDERPUNCH, Move.DISCHARGE, Move.SCREECH, Move.THUNDERBOLT, Move.THUNDER, Move.GIGA_IMPACT}), Type.ELECTRIC),
        MAGMORTAR("Magmortar", "467", (short)30, new short[] {75, 95, 67, 125, 95, 83}, (byte)243, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 36, 42, 49, 55, 62}, new Move[] {Move.THUNDERPUNCH, Move.SMOG, Move.LEER, Move.EMBER, Move.SMOKESCREEN, Move.EMBER, Move.SMOKESCREEN, Move.FAINT_ATTACK, Move.FIRE_SPIN, Move.CLEAR_SMOG, Move.FLAME_BURST, Move.CONFUSE_RAY, Move.FIRE_PUNCH, Move.LAVA_PLUME, Move.SUNNY_DAY, Move.FLAMETHROWER, Move.FIRE_BLAST, Move.HYPER_BEAM}), Type.FIRE),
        TOGEKISS("Togekiss", "468", (short)30, new short[] {85, 50, 95, 120, 115, 80}, (byte)245, new byte[] {0, 0, 0, 2, 1, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 0}, new Move[] {Move.SKY_ATTACK, Move.EXTREMESPEED, Move.AURA_SPHERE, Move.AIR_SLASH}), Type.NORMAL, Type.FLYING),
        YANMEGA("Yanmega", "469", (short)30, new short[] {86, 76, 86, 116, 56, 95}, (byte)180, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 6, 11, 14, 17, 22, 27, 30, 33, 38, 43, 46, 49, 54, 57}, new Move[] {Move.NIGHT_SLASH, Move.BUG_BITE, Move.TACKLE, Move.FORESIGHT, Move.QUICK_ATTACK, Move.DOUBLE_TEAM, Move.QUICK_ATTACK, Move.DOUBLE_TEAM, Move.SONICBOOM, Move.DETECT, Move.SUPERSONIC, Move.UPROAR, Move.PURSUIT, Move.ANCIENTPOWER, Move.FEINT, Move.SLASH, Move.SCREECH, Move.U_TURN, Move.AIR_SLASH, Move.BUG_BUZZ}), Type.BUG, Type.FLYING),
        LEAFEON("Leafeon", "470", (short)45, new short[] {65, 110, 130, 60, 65, 95}, (byte)196, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45}, new Move[] {Move.TAIL_WHIP, Move.TACKLE, Move.HELPING_HAND, Move.SAND_ATTACK, Move.RAZOR_LEAF, Move.QUICK_ATTACK, Move.GRASSWHISTLE, Move.MAGICAL_LEAF, Move.GIGA_DRAIN, Move.SWORDS_DANCE, Move.SYNTHESIS, Move.SUNNY_DAY, Move.LAST_RESORT, Move.LEAF_BLADE}), Type.GRASS),
        GLACEON("Glaceon", "471", (short)45, new short[] {65, 60, 110, 130, 95, 65}, (byte)196, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45}, new Move[] {Move.HELPING_HAND, Move.TACKLE, Move.TAIL_WHIP, Move.SAND_ATTACK, Move.ICY_WIND, Move.QUICK_ATTACK, Move.BITE, Move.ICE_FANG, Move.ICE_SHARD, Move.BARRIER, Move.MIRROR_COAT, Move.HAIL, Move.LAST_RESORT, Move.BLIZZARD}), Type.ICE),
        GLISCOR("Gliscor", "472", (short)30, new short[] {75, 95, 125, 45, 75, 95}, (byte)179, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 4, 7, 10, 13, 16, 19, 22, 27, 30, 35, 40, 45, 50, 55}, new Move[] {Move.THUNDER_FANG, Move.ICE_FANG, Move.FIRE_FANG, Move.POISON_JAB, Move.SAND_ATTACK, Move.HARDEN, Move.KNOCK_OFF, Move.SAND_ATTACK, Move.HARDEN, Move.KNOCK_OFF, Move.QUICK_ATTACK, Move.FURY_CUTTER, Move.FAINT_ATTACK, Move.ACROBATICS, Move.NIGHT_SLASH, Move.U_TURN, Move.SCREECH, Move.X_SCISSOR, Move.SKY_UPPERCUT, Move.SWORDS_DANCE, Move.GUILLOTINE}), Type.GROUND, Type.FLYING),
        MAMOSWINE("Mamoswine", "473", (short)50, new short[] {110, 130, 80, 70, 60, 80}, (byte)207, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 8, 11, 14, 18, 21, 24, 28, 33, 37, 41, 46, 52, 58}, new Move[] {Move.ANCIENTPOWER, Move.PECK, Move.ODOR_SLEUTH, Move.MUD_SPORT, Move.POWDER_SNOW, Move.MUD_SPORT, Move.POWDER_SNOW, Move.MUD_SLAP, Move.ENDURE, Move.MUD_BOMB, Move.HAIL, Move.ICE_FANG, Move.TAKE_DOWN, Move.DOUBLE_HIT, Move.MIST, Move.THRASH, Move.EARTHQUAKE, Move.BLIZZARD, Move.SCARY_FACE}), Type.ICE, Type.GROUND),
        PORYGON_Z("Porygon-Z", "474", (short)30, new short[] {85, 80, 70, 135, 75, 90}, (byte)241, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 7, 12, 18, 23, 29, 34, 40, 45, 51, 56, 62, 67}, new Move[] {Move.TRICK_ROOM, Move.CONVERSION_2, Move.TACKLE, Move.CONVERSION, Move.NASTY_PLOT, Move.PSYBEAM, Move.AGILITY, Move.RECOVER, Move.MAGNET_RISE, Move.SIGNAL_BEAM, Move.EMBARGO, Move.DISCHARGE, Move.LOCK_ON, Move.TRI_ATTACK, Move.MAGIC_COAT, Move.ZAP_CANNON, Move.HYPER_BEAM}), Type.NORMAL),
        GALLADE("Gallade", "475", (short)45, new short[] {68, 125, 65, 65, 115, 80}, (byte)233, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 6, 10, 12, 17, 22, 25, 31, 36, 39, 45, 50, 53, 59, 64}, new Move[] {Move.LEAF_BLADE, Move.NIGHT_SLASH, Move.LEER, Move.CONFUSION, Move.DOUBLE_TEAM, Move.TELEPORT, Move.CONFUSION, Move.DOUBLE_TEAM, Move.TELEPORT, Move.FURY_CUTTER, Move.SLASH, Move.HEAL_PULSE, Move.SWORDS_DANCE, Move.PSYCHO_CUT, Move.HELPING_HAND, Move.FEINT, Move.FALSE_SWIPE, Move.PROTECT, Move.CLOSE_COMBAT, Move.STORED_POWER}), Type.PSYCHIC, Type.FIGHTING),
        PROBOPASS("Probopass", "476", (short)60, new short[] {60, 55, 145, 75, 150, 40}, (byte)184, new byte[] {0, 0, 1, 0, 2, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 39, 43, 46, 50, 50}, new Move[] {Move.MAGNET_RISE, Move.GRAVITY, Move.TACKLE, Move.IRON_DEFENSE, Move.BLOCK, Move.MAGNET_BOMB, Move.IRON_DEFENSE, Move.BLOCK, Move.MAGNET_BOMB, Move.THUNDER_WAVE, Move.ROCK_BLAST, Move.REST, Move.SPARK, Move.ROCK_SLIDE, Move.POWER_GEM, Move.SANDSTORM, Move.DISCHARGE, Move.EARTH_POWER, Move.STONE_EDGE, Move.LOCK_ON, Move.ZAP_CANNON}), Type.ROCK, Type.STEEL),
        DUSKNOIR("Dusknoir", "477", (short)45, new short[] {45, 100, 135, 65, 135, 45}, (byte)236, new byte[] {0, 0, 1, 0, 2, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 6, 9, 14, 17, 22, 25, 30, 33, 37, 42, 49, 58, 61}, new Move[] {Move.FIRE_PUNCH, Move.ICE_PUNCH, Move.THUNDERPUNCH, Move.GRAVITY, Move.BIND, Move.LEER, Move.NIGHT_SHADE, Move.DISABLE, Move.DISABLE, Move.FORESIGHT, Move.ASTONISH, Move.CONFUSE_RAY, Move.SHADOW_SNEAK, Move.PURSUIT, Move.CURSE, Move.WILL_O_WISP, Move.SHADOW_PUNCH, Move.HEX, Move.MEAN_LOOK, Move.PAYBACK, Move.FUTURE_SIGHT}), Type.GHOST),
        FROSLASS("Froslass", "478", (short)75, new short[] {70, 80, 70, 80, 70, 110}, (byte)168, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.FEMALE_ONLY, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 4, 10, 13, 19, 22, 28, 31, 37, 40, 51, 59}, new Move[] {Move.POWDER_SNOW, Move.LEER, Move.DOUBLE_TEAM, Move.ASTONISH, Move.DOUBLE_TEAM, Move.ASTONISH, Move.ICY_WIND, Move.CONFUSE_RAY, Move.OMINOUS_WIND, Move.WAKE_UP_SLAP, Move.CAPTIVATE, Move.ICE_SHARD, Move.HAIL, Move.BLIZZARD, Move.DESTINY_BOND}), Type.ICE, Type.GHOST),
        ROTOM("Rotom", "479", (short)45, new short[] {50, 50, 77, 95, 77, 91}, (byte)154, new byte[] {0, 0, 0, 1, 0, 1}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64}, new Move[] {Move.TRICK, Move.ASTONISH, Move.THUNDER_WAVE, Move.THUNDERSHOCK, Move.CONFUSE_RAY, Move.UPROAR, Move.DOUBLE_TEAM, Move.SHOCK_WAVE, Move.OMINOUS_WIND, Move.SUBSTITUTE, Move.ELECTRO_BALL, Move.HEX, Move.CHARGE, Move.DISCHARGE}), Type.ELECTRIC, Type.GHOST),
        ROTOM_HEAT("Rotom", "479", (short)45, new short[] {50, 65, 107, 105, 107, 86}, (byte)154, new byte[] {0, 0, 0, 1, 0, 1}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64}, new Move[] {Move.TRICK, Move.ASTONISH, Move.THUNDER_WAVE, Move.THUNDERSHOCK, Move.CONFUSE_RAY, Move.UPROAR, Move.DOUBLE_TEAM, Move.SHOCK_WAVE, Move.OMINOUS_WIND, Move.SUBSTITUTE, Move.ELECTRO_BALL, Move.HEX, Move.CHARGE, Move.DISCHARGE}), Type.ELECTRIC, Type.FIRE),
        ROTOM_WASH("Rotom", "479", (short)45, new short[] {50, 65, 107, 105, 107, 86}, (byte)154, new byte[] {0, 0, 0, 1, 0, 1}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64}, new Move[] {Move.TRICK, Move.ASTONISH, Move.THUNDER_WAVE, Move.THUNDERSHOCK, Move.CONFUSE_RAY, Move.UPROAR, Move.DOUBLE_TEAM, Move.SHOCK_WAVE, Move.OMINOUS_WIND, Move.SUBSTITUTE, Move.ELECTRO_BALL, Move.HEX, Move.CHARGE, Move.DISCHARGE}), Type.ELECTRIC, Type.WATER),
        ROTOM_FROST("Rotom", "479", (short)45, new short[] {50, 65, 107, 105, 107, 86}, (byte)154, new byte[] {0, 0, 0, 1, 0, 1}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64}, new Move[] {Move.TRICK, Move.ASTONISH, Move.THUNDER_WAVE, Move.THUNDERSHOCK, Move.CONFUSE_RAY, Move.UPROAR, Move.DOUBLE_TEAM, Move.SHOCK_WAVE, Move.OMINOUS_WIND, Move.SUBSTITUTE, Move.ELECTRO_BALL, Move.HEX, Move.CHARGE, Move.DISCHARGE}), Type.ELECTRIC, Type.ICE),
        ROTOM_FAN("Rotom", "479", (short)45, new short[] {50, 65, 107, 105, 107, 86}, (byte)154, new byte[] {0, 0, 0, 1, 0, 1}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64}, new Move[] {Move.TRICK, Move.ASTONISH, Move.THUNDER_WAVE, Move.THUNDERSHOCK, Move.CONFUSE_RAY, Move.UPROAR, Move.DOUBLE_TEAM, Move.SHOCK_WAVE, Move.OMINOUS_WIND, Move.SUBSTITUTE, Move.ELECTRO_BALL, Move.HEX, Move.CHARGE, Move.DISCHARGE}), Type.ELECTRIC, Type.FLYING),
        ROTOM_MOW("Rotom", "479", (short)45, new short[] {50, 65, 107, 105, 107, 86}, (byte)154, new byte[] {0, 0, 0, 1, 0, 1}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64}, new Move[] {Move.TRICK, Move.ASTONISH, Move.THUNDER_WAVE, Move.THUNDERSHOCK, Move.CONFUSE_RAY, Move.UPROAR, Move.DOUBLE_TEAM, Move.SHOCK_WAVE, Move.OMINOUS_WIND, Move.SUBSTITUTE, Move.ELECTRO_BALL, Move.HEX, Move.CHARGE, Move.DISCHARGE}), Type.ELECTRIC, Type.GRASS),
        UXIE("Uxie", "480", (short)3, new short[] {75, 75, 130, 75, 130, 95}, (byte)261, new byte[] {0, 0, 2, 0, 1, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 6, 16, 21, 31, 36, 46, 51, 61, 66, 76}, new Move[] {Move.REST, Move.CONFUSION, Move.IMPRISON, Move.ENDURE, Move.SWIFT, Move.YAWN, Move.FUTURE_SIGHT, Move.AMNESIA, Move.EXTRASENSORY, Move.FLAIL, Move.NATURAL_GIFT, Move.MEMENTO}), Type.PSYCHIC),
        MESPRIT("Mesprit", "481", (short)3, new short[] {80, 105, 105, 105, 105, 80}, (byte)261, new byte[] {0, 1, 0, 1, 1, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 6, 16, 21, 31, 36, 46, 51, 61, 66, 76}, new Move[] {Move.REST, Move.CONFUSION, Move.IMPRISON, Move.PROTECT, Move.SWIFT, Move.LUCKY_CHANT, Move.FUTURE_SIGHT, Move.CHARM, Move.EXTRASENSORY, Move.COPYCAT, Move.NATURAL_GIFT, Move.HEALING_WISH}), Type.PSYCHIC),
        AZELF("Azelf", "482", (short)3, new short[] {75, 125, 70, 125, 70, 115}, (byte)261, new byte[] {0, 2, 0, 1, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 6, 16, 21, 31, 36, 46, 51, 61, 66, 76}, new Move[] {Move.REST, Move.CONFUSION, Move.IMPRISON, Move.DETECT, Move.SWIFT, Move.UPROAR, Move.FUTURE_SIGHT, Move.NASTY_PLOT, Move.EXTRASENSORY, Move.LAST_RESORT, Move.NATURAL_GIFT, Move.EXPLOSION}), Type.PSYCHIC),
        DIALGA("Dialga", "483", (short)30, new short[] {100, 120, 120, 150, 100, 90}, (byte)306, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 6, 10, 15, 19, 24, 28, 33, 37, 42, 46, 50}, new Move[] {Move.DRAGONBREATH, Move.SCARY_FACE, Move.METAL_CLAW, Move.ANCIENTPOWER, Move.SLASH, Move.POWER_GEM, Move.METAL_BURST, Move.DRAGON_CLAW, Move.EARTH_POWER, Move.AURA_SPHERE, Move.IRON_TAIL, Move.ROAR_OF_TIME, Move.FLASH_CANNON}), Type.STEEL, Type.DRAGON),
        PALKIA("Palkia", "484", (short)30, new short[] {90, 120, 100, 150, 120, 100}, (byte)306, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 6, 10, 15, 19, 24, 28, 33, 37, 42, 46, 50}, new Move[] {Move.DRAGONBREATH, Move.SCARY_FACE, Move.WATER_PULSE, Move.ANCIENTPOWER, Move.SLASH, Move.POWER_GEM, Move.AQUA_TAIL, Move.DRAGON_CLAW, Move.EARTH_POWER, Move.AURA_SPHERE, Move.AQUA_TAIL, Move.SPACIAL_REND, Move.HYDRO_PUMP}), Type.WATER, Type.DRAGON),
        HEATRAN("Heatran", "485", (short)3, new short[] {91, 90, 106, 130, 106, 77}, (byte)270, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 9, 17, 25, 33, 41, 49, 57, 65, 73, 81, 88, 96}, new Move[] {Move.ANCIENTPOWER, Move.LEER, Move.FIRE_FANG, Move.METAL_SOUND, Move.CRUNCH, Move.SCARY_FACE, Move.LAVA_PLUME, Move.FIRE_SPIN, Move.IRON_HEAD, Move.EARTH_POWER, Move.HEAT_WAVE, Move.STONE_EDGE, Move.MAGMA_STORM}), Type.FIRE, Type.STEEL),
        REGIGIGAS("Regigigas", "486", (short)3, new short[] {110, 160, 110, 80, 110, 100}, (byte)302, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 25, 40, 50, 65, 75, 90, 100}, new Move[] {Move.FIRE_PUNCH, Move.ICE_PUNCH, Move.THUNDERPUNCH, Move.DIZZY_PUNCH, Move.KNOCK_OFF, Move.CONFUSE_RAY, Move.FORESIGHT, Move.REVENGE, Move.WIDE_GUARD, Move.ZEN_HEADBUTT, Move.PAYBACK, Move.CRUSH_GRIP, Move.HEAVY_SLAM, Move.GIGA_IMPACT}), Type.NORMAL),
        GIRATINA_ALTERED("Giratina", "487", (short)3, new short[] {150, 100, 120, 100, 120, 90}, (byte)306, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 6, 10, 15, 19, 24, 28, 33, 37, 42, 46, 50}, new Move[] {Move.DRAGONBREATH, Move.SCARY_FACE, Move.OMINOUS_WIND, Move.ANCIENTPOWER, Move.SLASH, Move.SHADOW_SNEAK, Move.DESTINY_BOND, Move.DRAGON_CLAW, Move.EARTH_POWER, Move.AURA_SPHERE, Move.SHADOW_CLAW, Move.SHADOW_FORCE, Move.HEX}), Type.GHOST, Type.DRAGON),
        GIRATINA_ORIGIN("Giratina", "487", (short)3, new short[] {150, 120, 100, 120, 100, 90}, (byte)306, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 6, 10, 15, 19, 24, 28, 33, 37, 42, 46, 50}, new Move[] {Move.DRAGONBREATH, Move.SCARY_FACE, Move.OMINOUS_WIND, Move.ANCIENTPOWER, Move.SLASH, Move.SHADOW_SNEAK, Move.DESTINY_BOND, Move.DRAGON_CLAW, Move.EARTH_POWER, Move.AURA_SPHERE, Move.SHADOW_CLAW, Move.SHADOW_FORCE, Move.HEX}), Type.GHOST, Type.DRAGON),
        CRESSELIA("Cresselia", "488", (short)3, new short[] {120, 70, 120, 75, 130, 85}, (byte)270, new byte[] {0, 0, 0, 0, 3, 0}, GenderRatio.FEMALE_ONLY, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 11, 20, 29, 38, 47, 57, 66, 75, 84, 93}, new Move[] {Move.CONFUSION, Move.DOUBLE_TEAM, Move.SAFEGUARD, Move.MIST, Move.AURORA_BEAM, Move.FUTURE_SIGHT, Move.SLASH, Move.MOONLIGHT, Move.PSYCHO_CUT, Move.PSYCHO_SHIFT, Move.LUNAR_DANCE, Move.PSYCHIC}), Type.PSYCHIC),
        PHIONE("Phione", "489", (short)30, new short[] {80, 80, 80, 80, 80, 80}, (byte)216, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 9, 16, 24, 31, 39, 46, 54, 61, 69}, new Move[] {Move.BUBBLE, Move.WATER_SPORT, Move.CHARM, Move.SUPERSONIC, Move.BUBBLEBEAM, Move.ACID_ARMOR, Move.WHIRLPOOL, Move.WATER_PULSE, Move.AQUA_RING, Move.DIVE, Move.RAIN_DANCE}), Type.WATER),
        MANAPHY("Manaphy", "490", (short)3, new short[] {100, 100, 100, 100, 100, 100}, (byte)270, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 9, 16, 24, 31, 39, 46, 54, 61, 69, 76}, new Move[] {Move.TAIL_GLOW, Move.BUBBLE, Move.WATER_SPORT, Move.CHARM, Move.SUPERSONIC, Move.BUBBLEBEAM, Move.ACID_ARMOR, Move.WHIRLPOOL, Move.WATER_PULSE, Move.AQUA_RING, Move.DIVE, Move.RAIN_DANCE, Move.HEART_SWAP}), Type.WATER),
        DARKRAI("Darkrai", "491", (short)3, new short[] {70, 90, 90, 135, 90, 125}, (byte)270, new byte[] {0, 0, 0, 2, 0, 1}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 11, 20, 29, 38, 47, 57, 66, 75, 84, 93}, new Move[] {Move.OMINOUS_WIND, Move.DISABLE, Move.QUICK_ATTACK, Move.HYPNOSIS, Move.FAINT_ATTACK, Move.NIGHTMARE, Move.DOUBLE_TEAM, Move.HAZE, Move.DARK_VOID, Move.NASTY_PLOT, Move.DREAM_EATER, Move.DARK_PULSE}), Type.DARK),
        SHAYMIN_LAND("Shaymin", "492", (short)45, new short[] {100, 100, 100, 100, 100, 100}, (byte)270, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 10, 19, 28, 37, 46, 55, 64, 73, 82, 91, 100}, new Move[] {Move.GROWTH, Move.MAGICAL_LEAF, Move.LEECH_SEED, Move.SYNTHESIS, Move.SWEET_SCENT, Move.NATURAL_GIFT, Move.WORRY_SEED, Move.AROMATHERAPY, Move.ENERGY_BALL, Move.SWEET_KISS, Move.HEALING_WISH, Move.SEED_FLARE}), Type.GRASS),
        SHAYMIN_SKY("Shaymin", "492", (short)45, new short[] {100, 103, 75, 120, 75, 127}, (byte)270, new byte[] {0, 0, 0, 0, 0, 3}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 10, 19, 28, 37, 46, 55, 64, 73, 82, 91, 100}, new Move[] {Move.GROWTH, Move.MAGICAL_LEAF, Move.LEECH_SEED, Move.SYNTHESIS, Move.SWEET_SCENT, Move.NATURAL_GIFT, Move.WORRY_SEED, Move.AROMATHERAPY, Move.ENERGY_BALL, Move.SWEET_KISS, Move.HEALING_WISH, Move.SEED_FLARE}), Type.GRASS, Type.FLYING),
        ARCEUS("Arceus", "493", (short)3, new short[] {120, 120, 120, 120, 120, 120}, (byte)324, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100}, new Move[] {Move.SEISMIC_TOSS, Move.COSMIC_POWER, Move.NATURAL_GIFT, Move.PUNISHMENT, Move.GRAVITY, Move.EARTH_POWER, Move.HYPER_VOICE, Move.EXTREMESPEED, Move.REFRESH, Move.FUTURE_SIGHT, Move.RECOVER, Move.HYPER_BEAM, Move.PERISH_SONG, Move.JUDGMENT}), Type.NORMAL);

        private final Map<Integer, Move> LEARNSET;
        private final ExperienceGroup EXP_GROUP;
        private final Species[] EVOLUTION;
        private final GenderRatio GENDER_RATIO;
        private final short[] BASE_STATS;
        private final byte[] EV_YIELD;
        private final Type[] TYPE;
        private final String NAME, NAT_DEX_NUMBER;
        private final short CATCH_RATE;

        Generation4(final String name, final String dexNumber, final short catchRate, final short[] stats, byte expYield, byte[] evYield,
                    GenderRatio ratio, ExperienceGroup group,/*final Species[] evolvesTo,*/ Map<Integer, Move> learnset, final Type... type)
        {
            if(type.length > 2)
            {
                throw new IllegalArgumentException("You must input 1 or 2 types for " + name + ". The types " +
                        Arrays.toString(type) + " are invalid.");
            }
            else if(type.length == 0)
            {
                throw new IllegalArgumentException("You must input at least one type for " + name);
            }

            LEARNSET = new TreeMap<>(learnset);
            GENDER_RATIO = ratio;
            EV_YIELD = new byte[] {evYield[0], evYield[1], evYield[2], evYield[3], evYield[4], evYield[5]};
            BASE_STATS = new short[] {stats[0], stats[1], stats[2], stats[3], stats[4], stats[5]};
            CATCH_RATE = catchRate;
            NAT_DEX_NUMBER = dexNumber;

            NAME = name;
            TYPE = type;

            EVOLUTION = null;
            /*if(evolvesFrom != null)
            {
                switch(evolvesFrom.length)
                {
                    case 1:
                        PREVOLUTION = new Species[]{evolvesFrom[0]};
                        break;
                    case 2:
                        PREVOLUTION = new Species[]{evolvesFrom[0], evolvesFrom[1]};
                        break;
                    case 3:
                        PREVOLUTION = new Species[]{evolvesFrom[0], evolvesFrom[1], evolvesFrom[2]};
                        break;
                    default:
                        PREVOLUTION = new Species[]{evolvesFrom[0], evolvesFrom[1], evolvesFrom[2], evolvesFrom[3]};
                        break;
                }
            }
            else
            {
                PREVOLUTION = null;
            }*/

            /*if(evolvesTo != null)
            {
                switch(evolvesTo.length)
                {
                    case 1:
                        EVOLUTION = new Species[]{evolvesTo[0]};
                        break;
                    case 2:
                        EVOLUTION = new Species[]{evolvesTo[0], evolvesTo[1]};
                        break;
                    case 3:
                        EVOLUTION = new Species[]{evolvesTo[0], evolvesTo[1], evolvesTo[2]};
                        break;
                    default:
                        EVOLUTION = new Species[]{evolvesTo[0], evolvesTo[1], evolvesTo[2], evolvesTo[3]};
                        break;
                }
            }
            else
            {
                EVOLUTION = null;
            }*/

            EXP_GROUP = group;
        }
    }
    private enum Generation5
    {
        VICTINI("Victini", "494", (short)3, new short[] {100, 100, 100, 100, 100, 100}, (byte)270, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 9, 17, 25, 33, 41, 49, 57, 65, 73, 81, 89, 97}, new Move[] {Move.SEARING_SHOT, Move.FOCUS_ENERGY, Move.CONFUSION, Move.INCINERATE, Move.QUICK_ATTACK, Move.ENDURE, Move.HEADBUTT, Move.FLAME_CHARGE, Move.REVERSAL, Move.FLAME_BURST, Move.ZEN_HEADBUTT, Move.INFERNO, Move.DOUBLE_EDGE, Move.FLARE_BLITZ, Move.FINAL_GAMBIT, Move.STORED_POWER, Move.OVERHEAT}), Type.PSYCHIC, Type.FIRE),
        SNIVY("Snivy", "495", (short)45, new short[] {45, 45, 55, 45, 55, 63}, (byte)28, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43}, new Move[] {Move.TACKLE, Move.LEER, Move.VINE_WHIP, Move.WRAP, Move.GROWTH, Move.LEAF_TORNADO, Move.LEECH_SEED, Move.MEGA_DRAIN, Move.SLAM, Move.LEAF_BLADE, Move.COIL, Move.GIGA_DRAIN, Move.WRING_OUT, Move.GASTRO_ACID, Move.LEAF_STORM}), Type.GRASS),
        SERVINE("Servine", "496", (short)45, new short[] {60, 60, 75, 60, 75, 83}, (byte)145, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 10, 13, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52}, new Move[] {Move.TACKLE, Move.LEER, Move.VINE_WHIP, Move.WRAP, Move.LEER, Move.VINE_WHIP, Move.WRAP, Move.GROWTH, Move.LEAF_TORNADO, Move.LEECH_SEED, Move.MEGA_DRAIN, Move.SLAM, Move.LEAF_BLADE, Move.COIL, Move.GIGA_DRAIN, Move.WRING_OUT, Move.GASTRO_ACID, Move.LEAF_STORM}), Type.GRASS),
        SERPERIOR("Serperior", "497", (short)45, new short[] {75, 75, 95, 75, 95, 113}, (byte)238, new byte[] {0, 0, 0, 0, 0, 3}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 10, 13, 16, 20, 24, 28, 32, 38, 44, 50, 56, 62}, new Move[] {Move.TACKLE, Move.LEER, Move.VINE_WHIP, Move.WRAP, Move.LEER, Move.VINE_WHIP, Move.WRAP, Move.GROWTH, Move.LEAF_TORNADO, Move.LEECH_SEED, Move.MEGA_DRAIN, Move.SLAM, Move.LEAF_BLADE, Move.COIL, Move.GIGA_DRAIN, Move.WRING_OUT, Move.GASTRO_ACID, Move.LEAF_STORM}), Type.GRASS),
        TEPIG("Tepig", "498", (short)45, new short[] {65, 63, 45, 45, 45, 45}, (byte)28, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 3, 7, 9, 13, 15, 19, 21, 25, 27, 31, 33, 37, 39, 43}, new Move[] {Move.TACKLE, Move.TAIL_WHIP, Move.EMBER, Move.ODOR_SLEUTH, Move.DEFENSE_CURL, Move.FLAME_CHARGE, Move.SMOG, Move.ROLLOUT, Move.TAKE_DOWN, Move.HEAT_CRASH, Move.ASSURANCE, Move.FLAMETHROWER, Move.HEAD_SMASH, Move.ROAR, Move.FLARE_BLITZ}), Type.FIRE),
        PIGNITE("Pignite", "499", (short)45, new short[] {90, 93, 55, 70, 55, 55}, (byte)146, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 3, 7, 9, 13, 15, 17, 20, 23, 28, 31, 36, 39, 44, 47, 52}, new Move[] {Move.TACKLE, Move.TAIL_WHIP, Move.EMBER, Move.ODOR_SLEUTH, Move.TAIL_WHIP, Move.EMBER, Move.ODOR_SLEUTH, Move.DEFENSE_CURL, Move.FLAME_CHARGE, Move.ARM_THRUST, Move.SMOG, Move.ROLLOUT, Move.TAKE_DOWN, Move.HEAT_CRASH, Move.ASSURANCE, Move.FLAMETHROWER, Move.HEAD_SMASH, Move.ROAR, Move.FLARE_BLITZ}), Type.FIRE, Type.FIGHTING),
        EMBOAR("Emboar", "500", (short)45, new short[] {110, 123, 65, 100, 65, 65}, (byte)238, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 3, 7, 9, 13, 15, 17, 20, 23, 28, 31, 38, 43, 50, 55, 62}, new Move[] {Move.HAMMER_ARM, Move.TACKLE, Move.TAIL_WHIP, Move.EMBER, Move.ODOR_SLEUTH, Move.TAIL_WHIP, Move.EMBER, Move.ODOR_SLEUTH, Move.DEFENSE_CURL, Move.FLAME_CHARGE, Move.ARM_THRUST, Move.SMOG, Move.ROLLOUT, Move.TAKE_DOWN, Move.HEAT_CRASH, Move.ASSURANCE, Move.FLAMETHROWER, Move.HEAD_SMASH, Move.ROAR, Move.FLARE_BLITZ}), Type.FIRE, Type.FIGHTING),
        OSHAWOTT("Oshawott", "501", (short)45, new short[] {55, 55, 45, 63, 45, 45}, (byte)28, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 5, 7, 11, 13, 17, 19, 23, 25, 29, 31, 35, 37, 41, 43}, new Move[] {Move.TACKLE, Move.TAIL_WHIP, Move.WATER_GUN, Move.WATER_SPORT, Move.FOCUS_ENERGY, Move.RAZOR_SHELL, Move.FURY_CUTTER, Move.WATER_PULSE, Move.REVENGE, Move.AQUA_JET, Move.ENCORE, Move.AQUA_TAIL, Move.RETALIATE, Move.SWORDS_DANCE, Move.HYDRO_PUMP}), Type.WATER),
        DEWOTT("Dewott", "502", (short)45, new short[] {75, 75, 60, 83, 60, 60}, (byte)145, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 5, 7, 11, 13, 17, 20, 25, 28, 33, 36, 41, 44, 49, 52}, new Move[] {Move.TACKLE, Move.TAIL_WHIP, Move.WATER_GUN, Move.WATER_SPORT, Move.TAIL_WHIP, Move.WATER_GUN, Move.WATER_SPORT, Move.FOCUS_ENERGY, Move.RAZOR_SHELL, Move.FURY_CUTTER, Move.WATER_PULSE, Move.REVENGE, Move.AQUA_JET, Move.ENCORE, Move.AQUA_TAIL, Move.RETALIATE, Move.SWORDS_DANCE, Move.HYDRO_PUMP}), Type.WATER),
        SAMUROTT("Samurott", "503", (short)45, new short[] {95, 100, 85, 108, 70, 70}, (byte)238, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 7, 11, 13, 17, 20, 25, 28, 33, 36, 38, 45, 50, 57, 62}, new Move[] {Move.MEGAHORN, Move.TACKLE, Move.TAIL_WHIP, Move.WATER_GUN, Move.WATER_SPORT, Move.TAIL_WHIP, Move.WATER_GUN, Move.WATER_SPORT, Move.FOCUS_ENERGY, Move.RAZOR_SHELL, Move.FURY_CUTTER, Move.WATER_PULSE, Move.REVENGE, Move.AQUA_JET, Move.SLASH, Move.ENCORE, Move.AQUA_TAIL, Move.RETALIATE, Move.SWORDS_DANCE, Move.HYDRO_PUMP}), Type.WATER),
        PATRAT("Patrat", "504", (short)255, new short[] {45, 55, 39, 35, 39, 42}, (byte)51, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 3, 6, 8, 11, 13, 16, 18, 21, 23, 26, 28, 31, 33, 36}, new Move[] {Move.TACKLE, Move.LEER, Move.BITE, Move.BIDE, Move.DETECT, Move.SAND_ATTACK, Move.CRUNCH, Move.HYPNOSIS, Move.SUPER_FANG, Move.AFTER_YOU, Move.WORK_UP, Move.HYPER_FANG, Move.MEAN_LOOK, Move.BATON_PASS, Move.SLAM}), Type.NORMAL),
        WATCHOG("Watchog", "505", (short)255, new short[] {60, 85, 69, 60, 69, 77}, (byte)147, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 3, 6, 8, 11, 13, 16, 18, 20, 22, 25, 29, 32, 36, 39, 43}, new Move[] {Move.TACKLE, Move.LEER, Move.BITE, Move.LOW_KICK, Move.LEER, Move.BITE, Move.BIDE, Move.DETECT, Move.SAND_ATTACK, Move.CRUNCH, Move.HYPNOSIS, Move.CONFUSE_RAY, Move.SUPER_FANG, Move.AFTER_YOU, Move.PSYCH_UP, Move.HYPER_FANG, Move.MEAN_LOOK, Move.BATON_PASS, Move.SLAM}), Type.NORMAL),
        LILLIPUP("Lillipup", "506", (short)255, new short[] {45, 60, 45, 25, 45, 55}, (byte)55, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 33, 36, 40}, new Move[] {Move.LEER, Move.TACKLE, Move.ODOR_SLEUTH, Move.BITE, Move.HELPING_HAND, Move.TAKE_DOWN, Move.WORK_UP, Move.CRUNCH, Move.ROAR, Move.RETALIATE, Move.REVERSAL, Move.LAST_RESORT, Move.GIGA_IMPACT}), Type.NORMAL),
        HERDIER("Herdier", "507", (short)120, new short[] {65, 80, 65, 35, 65, 60}, (byte)130, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 5, 8, 12, 15, 20, 24, 29, 33, 38, 42, 47}, new Move[] {Move.LEER, Move.TACKLE, Move.ODOR_SLEUTH, Move.BITE, Move.ODOR_SLEUTH, Move.BITE, Move.HELPING_HAND, Move.TAKE_DOWN, Move.WORK_UP, Move.CRUNCH, Move.ROAR, Move.RETALIATE, Move.REVERSAL, Move.LAST_RESORT, Move.GIGA_IMPACT}), Type.NORMAL),
        STOUTLAND("Stoutland", "508", (short)45, new short[] {85, 100, 90, 45, 90, 80}, (byte)221, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 0, 5, 8, 12, 15, 20, 24, 29, 36, 42, 51, 59}, new Move[] {Move.ICE_FANG, Move.FIRE_FANG, Move.THUNDER_FANG, Move.LEER, Move.TACKLE, Move.ODOR_SLEUTH, Move.BITE, Move.ODOR_SLEUTH, Move.BITE, Move.HELPING_HAND, Move.TAKE_DOWN, Move.WORK_UP, Move.CRUNCH, Move.ROAR, Move.RETALIATE, Move.REVERSAL, Move.LAST_RESORT, Move.GIGA_IMPACT}), Type.NORMAL),
        PURRLOIN("Purrloin", "509", (short)255, new short[] {41, 50, 37, 50, 37, 66}, (byte)56, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 3, 6, 10, 12, 15, 19, 21, 24, 28, 30, 33, 37, 39, 42, 46}, new Move[] {Move.SCRATCH, Move.GROWL, Move.ASSIST, Move.SAND_ATTACK, Move.FURY_SWIPES, Move.PURSUIT, Move.TORMENT, Move.FAKE_OUT, Move.HONE_CLAWS, Move.ASSURANCE, Move.SLASH, Move.CAPTIVATE, Move.NIGHT_SLASH, Move.SNATCH, Move.NASTY_PLOT, Move.SUCKER_PUNCH}), Type.DARK),
        LIEPARD("Liepard", "510", (short)90, new short[] {64, 88, 50, 88, 50, 106}, (byte)156, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 3, 6, 10, 12, 15, 19, 22, 26, 31, 34, 38, 43, 47, 50, 55}, new Move[] {Move.SCRATCH, Move.GROWL, Move.ASSIST, Move.SAND_ATTACK, Move.GROWL, Move.ASSIST, Move.SAND_ATTACK, Move.FURY_SWIPES, Move.PURSUIT, Move.TORMENT, Move.FAKE_OUT, Move.HONE_CLAWS, Move.ASSURANCE, Move.SLASH, Move.TAUNT, Move.NIGHT_SLASH, Move.SNATCH, Move.NASTY_PLOT, Move.SUCKER_PUNCH}), Type.DARK),
        PANSAGE("Pansage", "511", (short)65, new short[] {50, 53, 48, 53, 48, 64}, (byte)63, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43}, new Move[] {Move.SCRATCH, Move.LEER, Move.LICK, Move.VINE_WHIP, Move.FURY_SWIPES, Move.LEECH_SEED, Move.BITE, Move.SEED_BOMB, Move.TORMENT, Move.FLING, Move.ACROBATICS, Move.GRASS_KNOT, Move.RECYCLE, Move.NATURAL_GIFT, Move.CRUNCH}), Type.GRASS),
        SIMISAGE("Simisage", "512", (short)65, new short[] {75, 98, 63, 98, 63, 101}, (byte)174, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0}, new Move[] {Move.LEER, Move.LICK, Move.FURY_SWIPES, Move.SEED_BOMB}), Type.GRASS),
        PANSEAR("Pansear", "513", (short)65, new short[] {50, 53, 48, 53, 48, 64}, (byte)63, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43}, new Move[] {Move.SCRATCH, Move.LEER, Move.LICK, Move.INCINERATE, Move.FURY_SWIPES, Move.YAWN, Move.BITE, Move.FLAME_BURST, Move.AMNESIA, Move.FLING, Move.ACROBATICS, Move.FIRE_BLAST, Move.RECYCLE, Move.NATURAL_GIFT, Move.CRUNCH}), Type.FIRE),
        SIMISEAR("Simisear", "514", (short)65, new short[] {75, 98, 63, 98, 63, 101}, (byte)174, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0}, new Move[] {Move.LEER, Move.LICK, Move.FURY_SWIPES, Move.FLAME_BURST}), Type.FIRE),
        PANPOUR("Panpour", "515", (short)65, new short[] {50, 53, 48, 53, 48, 64}, (byte)63, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43}, new Move[] {Move.SCRATCH, Move.LEER, Move.LICK, Move.WATER_GUN, Move.FURY_SWIPES, Move.WATER_SPORT, Move.BITE, Move.SCALD, Move.TAUNT, Move.FLING, Move.ACROBATICS, Move.BRINE, Move.RECYCLE, Move.NATURAL_GIFT, Move.CRUNCH}), Type.WATER),
        SIMIPOUR("Simipour", "516", (short)65, new short[] {75, 98, 63, 98, 63, 101}, (byte)174, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0}, new Move[] {Move.LEER, Move.LICK, Move.FURY_SWIPES, Move.SCALD}), Type.WATER),
        MUNNA("Munna", "517", (short)190, new short[] {76, 25, 45, 67, 55, 24}, (byte)58, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 5, 7, 11, 13, 17, 19, 23, 25, 29, 31, 35, 37, 41, 43, 47}, new Move[] {Move.PSYWAVE, Move.DEFENSE_CURL, Move.LUCKY_CHANT, Move.YAWN, Move.PSYBEAM, Move.IMPRISON, Move.MOONLIGHT, Move.HYPNOSIS, Move.ZEN_HEADBUTT, Move.SYNCHRONOISE, Move.NIGHTMARE, Move.FUTURE_SIGHT, Move.CALM_MIND, Move.PSYCHIC, Move.DREAM_EATER, Move.TELEKINESIS, Move.STORED_POWER}), Type.PSYCHIC),
        MUSHARNA("Musharna", "518", (short)75, new short[] {116, 55, 85, 107, 95, 29}, (byte)170, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 0}, new Move[] {Move.DEFENSE_CURL, Move.LUCKY_CHANT, Move.PSYBEAM, Move.HYPNOSIS}), Type.PSYCHIC),
        PIDOVE("Pidove", "519", (short)255, new short[] {50, 55, 50, 36, 30, 43}, (byte)53, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 39, 43, 46, 50}, new Move[] {Move.GUST, Move.GROWL, Move.LEER, Move.QUICK_ATTACK, Move.AIR_CUTTER, Move.ROOST, Move.DETECT, Move.TAUNT, Move.AIR_SLASH, Move.RAZOR_WIND, Move.FEATHERDANCE, Move.SWAGGER, Move.FACADE, Move.TAILWIND, Move.SKY_ATTACK}), Type.NORMAL, Type.FLYING),
        TRANQUILL("Tranquill", "520", (short)120, new short[] {62, 77, 62, 50, 42, 65}, (byte)125, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 8, 11, 15, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59}, new Move[] {Move.GUST, Move.GROWL, Move.LEER, Move.QUICK_ATTACK, Move.GROWL, Move.LEER, Move.QUICK_ATTACK, Move.AIR_CUTTER, Move.ROOST, Move.DETECT, Move.TAUNT, Move.AIR_SLASH, Move.RAZOR_WIND, Move.FEATHERDANCE, Move.SWAGGER, Move.FACADE, Move.TAILWIND, Move.SKY_ATTACK}), Type.NORMAL, Type.FLYING),
        UNFEZANT("Unfezant", "521", (short)45, new short[] {80, 105, 80, 65, 55, 93}, (byte)215, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 8, 11, 15, 18, 23, 27, 33, 38, 44, 49, 55, 60, 66}, new Move[] {Move.GUST, Move.GROWL, Move.LEER, Move.QUICK_ATTACK, Move.GROWL, Move.LEER, Move.QUICK_ATTACK, Move.AIR_CUTTER, Move.ROOST, Move.DETECT, Move.TAUNT, Move.AIR_SLASH, Move.RAZOR_WIND, Move.FEATHERDANCE, Move.SWAGGER, Move.FACADE, Move.TAILWIND, Move.SKY_ATTACK}), Type.NORMAL, Type.FLYING),
        BLITZLE("Blitzle", "522", (short)190, new short[] {45, 60, 32, 50, 32, 76}, (byte)59, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 39, 43}, new Move[] {Move.QUICK_ATTACK, Move.TAIL_WHIP, Move.CHARGE, Move.SHOCK_WAVE, Move.THUNDER_WAVE, Move.FLAME_CHARGE, Move.PURSUIT, Move.SPARK, Move.STOMP, Move.DISCHARGE, Move.AGILITY, Move.WILD_CHARGE, Move.THRASH}), Type.ELECTRIC),
        ZEBSTRIKA("Zebstrika", "523", (short)75, new short[] {75, 100, 63, 80, 63, 116}, (byte)174, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 4, 8, 11, 15, 18, 22, 25, 31, 36, 42, 47, 53}, new Move[] {Move.QUICK_ATTACK, Move.TAIL_WHIP, Move.CHARGE, Move.THUNDER_WAVE, Move.TAIL_WHIP, Move.CHARGE, Move.SHOCK_WAVE, Move.THUNDER_WAVE, Move.FLAME_CHARGE, Move.PURSUIT, Move.SPARK, Move.STOMP, Move.DISCHARGE, Move.AGILITY, Move.WILD_CHARGE, Move.THRASH}), Type.ELECTRIC),
        ROGGENROLA("Roggenrola", "524", (short)255, new short[] {55, 75, 85, 25, 25, 15}, (byte)56, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 4, 7, 10, 14, 17, 20, 23, 27, 30, 33, 36, 40}, new Move[] {Move.TACKLE, Move.HARDEN, Move.SAND_ATTACK, Move.HEADBUTT, Move.ROCK_BLAST, Move.MUD_SLAP, Move.IRON_DEFENSE, Move.SMACK_DOWN, Move.ROCK_SLIDE, Move.STEALTH_ROCK, Move.SANDSTORM, Move.STONE_EDGE, Move.EXPLOSION}), Type.ROCK),
        BOLDORE("Boldore", "525", (short)120, new short[] {70, 105, 105, 50, 40, 20}, (byte)137, new byte[] {0, 1, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 10, 14, 17, 20, 23, 25, 30, 36, 42, 48, 55}, new Move[] {Move.TACKLE, Move.HARDEN, Move.SAND_ATTACK, Move.HEADBUTT, Move.HARDEN, Move.SAND_ATTACK, Move.HEADBUTT, Move.ROCK_BLAST, Move.MUD_SLAP, Move.IRON_DEFENSE, Move.SMACK_DOWN, Move.POWER_GEM, Move.ROCK_SLIDE, Move.STEALTH_ROCK, Move.SANDSTORM, Move.STONE_EDGE, Move.EXPLOSION}), Type.ROCK),
        GIGALITH("Gigalith", "526", (short)45, new short[] {85, 135, 130, 60, 70, 25}, (byte)227, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 10, 14, 17, 20, 23, 25, 30, 36, 42, 48, 55}, new Move[] {Move.TACKLE, Move.HARDEN, Move.SAND_ATTACK, Move.HEADBUTT, Move.HARDEN, Move.SAND_ATTACK, Move.HEADBUTT, Move.ROCK_BLAST, Move.MUD_SLAP, Move.IRON_DEFENSE, Move.SMACK_DOWN, Move.POWER_GEM, Move.ROCK_SLIDE, Move.STEALTH_ROCK, Move.SANDSTORM, Move.STONE_EDGE, Move.EXPLOSION}), Type.ROCK),
        WOOBAT("Woobat", "527", (short)190, new short[] {55, 45, 43, 55, 43, 72}, (byte)63, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 8, 12, 15, 19, 21, 25, 29, 29, 32, 36, 41, 47}, new Move[] {Move.CONFUSION, Move.ODOR_SLEUTH, Move.GUST, Move.ASSURANCE, Move.HEART_STAMP, Move.IMPRISON, Move.AIR_CUTTER, Move.ATTRACT, Move.AMNESIA, Move.CALM_MIND, Move.AIR_SLASH, Move.FUTURE_SIGHT, Move.PSYCHIC, Move.ENDEAVOR}), Type.PSYCHIC, Type.FLYING),
        SWOOBAT("Swoobat", "528", (short)45, new short[] {67, 57, 55, 77, 55, 114}, (byte)149, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 4, 8, 12, 15, 19, 21, 25, 29, 29, 32, 36, 41, 47}, new Move[] {Move.CONFUSION, Move.ODOR_SLEUTH, Move.GUST, Move.ASSURANCE, Move.ODOR_SLEUTH, Move.GUST, Move.ASSURANCE, Move.HEART_STAMP, Move.IMPRISON, Move.AIR_CUTTER, Move.ATTRACT, Move.AMNESIA, Move.CALM_MIND, Move.AIR_SLASH, Move.FUTURE_SIGHT, Move.PSYCHIC, Move.ENDEAVOR}), Type.PSYCHIC, Type.FLYING),
        DRILBUR("Drilbur", "529", (short)120, new short[] {60, 85, 40, 30, 45, 68}, (byte)66, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 33, 36, 40, 43, 47}, new Move[] {Move.SCRATCH, Move.MUD_SPORT, Move.RAPID_SPIN, Move.MUD_SLAP, Move.FURY_SWIPES, Move.METAL_CLAW, Move.DIG, Move.HONE_CLAWS, Move.SLASH, Move.ROCK_SLIDE, Move.EARTHQUAKE, Move.SWORDS_DANCE, Move.SANDSTORM, Move.DRILL_RUN, Move.FISSURE}), Type.GROUND),
        EXCADRILL("Excadrill", "530", (short)60, new short[] {110, 135, 60, 50, 65, 88}, (byte)178, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 31, 36, 42, 49, 55, 62}, new Move[] {Move.SCRATCH, Move.MUD_SPORT, Move.RAPID_SPIN, Move.MUD_SLAP, Move.RAPID_SPIN, Move.MUD_SLAP, Move.FURY_SWIPES, Move.METAL_CLAW, Move.DIG, Move.HONE_CLAWS, Move.SLASH, Move.ROCK_SLIDE, Move.HORN_DRILL, Move.EARTHQUAKE, Move.SWORDS_DANCE, Move.SANDSTORM, Move.DRILL_RUN, Move.FISSURE}), Type.GROUND, Type.STEEL),
        AUDINO("Audino", "531", (short)255, new short[] {103, 60, 86, 60, 86, 50}, (byte)390, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55}, new Move[] {Move.POUND, Move.GROWL, Move.HELPING_HAND, Move.REFRESH, Move.DOUBLESLAP, Move.ATTRACT, Move.SECRET_POWER, Move.ENTRAINMENT, Move.TAKE_DOWN, Move.HEAL_PULSE, Move.AFTER_YOU, Move.SIMPLE_BEAM, Move.DOUBLE_EDGE, Move.LAST_RESORT}), Type.NORMAL),
        TIMBURR("Timburr", "532", (short)180, new short[] {75, 80, 55, 25, 35, 35}, (byte)61, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 4, 8, 12, 16, 20, 24, 28, 31, 34, 37, 40, 43, 46, 49}, new Move[] {Move.POUND, Move.LEER, Move.FOCUS_ENERGY, Move.BIDE, Move.LOW_KICK, Move.ROCK_THROW, Move.WAKE_UP_SLAP, Move.CHIP_AWAY, Move.BULK_UP, Move.ROCK_SLIDE, Move.DYNAMICPUNCH, Move.SCARY_FACE, Move.HAMMER_ARM, Move.STONE_EDGE, Move.FOCUS_PUNCH, Move.SUPERPOWER}), Type.FIGHTING),
        GURDURR("Gurdurr", "533", (short)90, new short[] {85, 105, 85, 40, 50, 40}, (byte)142, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 8, 12, 16, 20, 24, 29, 33, 37, 41, 45, 49, 53, 57}, new Move[] {Move.POUND, Move.LEER, Move.FOCUS_ENERGY, Move.BIDE, Move.FOCUS_ENERGY, Move.BIDE, Move.LOW_KICK, Move.ROCK_THROW, Move.WAKE_UP_SLAP, Move.CHIP_AWAY, Move.BULK_UP, Move.ROCK_SLIDE, Move.DYNAMICPUNCH, Move.SCARY_FACE, Move.HAMMER_ARM, Move.STONE_EDGE, Move.FOCUS_PUNCH, Move.SUPERPOWER}), Type.FIGHTING),
        CONKELDURR("Conkeldurr", "534", (short)45, new short[] {105, 140, 95, 55, 65, 45}, (byte)227, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_THREE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 8, 12, 16, 20, 24, 29, 33, 37, 41, 45, 49, 53, 57}, new Move[] {Move.POUND, Move.LEER, Move.FOCUS_ENERGY, Move.BIDE, Move.FOCUS_ENERGY, Move.BIDE, Move.LOW_KICK, Move.ROCK_THROW, Move.WAKE_UP_SLAP, Move.CHIP_AWAY, Move.BULK_UP, Move.ROCK_SLIDE, Move.DYNAMICPUNCH, Move.SCARY_FACE, Move.HAMMER_ARM, Move.STONE_EDGE, Move.FOCUS_PUNCH, Move.SUPERPOWER}), Type.FIGHTING),
        TYMPOLE("Tympole", "535", (short)255, new short[] {50, 50, 40, 50, 40, 64}, (byte)59, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 5, 9, 12, 16, 20, 23, 27, 31, 34, 38, 42, 45}, new Move[] {Move.BUBBLE, Move.GROWL, Move.SUPERSONIC, Move.ROUND, Move.BUBBLEBEAM, Move.MUD_SHOT, Move.AQUA_RING, Move.UPROAR, Move.MUDDY_WATER, Move.RAIN_DANCE, Move.FLAIL, Move.ECHOED_VOICE, Move.HYDRO_PUMP, Move.HYPER_VOICE}), Type.WATER),
        PALPITOAD("Palpitoad", "536", (short)120, new short[] {75, 65, 55, 65, 55, 69}, (byte)134, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 5, 9, 12, 16, 20, 23, 28, 33, 37, 42, 47, 51}, new Move[] {Move.BUBBLE, Move.GROWL, Move.SUPERSONIC, Move.ROUND, Move.SUPERSONIC, Move.ROUND, Move.BUBBLEBEAM, Move.MUD_SHOT, Move.AQUA_RING, Move.UPROAR, Move.MUDDY_WATER, Move.RAIN_DANCE, Move.FLAIL, Move.ECHOED_VOICE, Move.HYDRO_PUMP, Move.HYPER_VOICE}), Type.WATER, Type.GROUND),
        SEISMITOAD("Seismitoad", "537", (short)45, new short[] {105, 85, 75, 85, 75, 74}, (byte)225, new byte[] {3, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 5, 9, 12, 16, 20, 23, 28, 33, 36, 39, 44, 49, 53, 59}, new Move[] {Move.BUBBLE, Move.GROWL, Move.SUPERSONIC, Move.ROUND, Move.SUPERSONIC, Move.ROUND, Move.BUBBLEBEAM, Move.MUD_SHOT, Move.AQUA_RING, Move.UPROAR, Move.MUDDY_WATER, Move.RAIN_DANCE, Move.ACID, Move.FLAIL, Move.DRAIN_PUNCH, Move.ECHOED_VOICE, Move.HYDRO_PUMP, Move.HYPER_VOICE}), Type.WATER, Type.GROUND),
        THROH("Throh", "538", (short)45, new short[] {120, 100, 85, 30, 85, 45}, (byte)163, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53}, new Move[] {Move.BIND, Move.LEER, Move.BIDE, Move.FOCUS_ENERGY, Move.SEISMIC_TOSS, Move.VITAL_THROW, Move.REVENGE, Move.STORM_THROW, Move.BODY_SLAM, Move.BULK_UP, Move.CIRCLE_THROW, Move.ENDURE, Move.WIDE_GUARD, Move.SUPERPOWER, Move.REVERSAL}), Type.FIGHTING),
        SAWK("Sawk", "539", (short)45, new short[] {75, 125, 75, 30, 75, 85}, (byte)163, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53}, new Move[] {Move.ROCK_SMASH, Move.LEER, Move.BIDE, Move.FOCUS_ENERGY, Move.DOUBLE_KICK, Move.LOW_SWEEP, Move.COUNTER, Move.KARATE_CHOP, Move.BRICK_BREAK, Move.BULK_UP, Move.RETALIATE, Move.ENDURE, Move.QUICK_GUARD, Move.CLOSE_COMBAT, Move.REVERSAL}), Type.FIGHTING),
        SEWADDLE("Sewaddle", "540", (short)255, new short[] {45, 53, 70, 40, 60, 42}, (byte)62, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 8, 15, 22, 29, 36, 43}, new Move[] {Move.TACKLE, Move.STRING_SHOT, Move.BUG_BITE, Move.RAZOR_LEAF, Move.STRUGGLE_BUG, Move.ENDURE, Move.BUG_BUZZ, Move.FLAIL}), Type.BUG, Type.GRASS),
        SWADLOON("Swadloon", "541", (short)120, new short[] {55, 63, 90, 50, 80, 42}, (byte)133, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 20}, new Move[] {Move.GRASSWHISTLE, Move.TACKLE, Move.STRING_SHOT, Move.BUG_BITE, Move.RAZOR_LEAF, Move.PROTECT}), Type.BUG, Type.GRASS),
        LEAVANNY("Leavanny", "542", (short)45, new short[] {75, 103, 80, 70, 70, 92}, (byte)221, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 8, 15, 22, 29, 32, 36, 39, 43, 46, 50}, new Move[] {Move.FALSE_SWIPE, Move.TACKLE, Move.STRING_SHOT, Move.BUG_BITE, Move.RAZOR_LEAF, Move.BUG_BITE, Move.RAZOR_LEAF, Move.STRUGGLE_BUG, Move.SLASH, Move.HELPING_HAND, Move.LEAF_BLADE, Move.X_SCISSOR, Move.ENTRAINMENT, Move.SWORDS_DANCE, Move.LEAF_STORM}), Type.BUG, Type.GRASS),
        VENIPEDE("Venipede", "543", (short)255, new short[] {30, 45, 59, 30, 39, 57}, (byte)52, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 5, 8, 12, 15, 19, 22, 26, 29, 33, 36, 40, 43}, new Move[] {Move.DEFENSE_CURL, Move.ROLLOUT, Move.POISON_STING, Move.SCREECH, Move.PURSUIT, Move.PROTECT, Move.POISON_TAIL, Move.BUG_BITE, Move.VENOSHOCK, Move.AGILITY, Move.STEAMROLLER, Move.TOXIC, Move.ROCK_CLIMB, Move.DOUBLE_EDGE}), Type.BUG, Type.POISON),
        WHIRLIPEDE("Whirlipede", "544", (short)120, new short[] {40, 55, 99, 40, 79, 47}, (byte)126, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 5, 8, 12, 15, 19, 22, 23, 28, 32, 37, 41, 46, 50}, new Move[] {Move.DEFENSE_CURL, Move.ROLLOUT, Move.POISON_STING, Move.SCREECH, Move.POISON_STING, Move.SCREECH, Move.PURSUIT, Move.PROTECT, Move.POISON_TAIL, Move.IRON_DEFENSE, Move.BUG_BITE, Move.VENOSHOCK, Move.AGILITY, Move.STEAMROLLER, Move.TOXIC, Move.ROCK_CLIMB, Move.DOUBLE_EDGE}), Type.BUG, Type.POISON),
        SCOLIPEDE("Scolipede", "545", (short)45, new short[] {60, 90, 89, 55, 69, 112}, (byte)214, new byte[] {0, 0, 0, 0, 0, 3}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 8, 12, 15, 19, 23, 28, 30, 33, 39, 44, 50, 55}, new Move[] {Move.MEGAHORN, Move.DEFENSE_CURL, Move.ROLLOUT, Move.POISON_STING, Move.SCREECH, Move.POISON_STING, Move.SCREECH, Move.PURSUIT, Move.PROTECT, Move.POISON_TAIL, Move.BUG_BITE, Move.VENOSHOCK, Move.BATON_PASS, Move.AGILITY, Move.STEAMROLLER, Move.TOXIC, Move.ROCK_CLIMB, Move.DOUBLE_EDGE}), Type.BUG, Type.POISON),
        COTTONEE("Cottonee", "546", (short)190, new short[] {40, 27, 60, 37, 50, 66}, (byte)56, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 8, 10, 13, 17, 19, 22, 26, 28, 31, 35, 37, 40, 44, 46}, new Move[] {Move.ABSORB, Move.GROWTH, Move.LEECH_SEED, Move.STUN_SPORE, Move.MEGA_DRAIN, Move.COTTON_SPORE, Move.RAZOR_LEAF, Move.POISONPOWDER, Move.GIGA_DRAIN, Move.CHARM, Move.HELPING_HAND, Move.ENERGY_BALL, Move.COTTON_GUARD, Move.SUNNY_DAY, Move.ENDEAVOR, Move.SOLARBEAM}), Type.GRASS),
        WHIMSICOTT("Whimsicott", "547", (short)75, new short[] {60, 67, 85, 77, 75, 116}, (byte)168, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 10, 28, 46}, new Move[] {Move.GROWTH, Move.LEECH_SEED, Move.MEGA_DRAIN, Move.COTTON_SPORE, Move.GUST, Move.TAILWIND, Move.HURRICANE}), Type.GRASS),
        PETILIL("Petilil", "548", (short)190, new short[] {45, 35, 50, 70, 50, 30}, (byte)56, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.FEMALE_ONLY, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 8, 10, 13, 17, 19, 22, 26, 28, 31, 35, 37, 40, 44, 46}, new Move[] {Move.ABSORB, Move.GROWTH, Move.LEECH_SEED, Move.SLEEP_POWDER, Move.MEGA_DRAIN, Move.SYNTHESIS, Move.MAGICAL_LEAF, Move.STUN_SPORE, Move.GIGA_DRAIN, Move.AROMATHERAPY, Move.HELPING_HAND, Move.ENERGY_BALL, Move.ENTRAINMENT, Move.SUNNY_DAY, Move.AFTER_YOU, Move.LEAF_STORM}), Type.GRASS),
        LILLIGANT("Lilligant", "549", (short)75, new short[] {70, 60, 75, 110, 75, 90}, (byte)168, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.FEMALE_ONLY, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 10, 28, 46}, new Move[] {Move.GROWTH, Move.LEECH_SEED, Move.MEGA_DRAIN, Move.SYNTHESIS, Move.TEETER_DANCE, Move.QUIVER_DANCE, Move.PETAL_DANCE}), Type.GRASS),
        BASCULIN("Basculin", "550", (short)25, new short[] {70, 92, 65, 80, 55, 98}, (byte)161, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 4, 7, 10, 13, 16, 20, 24, 28, 32, 36, 41, 46, 51, 56}, new Move[] {Move.TACKLE, Move.WATER_GUN, Move.UPROAR, Move.HEADBUTT, Move.BITE, Move.AQUA_JET, Move.CHIP_AWAY, Move.TAKE_DOWN, Move.CRUNCH, Move.AQUA_TAIL, Move.SOAK, Move.DOUBLE_EDGE, Move.SCARY_FACE, Move.FLAIL, Move.FINAL_GAMBIT, Move.THRASH}), Type.WATER),
        SANDILE("Sandile", "551", (short)180, new short[] {50, 72, 35, 35, 35, 65}, (byte)58, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46}, new Move[] {Move.LEER, Move.RAGE, Move.BITE, Move.SAND_ATTACK, Move.TORMENT, Move.SAND_TOMB, Move.ASSURANCE, Move.MUD_SLAP, Move.EMBARGO, Move.SWAGGER, Move.CRUNCH, Move.DIG, Move.SCARY_FACE, Move.FOUL_PLAY, Move.SANDSTORM, Move.EARTHQUAKE, Move.THRASH}), Type.GROUND, Type.DARK),
        KROKOROK("Krokorok", "552", (short)90, new short[] {60, 82, 45, 45, 45, 74}, (byte)123, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 32, 36, 40, 44, 48, 52}, new Move[] {Move.LEER, Move.RAGE, Move.BITE, Move.SAND_ATTACK, Move.BITE, Move.SAND_ATTACK, Move.TORMENT, Move.SAND_TOMB, Move.ASSURANCE, Move.MUD_SLAP, Move.EMBARGO, Move.SWAGGER, Move.CRUNCH, Move.DIG, Move.SCARY_FACE, Move.FOUL_PLAY, Move.SANDSTORM, Move.EARTHQUAKE, Move.THRASH}), Type.GROUND, Type.DARK),
        KROOKODILE("Krookodile", "553", (short)45, new short[] {95, 117, 70, 65, 70, 92}, (byte)229, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 10, 13, 16, 19, 22, 25, 28, 32, 36, 42, 48, 54, 60}, new Move[] {Move.LEER, Move.RAGE, Move.BITE, Move.SAND_ATTACK, Move.BITE, Move.SAND_ATTACK, Move.TORMENT, Move.SAND_TOMB, Move.ASSURANCE, Move.MUD_SLAP, Move.EMBARGO, Move.SWAGGER, Move.CRUNCH, Move.DIG, Move.SCARY_FACE, Move.FOUL_PLAY, Move.SANDSTORM, Move.EARTHQUAKE, Move.OUTRAGE}), Type.GROUND, Type.DARK),
        DARUMAKA("Darumaka", "554", (short)120, new short[] {70, 90, 45, 15, 45, 50}, (byte)63, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 3, 6, 9, 11, 14, 17, 19, 22, 25, 27, 30, 33, 35, 39, 42}, new Move[] {Move.TACKLE, Move.ROLLOUT, Move.INCINERATE, Move.RAGE, Move.FIRE_FANG, Move.HEADBUTT, Move.UPROAR, Move.FACADE, Move.FIRE_PUNCH, Move.WORK_UP, Move.THRASH, Move.BELLY_DRUM, Move.FLARE_BLITZ, Move.TAUNT, Move.SUPERPOWER, Move.OVERHEAT}), Type.FIRE),
        DARMANITAN_STANDARD("Darmanitan", "555", (short)60, new short[] {105, 140, 55, 30, 55, 95}, (byte)168, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 3, 6, 9, 11, 14, 17, 19, 22, 25, 27, 30, 33, 35, 39, 47, 54}, new Move[] {Move.TACKLE, Move.ROLLOUT, Move.INCINERATE, Move.RAGE, Move.ROLLOUT, Move.INCINERATE, Move.RAGE, Move.FIRE_FANG, Move.HEADBUTT, Move.SWAGGER, Move.FACADE, Move.FIRE_PUNCH, Move.WORK_UP, Move.THRASH, Move.BELLY_DRUM, Move.FLARE_BLITZ, Move.HAMMER_ARM, Move.TAUNT, Move.SUPERPOWER, Move.OVERHEAT}), Type.FIRE),
        DARMANITAN_ZEN("Darmanitan", "555", (short)60, new short[] {105, 30, 105, 140, 105, 55}, (byte)168, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 3, 6, 9, 11, 14, 17, 19, 22, 25, 27, 30, 33, 35, 39, 47, 54}, new Move[] {Move.TACKLE, Move.ROLLOUT, Move.INCINERATE, Move.RAGE, Move.ROLLOUT, Move.INCINERATE, Move.RAGE, Move.FIRE_FANG, Move.HEADBUTT, Move.SWAGGER, Move.FACADE, Move.FIRE_PUNCH, Move.WORK_UP, Move.THRASH, Move.BELLY_DRUM, Move.FLARE_BLITZ, Move.HAMMER_ARM, Move.TAUNT, Move.SUPERPOWER, Move.OVERHEAT}), Type.FIRE, Type.PSYCHIC),
        MARACTUS("Maractus", "556", (short)255, new short[] {75, 86, 67, 106, 67, 60}, (byte)161, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 3, 6, 10, 13, 15, 18, 22, 26, 29, 33, 38, 42, 45, 50, 55, 57}, new Move[] {Move.PECK, Move.ABSORB, Move.SWEET_SCENT, Move.GROWTH, Move.PIN_MISSILE, Move.MEGA_DRAIN, Move.SYNTHESIS, Move.COTTON_SPORE, Move.NEEDLE_ARM, Move.GIGA_DRAIN, Move.ACUPRESSURE, Move.INGRAIN, Move.PETAL_DANCE, Move.SUCKER_PUNCH, Move.SUNNY_DAY, Move.SOLARBEAM, Move.COTTON_GUARD, Move.AFTER_YOU}), Type.GRASS),
        DWEBBLE("Dwebble", "557", (short)190, new short[] {50, 65, 85, 35, 35, 55}, (byte)65, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 5, 7, 11, 13, 17, 19, 23, 24, 29, 31, 35, 37, 41, 43}, new Move[] {Move.FURY_CUTTER, Move.ROCK_BLAST, Move.WITHDRAW, Move.SAND_ATTACK, Move.FAINT_ATTACK, Move.SMACK_DOWN, Move.ROCK_POLISH, Move.BUG_BITE, Move.STEALTH_ROCK, Move.ROCK_SLIDE, Move.SLASH, Move.X_SCISSOR, Move.SHELL_SMASH, Move.FLAIL, Move.ROCK_WRECKER}), Type.BUG, Type.ROCK),
        CRUSTLE("Crustle", "558", (short)75, new short[] {70, 95, 125, 65, 75, 45}, (byte)166, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 5, 7, 11, 13, 17, 19, 23, 24, 29, 31, 38, 43, 50, 55}, new Move[] {Move.SHELL_SMASH, Move.ROCK_BLAST, Move.WITHDRAW, Move.SAND_ATTACK, Move.ROCK_BLAST, Move.WITHDRAW, Move.SAND_ATTACK, Move.FAINT_ATTACK, Move.SMACK_DOWN, Move.ROCK_POLISH, Move.BUG_BITE, Move.STEALTH_ROCK, Move.ROCK_SLIDE, Move.SLASH, Move.X_SCISSOR, Move.SHELL_SMASH, Move.FLAIL, Move.ROCK_WRECKER}), Type.BUG, Type.ROCK),
        SCRAGGY("Scraggy", "559", (short)180, new short[] {50, 75, 70, 35, 70, 48}, (byte)70, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 9, 12, 16, 20, 23, 27, 31, 34, 38, 42, 45, 49, 53}, new Move[] {Move.LEER, Move.LOW_KICK, Move.SAND_ATTACK, Move.FAINT_ATTACK, Move.HEADBUTT, Move.SWAGGER, Move.BRICK_BREAK, Move.PAYBACK, Move.CHIP_AWAY, Move.HI_JUMP_KICK, Move.SCARY_FACE, Move.CRUNCH, Move.FACADE, Move.ROCK_CLIMB, Move.FOCUS_PUNCH, Move.HEAD_SMASH}), Type.DARK, Type.FIGHTING),
        SCRAFTY("Scrafty", "560", (short)90, new short[] {65, 90, 115, 45, 115, 58}, (byte)171, new byte[] {0, 0, 1, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 5, 9, 12, 16, 20, 23, 27, 31, 34, 38, 45, 51, 58, 65}, new Move[] {Move.LEER, Move.LOW_KICK, Move.SAND_ATTACK, Move.FAINT_ATTACK, Move.SAND_ATTACK, Move.FAINT_ATTACK, Move.HEADBUTT, Move.SWAGGER, Move.BRICK_BREAK, Move.PAYBACK, Move.CHIP_AWAY, Move.HI_JUMP_KICK, Move.SCARY_FACE, Move.CRUNCH, Move.FACADE, Move.ROCK_CLIMB, Move.FOCUS_PUNCH, Move.HEAD_SMASH}), Type.DARK, Type.FIGHTING),
        SIGILYPH("Sigilyph", "561", (short)45, new short[] {72, 58, 80, 103, 80, 97}, (byte)172, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 4, 8, 11, 14, 18, 21, 24, 28, 31, 34, 38, 41, 44, 48, 51}, new Move[] {Move.GUST, Move.MIRACLE_EYE, Move.HYPNOSIS, Move.PSYWAVE, Move.TAILWIND, Move.WHIRLWIND, Move.PSYBEAM, Move.AIR_CUTTER, Move.LIGHT_SCREEN, Move.REFLECT, Move.SYNCHRONOISE, Move.MIRROR_MOVE, Move.GRAVITY, Move.AIR_SLASH, Move.PSYCHIC, Move.COSMIC_POWER, Move.SKY_ATTACK}), Type.PSYCHIC, Type.FLYING),
        YAMASK("Yamask", "562", (short)190, new short[] {38, 30, 85, 55, 65, 30}, (byte)61, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 33, 37, 41, 45, 49}, new Move[] {Move.ASTONISH, Move.PROTECT, Move.DISABLE, Move.HAZE, Move.NIGHT_SHADE, Move.HEX, Move.WILL_O_WISP, Move.OMINOUS_WIND, Move.CURSE, Move.POWER_SPLIT, Move.GUARD_SPLIT, Move.SHADOW_BALL, Move.GRUDGE, Move.MEAN_LOOK, Move.DESTINY_BOND}), Type.GHOST),
        COFAGRIGUS("Cofagrigus", "563", (short)90, new short[] {58, 50, 145, 95, 105, 30}, (byte)169, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 33, 34, 39, 45, 51, 57}, new Move[] {Move.ASTONISH, Move.PROTECT, Move.DISABLE, Move.HAZE, Move.DISABLE, Move.HAZE, Move.NIGHT_SHADE, Move.HEX, Move.WILL_O_WISP, Move.OMINOUS_WIND, Move.CURSE, Move.POWER_SPLIT, Move.GUARD_SPLIT, Move.SCARY_FACE, Move.SHADOW_BALL, Move.GRUDGE, Move.MEAN_LOOK, Move.DESTINY_BOND}), Type.GHOST),
        TIRTOUGA("Tirtouga", "564", (short)45, new short[] {54, 78, 103, 53, 45, 22}, (byte)71, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 8, 11, 15, 18, 21, 25, 28, 31, 35, 38, 41, 45, 48, 51}, new Move[] {Move.BIDE, Move.WITHDRAW, Move.WATER_GUN, Move.ROLLOUT, Move.BITE, Move.PROTECT, Move.AQUA_JET, Move.ANCIENTPOWER, Move.CRUNCH, Move.WIDE_GUARD, Move.BRINE, Move.SMACK_DOWN, Move.CURSE, Move.SHELL_SMASH, Move.AQUA_TAIL, Move.ROCK_SLIDE, Move.RAIN_DANCE, Move.HYDRO_PUMP}), Type.WATER, Type.ROCK),
        CARRACOSTA("Carracosta", "565", (short)45, new short[] {74, 108, 133, 83, 65, 32}, (byte)173, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 5, 8, 11, 15, 18, 21, 25, 28, 31, 35, 40, 45, 51, 56, 61}, new Move[] {Move.BIDE, Move.WITHDRAW, Move.WATER_GUN, Move.ROLLOUT, Move.ROLLOUT, Move.BITE, Move.PROTECT, Move.AQUA_JET, Move.ANCIENTPOWER, Move.CRUNCH, Move.WIDE_GUARD, Move.BRINE, Move.SMACK_DOWN, Move.CURSE, Move.SHELL_SMASH, Move.AQUA_TAIL, Move.ROCK_SLIDE, Move.RAIN_DANCE, Move.HYDRO_PUMP}), Type.WATER, Type.ROCK),
        ARCHEN("Archen", "566", (short)45, new short[] {55, 112, 45, 74, 45, 70}, (byte)71, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 8, 11, 15, 18, 21, 25, 28, 31, 35, 38, 41, 45, 48, 51}, new Move[] {Move.QUICK_ATTACK, Move.LEER, Move.WING_ATTACK, Move.ROCK_THROW, Move.DOUBLE_TEAM, Move.SCARY_FACE, Move.PLUCK, Move.ANCIENTPOWER, Move.AGILITY, Move.QUICK_GUARD, Move.ACROBATICS, Move.DRAGONBREATH, Move.CRUNCH, Move.ENDEAVOR, Move.U_TURN, Move.ROCK_SLIDE, Move.DRAGON_CLAW, Move.THRASH}), Type.ROCK, Type.FLYING),
        ARCHEOPS("Archeops", "567", (short)45, new short[] {75, 140, 65, 112, 65, 110}, (byte)177, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 5, 8, 11, 15, 18, 21, 25, 28, 31, 35, 40, 45, 51, 56, 61}, new Move[] {Move.QUICK_ATTACK, Move.LEER, Move.WING_ATTACK, Move.ROCK_THROW, Move.ROCK_THROW, Move.DOUBLE_TEAM, Move.SCARY_FACE, Move.PLUCK, Move.ANCIENTPOWER, Move.AGILITY, Move.QUICK_GUARD, Move.ACROBATICS, Move.DRAGONBREATH, Move.CRUNCH, Move.ENDEAVOR, Move.U_TURN, Move.ROCK_SLIDE, Move.DRAGON_CLAW, Move.THRASH}), Type.ROCK, Type.FLYING),
        TRUBBISH("Trubbish", "568", (short)190, new short[] {50, 50, 62, 40, 62, 65}, (byte)66, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 3, 7, 12, 14, 18, 23, 23, 25, 29, 34, 36, 40, 45, 47}, new Move[] {Move.POUND, Move.POISON_GAS, Move.RECYCLE, Move.TOXIC_SPIKES, Move.ACID_SPRAY, Move.DOUBLESLAP, Move.SLUDGE, Move.STOCKPILE, Move.SWALLOW, Move.TAKE_DOWN, Move.SLUDGE_BOMB, Move.CLEAR_SMOG, Move.TOXIC, Move.AMNESIA, Move.GUNK_SHOT, Move.EXPLOSION}), Type.POISON),
        GARBODOR("Garbodor", "569", (short)60, new short[] {80, 95, 82, 60, 82, 75}, (byte)166, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 3, 7, 12, 14, 18, 23, 23, 25, 29, 34, 39, 46, 54, 59}, new Move[] {Move.POUND, Move.POISON_GAS, Move.RECYCLE, Move.TOXIC_SPIKES, Move.RECYCLE, Move.TOXIC_SPIKES, Move.ACID_SPRAY, Move.DOUBLESLAP, Move.SLUDGE, Move.STOCKPILE, Move.SWALLOW, Move.BODY_SLAM, Move.SLUDGE_BOMB, Move.CLEAR_SMOG, Move.TOXIC, Move.AMNESIA, Move.GUNK_SHOT, Move.EXPLOSION}), Type.POISON),
        ZORUA("Zorua", "570", (short)75, new short[] {40, 65, 40, 80, 40, 65}, (byte)66, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57}, new Move[] {Move.SCRATCH, Move.LEER, Move.PURSUIT, Move.FAKE_TEARS, Move.FURY_SWIPES, Move.FAINT_ATTACK, Move.SCARY_FACE, Move.TAUNT, Move.FOUL_PLAY, Move.TORMENT, Move.AGILITY, Move.EMBARGO, Move.PUNISHMENT, Move.NASTY_PLOT, Move.IMPRISON, Move.NIGHT_DAZE}), Type.DARK),
        ZOROARK("Zoroark", "571", (short)45, new short[] {60, 105, 60, 120, 60, 105}, (byte)179, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_SEVEN_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 30, 34, 39, 44, 49, 54, 59, 64}, new Move[] {Move.U_TURN, Move.SCRATCH, Move.LEER, Move.PURSUIT, Move.HONE_CLAWS, Move.PURSUIT, Move.HONE_CLAWS, Move.FURY_SWIPES, Move.FAINT_ATTACK, Move.SCARY_FACE, Move.TAUNT, Move.FOUL_PLAY, Move.NIGHT_SLASH, Move.TORMENT, Move.AGILITY, Move.EMBARGO, Move.PUNISHMENT, Move.NASTY_PLOT, Move.IMPRISON, Move.NIGHT_DAZE}), Type.DARK),
        MINCCINO("Minccino", "572", (short)255, new short[] {55, 50, 40, 40, 40, 75}, (byte)60, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 3, 7, 9, 13, 15, 19, 21, 25, 27, 31, 33, 37, 39, 43, 45, 49}, new Move[] {Move.POUND, Move.GROWL, Move.HELPING_HAND, Move.TICKLE, Move.DOUBLESLAP, Move.ENCORE, Move.SWIFT, Move.SING, Move.TAIL_SLAP, Move.CHARM, Move.WAKE_UP_SLAP, Move.ECHOED_VOICE, Move.SLAM, Move.CAPTIVATE, Move.HYPER_VOICE, Move.LAST_RESORT, Move.AFTER_YOU}), Type.NORMAL),
        CINCCINO("Cinccino", "573", (short)60, new short[] {75, 95, 60, 65, 60, 115}, (byte)165, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0}, new Move[] {Move.BULLET_SEED, Move.ROCK_BLAST, Move.HELPING_HAND, Move.TICKLE, Move.SING, Move.TAIL_SLAP}), Type.NORMAL),
        GOTHITA("Gothita", "574", (short)200, new short[] {45, 30, 50, 55, 65, 45}, (byte)58, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 3, 7, 10, 14, 16, 19, 24, 25, 28, 31, 33, 37, 40, 46, 48}, new Move[] {Move.POUND, Move.CONFUSION, Move.TICKLE, Move.FAKE_TEARS, Move.DOUBLESLAP, Move.PSYBEAM, Move.EMBARGO, Move.FAINT_ATTACK, Move.PSYSHOCK, Move.FLATTER, Move.FUTURE_SIGHT, Move.HEAL_BLOCK, Move.PSYCHIC, Move.TELEKINESIS, Move.CHARM, Move.MAGIC_ROOM}), Type.PSYCHIC),
        GOTHORITA("Gothorita", "575", (short)100, new short[] {60, 45, 70, 75, 85, 55}, (byte)137, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 3, 7, 10, 14, 16, 19, 24, 25, 28, 31, 34, 39, 43, 50, 53}, new Move[] {Move.POUND, Move.CONFUSION, Move.TICKLE, Move.FAKE_TEARS, Move.CONFUSION, Move.TICKLE, Move.FAKE_TEARS, Move.DOUBLESLAP, Move.PSYBEAM, Move.EMBARGO, Move.FAINT_ATTACK, Move.PSYSHOCK, Move.FLATTER, Move.FUTURE_SIGHT, Move.HEAL_BLOCK, Move.PSYCHIC, Move.TELEKINESIS, Move.CHARM, Move.MAGIC_ROOM}), Type.PSYCHIC),
        GOTHITELLE("Gothitelle", "576", (short)50, new short[] {70, 55, 95, 95, 110, 65}, (byte)221, new byte[] {0, 0, 0, 0, 3, 0}, GenderRatio.THREE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 3, 7, 10, 14, 16, 19, 24, 25, 28, 31, 34, 39, 45, 54, 59}, new Move[] {Move.POUND, Move.CONFUSION, Move.TICKLE, Move.FAKE_TEARS, Move.CONFUSION, Move.TICKLE, Move.FAKE_TEARS, Move.DOUBLESLAP, Move.PSYBEAM, Move.EMBARGO, Move.FAINT_ATTACK, Move.PSYSHOCK, Move.FLATTER, Move.FUTURE_SIGHT, Move.HEAL_BLOCK, Move.PSYCHIC, Move.TELEKINESIS, Move.CHARM, Move.MAGIC_ROOM}), Type.PSYCHIC),
        SOLOSIS("Solosis", "577", (short)200, new short[] {45, 30, 40, 105, 50, 20}, (byte)58, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 3, 7, 10, 14, 16, 19, 24, 25, 28, 31, 33, 37, 40, 46, 48}, new Move[] {Move.PSYWAVE, Move.REFLECT, Move.ROLLOUT, Move.SNATCH, Move.HIDDEN_POWER, Move.LIGHT_SCREEN, Move.CHARM, Move.RECOVER, Move.PSYSHOCK, Move.ENDEAVOR, Move.FUTURE_SIGHT, Move.PAIN_SPLIT, Move.PSYCHIC, Move.SKILL_SWAP, Move.HEAL_BLOCK, Move.WONDER_ROOM}), Type.PSYCHIC),
        DUOSION("Duosion", "578", (short)100, new short[] {65, 40, 50, 125, 60, 30}, (byte)130, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 3, 7, 10, 14, 16, 19, 24, 25, 28, 31, 34, 39, 43, 50, 53}, new Move[] {Move.PSYWAVE, Move.REFLECT, Move.ROLLOUT, Move.SNATCH, Move.REFLECT, Move.ROLLOUT, Move.SNATCH, Move.HIDDEN_POWER, Move.LIGHT_SCREEN, Move.CHARM, Move.RECOVER, Move.PSYSHOCK, Move.ENDEAVOR, Move.FUTURE_SIGHT, Move.PAIN_SPLIT, Move.PSYCHIC, Move.SKILL_SWAP, Move.HEAL_BLOCK, Move.WONDER_ROOM}), Type.PSYCHIC),
        REUNICLUS("Reuniclus", "579", (short)50, new short[] {110, 65, 75, 125, 85, 30}, (byte)221, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 3, 7, 10, 14, 16, 19, 24, 25, 28, 31, 34, 39, 41, 45, 54, 59}, new Move[] {Move.PSYWAVE, Move.REFLECT, Move.ROLLOUT, Move.SNATCH, Move.REFLECT, Move.ROLLOUT, Move.SNATCH, Move.HIDDEN_POWER, Move.LIGHT_SCREEN, Move.CHARM, Move.RECOVER, Move.PSYSHOCK, Move.ENDEAVOR, Move.FUTURE_SIGHT, Move.PAIN_SPLIT, Move.PSYCHIC, Move.DIZZY_PUNCH, Move.SKILL_SWAP, Move.HEAL_BLOCK, Move.WONDER_ROOM}), Type.PSYCHIC),
        DUCKLETT("Ducklett", "580", (short)190, new short[] {62, 44, 50, 44, 50, 55}, (byte)61, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 3, 6, 9, 13, 15, 19, 21, 24, 27, 30, 34, 37, 41, 46}, new Move[] {Move.WATER_GUN, Move.WATER_SPORT, Move.DEFOG, Move.WING_ATTACK, Move.WATER_PULSE, Move.AERIAL_ACE, Move.BUBBLEBEAM, Move.FEATHERDANCE, Move.AQUA_RING, Move.AIR_SLASH, Move.ROOST, Move.RAIN_DANCE, Move.TAILWIND, Move.BRAVE_BIRD, Move.HURRICANE}), Type.WATER, Type.FLYING),
        SWANNA("Swanna", "581", (short)45, new short[] {75, 87, 63, 87, 63, 98}, (byte)166, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 3, 6, 9, 13, 15, 19, 21, 24, 27, 30, 34, 40, 47, 55}, new Move[] {Move.WATER_GUN, Move.WATER_SPORT, Move.DEFOG, Move.WING_ATTACK, Move.WATER_SPORT, Move.DEFOG, Move.WING_ATTACK, Move.WATER_PULSE, Move.AERIAL_ACE, Move.BUBBLEBEAM, Move.FEATHERDANCE, Move.AQUA_RING, Move.AIR_SLASH, Move.ROOST, Move.RAIN_DANCE, Move.TAILWIND, Move.BRAVE_BIRD, Move.HURRICANE}), Type.WATER, Type.FLYING),
        VANILLITE("Vanillite", "582", (short)255, new short[] {36, 50, 50, 65, 60, 44}, (byte)61, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 4, 7, 10, 13, 16, 19, 22, 26, 31, 35, 40, 44, 49, 53}, new Move[] {Move.ICICLE_SPEAR, Move.HARDEN, Move.ASTONISH, Move.UPROAR, Move.ICY_WIND, Move.MIST, Move.AVALANCHE, Move.TAUNT, Move.MIRROR_SHOT, Move.ACID_ARMOR, Move.ICE_BEAM, Move.HAIL, Move.MIRROR_COAT, Move.BLIZZARD, Move.SHEER_COLD}), Type.ICE),
        VANILLISH("Vanillish", "583", (short)120, new short[] {51, 65, 65, 80, 75, 59}, (byte)138, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 10, 13, 16, 19, 22, 26, 31, 36, 42, 47, 53, 58}, new Move[] {Move.ICICLE_SPEAR, Move.HARDEN, Move.ASTONISH, Move.UPROAR, Move.HARDEN, Move.ASTONISH, Move.UPROAR, Move.ICY_WIND, Move.MIST, Move.AVALANCHE, Move.TAUNT, Move.MIRROR_SHOT, Move.ACID_ARMOR, Move.ICE_BEAM, Move.HAIL, Move.MIRROR_COAT, Move.BLIZZARD, Move.SHEER_COLD}), Type.ICE),
        VANILLUXE("Vanilluxe", "584", (short)45, new short[] {71, 95, 85, 110, 95, 79}, (byte)241, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 4, 7, 10, 13, 16, 19, 22, 26, 31, 36, 42, 50, 59, 67}, new Move[] {Move.WEATHER_BALL, Move.ICICLE_SPEAR, Move.HARDEN, Move.ASTONISH, Move.UPROAR, Move.HARDEN, Move.ASTONISH, Move.UPROAR, Move.ICY_WIND, Move.MIST, Move.AVALANCHE, Move.TAUNT, Move.MIRROR_SHOT, Move.ACID_ARMOR, Move.ICE_BEAM, Move.HAIL, Move.MIRROR_COAT, Move.BLIZZARD, Move.SHEER_COLD}), Type.ICE),
        DEERLING("Deerling", "585", (short)190, new short[] {60, 60, 50, 40, 50, 75}, (byte)67, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 4, 7, 10, 13, 16, 20, 24, 28, 32, 36, 41, 46, 51}, new Move[] {Move.TACKLE, Move.CAMOUFLAGE, Move.GROWL, Move.SAND_ATTACK, Move.DOUBLE_KICK, Move.LEECH_SEED, Move.FAINT_ATTACK, Move.TAKE_DOWN, Move.JUMP_KICK, Move.AROMATHERAPY, Move.ENERGY_BALL, Move.CHARM, Move.NATURE_POWER, Move.DOUBLE_EDGE, Move.SOLARBEAM}), Type.NORMAL, Type.GRASS),
        SAWSBUCK("Sawsbuck", "586", (short)75, new short[] {80, 100, 70, 60, 70, 95}, (byte)166, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 4, 7, 10, 13, 16, 20, 24, 28, 32, 36, 37, 44, 52, 60}, new Move[] {Move.MEGAHORN, Move.TACKLE, Move.CAMOUFLAGE, Move.GROWL, Move.SAND_ATTACK, Move.GROWL, Move.SAND_ATTACK, Move.DOUBLE_KICK, Move.LEECH_SEED, Move.FAINT_ATTACK, Move.TAKE_DOWN, Move.JUMP_KICK, Move.AROMATHERAPY, Move.ENERGY_BALL, Move.CHARM, Move.HORN_LEECH, Move.NATURE_POWER, Move.DOUBLE_EDGE, Move.SOLARBEAM}), Type.NORMAL, Type.GRASS),
        EMOLGA("Emolga", "587", (short)200, new short[] {55, 75, 60, 75, 60, 103}, (byte)150, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 7, 10, 13, 16, 19, 22, 26, 30, 34, 38, 42, 46, 50}, new Move[] {Move.THUNDERSHOCK, Move.QUICK_ATTACK, Move.TAIL_WHIP, Move.CHARGE, Move.SPARK, Move.PURSUIT, Move.DOUBLE_TEAM, Move.SHOCK_WAVE, Move.ELECTRO_BALL, Move.ACROBATICS, Move.LIGHT_SCREEN, Move.ENCORE, Move.VOLT_SWITCH, Move.AGILITY, Move.DISCHARGE}), Type.ELECTRIC, Type.FLYING),
        KARRABLAST("Karrablast", "588", (short)200, new short[] {50, 75, 45, 40, 45, 60}, (byte)63, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 8, 13, 16, 20, 25, 28, 32, 37, 40, 44, 49, 52, 56}, new Move[] {Move.PECK, Move.LEER, Move.ENDURE, Move.FURY_CUTTER, Move.FURY_ATTACK, Move.HEADBUTT, Move.FALSE_SWIPE, Move.BUG_BUZZ, Move.SLASH, Move.TAKE_DOWN, Move.SCARY_FACE, Move.X_SCISSOR, Move.FLAIL, Move.SWORDS_DANCE, Move.DOUBLE_EDGE}), Type.BUG),
        ESCAVALIER("Escavalier", "589", (short)75, new short[] {70, 135, 105, 60, 105, 20}, (byte)173, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 4, 8, 13, 16, 20, 25, 28, 32, 37, 40, 44, 49, 52, 56}, new Move[] {Move.PECK, Move.LEER, Move.QUICK_GUARD, Move.TWINEEDLE, Move.LEER, Move.QUICK_GUARD, Move.TWINEEDLE, Move.FURY_ATTACK, Move.HEADBUTT, Move.FALSE_SWIPE, Move.BUG_BUZZ, Move.SLASH, Move.IRON_HEAD, Move.IRON_DEFENSE, Move.X_SCISSOR, Move.REVERSAL, Move.SWORDS_DANCE, Move.GIGA_IMPACT}), Type.BUG, Type.STEEL),
        FOONGUS("Foongus", "590", (short)190, new short[] {69, 55, 45, 55, 55, 15}, (byte)59, new byte[] {1, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 6, 8, 12, 15, 18, 20, 24, 28, 32, 35, 39, 43, 45, 50}, new Move[] {Move.ABSORB, Move.GROWTH, Move.ASTONISH, Move.BIDE, Move.MEGA_DRAIN, Move.INGRAIN, Move.FAINT_ATTACK, Move.SWEET_SCENT, Move.GIGA_DRAIN, Move.TOXIC, Move.SYNTHESIS, Move.CLEAR_SMOG, Move.SOLARBEAM, Move.RAGE_POWDER, Move.SPORE}), Type.GRASS, Type.POISON),
        AMOONGUSS("Amoonguss", "591", (short)75, new short[] {114, 85, 70, 85, 80, 30}, (byte)162, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 6, 8, 12, 15, 18, 20, 24, 28, 32, 35, 43, 49, 54, 62}, new Move[] {Move.ABSORB, Move.GROWTH, Move.ASTONISH, Move.BIDE, Move.GROWTH, Move.ASTONISH, Move.BIDE, Move.MEGA_DRAIN, Move.INGRAIN, Move.FAINT_ATTACK, Move.SWEET_SCENT, Move.GIGA_DRAIN, Move.TOXIC, Move.SYNTHESIS, Move.CLEAR_SMOG, Move.SOLARBEAM, Move.RAGE_POWDER, Move.SPORE}), Type.GRASS, Type.POISON),
        FRILLISH("Frillish", "592", (short)190, new short[] {55, 40, 50, 65, 85, 40}, (byte)67, new byte[] {0, 0, 0, 0, 1, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 22, 27, 32, 37, 43, 49, 55, 61}, new Move[] {Move.BUBBLE, Move.WATER_SPORT, Move.ABSORB, Move.NIGHT_SHADE, Move.BUBBLEBEAM, Move.RECOVER, Move.WATER_PULSE, Move.OMINOUS_WIND, Move.BRINE, Move.RAIN_DANCE, Move.HEX, Move.HYDRO_PUMP, Move.WRING_OUT, Move.WATER_SPOUT}), Type.WATER, Type.GHOST),
        JELLICENT("Jellicent", "593", (short)60, new short[] {100, 60, 70, 85, 105, 60}, (byte)168, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 5, 9, 13, 17, 22, 27, 32, 37, 45, 53, 61, 69}, new Move[] {Move.BUBBLE, Move.WATER_SPORT, Move.ABSORB, Move.NIGHT_SHADE, Move.ABSORB, Move.NIGHT_SHADE, Move.BUBBLEBEAM, Move.RECOVER, Move.WATER_PULSE, Move.OMINOUS_WIND, Move.BRINE, Move.RAIN_DANCE, Move.HEX, Move.HYDRO_PUMP, Move.WRING_OUT, Move.WATER_SPOUT}), Type.WATER, Type.GHOST),
        ALOMOMOLA("Alomomola", "594", (short)75, new short[] {165, 75, 80, 40, 45, 65}, (byte)165, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.FAST,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57, 61}, new Move[] {Move.POUND, Move.WATER_SPORT, Move.AQUA_RING, Move.AQUA_JET, Move.DOUBLESLAP, Move.HEAL_PULSE, Move.PROTECT, Move.WATER_PULSE, Move.WAKE_UP_SLAP, Move.SOAK, Move.WISH, Move.BRINE, Move.SAFEGUARD, Move.HELPING_HAND, Move.WIDE_GUARD, Move.HEALING_WISH, Move.HYDRO_PUMP}), Type.WATER),
        JOLTIK("Joltik", "595", (short)190, new short[] {50, 47, 50, 57, 50, 65}, (byte)64, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 4, 7, 12, 15, 18, 23, 26, 29, 34, 37, 40, 45, 48}, new Move[] {Move.STRING_SHOT, Move.LEECH_LIFE, Move.SPIDER_WEB, Move.THUNDER_WAVE, Move.SCREECH, Move.FURY_CUTTER, Move.ELECTROWEB, Move.BUG_BITE, Move.GASTRO_ACID, Move.SLASH, Move.ELECTRO_BALL, Move.SIGNAL_BEAM, Move.AGILITY, Move.SUCKER_PUNCH, Move.DISCHARGE, Move.BUG_BUZZ}), Type.BUG, Type.ELECTRIC),
        GALVANTULA("Galvantula", "596", (short)75, new short[] {70, 77, 60, 97, 60, 108}, (byte)165, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 12, 15, 18, 23, 26, 29, 34, 40, 46, 54, 60}, new Move[] {Move.STRING_SHOT, Move.LEECH_LIFE, Move.SPIDER_WEB, Move.THUNDER_WAVE, Move.THUNDER_WAVE, Move.SCREECH, Move.FURY_CUTTER, Move.ELECTROWEB, Move.BUG_BITE, Move.GASTRO_ACID, Move.SLASH, Move.ELECTRO_BALL, Move.SIGNAL_BEAM, Move.AGILITY, Move.SUCKER_PUNCH, Move.DISCHARGE, Move.BUG_BUZZ}), Type.BUG, Type.ELECTRIC),
        FERROSEED("Ferroseed", "597", (short)255, new short[] {44, 50, 91, 24, 86, 10}, (byte)61, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 6, 9, 14, 18, 21, 26, 30, 35, 38, 43, 47, 52, 55}, new Move[] {Move.TACKLE, Move.HARDEN, Move.ROLLOUT, Move.CURSE, Move.METAL_CLAW, Move.PIN_MISSILE, Move.GYRO_BALL, Move.IRON_DEFENSE, Move.MIRROR_SHOT, Move.INGRAIN, Move.SELFDESTRUCT, Move.IRON_HEAD, Move.PAYBACK, Move.FLASH_CANNON, Move.EXPLOSION}), Type.GRASS, Type.STEEL),
        FERROTHORN("Ferrothorn", "598", (short)90, new short[] {74, 94, 131, 54, 116, 20}, (byte)171, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 6, 9, 14, 18, 21, 26, 30, 35, 38, 40, 46, 53, 61, 67}, new Move[] {Move.ROCK_CLIMB, Move.TACKLE, Move.HARDEN, Move.ROLLOUT, Move.CURSE, Move.ROLLOUT, Move.CURSE, Move.METAL_CLAW, Move.PIN_MISSILE, Move.GYRO_BALL, Move.IRON_DEFENSE, Move.MIRROR_SHOT, Move.INGRAIN, Move.SELFDESTRUCT, Move.POWER_WHIP, Move.IRON_HEAD, Move.PAYBACK, Move.FLASH_CANNON, Move.EXPLOSION}), Type.GRASS, Type.STEEL),
        KLINK("Klink", "599", (short)130, new short[] {40, 55, 70, 45, 60, 30}, (byte)60, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 6, 11, 16, 21, 26, 31, 36, 39, 42, 45, 48, 51, 54, 57}, new Move[] {Move.VICEGRIP, Move.CHARGE, Move.THUNDERSHOCK, Move.GEAR_GRIND, Move.BIND, Move.CHARGE_BEAM, Move.AUTOTOMIZE, Move.MIRROR_SHOT, Move.SCREECH, Move.DISCHARGE, Move.METAL_SOUND, Move.SHIFT_GEAR, Move.LOCK_ON, Move.ZAP_CANNON, Move.HYPER_BEAM}), Type.STEEL),
        KLANG("Klang", "600", (short)60, new short[] {60, 80, 95, 70, 85, 50}, (byte)154, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 6, 11, 16, 21, 26, 31, 36, 40, 44, 48, 52, 56, 60, 64}, new Move[] {Move.VICEGRIP, Move.CHARGE, Move.THUNDERSHOCK, Move.GEAR_GRIND, Move.CHARGE, Move.THUNDERSHOCK, Move.GEAR_GRIND, Move.BIND, Move.CHARGE_BEAM, Move.AUTOTOMIZE, Move.MIRROR_SHOT, Move.SCREECH, Move.DISCHARGE, Move.METAL_SOUND, Move.SHIFT_GEAR, Move.LOCK_ON, Move.ZAP_CANNON, Move.HYPER_BEAM}), Type.STEEL),
        KLINKLANG("Klinklang", "601", (short)30, new short[] {60, 100, 115, 70, 85, 90}, (byte)234, new byte[] {0, 0, 3, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 6, 11, 16, 21, 25, 31, 36, 40, 44, 48, 54, 60, 66, 72}, new Move[] {Move.VICEGRIP, Move.CHARGE, Move.THUNDERSHOCK, Move.GEAR_GRIND, Move.CHARGE, Move.THUNDERSHOCK, Move.GEAR_GRIND, Move.BIND, Move.CHARGE_BEAM, Move.AUTOTOMIZE, Move.MIRROR_SHOT, Move.SCREECH, Move.DISCHARGE, Move.METAL_SOUND, Move.SHIFT_GEAR, Move.LOCK_ON, Move.ZAP_CANNON, Move.HYPER_BEAM}), Type.STEEL),
        TYNAMO("Tynamo", "602", (short)190, new short[] {35, 55, 40, 45, 40, 60}, (byte)55, new byte[] {0, 0, 0, 0, 0, 1}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0}, new Move[] {Move.TACKLE, Move.THUNDER_WAVE, Move.SPARK, Move.CHARGE_BEAM}), Type.ELECTRIC),
        EELEKTRIK("Eelektrik", "603", (short)60, new short[] {65, 85, 70, 75, 70, 40}, (byte)142, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 9, 19, 29, 39, 44, 49, 54, 59, 64, 69, 74}, new Move[] {Move.HEADBUTT, Move.THUNDER_WAVE, Move.SPARK, Move.CHARGE_BEAM, Move.BIND, Move.ACID, Move.DISCHARGE, Move.CRUNCH, Move.THUNDERBOLT, Move.ACID_SPRAY, Move.COIL, Move.WILD_CHARGE, Move.GASTRO_ACID, Move.ZAP_CANNON, Move.THRASH}), Type.ELECTRIC),
        EELEKTROSS("Eelektross", "604", (short)30, new short[] {85, 115, 80, 105, 80, 50}, (byte)232, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0}, new Move[] {Move.CRUSH_CLAW, Move.HEADBUTT, Move.ACID, Move.DISCHARGE, Move.CRUNCH}), Type.ELECTRIC),
        ELGYEM("Elgyem", "605", (short)255, new short[] {55, 55, 55, 85, 55, 30}, (byte)67, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 39, 43, 46, 50, 50, 53, 56}, new Move[] {Move.CONFUSION, Move.GROWL, Move.HEAL_BLOCK, Move.MIRACLE_EYE, Move.PSYBEAM, Move.HEADBUTT, Move.HIDDEN_POWER, Move.IMPRISON, Move.SIMPLE_BEAM, Move.ZEN_HEADBUTT, Move.PSYCH_UP, Move.PSYCHIC, Move.CALM_MIND, Move.RECOVER, Move.GUARD_SPLIT, Move.POWER_SPLIT, Move.SYNCHRONOISE, Move.WONDER_ROOM}), Type.PSYCHIC),
        BEHEEYEM("Beheeyem", "606", (short)90, new short[] {75, 75, 75, 125, 95, 40}, (byte)170, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 4, 8, 11, 15, 18, 22, 25, 29, 32, 36, 39, 45, 50, 56, 58, 63, 68}, new Move[] {Move.CONFUSION, Move.GROWL, Move.HEAL_BLOCK, Move.MIRACLE_EYE, Move.GROWL, Move.HEAL_BLOCK, Move.MIRACLE_EYE, Move.PSYBEAM, Move.HEADBUTT, Move.HIDDEN_POWER, Move.IMPRISON, Move.SIMPLE_BEAM, Move.ZEN_HEADBUTT, Move.PSYCH_UP, Move.PSYCHIC, Move.CALM_MIND, Move.RECOVER, Move.GUARD_SPLIT, Move.POWER_SPLIT, Move.SYNCHRONOISE, Move.WONDER_ROOM}), Type.PSYCHIC),
        LITWICK("Litwick", "607", (short)190, new short[] {50, 30, 55, 65, 55, 20}, (byte)55, new byte[] {0, 0, 0, 1, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 3, 5, 7, 10, 13, 16, 20, 24, 28, 33, 38, 43, 49, 55, 61}, new Move[] {Move.EMBER, Move.ASTONISH, Move.MINIMIZE, Move.SMOG, Move.FIRE_SPIN, Move.CONFUSE_RAY, Move.NIGHT_SHADE, Move.WILL_O_WISP, Move.FLAME_BURST, Move.IMPRISON, Move.HEX, Move.MEMENTO, Move.INFERNO, Move.CURSE, Move.SHADOW_BALL, Move.PAIN_SPLIT, Move.OVERHEAT}), Type.GHOST, Type.FIRE),
        LAMPENT("Lampent", "608", (short)90, new short[] {60, 40, 60, 95, 60, 55}, (byte)130, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 3, 5, 7, 10, 13, 16, 20, 24, 28, 33, 38, 45, 53, 61, 69}, new Move[] {Move.EMBER, Move.ASTONISH, Move.MINIMIZE, Move.SMOG, Move.MINIMIZE, Move.SMOG, Move.FIRE_SPIN, Move.CONFUSE_RAY, Move.NIGHT_SHADE, Move.WILL_O_WISP, Move.FLAME_BURST, Move.IMPRISON, Move.HEX, Move.MEMENTO, Move.INFERNO, Move.CURSE, Move.SHADOW_BALL, Move.PAIN_SPLIT, Move.OVERHEAT}), Type.GHOST, Type.FIRE),
        CHANDELURE("Chandelure", "609", (short)45, new short[] {60, 55, 90, 145, 90, 80}, (byte)234, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0}, new Move[] {Move.SMOG, Move.CONFUSE_RAY, Move.FLAME_BURST, Move.HEX}), Type.GHOST, Type.FIRE),
        AXEW("Axew", "610", (short)75, new short[] {46, 87, 60, 30, 40, 57}, (byte)64, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 4, 7, 10, 13, 16, 20, 24, 28, 32, 36, 41, 46, 51, 56, 61}, new Move[] {Move.SCRATCH, Move.LEER, Move.ASSURANCE, Move.DRAGON_RAGE, Move.DUAL_CHOP, Move.SCARY_FACE, Move.SLASH, Move.FALSE_SWIPE, Move.DRAGON_CLAW, Move.DRAGON_DANCE, Move.TAUNT, Move.DRAGON_PULSE, Move.SWORDS_DANCE, Move.GUILLOTINE, Move.OUTRAGE, Move.GIGA_IMPACT}), Type.DRAGON),
        FRAXURE("Fraxure", "611", (short)60, new short[] {66, 117, 70, 40, 50, 67}, (byte)144, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 10, 13, 16, 20, 24, 28, 32, 36, 42, 48, 54, 60, 66}, new Move[] {Move.SCRATCH, Move.LEER, Move.ASSURANCE, Move.DRAGON_RAGE, Move.LEER, Move.ASSURANCE, Move.DRAGON_RAGE, Move.DUAL_CHOP, Move.SCARY_FACE, Move.SLASH, Move.FALSE_SWIPE, Move.DRAGON_CLAW, Move.DRAGON_DANCE, Move.TAUNT, Move.DRAGON_PULSE, Move.SWORDS_DANCE, Move.GUILLOTINE, Move.OUTRAGE, Move.GIGA_IMPACT}), Type.DRAGON),
        HAXORUS("Haxorus", "612", (short)45, new short[] {76, 147, 90, 60, 70, 97}, (byte)243, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 7, 10, 13, 16, 20, 24, 28, 32, 36, 42, 50, 58, 66, 74}, new Move[] {Move.SCRATCH, Move.LEER, Move.ASSURANCE, Move.DRAGON_RAGE, Move.LEER, Move.ASSURANCE, Move.DRAGON_RAGE, Move.DUAL_CHOP, Move.SCARY_FACE, Move.SLASH, Move.FALSE_SWIPE, Move.DRAGON_CLAW, Move.DRAGON_DANCE, Move.TAUNT, Move.DRAGON_PULSE, Move.SWORDS_DANCE, Move.GUILLOTINE, Move.OUTRAGE, Move.GIGA_IMPACT}), Type.DRAGON),
        CUBCHOO("Cubchoo", "613", (short)120, new short[] {55, 70, 40, 60, 40, 40}, (byte)61, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 5, 9, 13, 17, 21, 25, 29, 33, 36, 41, 45, 49, 53, 57}, new Move[] {Move.POWDER_SNOW, Move.GROWL, Move.BIDE, Move.ICY_WIND, Move.FURY_SWIPES, Move.BRINE, Move.ENDURE, Move.CHARM, Move.SLASH, Move.FLAIL, Move.REST, Move.BLIZZARD, Move.HAIL, Move.THRASH, Move.SHEER_COLD}), Type.ICE),
        BEARTIC("Beartic", "614", (short)60, new short[] {95, 110, 80, 70, 80, 50}, (byte)170, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 36, 37, 41, 45, 53, 59, 66}, new Move[] {Move.SUPERPOWER, Move.AQUA_JET, Move.POWDER_SNOW, Move.GROWL, Move.BIDE, Move.ICY_WIND, Move.GROWL, Move.BIDE, Move.ICY_WIND, Move.FURY_SWIPES, Move.BRINE, Move.ENDURE, Move.SWAGGER, Move.SLASH, Move.FLAIL, Move.ICICLE_CRASH, Move.REST, Move.BLIZZARD, Move.HAIL, Move.THRASH, Move.SHEER_COLD}), Type.ICE),
        CRYOGONAL("Cryogonal", "615", (short)25, new short[] {70, 50, 30, 95, 135, 105}, (byte)170, new byte[] {0, 0, 0, 0, 2, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 5, 9, 13, 17, 21, 21, 25, 29, 33, 37, 37, 41, 45, 49, 53, 57, 61}, new Move[] {Move.BIND, Move.ICE_SHARD, Move.SHARPEN, Move.RAPID_SPIN, Move.ICY_WIND, Move.MIST, Move.HAZE, Move.AURORA_BEAM, Move.ACID_ARMOR, Move.ICE_BEAM, Move.LIGHT_SCREEN, Move.REFLECT, Move.SLASH, Move.CONFUSE_RAY, Move.RECOVER, Move.SOLARBEAM, Move.NIGHT_SLASH, Move.SHEER_COLD}), Type.ICE),
        SHELMET("Shelmet", "616", (short)200, new short[] {50, 40, 85, 40, 65, 25}, (byte)61, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 4, 8, 13, 16, 20, 25, 28, 32, 37, 40, 44, 49, 52, 56}, new Move[] {Move.LEECH_LIFE, Move.ACID, Move.BIDE, Move.CURSE, Move.STRUGGLE_BUG, Move.MEGA_DRAIN, Move.YAWN, Move.PROTECT, Move.ACID_ARMOR, Move.GIGA_DRAIN, Move.BODY_SLAM, Move.BUG_BUZZ, Move.RECOVER, Move.GUARD_SWAP, Move.FINAL_GAMBIT}), Type.BUG),
        ACCELGOR("Accelgor", "617", (short)75, new short[] {80, 70, 40, 100, 60, 145}, (byte)173, new byte[] {0, 0, 0, 0, 0, 2}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 4, 8, 13, 16, 20, 25, 28, 32, 37, 40, 44, 49, 52, 56}, new Move[] {Move.LEECH_LIFE, Move.ACID_SPRAY, Move.DOUBLE_TEAM, Move.QUICK_ATTACK, Move.ACID_SPRAY, Move.DOUBLE_TEAM, Move.QUICK_ATTACK, Move.STRUGGLE_BUG, Move.MEGA_DRAIN, Move.SWIFT, Move.ME_FIRST, Move.AGILITY, Move.GIGA_DRAIN, Move.U_TURN, Move.BUG_BUZZ, Move.RECOVER, Move.POWER_SWAP, Move.FINAL_GAMBIT}), Type.BUG),
        STUNFISK("Stunfisk", "618", (short)75, new short[] {109, 66, 84, 81, 99, 32}, (byte)165, new byte[] {2, 0, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 9, 13, 17, 21, 25, 30, 35, 40, 45, 50, 55, 61}, new Move[] {Move.MUD_SLAP, Move.MUD_SPORT, Move.BIDE, Move.THUNDERSHOCK, Move.MUD_SHOT, Move.CAMOUFLAGE, Move.MUD_BOMB, Move.DISCHARGE, Move.ENDURE, Move.BOUNCE, Move.MUDDY_WATER, Move.THUNDERBOLT, Move.REVENGE, Move.FLAIL, Move.FISSURE}), Type.GROUND, Type.ELECTRIC),
        MIENFOO("Mienfoo", "619", (short)180, new short[] {45, 85, 50, 55, 50, 65}, (byte)70, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53, 57, 61}, new Move[] {Move.POUND, Move.MEDITATE, Move.DETECT, Move.FAKE_OUT, Move.DOUBLESLAP, Move.SWIFT, Move.CALM_MIND, Move.FORCE_PALM, Move.DRAIN_PUNCH, Move.JUMP_KICK, Move.U_TURN, Move.QUICK_GUARD, Move.BOUNCE, Move.HI_JUMP_KICK, Move.REVERSAL, Move.AURA_SPHERE}), Type.FIGHTING),
        MIENSHAO("Mienshao", "620", (short)45, new short[] {65, 125, 60, 95, 60, 105}, (byte)179, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_SLOW,convertToMap(new int[] {0, 0, 0, 0, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 56, 63, 70}, new Move[] {Move.POUND, Move.MEDITATE, Move.DETECT, Move.FAKE_OUT, Move.MEDITATE, Move.DETECT, Move.FAKE_OUT, Move.DOUBLESLAP, Move.SWIFT, Move.CALM_MIND, Move.FORCE_PALM, Move.DRAIN_PUNCH, Move.JUMP_KICK, Move.U_TURN, Move.WIDE_GUARD, Move.BOUNCE, Move.HI_JUMP_KICK, Move.REVERSAL, Move.AURA_SPHERE}), Type.FIGHTING),
        DRUDDIGON("Druddigon", "621", (short)45, new short[] {77, 120, 90, 60, 90, 48}, (byte)170, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 5, 9, 13, 18, 21, 25, 27, 31, 35, 40, 45, 49, 55, 62}, new Move[] {Move.LEER, Move.SCRATCH, Move.HONE_CLAWS, Move.BITE, Move.SCARY_FACE, Move.DRAGON_RAGE, Move.SLASH, Move.CRUNCH, Move.DRAGON_CLAW, Move.CHIP_AWAY, Move.REVENGE, Move.NIGHT_SLASH, Move.DRAGON_TAIL, Move.ROCK_CLIMB, Move.SUPERPOWER, Move.OUTRAGE}), Type.DRAGON),
        GOLETT("Golett", "622", (short)190, new short[] {59, 74, 50, 35, 50, 35}, (byte)61, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 5, 9, 13, 17, 21, 25, 30, 35, 40, 45, 50, 55}, new Move[] {Move.POUND, Move.ASTONISH, Move.DEFENSE_CURL, Move.MUD_SLAP, Move.ROLLOUT, Move.SHADOW_PUNCH, Move.IRON_DEFENSE, Move.MEGA_PUNCH, Move.MAGNITUDE, Move.DYNAMICPUNCH, Move.NIGHT_SHADE, Move.CURSE, Move.EARTHQUAKE, Move.HAMMER_ARM, Move.FOCUS_PUNCH}), Type.GROUND, Type.GHOST),
        GOLURK("Golurk", "623", (short)90, new short[] {89, 124, 80, 55, 80, 55}, (byte)169, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 5, 9, 13, 17, 21, 25, 30, 35, 40, 43, 50, 60, 70}, new Move[] {Move.POUND, Move.ASTONISH, Move.DEFENSE_CURL, Move.MUD_SLAP, Move.MUD_SLAP, Move.ROLLOUT, Move.SHADOW_PUNCH, Move.IRON_DEFENSE, Move.MEGA_PUNCH, Move.MAGNITUDE, Move.DYNAMICPUNCH, Move.NIGHT_SHADE, Move.CURSE, Move.HEAVY_SLAM, Move.EARTHQUAKE, Move.HAMMER_ARM, Move.FOCUS_PUNCH}), Type.GROUND, Type.GHOST),
        PAWNIARD("Pawniard", "624", (short)120, new short[] {45, 85, 70, 40, 40, 60}, (byte)68, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 6, 9, 14, 17, 22, 25, 30, 33, 38, 41, 46, 49, 54, 57, 62}, new Move[] {Move.SCRATCH, Move.LEER, Move.FURY_CUTTER, Move.TORMENT, Move.FAINT_ATTACK, Move.SCARY_FACE, Move.METAL_CLAW, Move.SLASH, Move.ASSURANCE, Move.METAL_SOUND, Move.EMBARGO, Move.IRON_DEFENSE, Move.NIGHT_SLASH, Move.IRON_HEAD, Move.SWORDS_DANCE, Move.GUILLOTINE}), Type.DARK, Type.STEEL),
        BISHARP("Bisharp", "625", (short)45, new short[] {65, 125, 100, 60, 70, 70}, (byte)172, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 0, 0, 0, 6, 9, 14, 17, 22, 25, 30, 33, 38, 41, 46, 49, 57, 63, 71}, new Move[] {Move.METAL_BURST, Move.SCRATCH, Move.LEER, Move.FURY_CUTTER, Move.TORMENT, Move.LEER, Move.FURY_CUTTER, Move.TORMENT, Move.FAINT_ATTACK, Move.SCARY_FACE, Move.METAL_CLAW, Move.SLASH, Move.ASSURANCE, Move.METAL_SOUND, Move.EMBARGO, Move.IRON_DEFENSE, Move.NIGHT_SLASH, Move.IRON_HEAD, Move.SWORDS_DANCE, Move.GUILLOTINE}), Type.DARK, Type.STEEL),
        BOUFFALANT("Bouffalant", "626", (short)45, new short[] {95, 110, 95, 40, 95, 55}, (byte)172, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 6, 11, 16, 21, 26, 31, 36, 41, 46, 51, 56, 61}, new Move[] {Move.PURSUIT, Move.LEER, Move.RAGE, Move.FURY_ATTACK, Move.HORN_ATTACK, Move.SCARY_FACE, Move.REVENGE, Move.HEAD_CHARGE, Move.FOCUS_ENERGY, Move.MEGAHORN, Move.REVERSAL, Move.THRASH, Move.SWORDS_DANCE, Move.GIGA_IMPACT}), Type.NORMAL),
        RUFFLET("Rufflet", "627", (short)190, new short[] {70, 83, 50, 37, 50, 60}, (byte)70, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 5, 10, 14, 19, 23, 28, 32, 37, 41, 46, 50, 55, 59, 64}, new Move[] {Move.PECK, Move.LEER, Move.FURY_ATTACK, Move.WING_ATTACK, Move.HONE_CLAWS, Move.SCARY_FACE, Move.AERIAL_ACE, Move.SLASH, Move.DEFOG, Move.TAILWIND, Move.AIR_SLASH, Move.CRUSH_CLAW, Move.SKY_DROP, Move.WHIRLWIND, Move.BRAVE_BIRD, Move.THRASH}), Type.NORMAL, Type.FLYING),
        BRAVIARY("Braviary", "628", (short)60, new short[] {100, 123, 75, 57, 75, 80}, (byte)179, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 5, 10, 14, 19, 23, 28, 32, 37, 41, 46, 50, 51, 57, 63, 70}, new Move[] {Move.PECK, Move.LEER, Move.FURY_ATTACK, Move.WING_ATTACK, Move.FURY_ATTACK, Move.WING_ATTACK, Move.HONE_CLAWS, Move.SCARY_FACE, Move.AERIAL_ACE, Move.SLASH, Move.DEFOG, Move.TAILWIND, Move.AIR_SLASH, Move.CRUSH_CLAW, Move.SKY_DROP, Move.SUPERPOWER, Move.WHIRLWIND, Move.BRAVE_BIRD, Move.THRASH}), Type.NORMAL, Type.FLYING),
        VULLABY("Vullaby", "629", (short)190, new short[] {70, 55, 75, 45, 65, 60}, (byte)74, new byte[] {0, 0, 1, 0, 0, 0}, GenderRatio.FEMALE_ONLY, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 5, 10, 14, 19, 23, 28, 32, 37, 41, 46, 50, 55, 59, 64}, new Move[] {Move.GUST, Move.LEER, Move.FURY_ATTACK, Move.PLUCK, Move.NASTY_PLOT, Move.FLATTER, Move.FAINT_ATTACK, Move.PUNISHMENT, Move.DEFOG, Move.TAILWIND, Move.AIR_SLASH, Move.DARK_PULSE, Move.EMBARGO, Move.WHIRLWIND, Move.BRAVE_BIRD, Move.MIRROR_MOVE}), Type.DARK, Type.FLYING),
        MANDIBUZZ("Mandibuzz", "630", (short)60, new short[] {110, 65, 105, 55, 95, 80}, (byte)179, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.FEMALE_ONLY, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 5, 10, 14, 19, 23, 28, 32, 37, 41, 46, 50, 51, 57, 63, 70}, new Move[] {Move.GUST, Move.LEER, Move.FURY_ATTACK, Move.PLUCK, Move.FURY_ATTACK, Move.PLUCK, Move.NASTY_PLOT, Move.FLATTER, Move.FAINT_ATTACK, Move.PUNISHMENT, Move.DEFOG, Move.TAILWIND, Move.AIR_SLASH, Move.DARK_PULSE, Move.EMBARGO, Move.BONE_RUSH, Move.WHIRLWIND, Move.BRAVE_BIRD, Move.MIRROR_MOVE}), Type.DARK, Type.FLYING),
        HEATMOR("Heatmor", "631", (short)90, new short[] {85, 97, 66, 105, 66, 65}, (byte)169, new byte[] {0, 0, 0, 2, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 6, 11, 16, 21, 26, 31, 36, 41, 46, 51, 56, 56, 56, 61}, new Move[] {Move.INCINERATE, Move.LICK, Move.ODOR_SLEUTH, Move.BIND, Move.FIRE_SPIN, Move.FURY_SWIPES, Move.SNATCH, Move.FLAME_BURST, Move.BUG_BITE, Move.SLASH, Move.AMNESIA, Move.FLAMETHROWER, Move.STOCKPILE, Move.SPIT_UP, Move.SWALLOW, Move.INFERNO}), Type.FIRE),
        DURANT("Durant", "632", (short)90, new short[] {58, 109, 112, 48, 48, 109}, (byte)169, new byte[] {0, 0, 2, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.MEDIUM_FAST,convertToMap(new int[] {0, 0, 6, 11, 16, 21, 26, 31, 36, 41, 46, 51, 56, 61, 66}, new Move[] {Move.VICEGRIP, Move.SAND_ATTACK, Move.FURY_CUTTER, Move.BITE, Move.AGILITY, Move.METAL_CLAW, Move.BUG_BITE, Move.CRUNCH, Move.IRON_HEAD, Move.DIG, Move.ENTRAINMENT, Move.X_SCISSOR, Move.IRON_DEFENSE, Move.GUILLOTINE, Move.METAL_SOUND}), Type.BUG, Type.STEEL),
        DEINO("Deino", "633", (short)45, new short[] {52, 65, 50, 45, 50, 38}, (byte)60, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 4, 9, 12, 17, 20, 25, 28, 32, 38, 42, 48, 52, 58, 62}, new Move[] {Move.TACKLE, Move.DRAGON_RAGE, Move.FOCUS_ENERGY, Move.BITE, Move.HEADBUTT, Move.DRAGONBREATH, Move.ROAR, Move.CRUNCH, Move.SLAM, Move.DRAGON_PULSE, Move.WORK_UP, Move.DRAGON_RUSH, Move.BODY_SLAM, Move.SCARY_FACE, Move.HYPER_VOICE, Move.OUTRAGE}), Type.DARK, Type.DRAGON),
        ZWEILOUS("Zweilous", "634", (short)45, new short[] {72, 85, 70, 65, 70, 58}, (byte)147, new byte[] {0, 2, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 9, 12, 17, 20, 25, 28, 32, 38, 42, 48, 55, 64, 71}, new Move[] {Move.DOUBLE_HIT, Move.DRAGON_RAGE, Move.FOCUS_ENERGY, Move.BITE, Move.FOCUS_ENERGY, Move.BITE, Move.HEADBUTT, Move.DRAGONBREATH, Move.ROAR, Move.CRUNCH, Move.SLAM, Move.DRAGON_PULSE, Move.WORK_UP, Move.DRAGON_RUSH, Move.BODY_SLAM, Move.SCARY_FACE, Move.HYPER_VOICE, Move.OUTRAGE}), Type.DARK, Type.DRAGON),
        HYDREIGON("Hydreigon", "635", (short)45, new short[] {92, 105, 90, 125, 90, 98}, (byte)270, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 4, 9, 12, 17, 20, 25, 28, 32, 38, 42, 48, 55, 68, 79}, new Move[] {Move.TRI_ATTACK, Move.DRAGON_RAGE, Move.FOCUS_ENERGY, Move.BITE, Move.FOCUS_ENERGY, Move.BITE, Move.HEADBUTT, Move.DRAGONBREATH, Move.ROAR, Move.CRUNCH, Move.SLAM, Move.DRAGON_PULSE, Move.WORK_UP, Move.DRAGON_RUSH, Move.BODY_SLAM, Move.SCARY_FACE, Move.HYPER_VOICE, Move.OUTRAGE}), Type.DARK, Type.DRAGON),
        LARVESTA("Larvesta", "636", (short)45, new short[] {55, 85, 55, 50, 55, 60}, (byte)72, new byte[] {0, 1, 0, 0, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100}, new Move[] {Move.EMBER, Move.STRING_SHOT, Move.LEECH_LIFE, Move.TAKE_DOWN, Move.FLAME_CHARGE, Move.BUG_BITE, Move.DOUBLE_EDGE, Move.FLAME_WHEEL, Move.BUG_BUZZ, Move.AMNESIA, Move.THRASH, Move.FLARE_BLITZ}), Type.BUG, Type.FIRE),
        VOLCARONA("Volcarona", "637", (short)15, new short[] {85, 60, 65, 135, 105, 100}, (byte)248, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.ONE_FEMALE_ONE_MALE, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 10, 20, 30, 40, 50, 59, 60, 70, 80, 90, 100}, new Move[] {Move.EMBER, Move.STRING_SHOT, Move.LEECH_LIFE, Move.GUST, Move.LEECH_LIFE, Move.GUST, Move.FIRE_SPIN, Move.WHIRLWIND, Move.SILVER_WIND, Move.QUIVER_DANCE, Move.HEAT_WAVE, Move.BUG_BUZZ, Move.RAGE_POWDER, Move.HURRICANE, Move.FIERY_DANCE}), Type.BUG, Type.FIRE),
        COBALION("Cobalion", "638", (short)3, new short[] {91, 90, 129, 90, 72, 108}, (byte)261, new byte[] {0, 0, 3, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 7, 13, 19, 25, 31, 37, 42, 49, 55, 61, 67, 73}, new Move[] {Move.QUICK_ATTACK, Move.LEER, Move.DOUBLE_KICK, Move.METAL_CLAW, Move.TAKE_DOWN, Move.HELPING_HAND, Move.RETALIATE, Move.IRON_HEAD, Move.SACRED_SWORD, Move.SWORDS_DANCE, Move.QUICK_GUARD, Move.WORK_UP, Move.METAL_BURST, Move.CLOSE_COMBAT}), Type.STEEL, Type.FIGHTING),
        TERRAKION("Terrakion", "639", (short)3, new short[] {91, 129, 90, 72, 90, 108}, (byte)261, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 7, 13, 19, 25, 31, 37, 42, 49, 55, 61, 67, 73}, new Move[] {Move.QUICK_ATTACK, Move.LEER, Move.DOUBLE_KICK, Move.SMACK_DOWN, Move.TAKE_DOWN, Move.HELPING_HAND, Move.RETALIATE, Move.ROCK_SLIDE, Move.SACRED_SWORD, Move.SWORDS_DANCE, Move.QUICK_GUARD, Move.WORK_UP, Move.STONE_EDGE, Move.CLOSE_COMBAT}), Type.ROCK, Type.FIGHTING),
        VIRIZION("Virizion", "640", (short)3, new short[] {91, 90, 72, 90, 129, 108}, (byte)261, new byte[] {0, 0, 0, 0, 3, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 7, 13, 19, 25, 31, 37, 42, 49, 55, 61, 67, 73}, new Move[] {Move.QUICK_ATTACK, Move.LEER, Move.DOUBLE_KICK, Move.MAGICAL_LEAF, Move.TAKE_DOWN, Move.HELPING_HAND, Move.RETALIATE, Move.GIGA_DRAIN, Move.SACRED_SWORD, Move.SWORDS_DANCE, Move.QUICK_GUARD, Move.WORK_UP, Move.LEAF_BLADE, Move.CLOSE_COMBAT}), Type.GRASS, Type.FIGHTING),
        TORNADUS_INCARNATE("Tornadus", "641", (short)3, new short[] {79, 115, 70, 125, 80, 111}, (byte)261, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 7, 13, 19, 25, 31, 37, 43, 49, 55, 61, 67, 73, 79, 85}, new Move[] {Move.UPROAR, Move.ASTONISH, Move.GUST, Move.SWAGGER, Move.BITE, Move.REVENGE, Move.AIR_CUTTER, Move.EXTRASENSORY, Move.AGILITY, Move.AIR_SLASH, Move.CRUNCH, Move.TAILWIND, Move.RAIN_DANCE, Move.HURRICANE, Move.DARK_PULSE, Move.HAMMER_ARM, Move.THRASH}), Type.FLYING),
        TORNADUS_THERIAN("Tornadus", "641", (short)3, new short[] {79, 100, 80, 110, 90, 121}, (byte)261, new byte[] {0, 0, 0, 0, 0, 3}, GenderRatio.MALE_ONLY, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 7, 13, 19, 25, 31, 37, 43, 49, 55, 61, 67, 73, 79, 85}, new Move[] {Move.UPROAR, Move.ASTONISH, Move.GUST, Move.SWAGGER, Move.BITE, Move.REVENGE, Move.AIR_CUTTER, Move.EXTRASENSORY, Move.AGILITY, Move.AIR_SLASH, Move.CRUNCH, Move.TAILWIND, Move.RAIN_DANCE, Move.HURRICANE, Move.DARK_PULSE, Move.HAMMER_ARM, Move.THRASH}), Type.FLYING),
        THUNDURUS_INCARNATE("Thundurus", "642", (short)3, new short[] {79, 115, 70, 125, 80, 111}, (byte)261, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 7, 13, 19, 25, 31, 37, 43, 49, 55, 61, 67, 73, 79, 85}, new Move[] {Move.UPROAR, Move.ASTONISH, Move.THUNDERSHOCK, Move.SWAGGER, Move.BITE, Move.REVENGE, Move.SHOCK_WAVE, Move.HEAL_BLOCK, Move.AGILITY, Move.DISCHARGE, Move.CRUNCH, Move.CHARGE, Move.NASTY_PLOT, Move.THUNDER, Move.DARK_PULSE, Move.HAMMER_ARM, Move.THRASH}), Type.ELECTRIC, Type.FLYING),
        THUNDURUS_THERIAN("Thundurus", "642", (short)3, new short[] {79, 105, 70, 145, 80, 101}, (byte)261, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 7, 13, 19, 25, 31, 37, 43, 49, 55, 61, 67, 73, 79, 85}, new Move[] {Move.UPROAR, Move.ASTONISH, Move.THUNDERSHOCK, Move.SWAGGER, Move.BITE, Move.REVENGE, Move.SHOCK_WAVE, Move.HEAL_BLOCK, Move.AGILITY, Move.DISCHARGE, Move.CRUNCH, Move.CHARGE, Move.NASTY_PLOT, Move.THUNDER, Move.DARK_PULSE, Move.HAMMER_ARM, Move.THRASH}), Type.ELECTRIC, Type.FLYING),
        RESHIRAM("Reshiram", "643", (short)45, new short[] {100, 120, 100, 150, 120, 90}, (byte)306, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 8, 15, 22, 29, 36, 43, 50, 54, 64, 71, 78, 85, 92, 100}, new Move[] {Move.FIRE_FANG, Move.DRAGON_RAGE, Move.IMPRISON, Move.ANCIENTPOWER, Move.FLAMETHROWER, Move.DRAGONBREATH, Move.SLASH, Move.EXTRASENSORY, Move.FUSION_FLARE, Move.DRAGON_PULSE, Move.IMPRISON, Move.CRUNCH, Move.FIRE_BLAST, Move.OUTRAGE, Move.HYPER_VOICE, Move.BLUE_FLARE}), Type.DRAGON, Type.FIRE),
        ZEKROM("Zekrom", "644", (short)45, new short[] {100, 150, 120, 120, 100, 90}, (byte)306, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 8, 15, 22, 29, 36, 43, 50, 54, 64, 71, 78, 85, 92, 100}, new Move[] {Move.THUNDER_FANG, Move.DRAGON_RAGE, Move.IMPRISON, Move.ANCIENTPOWER, Move.THUNDERBOLT, Move.DRAGONBREATH, Move.SLASH, Move.ZEN_HEADBUTT, Move.FUSION_BOLT, Move.DRAGON_CLAW, Move.IMPRISON, Move.CRUNCH, Move.THUNDER, Move.OUTRAGE, Move.HYPER_VOICE, Move.BOLT_STRIKE}), Type.DRAGON, Type.ELECTRIC),
        LANDORUS_INCARNATE("Landorus", "645", (short)3, new short[] {89, 125, 90, 115, 80, 101}, (byte)270, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 7, 13, 19, 25, 31, 37, 43, 49, 55, 61, 67, 73, 79, 85}, new Move[] {Move.BLOCK, Move.MUD_SHOT, Move.ROCK_TOMB, Move.IMPRISON, Move.PUNISHMENT, Move.BULLDOZE, Move.ROCK_THROW, Move.EXTRASENSORY, Move.SWORDS_DANCE, Move.EARTH_POWER, Move.ROCK_SLIDE, Move.EARTHQUAKE, Move.SANDSTORM, Move.FISSURE, Move.STONE_EDGE, Move.HAMMER_ARM, Move.OUTRAGE}), Type.GROUND, Type.FLYING),
        LANDORUS_THERIAN("Landorus", "645", (short)3, new short[] {89, 145, 90, 105, 80, 91}, (byte)270, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.MALE_ONLY, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 7, 13, 19, 25, 31, 37, 43, 49, 55, 61, 67, 73, 79, 85}, new Move[] {Move.BLOCK, Move.MUD_SHOT, Move.ROCK_TOMB, Move.IMPRISON, Move.PUNISHMENT, Move.BULLDOZE, Move.ROCK_THROW, Move.EXTRASENSORY, Move.SWORDS_DANCE, Move.EARTH_POWER, Move.ROCK_SLIDE, Move.EARTHQUAKE, Move.SANDSTORM, Move.FISSURE, Move.STONE_EDGE, Move.HAMMER_ARM, Move.OUTRAGE}), Type.GROUND, Type.FLYING),
        KYUREM("Kyurem", "646", (short)3, new short[] {125, 130, 90, 130, 90, 95}, (byte)297, new byte[] {1, 1, 0, 1, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64, 71, 78, 85, 92}, new Move[] {Move.ICY_WIND, Move.DRAGON_RAGE, Move.IMPRISON, Move.ANCIENTPOWER, Move.ICE_BEAM, Move.DRAGONBREATH, Move.SLASH, Move.SCARY_FACE, Move.GLACIATE, Move.DRAGON_PULSE, Move.IMPRISON, Move.ENDEAVOR, Move.BLIZZARD, Move.OUTRAGE, Move.HYPER_VOICE}), Type.DRAGON, Type.ICE),
        KYUREM_BLACK("Kyurem", "646", (short)3, new short[] {125, 170, 100, 120, 90, 95}, (byte)297, new byte[] {0, 3, 0, 0, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64, 71, 78, 85, 92}, new Move[] {Move.ICY_WIND, Move.DRAGON_RAGE, Move.IMPRISON, Move.ANCIENTPOWER, Move.ICE_BEAM, Move.DRAGONBREATH, Move.SLASH, Move.SCARY_FACE, Move.GLACIATE, Move.DRAGON_PULSE, Move.IMPRISON, Move.ENDEAVOR, Move.BLIZZARD, Move.OUTRAGE, Move.HYPER_VOICE}), Type.DRAGON, Type.ICE),
        KYUREM_WHITE("Kyurem", "646", (short)3, new short[] {125, 120, 90, 170, 100, 95}, (byte)297, new byte[] {0, 0, 0, 3, 0, 0}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 8, 15, 22, 29, 36, 43, 50, 57, 64, 71, 78, 85, 92}, new Move[] {Move.ICY_WIND, Move.DRAGON_RAGE, Move.IMPRISON, Move.ANCIENTPOWER, Move.ICE_BEAM, Move.DRAGONBREATH, Move.SLASH, Move.SCARY_FACE, Move.GLACIATE, Move.DRAGON_PULSE, Move.IMPRISON, Move.ENDEAVOR, Move.BLIZZARD, Move.OUTRAGE, Move.HYPER_VOICE}), Type.DRAGON, Type.ICE),
        KELDEO("Keldeo", "647", (short)3, new short[] {91, 72, 90, 129, 90, 108}, (byte)261, new byte[] {0, 0, 0, 1, 1, 1}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 7, 13, 19, 25, 31, 37, 43, 49, 55, 61, 67, 73}, new Move[] {Move.AQUA_JET, Move.LEER, Move.DOUBLE_KICK, Move.BUBBLEBEAM, Move.TAKE_DOWN, Move.HELPING_HAND, Move.RETALIATE, Move.AQUA_TAIL, Move.SACRED_SWORD, Move.SWORDS_DANCE, Move.QUICK_GUARD, Move.WORK_UP, Move.HYDRO_PUMP, Move.CLOSE_COMBAT}), Type.WATER, Type.FIGHTING),
        KELDEO_RESOLUTE("Keldeo", "647", (short)3, new short[] {91, 72, 90, 129, 90, 108}, (byte)261, new byte[] {0, 0, 0, 1, 1, 1}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 7, 13, 19, 25, 31, 37, 43, 49, 55, 61, 67, 73}, new Move[] {Move.AQUA_JET, Move.LEER, Move.DOUBLE_KICK, Move.BUBBLEBEAM, Move.TAKE_DOWN, Move.HELPING_HAND, Move.RETALIATE, Move.AQUA_TAIL, Move.SACRED_SWORD, Move.SWORDS_DANCE, Move.QUICK_GUARD, Move.WORK_UP, Move.HYDRO_PUMP, Move.CLOSE_COMBAT}), Type.WATER, Type.FIGHTING),
        MELOETTA_ARIA("Meloetta", "648", (short)3, new short[] {100, 77, 77, 128, 128, 90}, (byte)270, new byte[] {0, 0, 0, 1, 1, 1}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 6, 11, 16, 21, 26, 31, 36, 43, 50, 57, 64, 71, 78, 85}, new Move[] {Move.ROUND, Move.QUICK_ATTACK, Move.CONFUSION, Move.SING, Move.TEETER_DANCE, Move.ACROBATICS, Move.PSYBEAM, Move.ECHOED_VOICE, Move.U_TURN, Move.WAKE_UP_SLAP, Move.PSYCHIC, Move.HYPER_VOICE, Move.ROLE_PLAY, Move.CLOSE_COMBAT, Move.PERISH_SONG}), Type.NORMAL, Type.PSYCHIC),
        MELOETTA_PIROUETTE("Meloetta", "648", (short)3, new short[] {100, 128, 90, 77, 77, 128}, (byte)270, new byte[] {0, 1, 1, 0, 0, 1}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 6, 11, 16, 21, 26, 31, 36, 43, 50, 57, 64, 71, 78, 85}, new Move[] {Move.ROUND, Move.QUICK_ATTACK, Move.CONFUSION, Move.SING, Move.TEETER_DANCE, Move.ACROBATICS, Move.PSYBEAM, Move.ECHOED_VOICE, Move.U_TURN, Move.WAKE_UP_SLAP, Move.PSYCHIC, Move.HYPER_VOICE, Move.ROLE_PLAY, Move.CLOSE_COMBAT, Move.PERISH_SONG}), Type.NORMAL, Type.FIGHTING),
        GENESECT("Genesect", "649", (short)3, new short[] {71, 120, 95, 120, 95, 99}, (byte)270, new byte[] {0, 1, 0, 1, 0, 1}, GenderRatio.GENDERLESS, ExperienceGroup.SLOW,convertToMap(new int[] {0, 0, 0, 0, 0, 7, 11, 18, 22, 29, 33, 40, 44, 51, 55, 62, 66, 73, 77}, new Move[] {Move.TECHNO_BLAST, Move.QUICK_ATTACK, Move.MAGNET_RISE, Move.METAL_CLAW, Move.SCREECH, Move.FURY_CUTTER, Move.LOCK_ON, Move.FLAME_CHARGE, Move.MAGNET_BOMB, Move.SLASH, Move.METAL_SOUND, Move.SIGNAL_BEAM, Move.TRI_ATTACK, Move.X_SCISSOR, Move.BUG_BUZZ, Move.SIMPLE_BEAM, Move.ZAP_CANNON, Move.HYPER_BEAM, Move.SELFDESTRUCT}), Type.BUG, Type.STEEL);

        private final Map<Integer, Move> LEARNSET;
        private final ExperienceGroup EXP_GROUP;
        private final Species[] EVOLUTION;
        private final GenderRatio GENDER_RATIO;
        private final short[] BASE_STATS;
        private final byte[] EV_YIELD;
        private final Type[] TYPE;
        private final String NAME, NAT_DEX_NUMBER;
        private final short CATCH_RATE;

        Generation5(final String name, final String dexNumber, final short catchRate, final short[] stats, byte expYield, byte[] evYield,
                    GenderRatio ratio, ExperienceGroup group,/*final Species[] evolvesTo,*/ Map<Integer, Move> learnset, final Type... type)
        {
            if(type.length > 2)
            {
                throw new IllegalArgumentException("You must input 1 or 2 types for " + name + ". The types " +
                        Arrays.toString(type) + " are invalid.");
            }
            else if(type.length == 0)
            {
                throw new IllegalArgumentException("You must input at least one type for " + name);
            }

            LEARNSET = new TreeMap<>(learnset);
            GENDER_RATIO = ratio;
            EV_YIELD = new byte[] {evYield[0], evYield[1], evYield[2], evYield[3], evYield[4], evYield[5]};
            BASE_STATS = new short[] {stats[0], stats[1], stats[2], stats[3], stats[4], stats[5]};
            CATCH_RATE = catchRate;
            NAT_DEX_NUMBER = dexNumber;

            NAME = name;
            TYPE = type;

            EVOLUTION = null;
            /*if(evolvesFrom != null)
            {
                switch(evolvesFrom.length)
                {
                    case 1:
                        PREVOLUTION = new Species[]{evolvesFrom[0]};
                        break;
                    case 2:
                        PREVOLUTION = new Species[]{evolvesFrom[0], evolvesFrom[1]};
                        break;
                    case 3:
                        PREVOLUTION = new Species[]{evolvesFrom[0], evolvesFrom[1], evolvesFrom[2]};
                        break;
                    default:
                        PREVOLUTION = new Species[]{evolvesFrom[0], evolvesFrom[1], evolvesFrom[2], evolvesFrom[3]};
                        break;
                }
            }
            else
            {
                PREVOLUTION = null;
            }*/

            /*if(evolvesTo != null)
            {
                switch(evolvesTo.length)
                {
                    case 1:
                        EVOLUTION = new Species[]{evolvesTo[0]};
                        break;
                    case 2:
                        EVOLUTION = new Species[]{evolvesTo[0], evolvesTo[1]};
                        break;
                    case 3:
                        EVOLUTION = new Species[]{evolvesTo[0], evolvesTo[1], evolvesTo[2]};
                        break;
                    default:
                        EVOLUTION = new Species[]{evolvesTo[0], evolvesTo[1], evolvesTo[2], evolvesTo[3]};
                        break;
                }
            }
            else
            {
                EVOLUTION = null;
            }*/

            EXP_GROUP = group;
        }
    }

    private enum GenderRatio
    {
        MALE_ONLY((byte)100),
        ONE_FEMALE_SEVEN_MALE((float)87.5),
        ONE_FEMALE_THREE_MALE((byte)75),
        ONE_FEMALE_ONE_MALE((byte)50),
        THREE_FEMALE_ONE_MALE((byte)25),
        FEMALE_ONLY((byte)0),
        GENDERLESS((byte)-1);

        private final float PERCENT_MALE;

        GenderRatio(byte percentMale)
        {
            PERCENT_MALE = percentMale;
        }

        GenderRatio(float percentMale)
        {
            PERCENT_MALE = percentMale;
        }

        public Gender getGender()
        {
            switch((byte)PERCENT_MALE)
            {
                case 100:
                    return Gender.MALE;
                case 0:
                    return Gender.FEMALE;
                case -1:
                    return Gender.GENDERLESS;
            }

            byte t = (byte)((Math.random() * 100) + 1);
            return t <= PERCENT_MALE ? Gender.MALE : Gender.FEMALE;
        }
    }

    private enum ExperienceGroup
    {
        ERRATIC,
        FAST,
        MEDIUM_FAST,
        MEDIUM_SLOW,
        SLOW,
        FLUCTUATING;

        public int getExpForLevel(final byte level)
        {
            switch(this)
            {
                case ERRATIC:
                    return calcErratic(level);
                case FAST:
                    return calcFast(level);
                case MEDIUM_FAST:
                   return calcMedFast(level);
                case MEDIUM_SLOW:
                    return calcMedSlow(level);
                case SLOW:
                    return calcSlow(level);
                case FLUCTUATING:
                    return calcFluctuating(level);
                default:
                    throw new IllegalStateException("Enum " + this.toString().toLowerCase() + " is illlegal");
            }
        }

        private int calcErratic(byte level)
        {
            if(level > 0 && level <= 50)
            {
                return (int)((Math.pow(level, 3) * (100 - level)) / 50);
            }
            else if(level > 50 && level <= 68)
            {
                return (int)((Math.pow(level, 3) * (150 - level)) / 100);
            }
            else if(level > 68 && level <= 98)
            {
                return (int)((Math.pow(level, 3) * ((1911 - 10 * level) / 3)) / 500);
            }
            else if(level > 98 && level <= 100)
            {
                return (int)((Math.pow(level, 3) * (160 - level)) / 100);
            }
            else
            {
                throw new IllegalArgumentException("A level of " + level + " is not allowed");
            }
        }

        private int calcFast(byte level)
        {
            if(level > 0 && level <= 100)
            {
                return (int)((4 * Math.pow(level, 3)) / 5);
            }

            throw new IllegalArgumentException("Level " + level + " is not allowed");
        }

        private int calcMedFast(byte level)
        {
            if(level > 0 && level <= 100)
            {
                return (int)Math.pow(level, 3);
            }

            throw new IllegalArgumentException("Level " + level + " is not allowed");
        }

        private int calcMedSlow(byte level)
        {
            if(level > 0 && level <= 100)
            {
                return (int)(((6 * Math.pow(level, 3)) / 5) - (15 * Math.pow(level, 2)) + (100 * level) - 140);
            }

            throw new IllegalArgumentException("Level " + level + " is not allowed");
        }

        private int calcSlow(byte level)
        {
            if(level > 0 && level <= 100)
            {
                return (int)((5 * Math.pow(level, 3)) / 4);
            }

            throw new IllegalArgumentException("Level " + level + " is not allowed");
        }

        private int calcFluctuating(byte level)
        {
            if(level > 0 && level <= 15)
            {
                return (int)(Math.pow(level, 3) * ((((level + 1) / 3) + 24) / 50));
            }
            else if(level > 15 && level <= 36)
            {
                return (int)(Math.pow(level, 3) * ((level + 14) / 50));
            }
            else if(level > 36 && level <= 100)
            {
                return (int)(Math.pow(level, 3) * (((level / 2) + 32) / 50));
            }
            else
            {
                throw new IllegalArgumentException("A level of " + level + " is not allowed");
            }
        }
    }

    private final Map<Integer, Move> LEARNSET;
    private final ExperienceGroup EXP_GROUP;
    private final Species[] EVOLUTION;
    private final GenderRatio GENDER_RATIO;
    private final short[] BASE_STATS;
    private final byte[] EV_YIELD;
    private final Type[] TYPE;
    private final String NAME, NAT_DEX_NUMBER;
    private final short CATCH_RATE;
    private boolean HAS_CALCULATED_GENDER;

    Species(Generation1 g)
    {
        LEARNSET = g.LEARNSET;
        EXP_GROUP = g.EXP_GROUP;
        EVOLUTION = null;
        GENDER_RATIO = g.GENDER_RATIO;
        System.arraycopy(g.BASE_STATS, 0, (BASE_STATS = new short[6]), 0, 6);
        System.arraycopy(g.EV_YIELD, 0, (EV_YIELD = new byte[6]), 0, 6);
        System.arraycopy(g.TYPE, 0, (TYPE = new Type[2]), 0, g.TYPE.length);
        NAME = g.NAME;
        NAT_DEX_NUMBER = g.NAT_DEX_NUMBER;
        CATCH_RATE = g.CATCH_RATE;
    }

    Species(Generation2 g)
    {
        LEARNSET = g.LEARNSET;
        EXP_GROUP = g.EXP_GROUP;
        EVOLUTION = null;
        GENDER_RATIO = g.GENDER_RATIO;
        System.arraycopy(g.BASE_STATS, 0, (BASE_STATS = new short[6]), 0, 6);
        System.arraycopy(g.EV_YIELD, 0, (EV_YIELD = new byte[6]), 0, 6);
        System.arraycopy(g.TYPE, 0, (TYPE = new Type[2]), 0, g.TYPE.length);
        NAME = g.NAME;
        NAT_DEX_NUMBER = g.NAT_DEX_NUMBER;
        CATCH_RATE = g.CATCH_RATE;
    }

    Species(Generation3 g)
    {
        LEARNSET = g.LEARNSET;
        EXP_GROUP = g.EXP_GROUP;
        EVOLUTION = null;
        GENDER_RATIO = g.GENDER_RATIO;
        System.arraycopy(g.BASE_STATS, 0, (BASE_STATS = new short[6]), 0, 6);
        System.arraycopy(g.EV_YIELD, 0, (EV_YIELD = new byte[6]), 0, 6);
        System.arraycopy(g.TYPE, 0, (TYPE = new Type[2]), 0, g.TYPE.length);
        NAME = g.NAME;
        NAT_DEX_NUMBER = g.NAT_DEX_NUMBER;
        CATCH_RATE = g.CATCH_RATE;
    }

    Species(Generation4 g)
    {
        LEARNSET = g.LEARNSET;
        EXP_GROUP = g.EXP_GROUP;
        EVOLUTION = null;
        GENDER_RATIO = g.GENDER_RATIO;
        System.arraycopy(g.BASE_STATS, 0, (BASE_STATS = new short[6]), 0, 6);
        System.arraycopy(g.EV_YIELD, 0, (EV_YIELD = new byte[6]), 0, 6);
        System.arraycopy(g.TYPE, 0, (TYPE = new Type[2]), 0, g.TYPE.length);
        NAME = g.NAME;
        NAT_DEX_NUMBER = g.NAT_DEX_NUMBER;
        CATCH_RATE = g.CATCH_RATE;
    }

    Species(Generation5 g)
    {
        LEARNSET = g.LEARNSET;
        EXP_GROUP = g.EXP_GROUP;
        EVOLUTION = null;
        GENDER_RATIO = g.GENDER_RATIO;
        System.arraycopy(g.BASE_STATS, 0, (BASE_STATS = new short[6]), 0, 6);
        System.arraycopy(g.EV_YIELD, 0, (EV_YIELD = new byte[6]), 0, 6);
        System.arraycopy(g.TYPE, 0, (TYPE = new Type[2]), 0, g.TYPE.length);
        NAME = g.NAME;
        NAT_DEX_NUMBER = g.NAT_DEX_NUMBER;
        CATCH_RATE = g.CATCH_RATE;
    }

    /*public boolean hasPreEvolutions()
    {
        return PREVOLUTION != null;
    }*/

    public Map<Integer, Move> getLearnset()
    {
        return LEARNSET;
    }
    public boolean hasEvolutions()
    {
        return EVOLUTION != null;
    }

    public int calculateExp(byte level)
    {
        return EXP_GROUP.getExpForLevel(level);
    }

    /*public boolean hasPreEvolution(Species s)
    {
        return contains(PREVOLUTION, s);
    }*/

    public boolean hasEvolution(Species s)
    {
        return contains(EVOLUTION, s);
    }

    private static Map<Integer, Move> convertToMap(int[] a, Move[] b)
    {
        if(a.length != b.length)
        {
            throw new IllegalArgumentException("a and b must be the same length");
        }

        Map<Integer, Move> m = new TreeMap<>();

        for(int i = 0; i < a.length; i++)
        {
            //The -1 denotes a Move that isn't applicable for BW2. Thusly, it's ignored
            if(a[i] != -1)
            {
                m.put(a[i], b[i]);
            }
        }

        return m;
    }

    private boolean contains(Species[] spec, Species s)
    {
        for(Species species : spec)
        {
            if(species == s)
            {
                return true;
            }
        }

        return false;
    }
    public byte[] getEVYields()
    {
        return EV_YIELD;
    }

    public byte getYield(final byte stat)
    {
        return EV_YIELD[stat];
    }
    public short getCatchRate()
    {
        return CATCH_RATE;
    }

    public String getDexNumber()
    {
        return NAT_DEX_NUMBER;
    }

    /**
     * Retrieves the base value for the desired stat
     * @param stat The stat constant of the stat to get
     * @return The base value of that stat
     * @throws ArrayIndexOutOfBoundsException If the passed in constant is invalid
     */
    public short getBaseStat(final int stat) throws ArrayIndexOutOfBoundsException
    {
        return BASE_STATS[stat];
    }

    public Gender getGender()
    {
        return GENDER_RATIO.getGender();
    }

    /**
     * Returns Name of the Pokemon
     *
     * @return Name of the Pokemon
     */
    public String getName()
    {
        return NAME;
    }

    /**
     * This does the damage calculation from the actual Pokemon game and
     * returns the final damage. Props to the equation from
     * http://www.math.miami.edu/~jam/azure/compendium/battdam.htm
     *
     * @param m Move being used
     * @param p Pokemon attacking
     * @return Final damage
     */
    private int damageFormula(Move m, Pokemon p)
    {
        /*
        //Fix up this method to make it more visually appealing
        int a = p.getLevel(), b = p.getInBattleStat(ATTACK), c = m.power(),
                d = inBattleStats[DEFENSE], x = 1, z = new Random().nextInt(38) + 217,
                y = superEffective(m), value;


        if(m.getType().equalsIgnoreCase("PSN"))
        {
            status[POISONED] = true;
        }
        if(m.getName().equalsIgnoreCase("Dragon Rage"))
        {
            return 40;
        }

        value = 2 * a;
        value /= 5;
        if (value < 1.0)
        {
            value = 1;
        }
        value += 2;
        value *= b;
        value *= c;
        value /= d;
         if (value < 1.0)
        {
            value = 1;
        }
        value /= 50;
        if (value < 1.0)
        {
            value = 1;
        }
        value += 2;
        value *= x;
        value *= y;
        value /= 10;
        if (value < 1.0)
        {
            value = 1;
        }
        value *= z;
        value /= 255;
        if (value < 1.0)
        {
            value = 1;
        }
        if(value == 0)
        {
            value = 1;
        }
        //orignal eq'n((((((((2 * a / 5) + 2) * b * c)
        /// d) / 50) + 2) * 1) * y / 10) * z / 255;
        return value;*/

        return 0; //Shut up the compiler
    }

    /**
     * Gets the first type of the Pokemon
     * @return Their first type
     */
    public Type[] getType()
    {
        return TYPE;
    }
}
